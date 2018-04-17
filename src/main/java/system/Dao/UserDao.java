package system.Dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import system.Model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("user_lp") //этот объект работает с данными
public class UserDao extends AbstractDao implements UserDaoInt {

    public void saveUser(User user) {
        persist(user);

    }

    public User findByLogin(String login) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("login", login));
        return (User) criteria.uniqueResult();
    }

    public void updateEmployee(User user) {
        getSession().update(user);
    }
}
