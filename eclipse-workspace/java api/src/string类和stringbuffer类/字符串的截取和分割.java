package string���stringbuffer��;

public class �ַ����Ľ�ȡ�ͷָ� {

	public static void main(String[] args) {
		String str = "��ë��-ƹ����-����";
		//�������ַ�����ȡ����
		System.out.println("�ӵ�5���ַ���ȡ��ĩβ�Ľ����"+str.substring(4));
		System.out.println("�ӵ�5���ַ���ȡ����6���ַ��Ľ����"+str.substring(4, 6));
	//�������ַ����ָ�Ĳ���
		System.out.println("�ָ����ַ��������е�Ԫ������Ϊ��");
		String[] strArray = str.split("-");		//���ַ���ת��Ϊ�ַ�������
		for (int i = 0;i<strArray.length;i++) {
			//���������������һ��Ԫ�أ���Ԫ�غ���Ӷ���
			System.out.print(strArray[i] + ",");
		 {
		//��������һ��Ԫ�أ���Ԫ�غ���Ӷ���
			System.out.println(strArray[i]);

	}

		}
	}
}

