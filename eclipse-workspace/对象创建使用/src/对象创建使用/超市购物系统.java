package ���󴴽�ʹ��;

public class ���й���ϵͳ {

	public static void main(String[] args) {
		// ������Ʒ���󣬸����ָ�ֵ
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		p1.setProName("���ӻ�");
		p2.setProName("���ӻ�");
		p3.setProName("���ӻ�");
		p4.setProName("���ӻ�");
		p5.setProName("���ӻ�");
		//�������ж��󣬸��������ָ�ֵ�����ֿ⸳ֵ
		Market m = new Market();
		m.setMarketName("���ָ�");
		m.setProductArr(new Product[] {p1,p2,p3,p4,p5});
		//�����˶��󣬸����ָ�ֵ
		Person p = new Person();
		p.setName("С��");
		//���ù��﷽����ָ�����к���Ʒ�����õ�������
		Product result = p.shopping(m,"������");
		//���ݽ�������ж�
		if (result != null) {
			System.out.println(p.shopping() +"��"+ m.getMarketName() + "����" + result.getProName());			
		}else {
			System.out.println(p.getName() + "����һ�ˣ���" + m.getMaketName() + "ʲô��û��");
		}
		
	}

}