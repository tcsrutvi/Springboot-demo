package com.tcs.springbootdemo;

import org.springframework.data.repository.CrudRepository;
import com.tcs.springbootdemo.User;

public interface IUserRepository extends CrudRepository<User, Integer>{

}
