package ���췽��;
class Person{
	private String name;
	private int age;
	public Person(){
		System.out.println("�޲ι��췽��----");
	}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public Person(String name){
		this.name=name;
	}
	public void speak(){
		System.out.println("name="+name+",age="+age);
	}
}
public class ���췽��������{
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person("����",25);
		Person p3=new Person("����");
		p1.speak();
		p2.speak();
		p3.speak();
	}
}

