package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by dkirtan on 9/15/17.
 */
public class UserService {
    private static List<User> allUsers = new ArrayList<>();
    public UserService(String serviceName) {}

    public void addUser(User user) {
        List<User> lstUser =getUsers();
        List<User> ls = lstUser.stream().filter(User -> User.getId()== user.getId()).collect(Collectors.toList());
        User frstUser = (ls != null) ? ls.stream().findFirst().get(): null;
        if(frstUser!= null){
            frstUser.setName(user.getName());
        }
        if(ls == null){
            lstUser.add(user);
        }
    }

    public void deleteUser(User user) {
        List<User> lstUser =getUsers();
        List<User> ls = lstUser.stream().filter(User -> User.getId()== user.getId()).collect(Collectors.toList());
        User frstUser = (ls != null) ? ls.stream().findFirst().get(): null;
        lstUser.remove(frstUser);
    }

    public List<User> getUsers() {

        return allUsers;
    }

    public void registerListener(UserService userService) {}

    public void deregisterListener(UserService userService) {}
}
