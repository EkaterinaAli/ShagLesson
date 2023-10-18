package dao.jdbs_test;

import dao.impl.EmployeeDAOImpl;
import dao.impl.OfficeDAOImp;
import dao.impl.PassportDAOImpl;
import model.Employee;
import model.Office;

public class Test {
    public static void main(String[] args) {
        //Employee empl1 = new EmployeeDAOImpl().findById(2);
        //System.out.println(empl1.getPassportId());
        //System.out.println( new PassportDAOImpl().all().size());
        //System.out.println( new EmployeeDAOImpl().all().size());
        Office office = new Office();
        office.setAddress("address");
        office.setPhone1("123");
        office.setPhone2("445");
        office.setPostalCode(22222);
        office.setTitle("Nain 1");
        boolean isCreated = new OfficeDAOImp().createOffice(office);
        System.out.println("New office has been created " + isCreated);
    }
}
