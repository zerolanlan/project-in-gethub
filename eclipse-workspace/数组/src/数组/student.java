package ����;

public class student {
	static String  schoolName;
	String studentName;
	int age;
	void introduce() {
		System.out.println(studentName+"�Ͷ���"+schoolName+",����"+age+"��");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 =new student();
		student s2 =new student();
		student.schoolName="ѧԺ";
		s1.studentName="����";
		s1.age=25;
		s1.introduce();
		s2.introduce();
		
	}

}
