package com.crm.customer.dao;

import java.util.List;

import com.crm.common.beans.Dict;

public interface IDictDao {

	List<Dict> selectDictyByTypeCode(String typecode);


}
