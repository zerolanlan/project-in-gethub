 #include <graphics.h>
 #include <stdlib.h>
 #include <bios.h>   /*���弸�����ܰ���*/
 #define ESC 0x11b      /*ǿ���˳���Ϸ*/
 #define UP 0x4800      /*���������ĸ������ƶ�С��*/
 #define DOWN 0x5000
 #define LEFT 0x4b00 #define RIGHT 0x4d00  int a[50][50]={0}; /* ��ŵ�ͼ��Ϣ������  0�������ߵ��ϰ��� 1�������ߵ�·  */
 int qdx=1,qdy=1,zdx=20,zdy=20;  /* �����յ������ */
 int renx,reny;   /* С������  */
 int d=20;    /* С���ӵļ�� */
 int kk=0,rr=2;   main() {
     int i,j,m=30,n=16,d=20,k;
     int gdriver = DETECT, gmode;
     randtu(200);
     renx=qdx,reny=qdy;
     registerbgidriver(gdriver);
     initgraph(&gdriver, &gmode, "c:\\turboc2");
     redraw();
     while(1)              /* �����Ӽ��̻�ó�����Ҫ�İ��� */
        {     if(bioskey(1))         /* �ж��Ƿ��а��� */
        {        k=bioskey(0);       /* �������������k */
     switch(k)           /* �԰������з�������� */
     {    case ESC:            /* ESC�� �˳� */
         printf("%d times\n",kk);
          exit(0); break;    case UP:             /* UP�������ƶ���� */
              if(a[renx][reny-1]==1)
                {           reny-=1;
              redraw();        }

       break;
       case DOWN:           /* DOWN�������ƶ���� */
           if(a[renx][reny+1]==1)
            {           reny+=1;
           redraw();        }
           break;
           case LEFT:           /* LEFT�������ƶ���� */
               if(a[renx-1][reny]==1)
                {           renx-=1;
               redraw();        }
               break;
               case RIGHT:          /* RIGHT�������ƶ���� */
                   if(a[renx+1][reny]==1)
                    {           renx+=1;
                   redraw();        }
                   break;
                    }
                    }
                    }
                    getch();
                    closegraph(); } /*      redraw�ػ��������û��в������ػ���Ϸ���� */
                    redraw()
           {
               int i,j;
               for(i=qdx;i<=zdx;i++)
                for(j=qdy;j<=zdy;j++)
                {
                    if(i<renx+rr && i>renx-rr && j<reny+rr && j>reny-rr)
                    if(a[i][j]==0)   geziza(i*d,j*d);
                else          gezilu(i*d,j*d);
                else                gezibk(i*d,j*d);    }
                drawren(renx*d,reny*d); }  /*           �����ͼ��randlei����������������ɵ�ͼ */
                randtu(int num) {
                    int i,j,xx,yy,sum,t,m,n;
                    srand(time(NULL)); loop: sum=0;
                    m=zdy-qdy+1;  n=zdx-qdx+1;  a[qdx][qdy]=1;  a[zdx][zdy]=1;
                    do
                    {      t=random(m*n);      xx=t/m+1;      yy=t%m+1;
                    if(a[xx][yy]==0)
                        {          a[xx][yy]=1;
                    sum++;   }
                    }while(sum<num);
                    if(ok()) return;
                    for(i=0;i<50;i++)
                        for(j=0;j<50;j++)
                        a[i][j]=0;
                    kk++;
                    goto loop; } ok()  {
                        int b[50][50]={0};
                         b[qdx][qdy]=1;
                         tansuo(qdx,qdy,b);
                         return(b[zdx][zdy]); }
                         tansuo(int x,int y,int *b[50][50]) /* �����ǰ����Ϊ�հ��������������Χ̽�������Ƶ������
