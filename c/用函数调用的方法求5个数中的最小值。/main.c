#include <stdio.h>
#include <stdlib.h>

int main()
 {
int b,a,min;
   printf("������������ҳ����е���Сֵ��\n");
     scanf("%d",&a);
      min=a;
for(b=0;b<4;b++)
{
    scanf("%d",&a);
if(min>a) min=a;
}
   printf("��������У���Сֵ�ǣ�%d",min);
    return 0;
}

