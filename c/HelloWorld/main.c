#include <stdio.h>
#include <stdlib.h>

int main()
{    float weapon_attack;
     int strength;
     float real_damage;

     printf("�����������������ͽ�ɫ�������м��ÿո����\n");
     scanf("%f %d",&weapon_attack,&strength);
     real_damage = weapon_attack*(strength+100)/100;
     printf("��ɫʵ���˺�Ϊ��%.2f\n",real_damage);
    return 0;
}
