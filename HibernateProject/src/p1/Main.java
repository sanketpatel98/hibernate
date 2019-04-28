package p1;

import org.hibernate.Session;
import org.hibernate.*;
import org.hibernate.cfg.*;

import antlr.collections.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Student st = new Student();
		/*st.setName("sanket9");
		st.setPass("1219");
		session.save(st);*/
		
		st.setName("sanket3");
		st.setPass("ayushi");
		session.delete(st);
		
		
		
		Query query = session.createQuery("from Student"); 
		java.util.List l = query.list();
		
		for(int i=0;i<l.size(); i++)
		{
		Student stu = (Student)l.get(i);
		 
		System.out.println(stu.getName()+" "+stu.getPass());
		// print eb.getEid()
		// print eb.getFname()
		}
		t.commit();
		session.close();
		System.out.println("inserted!");
	}
}
