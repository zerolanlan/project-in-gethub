package ��ҵ245;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class KTVByArrayList {
	public static void main(String[] args) {
		System.out.println("------------��ӭ�������ϵͳ------------");
		System.out.println("0.��Ӹ������б�");
		System.out.println("1.�������ö�");
		System.out.println("2.������ǰ��һλ");
		System.out.println("3.�˳�");
		ArrayList lineUpList = new ArrayList<>();
		addMusicList(lineUpList);
		while(true) {
			System.out.println("������Ҫִ�еĲ�����ţ�");
			Scanner scan = new Scanner(System.in);
			int command = scan.nextInt();
			switch (command) {
			case 0:
				addMusic(lineUpList);
				break;
				
			case 1:
				setTop(lineUpList);
				break;

			case 2:
				setBefore(lineUpList);
				break;

			case 3:
				exit();
				break;


			default:
				System.out.println("----------------------------------------");
				System.out.println("����ѡ��������������ȷ�Ĺ�����ţ�");
				break;
			}
			System.out.println("��ǰ�����б�"+lineUpList);
		}
	}
	private static void addMusicList(ArrayList lineUpList) {
		lineUpList.add("����");
		lineUpList.add("����ָ");
		lineUpList.add("�����");
		lineUpList.add("�����¿�");
		lineUpList.add("��");
		lineUpList.add("������");
		lineUpList.add("����");
		lineUpList.add("����");
		lineUpList.add("��������ϲ��");
		lineUpList.add("����ϲ����");
		lineUpList.add("Ϊ��дʫ");
		lineUpList.add("��û��");
		lineUpList.add("��������");
		lineUpList.add("�Ҵ�����");
		lineUpList.add("��µ�");
		System.out.println("��ʼ�赥�б�"+lineUpList);
	}
	private static void addMusic(ArrayList lineUpList) {
		System.out.println("������Ҫ��ӵĸ������ƣ�");
		String musicName = new Scanner(System.in).nextLine();
		lineUpList.add(musicName);
		System.out.println("����Ӹ�����"+musicName);
	}
	private static void setTop(ArrayList lineUpList) {
		System.out.println("������Ҫ�ö��ĸ������ƣ�");
		String musicName = new Scanner(System.in).nextLine();
		int position = lineUpList.indexOf(musicName);
		if(position < 0) {
			System.out.println("��ǰ�б���û������ĸ�����");
		}else {
			lineUpList.remove(musicName);
			lineUpList.add(musicName);
		}
		System.out.println("�ѽ�����"+musicName+"�ö�");
	}
	private static void setBefore(ArrayList lineUpList) {
		System.out.println("������Ҫ��ǰ�ĸ������ƣ�");
		String musicName = new Scanner(System.in).nextLine();
		int position = lineUpList.indexOf(musicName);
		if(position < 0) {
			System.out.println("��ǰ�����б���û������ĸ�����");
		}else if(position == 0){
			System.out.println("��ǰ�������������");
		}else {
			lineUpList.remove(musicName);
			lineUpList.add(position-1,musicName);
		}
		System.out.println("�ѽ�����"+musicName+"��ǰһλ");
	}
	private static void exit() {
		System.out.println("-----------------�˳�-------------------");
		System.out.println("�����˳�ϵͳ��");
		System.exit(0);
	}
}
	