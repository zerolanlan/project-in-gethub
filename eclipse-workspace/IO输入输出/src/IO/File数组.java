package IO;

import java.io.File;

public class File���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\test");//����һ������Ŀ¼��File����
		deleteDir(file);//����deleteDirɾ������
		
	}
	public static void deleteDir(File dir) {
		if (dir.exists()) {	//�жϴ����File�����Ƿ����
			File[]  files = dir.listFiles();//�õ�File����
			for (File file : file) {  //�������е���Ŀ¼���ļ�
				if (file.isDirectory())  {
					deleteDir(file); // �����Ŀ¼���ݹ�������deleteDir����
				}else {
					//������ļ���ֱ��ɾ��
					file.delete();
				}				
			}
			//ɾ����һ��Ŀ¼��������ļ��󣬾�ɾ�����Ŀ¼
			dir.delete();
		}
	}
}
