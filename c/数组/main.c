#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a[]={8,4,2,1,23,344,12};
    int sum=0;
    double avg;

    for{int i=0;i<7;i++}{
       printf("%d",a[i]);
       sum+=a[i];
    }
     printf("\n�ܺ�Ϊ��%d",sum);
     avg=sum/7.0;
    printf("ƽ��ֵΪ��%.2f\n",avg);
    return 0;
}
