package com.example;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.example.dao.DeptInfoDao;
import com.example.entity.DeptInfo;
import com.example.service.IDeptInfoService;
import com.github.pagehelper.PageInfo;
import lombok.var;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    DeptInfoDao  deptInfoDao;
    @Autowired
    IDeptInfoService iDeptInfoService;

    @Test
    public void contextLoads() {
        DeptInfo deptInfo = deptInfoDao.selectById("7703856423441616896");
        System.out.println(deptInfo.toString());
    }

    @Test
    public void selelct() {
        List ids = new ArrayList();
        ids.add("7703878521759813632");
        List list = deptInfoDao.selectBatchIds(ids);
        System.out.println(list.toString());
    }

    @Test
    public void del() {
        EntityWrapper<DeptInfo>  wrapper = new EntityWrapper();
        DeptInfo info = new DeptInfo();
        info.setId(7703856423441616896L);
        wrapper.setEntity(info);
        Integer delete = deptInfoDao.delete(wrapper);
        System.out.println(delete);
    }

    @Test
    public void update() {
        PageInfo list = iDeptInfoService.getList();
        System.out.println("-------------");
        System.out.println(list.getList().size());
        System.out.println(list.getList());


    }
}

