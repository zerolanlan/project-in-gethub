package �쳣;

public class Throws�ؼ��� {		

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int result = divide(4,2);			//����divide
		System.out.println(result);
	}
	//���淽��ʵ�������������������ʹ��throws�ؼ��������׳��쳣
	public static int divide(int x,int y) throws Exception{
		int result = x / y;								//����һ������result��¼����������Ľ��
		return result;									//���������
	}
}
