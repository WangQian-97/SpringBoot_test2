package cn.jiyun.ssm.service;

import cn.jiyun.ssm.mapper.UserMapper;
import cn.jiyun.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
        @Autowired
        private UserMapper userMapper;

        public User queryUserById(Long id){
            return this.userMapper.selectByPrimaryKey(id);
        }
}
