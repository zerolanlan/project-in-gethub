#include <stdio.h>
#include <stdlib.h>

int main()
{
    int input;
    int sum=0;
    double avg=0;

    for(int i=0; i<5;i++ ){
        printf("�������%d��������\n",i+1);
        scanf("%d",&input);
        if(input<0){
            printf("������������\n");
            i--;
            continue;
        }
        sum+=input;
    }

    avg=sum/5.0;
    printf("ƽ��ֵΪ��%f\n",avg);

    return 0;
}
