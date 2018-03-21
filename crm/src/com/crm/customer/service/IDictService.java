package com.crm.customer.service;

import java.util.List;

import com.crm.common.beans.Dict;

public interface IDictService {

	List<Dict> findDictByTypeCode(String typecode);

}
