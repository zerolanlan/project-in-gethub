package string���stringbuffer��;

public class �ַ����Ļ������� {

	public static void main(String[] args) {
		String s ="ababcdedcba";//�����ַ���
		System.out.println("�ַ����ĳ���Ϊ��" + s.length());//��ȡ�ַ������ȣ����ַ�����
		System.out.println("�ַ����еĵ�һ���ַ���" + s.charAt(0));
		System.out.println("�ַ�c��һ�γ��ֵ�λ�ã�" + s.indexOf('c'));
		System.out.println("�ַ������һ�γ��ֵ�λ�ã�"+ s.indexOf('c'));
		System.out.println("���ַ�����һ�γ��ֵ�λ�ã�"+ s.indexOf("ab"));
		System.out.println("���ַ������һ�γ��ֵ�1λ�ã�" + s.indexOf("ab"));
	}

}
