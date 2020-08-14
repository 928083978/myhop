package com.aaa.dao;
import com.aaa.entity.ban;

import java.util.List;
public interface banDao {
    public int add(ban b);
    public int update (ban b);
    public int delete(Integer bid);
    public List<ban>query();

}
