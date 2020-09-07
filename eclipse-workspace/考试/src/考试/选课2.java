package ����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ѡ��2<Student, Course> {
    public static int NowPos = 0;
    List<Student> SCList = new ArrayList<Student>();

    public void AddStudent(Student a) {
        SCList.add(a);
        NowPos=SCList.size()-1;
    }


    public String StudentExist(int a) {
        for (int i=0;i<SCList.size();i++) {
            Student tmp2 = (Student)SCList.get(i);
            if (a == tmp2.ID) {
                NowPos=i;
                return tmp2.name;
            }
        }
    return "111111";
    }

    public boolean StudentCourseExist(int CID) {
        Student b=(Student)SCList.get(NowPos);
        for (int i=0;i<b.Course.size();i++) {
            Course c=b.Course.get(i);
            if (c.ID==CID) return true;
        }
        return false;
    }

    public void CourseDelete(int CID) {
        Student b=SCList.get(NowPos);
        for (int i=0;i<b.Course.size();i++) {
            Course c=b.Course.get(i);
            if (c.ID==CID) {
                b.Course.remove(i); 
                return;
            }
         }      
    }

    public void AddCourse(Course a) {
        Student b=(Student)SCList.get(NowPos);


        Course c=new Course();

        for (int i=0;i<b.Course.size();i++) {
            c=b.Course.get(i);      
        }

        b.Course.add(a);


        for (int i=0;i<b.Course.size();i++) {
            a=b.Course.get(i);
        }
        SCList.set(NowPos, b);
    }

    public static int Compare(Student aa,Student bb) {
        if (aa.ID>bb.ID) return 1;
        if (aa.ID<bb.ID) return -1;
        return 1;
    }
    public void PrintSCInfo() {
        int flag1=0;
        int flag2=0;
        for (int i=0;i<SCList.size();i++) {
            flag1=1;
            Student b = (Student)SCList.get(i);
            System.out.println("ѧ�ţ�"+b.ID+"  ������"+b.name);
            System.out.println("      �Ѿ�ѡ�������¿γ̣�");
            for (int j=0;j<b.Course.size();j++) {
                flag2=1;
                Course c=(Course)b.Course.get(j);
                System.out.println("        "+c.ID+" "+c.name);
            }
            if (flag2==0) {
                System.out.println("��ѧ����û��ѡ��γ�");
            }
        }
        if (flag1==0) {
            System.out.println("û��ѧ����ѡ����Ϣ");
        }
    }

    public void PrintSingleStudentInfo(int a) {
        for (int i=0;i<this.SCList.size();i++) {
            Student tmp2 = (Student)SCList.get(i);
            if (tmp2.ID==a) {
                for (int j=0;j<tmp2.Course.size();j++) {
                    Course b=tmp2.Course.get(j);
                    System.out.println(b.ID+"  "+b.name);
                }
            if (tmp2.Course.size()==0) {
                System.out.println("��û��ѡ���κογ�");
            }
            return;
            }
        }
    }
}