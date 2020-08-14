package com.aaa.service;

import com.aaa.dao.banDao;
import com.aaa.entity.ban;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class banService {
    @Autowired
    banDao banDao;
    public int add(ban b){
        return banDao.add(b);
    };
    public int update(ban b){
        return banDao.update(b);
    };
    public int delete(Integer bid){
        return banDao.delete(bid);
    };
    public List<ban>query(){
        return banDao.query();
    }
}
