package system.Service;

import java.util.List;

import system.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.Dao.UserDaoInt;
import system.Model.User;

import javax.transaction.Transactional;

@Service("userService")
@Transactional
public class UserService implements UserServiceInt {
    @Autowired
    // говорит спрингу чтоб он нашел и подтянул  такой объект (искать будет по типу данных, в данном случае UserDao)
    private UserDaoInt userDaoInt;


    public void saveUser(User user) {
        userDaoInt.saveUser(user);
    }

    public User findByLogin(String login) {
        return userDaoInt.findByLogin(login);
    }

    public void updateEmployee(User user) {
        userDaoInt.updateEmployee(user);
    }
}
