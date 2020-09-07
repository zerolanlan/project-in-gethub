package ��ҵ245;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DocumentManager {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("**1:ָ���ؼ��ּ����ļ�/n 2:ָ����׺�������ļ�/n 3:�����ļ�/Ŀ¼ /n 4:�˳�**");
		while (true) {
			System.out.println("������ָ�");
			int command = sc.nextInt();
			switch (command) {
			case 1:
				searchByKeyWorld();   //�ƶ��ؼ��ּ����ļ�
				break;
			case 2:
				searchBySuffix();   //ָ����׺�������ļ�
				break;
			case 3:
				copyDirectory();    //�����ļ�/Ŀ¼
			case 4:
				exit();  //�˳�
				break;
			default:
				System.out.println("�������ָ�����");
				break;
			}
		}
	}
	//********************1.ָ���ؼ��ּ����ļ�********************//
	private static void searchByKeyWorld() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ������Ŀ¼λ�ã�");
		String path = sc.next();    //�ӿ���̨��ȡ·��
		File file = new File(path);
		if (!file.exists() || !file.isDirectory()) {
			System.out.println(path+"(������ЧĿ¼)");
			return;
		}
		System.out.println("�����������ؼ��֣�");
		String key = sc.next(); //��ȡ�ؼ���
		//����Ŀ¼�»�ȡ���а����ؼ��ֵ��ļ�·��
		ArrayList<String> list = FileUtils.listFiles(file,key);
		for (Object obj : list) {
			System.out.println(obj);   //��·����ӡ������̨
		} 
	}
	//***********************************2.ָ����׺�������ļ�**************************
		private static void searchBySuffix() {
			Scanner sc = new Scanner(System.in);
			System.out.println("������Ҫ������Ŀ¼λ�ã�");
			String path = sc.next(); // �ӿ���̨��ȡ·��
			File file = new File(path);
			if (!file.exists() || !file.isDirectory()) {
				System.out.println(path+"(������ЧĿ¼)");
				return;
			}
			System.out.println("������������׺��");
			String suffix = sc.next();
			String[] suffixArray = suffix.split(",");  // ��ȡ��׺�ַ���
			//�����Ŀ¼�»�ȡ����ָ����׺�����ļ�·��
			ArrayList<String> list = FileUtils.listFiles(file,suffixArray);
			for (Object obj : list) {
				System.out.println(obj);
			}
		}
       //*******************3.�����ļ�/Ŀ¼******************//
		private static void copyDirectory() throws Exception{
			Scanner sc = new Scanner(System.in);
			System.out.println("������ԴĿ¼��");
			String srcDirectory = sc.next(); //�ӿ���̨��ȡԭ·��
			File srcFile = new File(srcDirectory);
			if (!srcFile.exists() || !srcFile.isDirectory()) {
				System.out.println("��Ч·����");
				return;
			}
			System.out.println("������Ŀ��λ�ã�");
			String destDirectory = sc.next();//�ӿ���̨��ȡĿ��·��
			File destFile = new File(destDirectory);
			if (!destFile.exists() || !destFile.isDirectory()) {
				System.out.println("��Ч·����");
				return;
			}
			//��Դ·���е����ݸ��Ƶ�Ŀ��·����
			FileUtils.copySrcPathToDestPath(srcFile,destFile);
		}
		//****************4.�˳�****************//
		private static void exit() {
			System.out.println("�����˳�ϵͳ��ллʹ�ã�");
			System.exit(0);
		}
}


