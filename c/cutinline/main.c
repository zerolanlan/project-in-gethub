#include <stdio.h>
#include <stdlib.h>
int main()
{
    char name[10];
    int n;
    char line[10][10]={"����","����","����","����","С��"}��
    printf("��㵱�Ķ��У�\n");
    for(int i=0;i<10;i++){
        printf("%a\n",line[i]);
    }
    printf("��ʱͻȻ�ܳ�һ��������ӣ��������ֽУ�\n");
    scanf("%s",name);
    printf("���嵽�ĵ�");
    scanf("%d",&n);
    printf("λ\n");
    for(int i=9;i>=n-1;i--);
       strcpy(line[i],line[i-1]);
}
    strcpy(line[n-1],name);
    printf("������ʦ�����˲�ӣ�\n");
    printf("��ǰ����Ϊ��\n");
    for(int i=0;i<10;i++);
    printf("%s\n",line[i]);
  }
    return 0;;
}
