#include <stdio.h>
#include <stdlib.h>

int main()
{   int num1=1024;
    int num2=2048;
    int *ptr1;
    int *ptr2;
    ptr1= &num1;
    ptr2= &num2;
    printf("num1��ֵΪ��%d\tptr1ָ��%p\n",num1,ptr1);
    printf("num2��ֵΪ��%d\tptr2ָ��%p\n",num2,ptr2);
    ptr2=ptr1;
    //*ptr2=*ptr1;
    printf("���¸�ֵ��\n");
    printf("num2��ֵΪ��%d\tptr2ָ��%p\n",num2,ptr2);


    return 0;
}
