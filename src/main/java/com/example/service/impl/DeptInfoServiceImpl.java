package com.example.service.impl;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.dao.DeptInfoDao;
import com.example.entity.DeptInfo;
import com.example.service.IDeptInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * <p>
 * 组织机构系统___部门信息表 服务实现类
 * </p>
 *
 * @author ML.Zhang
 * @since 2019-01-02
 */
@Service
public class DeptInfoServiceImpl extends ServiceImpl<DeptInfoDao, DeptInfo> implements IDeptInfoService {

    @Override
    public PageInfo getList() {
        PageHelper.startPage(1,10);
        List<DeptInfo> deptInfos = this.selectList(new EntityWrapper<>());
        PageInfo info = new PageInfo(deptInfos);
        return info;
    }
}
