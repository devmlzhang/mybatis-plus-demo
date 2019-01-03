package com.example.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.entity.DeptInfo;
import com.github.pagehelper.PageInfo;


/**
 * <p>
 * 组织机构系统___部门信息表 服务类
 * </p>
 *
 * @author ML.Zhang
 * @since 2019-01-02
 */
public interface IDeptInfoService extends IService<DeptInfo> {

    PageInfo getList();


}
