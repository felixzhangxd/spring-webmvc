package com.mmall.spring.webmvc.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private Map<Integer, String> userMap = new HashMap<Integer, String>();

    public UserDao() {
        this.userMap.put(1, "felix");
        this.userMap.put(2, "justin");
    }

    public String find(Integer id) {
        return this.userMap.get(id);
    }
}
