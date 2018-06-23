/********************************************************
* <p>Description: 天安佰盈_搭伙平台_俱乐部模块_Dao层</p>
* <p>Project: ClubDao.java </p>
* <p>Date: 2016-06-02 13:38:52 </p>
* <p>Author: SunMinghao </p>
* <p>Comment : </p>
*
*********************************************************/
package com.plum.manager.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    /**
     * 
     * 测试
     * 
     * @param
     * @since 2016-06-02 下午14:34:10
     * @author SunMinghao
     * @return
     */
    String searchTest();

}