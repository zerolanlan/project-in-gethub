package ��ļ̳�;
public class SendTask {
		private String goodsWeight;
		private String sendNumber;
		private String number;
		private Object goodWeight;
		public String getGoodsWeight() {
			return goodsWeight;
		}
		public void setGoodsWeight(String goodsWeight) {
			this.goodsWeight = goodsWeight;
		}
		public String getSendNumber() {
			return sendNumber;
		}
		public void setSendNumber(String sendNumber) {
			this.sendNumber = sendNumber;
		}
		
		public SendTask(){
			super();
		}
		public SendTask(String goodWeight,String sendNumber){
			this.goodsWeight=goodWeight;
			this.sendNumber = sendNumber;
		}
		
		//����ǰ
		public void sendBefore(){
			System.out.println("������ʼ�����ֿ������...");
			System.out.println("���������Ϊ��"+goodsWeight);
			System.out.println("���������ϣ�");
			System.out.println("����װ����ϣ�");
			System.out.println("�˻�����֪ͨ��");
			System.out.println("��ݵ���Ϊ��"+sendNumber);
		}
		
		
		//������
		public <GPS> void send(Trasportation t,GPS tool){
			System.out.println("�˻���"+t.Getadmin()+"���ڼ�ʻ���Ϊ"+t.Getnumber()+"��"+t.getModel()+"�������...");
			t.transport();
			String showCoodinate = tool.showCoordinate();
			System.out.println("��ǰ����Ϊ��"+showCoordinate);
		}
		
		//�����
		public void sendAfter(Trasportation t){
			System.out.println("���������Ѿ���ɣ�");
			System.out.println("�˻���"+t.Getadmin()+"��ʻ�ı��Ϊ"+t.Getnumber()+"��"+t.getModel()+"�Ѿ��黹��");	
		}
		public String getNumber() {
			return getNumber();
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public double getGoodweight() {
			return getGoodweight();
		}
		public void setGoodWeight(double goodweight) {
			this.goodWeight = goodWeight;
		}
}
		

