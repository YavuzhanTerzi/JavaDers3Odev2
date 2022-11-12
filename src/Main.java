public class Main {
    public static void main(String[] args)
    {
        //Overloading
        Dortislem dortislem = new Dortislem();
        System.out.println(dortislem.topla(3,8));

        //Inheritance
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.BestEmployee();

        //Inheritance Demo
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());


    }
}