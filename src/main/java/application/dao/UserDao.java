package application.dao;

import application.model.User;

import java.util.List;

public interface UserDao {

   public List<User> getAllUsers();

   public void saveUser(User user);
}
