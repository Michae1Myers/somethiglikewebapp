package system.service;
import java.util.List;

import system.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired // говорит спрингу чтоб он нашел и подтянул  такой объект (искать будет по типу данных, в данном случае UserDao)
    private UserDao userDao;

    public List getAllUsers(){
        return userDao.getAllUsers();
    }
}
