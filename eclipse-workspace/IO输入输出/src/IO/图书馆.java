package IO;
public class ͼ��� {
	static ArrayList<Books>booksList = new ArrayList<Books>();//�������
	public static void main(String[] args) {
		init();//��ʼ�����
		//�����������ͼ����Ϣ��ӡ����
		for (int i = 0;i < booksList.size();i++) {
			System.out.println(booksList.get(i));
		}
		while(true) {
			//��ȡ����̨��Ϣ
			Scanner scan = new Scanner(System.in);
			System.out.print("������ͼ���ţ�");
			int bookId = scan.nextInt();          ///nextInt()ʲô��˼
			Books stockBooks = getBooksById(bookId);    /////???????ʲô��˼
			if(stockBooks != null) {//�ж��Ƿ���ڴ�ͼ��
				System.out.println("��ǰͼ����Ϣ��"+stockBooks);   //print��println��ʲô����
				System.out.print("�����빺��������");
				int bookNumber = scan.nextInt();
				if (bookNumber <= stockBooks.number) {//�жϿ���Ƿ��㹻
					//��������Ϣ��װ��books����
					Books books = new Books(stockBooks.id, stockBooks.name, stockBooks.price, bookNumber,
							stockBooks.price*bookNumber,stockBooks.Publish);
					FileUtil.saveBooks(books);//���������ݱ����������ļ�
					//�޸Ŀ�桢
					stockBooks.setNumber(stockBooks.number - bookNumber);   //26~32��������setNumber����
				}else {
					System.out.println("��治�㣡");
				}
			}else {
				System.out.println("ͼ�����������");
			}
		}
	}

    					//41~51ҳ��ʼ������ϵ�ͼ����Ϣ ��ͼ����������
	private static void init() {
		Books goods1 = new Books(101, "Jave��������", 44.50, 100, 4450.00, "�廪��ѧ������");
		Books goods2 = new Books(102, "Jave���˼��", 108.00, 50, 5400.00, "��е��ҵ������");
		Books goods3 = new Books(103, "���Jave����", 99.00, 100, 9900.00, "���ӹ�ҵ������");
		booksList.add(goods1);
		booksList.add(goods2);
		booksList.add(goods3);
	}
	                   //���������ͼ���Ų���ͼ����Ϣ   ѭ�����������ͼ����Ϣ���ҵ�ͼ������ȵ�ȡ��
	private static Books getBooksById(int bookId) {
		for (int i = 0; i < booksList.size(); i++) {
			Books thisBooks = booksList.get(i);    //i�����������
			if (bookId == thisBooks.id) {
				return thisBooks;
			}
		}
		return null;
	}
}


