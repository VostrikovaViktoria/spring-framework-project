package hibernate_one_to_one;


import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

//
//        try{
//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Aleksandr", "Ivanov ", "IT", 600);
//            Detail detail = new Detail("Baku", "123456789", "ivanov@gmail.ru");
//            emp.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(emp);
//            System.out.println(emp);
//            session.getTransaction().commit();
//        }
//        finally {
//            factory.close();
//        }
//
//        try{
//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Oleg", "Smirnov ", "Sales", 700);
//            Detail detail = new Detail("Moscow", "985762143", "olejka@gmail.com");
//            emp.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(emp);
//            System.out.println(emp);
//            session.getTransaction().commit();
//        }
//        finally {
//            factory.close();
//        }

        Session session = null;
        try{
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp.getEmpDetail());
//            session.getTransaction().commit();

            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee emp = session.get(Employee.class, 1);
            session.delete(emp);
            System.out.println(emp.getEmpDetail());
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }

    }
}
