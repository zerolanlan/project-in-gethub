package IO;
public class ͼ����� {
	int id;
	String name;
	double price;
	int number;
	double money;
	String Publish;
	public ͼ�����(int id,String name,double price,int number,double money,String Publish) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
		this.money = money;
		this.Publish = Publish;
	}  //10~17�д��붨����һ���вεĹ��췽�������ڶ���Ĵ����ͳ�ʼ����
	public String toString() {
		String message = "ͼ���ţ�"+id+"ͼ�����ƣ�"+name+"�����磺"+Publish+"���ۣ�"+price+"���������"+number;
		return message;
	}//18~21����д��toString()���������ڷ���ͼ�����ϸ��Ϣ
	public void setNumber(int number) {
		this.number=number;
	}//22~24������һ��setNumber()�����������޸�ͼ������
}

