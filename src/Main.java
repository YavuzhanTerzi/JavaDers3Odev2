public class Main {
    public static void main(String[] args) {
        //Overloading
        Dortislem dortislem = new Dortislem();
        System.out.println(dortislem.topla(3, 8));

        //Inheritance
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.BestEmployee();

        //Inheritance Demo
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager());

        //Polymorphism
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log(" sa world ");
        //----------------------------------
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//        for (BaseLogger logger : loggers) {
//            logger.Log("Log mesajı");
//        }
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.Add();


    }
}