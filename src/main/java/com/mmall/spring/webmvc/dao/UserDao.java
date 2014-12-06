package com.mmall.spring.webmvc.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private Map<Integer, String> userMap = new HashMap<Integer, String>();

    public UserDao() {
        userMap.put(1, "felix");
        userMap.put(2, "justin");
    }

    public String find(Integer id) {
        return userMap.get(id);
    }
}
