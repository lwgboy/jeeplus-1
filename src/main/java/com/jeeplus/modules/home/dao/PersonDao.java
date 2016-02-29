/**
 * Copyright &copy; 2015-2020 <a href="--版权信息--">JeePlus</a> All rights reserved.
 */
package com.jeeplus.modules.home.dao;

import com.jeeplus.common.persistence.CrudDao;
import com.jeeplus.common.persistence.annotation.MyBatisDao;
import com.jeeplus.modules.home.entity.Person;

/**
 * 家庭DAO接口
 * @author zx
 * @version 2016-02-28
 */
@MyBatisDao
public interface PersonDao extends CrudDao<Person> {
	
}