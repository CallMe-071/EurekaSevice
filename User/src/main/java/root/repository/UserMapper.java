package root.repository;

import org.apache.ibatis.annotations.Mapper;
import root.entity.User;
import root.entity.UserDetail;

import java.util.List;

@Mapper
public  interface UserMapper {

       void addUser(String name, String nick);

       void deleteUser(Long id);

       User selectById(Long id);

       void updateUser(Long id, String name);

       List<User> findAll();

       Integer getSum();

       List<User> findByPage(Integer page, Integer pageSize, Integer age, String word);

       Integer getByTableSum(Integer age, String word);

       List<UserDetail> findByRTable(Integer age, String word, Integer page, Integer pageSize);

       List<UserDetail> get();


}
