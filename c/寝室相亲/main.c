#include <stdio.h>
#include <stdlib.h>

int main()
{   int a[8]={55,60,65,62,68,70,80,75};
    int b[8]={170,172,173,174,175,176,178,180,};
    int c,d,e,f,g,h,i,j;
    printf("���з���Ҫ�����ʾ�����ڡ�����֮����ʾ\n");
    printf("���������������(��λ��kg)��");
    scanf("%d",&c);
    for(i=0;i<8;i++){
        if(c==a[i]){
                printf("����\n");
                break;
        }
}
    printf("��������������(��λ��cm)��");
    scanf("%d",&d);
    for(i=0;i<8;i++){
        if(d==b[i]){
                printf("����\n");
                break;
        }
}
    printf("�����������͵����ط�Χ(�м�Ϊ��-��)��");
    scanf("%d-%d",&e,&f);
    for(i=0;i<8;i++){
        if(e>=a[i]){
            for(j=0;j<8;j++){
                    if(f<=a[j]){
                            printf("����\n");
                            break;
        }
}
     printf("�����������͵���߷�Χ(�м�Ϊ��-��)��");
     scanf("%d-%d",&g,&h);
     for(i=0;i<8;i++){
        if(e>=b[i]){
            for(j=0;j<8;j++){
                    if(f<=b[j]){
                            printf("����\n");
                            break;
        }

}
        }
     }
        }
    }
}
