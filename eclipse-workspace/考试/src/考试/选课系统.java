package ����;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ѡ��ϵͳ {

    public static void main(String[] args) {
        //Init The Class
    
        Scanner console=new Scanner(System.in);


        int num;
        int id;
        String name;
        while(1==1) {
            System.out.println("��ӭ����ѡ��ϵͳ");
            System.out.println("���������ѧ��");
            num=console.nextInt();
            id=num;
            if (num == 99991111) {
                System.out.println("��ã�����Ա�����������Ա����");
                num=console.nextInt();
                int flag=0;
                while(num!=1120172954){
                    System.out.println("����Ա�����������������<����56879�˳�����Աģʽ>");
                    num=console.nextInt();
                    if(num==56879) {
                        flag=1;
                        break;
                    }
                }
                if (flag==1) continue;

                //************************************����Աģʽ����*****************************************
                System.out.println("��ã�����Ա��������Ҫִ�еĲ�������");
                while(1==1) {
                    System.out.println("�鿴�γ�");
                    System.out.println("��ӿγ�");
                    System.out.println("�鿴����ѧ����ѡ����Ϣ");
                    System.out.println("�˳�����Աģʽ");
                    int tmp;
                    tmp=console.nextInt();
                    while (tmp<=0 || tmp>=5) {
                        System.out.println("�������������1��4֮��Ĵ���");
                    }
                    if (tmp == 4) break;
                    if (tmp == 1) {
                        course.PrintCourseList();
                        System.out.println("**********************�ָ���***********************");
                        continue;
                    }
                    String TmpName;
                    if (tmp == 2) {
                        System.out.println("������Ҫ��ӵĿγ̣�ϵͳ���Զ��������");
                        TmpName=console.next();
                        if (course.CourseExist(TmpName)==true) {
                            System.out.println("�γ��Ѿ�����");
                            continue;
                        }
                        Course course=new Course(TmpName);
                        course.AddCourse(course);
                        System.out.println("��ӿγ̳ɹ����γ̴���"+course.ID+"  �γ����ƣ�"+course.name);
                        System.out.println("**********************�ָ���***********************");
                        continue;
                    }
                    if (tmp == 3) {
                        e.PrintSCInfo();
                        System.out.println("**********************�ָ���***********************");
                        continue;
                    }
                }
                continue;
            }


            name=e.StudentExist(num);
            if (name!="111111") {
                System.out.println("��ã�"+name);
            }
            else {
                System.out.println("�������������");
                name=console.next();
                System.out.println("��ã�"+name+",���ѧ����"+num+"����Ϣ��ӳɹ�");
               
            }
            while(1==1){
                System.out.println("��ѡ������������������");
                System.out.println("1 �鿴��ѡ�γ�");
                System.out.println("2 ѡ��");
                System.out.println("3 ɾ���γ�");
                System.out.println("4 �˳�");
                System.out.println("**********************�ָ���***********************");
                num=console.nextInt();
                if (num<=0 || num>=5)
                do {
                    System.out.println("������1��3֮�������");
                    num=console.nextInt();
                }while(num<=0 || num >4);
                if(num==4) break;
                if (num == 1) {
                    e.PrintSingleStudentInfo(id);
                    System.out.println("**********************�ָ���***********************");
                    continue;
                }
                else if (num == 2) {
                    course.PrintCourseList();
                    while(1==1){
                        System.out.println("������Ҫѡ�Ŀγ̴���,����9999�˳�");
                        int CID=console.nextInt();
                        if(CID==9999) break;
                        if (course.CourseExist(CID)==false) {
                            System.out.println("�γ̲�����");
                            System.out.println("**********************�ָ���***********************");
                            continue;
                        }
                        if (e.StudentCourseExist(CID)==true) {
                            System.out.println("���Ѿ�ѡ���˸ÿγ�");
                            System.out.println("**********************�ָ���***********************");
                            continue;
                        }
                        Course course=new Course();
                        course.ID=CID;
                        course.name=course.ReturnCourseName(CID);
                        e.AddCourse(course);
                        System.out.println("���Ѿ��ɹ�ѡ���˸ÿγ�:"+CID+" "+course.name);
                        System.out.println("**********************�ָ���***********************");
                    }
                }
                else if (num == 3) {
                    System.out.println("�����ѡ�γ��б�Ϊ");
                    e.PrintSingleStudentInfo(id);
                    while(1==1) {
                        System.out.println("������Ҫɾ���Ŀγ̴��룬����9999�˳�");
                        int CID=console.nextInt();
                        if (CID==9999) break;
                        if (course.CourseExist(CID)==false) {
                            System.out.println("�γ̲�����");
                            System.out.println("**********************�ָ���***********************");
                            continue;
                        }
                        if (e.StudentCourseExist(CID)==false) {
                            System.out.println("�㲢δѡ���˸ÿγ�");
                            System.out.println("**********************�ָ���***********************");
                            continue;
                        }
                        e.CourseDelete(CID);    
                        System.out.println("��ɹ���ɾ���˿γ�"+CID+" "+course.ReturnCourseName(CID));
                        System.out.println("**********************�ָ���***********************");
                    }
                }
            }   
        }   
        }   
}
