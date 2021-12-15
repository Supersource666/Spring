package com.supersource.demoforjpacrud.controller;


import com.supersource.demoforjpacrud.entity.User_Entity;
import com.supersource.demoforjpacrud.jpa.UserJpa;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserJpa userJpa;

    /**
     * 查询所有数据
     *
     * @return
     */
    @RequestMapping("/list")
    public List<User_Entity> list() {
        return userJpa.findAll();
    }

    /**
     * 查询一个
     *
     * @return
     */
    @RequestMapping("/findById")
    public User_Entity findById(Long id) {
           Optional<User_Entity> id2user = userJpa.findById(id);

        return userJpa.findById(id).orElse(null);

}
    /**
     * 通过ID删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public List<User_Entity> delete(Long id) {
        userJpa.deleteById(id);
        return userJpa.findAll();
    }

    /**
     *添加一条信息
     * @param entity
     * @return
     */
    @RequestMapping("/save")
    public User_Entity save(User_Entity entity){
        return userJpa.save(entity);
    }



//    @RequestMapping("/update")
//    @Override
//    public User_Entity modifyUser(User_Entity entity) {
//        Long user_id = entity.getId();
//        User_Entity oldUser = userJpa.findById(user_id);
//        oldUser.setName(entity.getName());
//        userJpa.save(oldUser);
//        return userRepository.findById(userId);
//    }
   // }

}


