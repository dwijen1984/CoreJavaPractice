package com.dwijen.jconsole.jmx;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class SimpleAgent {
    /*
    * How JMX Works
    * 1. Create a Interface and as per naming convention ends with MBean
    * 2. Now all the classed want to be monitor or send value at runtime implements the interface
    * 3. Create a main class and give "new ObjectName("FOO:name=HelloBean")"
    * 4. Run the main class and open the jconsole and go to MBean tab
    * 5. You can see a FOO , and all methods and variables under that
    * 6. You can pass values to the variable as well
    *
    * Why used
    * 1. Lets say you can pass runtime values; lets say you can pass fixedthreadpool values and check with
    * max how many thread the jvm show stackoverlow exception
    * 2. JMX opearations can be used by nagoes to build the graphite images for monitoring
    *
     */
    private MBeanServer mbs = null;

    public SimpleAgent() {

        // Get the platform MBeanServer
        mbs = ManagementFactory.getPlatformMBeanServer();

        // Unique identification of MBeans
        //Hello helloBean = new Hello();
        Hello helloBean = new Hello("This is new Hello Class..");
        ObjectName helloName = null;



        try {
            // Uniquely identify the MBeans and register them with the platform MBeanServer
            helloName = new ObjectName("FOO:name=HelloBean");
            mbs.registerMBean(helloBean, helloName);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // Utility method: so that the application continues to run
    private static void waitForEnterPressed() {
        try {
            System.out.println("Press  to continue...");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String argv[]) {
        SimpleAgent agent = new SimpleAgent();
        System.out.println("SimpleAgent is running...");
        SimpleAgent.waitForEnterPressed();
    }
}
