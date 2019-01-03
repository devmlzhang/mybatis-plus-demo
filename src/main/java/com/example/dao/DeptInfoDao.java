package com.example.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.example.entity.DeptInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 组织机构系统___部门信息表 Mapper 接口
 * </p>
 *
 * @author ML.Zhang
 * @since 2019-01-02
 */
@Repository
public interface DeptInfoDao extends BaseMapper<DeptInfo> {

    List<DeptInfo> getLists();

}
