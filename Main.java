import java.util.Date;
public class Main {

	public static void main(String[] args) {

		StudentGroup stg=new StudentGroup(9);
	Date d=new Date(1999,8,11);
	Student s1=new Student(36,"qwerty",d,93.5);
                stg.addFirst(s1);
              System.out.println(stg.getStudent(0).getId());
	}

}
