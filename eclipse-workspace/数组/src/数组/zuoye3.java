package ����;

public class zuoye3 {
	String name;//��Ա����
	int age;//�����Ա����
	
	void speak() {
		System.out.println(name+age);//�������������
	}
	
	public static void main(String[] args) {
		zuoye3 p1 = new zuoye3();//���ɶ���p1
		zuoye3 p2 = new zuoye3();//���ɶ���p2
		p1.name="zhangsan";//������p1��name������ֵ
		p1.name="lisi";//������p2��name������ֵ
		p1.age=25;//������p1��age������ֵ
		p2.age=30;//������p2��age������ֵ
		p1.speak();//���ö���p1�ĳ�Ա����speak
		p2.speak();//���ö���p2�ĳ�Ա����speak
	}
}
