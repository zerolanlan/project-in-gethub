package �쳣;

import java.security.DigestException;

public class �Զ����쳣 {
	private static final int x = 0;
	private static final int y = 0;
	public static void main(String[] args) {
		// ����Ĵ��붨��һ��try-catch��䲶׽�쳣
		try {
			//����divide()����,����һ��������Ϊ������
			int result = divide (4,-2);
			System.out.println(result);
		}catch (DigestException e) {								//�Բ�׽�����쳣���д���
			System.out.println(e.getMessage());							//��ӡ������쳣��Ϣ
		}

	}
     //����ķ���ʵ���������������,��ʹ��throws�ؼ��������׳��Զ����쳣
	public static int divide(int x, int y) throws DigestException{
		if(y<0);
		//ʹ��throws�ؼ��������쳣����
		throw new Exception("�����Ǹ���");
	}
	int result = x / y ;			//����һ������result��¼����������Ľ��
	return result;				//���������
 }
}

