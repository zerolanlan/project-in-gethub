#include <stdio.h>
#include <stdlib.h>

double circleArea(double);
int main()
{
    double radio;
    printf("������Բ�İ뾶��");
    scanf("%lf",&radio);
    //double area=circleArea(radio);
    printf("\n�뾶Ϊ%f��Բ�����Ϊ%f",radio,circleArea(radio));
    return 0;
}
//��������
double circleArea(double r){
    double s=3.1315*r*r;
    return s;
    }
