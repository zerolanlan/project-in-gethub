#include <stdio.h>
#include <stdlib.h>

int main()
{
   double total=0;
   double current=0;

    for(int i=0;i<64;i++){
            if(i==0){
        current=1;
        }else{
            current*=2;
        }
        total+=current;
        printf("��%d����������Ϊ: %f,����Ϊ��%f\n",i+1,current,total);
    }
    printf("�ܹ�%f���%f��\n",total/50000,total/50000000);
    return 0;
}

