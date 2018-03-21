package com.crm.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.common.beans.Dict;
import com.crm.customer.dao.IDictDao;
import com.crm.customer.service.IDictService;

@Service
public class DictServiceImpl implements IDictService {

	@Autowired
	private IDictDao dictDao;
	
	@Override
	public List<Dict> findDictByTypeCode(String typecode) {
		List<Dict> dict = dictDao.selectDictyByTypeCode(typecode);
		//System.out.println(dict);
		return dict;
	}

}
