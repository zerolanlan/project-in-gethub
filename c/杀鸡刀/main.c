#include <stdio.h>
#include <stdlib.h>

int main()
{
    int total=0;
    int choise;

    printf("�����Թ����ĸ��⣬���ڲ������Ů�����Ƿ�Ϊ�����Ů�� ����һ�ٷ�\n");
    printf("һ�������� ���ֶ�ʮ��\n");

    scanf("%d",&choise);

    switch(choise){
case 1:
    total+=0;
    break;
case 2:
    total+=0;
    break;
case 3:
    total+=20;
    break;
case 4:
    total+=5;
    break;
    }

    printf("Ŀǰ�÷֣�%d\n",total);
    printf("���������� ������ʮ��\n");
    printf("�У���������˯�ɣ���Ҫ�ͻ��ѿ��ڣ�\n");
    printf("Ů���ֿ��ڣ������ǿ�����Ҫ��������Ҫ����˵����\n");


    printf("�ʣ�����������˵�Ŀ�����ָ��\n");
    printf("1:������ʵ�Ǻ���ᣬ����һ�ֺڵ��ϵĺڻ�\n");
    printf("2:����Ҫȥ�����ˣ������Եø�������ζ��\n");
    printf("3:����һ��ֱ�м���е��罻������\n");
    printf("4:����ҪԼ�ϼ����ˣ�һ�����Ϸ�ˡ�\n");
    scanf("%d",&choise);

    switch(choise){
case 1:
    total+=0;
    break;
case 2:
    total+=0;
    break;
case 3:
    total+=0;
    break;
case 4:
    total+=30;
    break;
    }

    printf("Ŀǰ�÷֣�%d\n",total);
     printf("���������� ������ʮ��\n");
    printf("һ�죬����Ϲ��������Ϲ�һͬ�����������������̨�磡����Ϲ�������8��Ĺ�����������ˮ�������Ӿ�������������Lv�������þȣ�����������Lv�����޷�ͬʱ֧���Ϲ��͹������������ۿ��˺͹���Ҫ��ˮ�ˣ�������Σ������ʱ�������ô�죿\n");

    printf("1:���Ϲ��߿����������Ű�����ȡ�\n");
    printf("2�ù���ҧ���Ϲ������Ű������:\n");
    printf("3:�Լ�����ˮ���û���İ�����\n");
    printf("4:��110\n");
    scanf("%d",&choise);

    switch(choise){
case 1:
    total+=25;
    break;
case 2:
    total+=50;
    break;
case 3:
    total+=0;
    break;
case 4:
    total+=10;
    break;
    }

    printf("Ŀǰ�÷֣�%d",total);
    return 0;
    }
