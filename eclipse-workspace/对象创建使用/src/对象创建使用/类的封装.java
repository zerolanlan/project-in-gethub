package ���󴴽�ʹ��;

public class ��ķ�װ {

		private String name;
		private int age;
		public String getName(){
			return name;
		}
		public void setName(String n){
			name = n;
		}
		public int getAge(){
			return age;
		}
		public void setAge(int a){
			if(a>0){
				age=a;
			}
			else{
				System.out.println("������������");
			}
		}
		
		public void introduce(){
			System.out.println("name="+name+";age="+age);
		}
	}

	