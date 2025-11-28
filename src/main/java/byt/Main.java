package byt;

import byt.adapter.EmployeeAdapter;
import byt.adapter.ITarget;
import byt.factory.DataAnalyticsEngine;
import byt.factory.DatabaseFactory;
import byt.factory.DatabaseType;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        dbEngines();
        Thread.sleep(2000);
        System.out.println();
//        employeesAdapterDemo();
        Thread.sleep(2000);
        System.out.println();
//        observingThings();
    }

    public static void dbEngines() {

        DataAnalyticsEngine sqlEngine = new DataAnalyticsEngine(
                DatabaseFactory.createDatabase(DatabaseType.SqlServer)
        );
        sqlEngine.processData("SQL Server, tell me what is the point of life?");

        DataAnalyticsEngine oracleEngine = new DataAnalyticsEngine(
                DatabaseFactory.createDatabase(DatabaseType.Oracle)
        );
        oracleEngine.processData("Oracle, tell me how to be a moral person?");
    }

    public static void employeesAdapterDemo() {
        String[][] employeesArray = {
            {"101","John","SE","10000"},
            {"102","Smith","SE","20000"},
            {"103","Dev","SSE","30000"},
            {"104","Pam","SE","40000"},
            {"105","Sara","SSE","50000"}
        };
        System.out.println("HR system passes employee string array to Adapter\n");
        ITarget target = new EmployeeAdapter();
        target.processCompanySallary(employeesArray);
    }

//    public static void observingThings() throws InterruptedException {
//        Subject RedMI = new Subject("Red MI Mobile", 10000, "Out Of Stock");
//
//        ConcreteObserver user1 = new ConcreteObserver("Anurag");
//        user1.addSubscriber(RedMI);
//
//        ConcreteObserver user2 = new ConcreteObserver("Pranaya");
//        user2.addSubscriber(RedMI);
//
//        ConcreteObserver user3 = new ConcreteObserver("Priyanka");
//        user3.addSubscriber(RedMI);
//
//        Thread.sleep(1000);
//
//        System.out.println("Red MI Mobile current state : " + RedMI.getAvailability());
//        System.out.println();
//
//        Thread.sleep(1000);
//
//        user3.removeSubscriber(RedMI);
//
//        Thread.sleep(1000);
//        RedMI.setAvailability("Available");
//    }

}