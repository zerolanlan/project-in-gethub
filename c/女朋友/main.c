#include <stdio.h>
#include <stdlib.h>


int main()
{
    int total=0;
    int choise;

    printf("�����Թ����ĸ��⣬���ڲ������Ů�����Ƿ�Ϊ�����Ů�� ����һ����\n");
    printf("һ�������� ���ֶ�ʮ��\n");

    printf("�У�����˯���Һ����ѿ��ڴ���Ϸ��\n");
    printf("Ů���������˻���\n");
    printf("�У��ԣ�����˯�\n");
    printf("Ů�����ˣ�������Ϸ������Ҫ������Ҳ������Ҫ�����ȥ���!\n");
    printf("�У����ա�\n");
    printf("���ʽ�������Ů������\n");
    printf("���ʽ�������Ů������\n");
    printf("1����������˵��\n");
    printf("2������������������ȥ\n");
    printf("3���������ѵ�����\n");
    printf("4����������һ�𿪺ڴ���Ϸ\n");


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
    printf("Ů�Ѻ��㳳���ˣ�һ��֮�£�˵��������˿���Ӧ����ô��?\n");

    printf("1�����뿪����Ů�����侲һ�£������ٺ�\n");
    printf("2�����̵�ͷ��Ů���ѵ�Ǹ\n");
    printf("3����ס��������˵�ҹ��ˣ�����ô�죿\n");
    printf("4����������������������������\n");
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
    printf("Ů�Ѵ��ڼ����ڼ䣬�����ֺ���Ը�����ʳ���Ӧ����ô�죿\n");

    printf("1:�����ԣ���������������\n");
    printf("2:����˵�����ֲ��֣�����㶫����ô��\n");
    printf("3:���ܸ����ԣ�������������ǰ������\n");
    printf("4:�����ԣ���������һ�����\n");


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

    printf("Ŀǰ�÷֣�%d\n",total);
    printf("�ģ������� ������ʮ��\n");
    printf("ĳ������Ů��������Ȼ����������ϵ�Ǹ��˵����ô�����Ƣ����û����˵��Ϊ�������û��Ƣ��������ΪЦ˵��������һ�����Խ����������Ů�Ѷ���˵��Ҷ��ҷ�����ô���������û�д���˵�������ھ�Ȼ��������ڵ������˵�㲻��ϣ������һ��Ů������������������� ��");
    printf("1:ϣ������Ϊ��Ҫ���ˣ�����Ҫ��������\n");
    printf("2:ϣ������Ϊ��������û��Ƣ��\n");
    printf("3:��ϣ������Ϊ������ϲ����û��Ƣ��\n");
    printf("4:��ϣ������Ϊ��ʹ�û�д���˵����\n");
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
