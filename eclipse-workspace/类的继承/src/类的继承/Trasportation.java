package ��ļ̳�;

public abstract class Trasportation {
	private String number; //���
	private String model;  //�ͺ�
	private String admin; //�˻�������
	public void Transportion()	{
	}
	public Trasportation(String number, String model, String admin) {
		this.number = number;
		this.model = model;
		this.admin = admin;
	}
	//���䷽��
	public abstract void transport();
	//���
	public void setNumber(String number) {
		this.number = number;
	}
	public String Getnumber() {
		return number;
	}
	//�ͺ�
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	//������
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String Getadmin() {
		return admin;
	}
}
