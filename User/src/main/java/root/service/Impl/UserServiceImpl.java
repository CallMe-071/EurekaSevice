package root.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import root.entity.User;
import root.entity.UserDetail;
import root.repository.UserMapper;
import root.service.IUserService;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(String name, String nick){
        User user = new User();
        user.setName(name);
        user.setNick(nick);
        userMapper.addUser(name,nick);
    }

    @Override
    public void deleteUser(Long id){ userMapper.deleteUser(id);}

    @Override
    public User selectById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public void updateUser(Long id,String name){ userMapper.updateUser(id,name);}

    @Override
    public List<User> findAll(){ return userMapper.findAll();}

    @Override
    public Integer getSum(){ return userMapper.getSum();}

    @Override
    public List<User> findByPage(Integer page,Integer pageSize,Integer age,String word){ return userMapper.findByPage(page,pageSize,age,word);}

    @Override
    public Integer getByTableSum(Integer age,String word){ return userMapper.getByTableSum(age,word);}

    @Override
    public List<UserDetail> findByRTable(Integer age, String word, Integer page, Integer pageSize){ return userMapper.findByRTable(age,word,page,pageSize);}

    @Override
    public List<UserDetail> get(){ return userMapper.get();}
}
