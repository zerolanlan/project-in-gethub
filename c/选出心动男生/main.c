#include <stdio.h>
#include <stdlib.h>

int main()
{
    int choise;
    char names[8][10]={"����","����ǿ","Ԭ��","�����","���ⳬ","������","������","����"};
    printf("�������ļα��У�\n");
    for(int i=0;i<8;i++){
        printf("%d�żα���%s\n",i+1,names[i]);
    }
    printf("��ѡ������Ķ�������");
    scanf("%d",&choise);
    switch(choise){
        case 1:
            printf("��ѡ����Ķ������ǣ�%d�żα� %s",choise,names[0]);
            break;
        case 2:
            printf("��ѡ����Ķ������ǣ�%d�żα� %s",choise,names[1]);
            break;
        case 3:
            printf("��ѡ����Ķ������ǣ�%d�żα� %s",choise,names[2]);
            break;
        case 4:
            printf("��ѡ����Ķ������ǣ�%d�żα� %s",choise,names[3]);
            break;
        case 5:
            printf("��ѡ����Ķ������ǣ�%d�żα� %s",choise,names[4]);
            break;
        case 6:
            printf("��ѡ����Ķ������ǣ�%d�żα� %s",choise,names[5]);
            break;
        case 7:
            printf("��ѡ����Ķ������ǣ�%d�żα� %s",choise,names[6]);
            break;
        case 8:
            printf("��ѡ����Ķ������ǣ�%d�żα� %s",choise,names[7]);
            break;

    }
}
