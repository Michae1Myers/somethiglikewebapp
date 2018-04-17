package system.Dao;

import system.Model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository //этот объект работает с данными
public class UserDao {
    private List<User> users = Arrays.asList(new User("admin", "admin"), new User ("user1", "user1"));
// здесь можно цеплять БД, чтобы тянуть оттуда данные, пока что захардкодировано
    public List<User> getAllUsers(){
        return users;
    }
}
