package ������ͽӿ�;

import javax.jws.soap.SOAPBinding.Use;

public class usb�ӿ� {
	private usb�ӿ�[] usbArr = new usb�ӿ�[4];

	public Use[] getUsbArr(Use[] usb�ӿ�) {
		return usb�ӿ�;
	}
	public void setUsbArr(usb�ӿ�[] usbArr) {
		this.usbArr = usbArr;
	}
	
	public void add(usb�ӿ� usb){
		for(int i=0;i<usbArr.length;i++){
			if(usbArr[i]==null){
				usbArr[i]=usb;
				break;
			}
		}
	}
	
	public void powerOn(){
		for(int i=0;i<usbArr.length;i++){
			if(usbArr[i]!=null){
				usbArr[i].turnOn();
			}
		}
		System.out.println("������Ѿ�������");
	}
	
	private void turnOn() {
		// TODO Auto-generated method stub
		
	}
	public void powerOff(){
		for(int i=0;i<usbArr.length;i++){
			if(usbArr[i]!=null){
				usbArr[i].turnOff();
			}
		}
		System.out.println("������Ѿ��ػ���");
	}
	private void turnOff() {
		// TODO Auto-generated method stub
		
	}
}


