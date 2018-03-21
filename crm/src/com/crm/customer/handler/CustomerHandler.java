package com.crm.customer.handler;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.common.beans.Customer;
import com.crm.common.beans.Dict;
import com.crm.common.beans.User;
import com.crm.common.utils.Page;
import com.crm.customer.service.ICustomerService;
import com.crm.customer.service.IDictService;

@Controller
@RequestMapping("/customer")
public class CustomerHandler {
	@Autowired
	private ICustomerService customerService;
	@Autowired
	private IDictService dictService;
	@RequestMapping("/list.do")
	public String list(@RequestParam(defaultValue="1")Integer page, 
				@RequestParam(defaultValue="2")Integer rows,String custName,
				String custSource,String custIndustry,String custLevel,Model model){
		//分页查询客户信息
		Page<Customer> customers = customerService.findCustomerList(page,
				rows,custName,custSource,custIndustry,custLevel);
		//按类型码查询客户来源，客户行业，客户级别
		List<Dict> fromType = dictService.findDictByTypeCode("002");
		List<Dict> industryType = dictService.findDictByTypeCode("001");
		List<Dict> levelType = dictService.findDictByTypeCode("003");
		model.addAttribute("page", customers);
		model.addAttribute("custName", custName);
		model.addAttribute("custSource", custSource);
		model.addAttribute("custIndustry", custIndustry);
		model.addAttribute("custLevel", custLevel);
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		return "customer";
	}
	
	@RequestMapping("/create.do")
	@ResponseBody
	public String customerCreate(Customer customer,HttpSession session){
		
		User user = (User) session.getAttribute("user");
		customer.setCust_create_id(Integer.toString(user.getUser_id()));
		Date date = new Date();
		customer.setCust_createtime(date);
		
		int rows = customerService.createCustomer(customer);
		System.out.println(rows);
		if(rows >0 ){
			return "OK";
		}else{
			return "FAIL";
		}
	}
	
	@RequestMapping("/getCustomerById.do")
	@ResponseBody
	public Customer getCustomerById(Integer id){
		Customer customer = customerService.getCustomerById(id); 
		System.out.println(customer);
		return customer;
		
	}
	
	@RequestMapping("/update.do")
	@ResponseBody
	public String update(Customer customer){
		int rows = customerService.updateCustomer(customer);
		if(rows > 0){
			return "OK";
		}else{
			return "FAIL";
		}
		
	}
	@RequestMapping("/delete.do")
	@ResponseBody
	public String delete(Integer id){
		int rows = customerService.deleteCustomerById(id);
		if(rows > 0){
			return "OK";
		}else{
			return "FAIL";
		}
		
	}
	
	
}
