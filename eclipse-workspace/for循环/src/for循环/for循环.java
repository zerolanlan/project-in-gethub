package forѭ��;

public class forѭ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;							//��������ѭ������
		itcast: for (i=1;i<=9;i++) {		//���ѭ��
			for(j=1;j<=i;j++) {				//�ڲ�ѭ��
				if(i>4) {					//�ж�i��ֵ�Ƿ����4
					break itcast;			//����ѭ��
				}
				System.out.print("*");	//��ӡ*
			}
			System.out.print("\n");		//����
		}
		
	}

}
