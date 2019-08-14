package com.test.data.service;

import com.test.data.model.User;

import java.util.HashMap;
import java.util.List;

/**
 * Created by guanguan on 2017/7/20.
 */
public interface UserService extends Services<User> {


     List<User> findBy(HashMap<?,?> params);

}
