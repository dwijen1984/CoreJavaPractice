package hackerRank;

import java.util.*;

/**
 * Created by dkirtan on 9/15/17.
 */
public class Solution {
    public static void main(String[] args) {
        List<UserService> services = new ArrayList<>();
        Map<String, UserService> serviceLookup = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int commands = scanner.nextInt();
        String serviceName, userName, serviceName1, serviceName2;
        int userId;
        UserService us, service1, service2;
        for (int c = 0; c < commands; c++) {
            String command = scanner.next();
            switch(command) {
                case "add":
                    serviceName = scanner.next();
                    userName = scanner.next();
                    userId = scanner.nextInt();
                    us = serviceLookup.get(serviceName);
                    us.addUser(new User(userName, userId));
                    break;
                case "delete":
                    serviceName = scanner.next();
                    userName = scanner.next();
                    userId = scanner.nextInt();
                    us = serviceLookup.get(serviceName);
                    us.deleteUser(new User(userName, userId));
                    break;
                case "service":
                    serviceName = scanner.next();
                    us = new UserService(serviceName);
                    services.add(us);
                    serviceLookup.put(serviceName, us);
                    break;
                case "register":
                    serviceName1 = scanner.next();
                    serviceName2 = scanner.next();
                    service1 = serviceLookup.get(serviceName1);
                    service2 = serviceLookup.get(serviceName2);
                    service1.registerListener(service2);
                    break;
                case "deregister":
                    serviceName1 = scanner.next();
                    serviceName2 = scanner.next();
                    service1 = serviceLookup.get(serviceName1);
                    service2 = serviceLookup.get(serviceName2);
                    service1.deregisterListener(service2);
                    break;
            }
        }
        for (UserService s : services) {
            System.out.println("service " + s);
            for (User u : s.getUsers()) {
                System.out.println(u);
            }
        }
    }
}
