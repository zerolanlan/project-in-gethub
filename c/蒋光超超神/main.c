#include <stdio.h>
#include <stdlib.h>

int main()
{
    float hurt;   //�˺�
    float armor;    //����
    float life;     //����ֵ
    float mana;     //����
    float   speed;    //����
    int   coupons;  //��ȯ
    int   distance; //��������
    float magic_resistance;    //ħ��
    float life_regen;    //�����ظ�
    float mana_regeneration;   //ħ���ظ�
    int   gold_coin;     //���


    hurt=57.88;armor=756.22;life=616.28;mana=0.0;speed=340.23;coupons=450;distance=172;magic_resistance=96.99;life_regen=36.23;mana_regeneration=56.22;gold_coin=331;
    printf("����:���ⳬ����\n");
    printf("�˺�:%.2f      ����:%.2f\n",hurt,armor);
    printf("����ֵ:%.2f    ����:%.2f\n",life,mana);
    printf("����:%.2f      ��ȯ:%d\n",speed,coupons);
    printf("��������:%d    ħ��:%.2f\n",distance,magic_resistance);
    printf("�����ָ�:%.2f  ħ���ظ�:%.2f\n",life_regen,mana_regeneration);
    printf("���:%d        ��λ:��� ���� ����\n",gold_coin);
    return 0;
}
