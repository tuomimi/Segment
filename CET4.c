#include<stdio.h>

main()
{
	int i,m,n;
	int a[8];
	printf("�������㿼�ļ��Ĵ���n��");
	scanf("%d",&n);
    printf("�����������ļ��ɼ���");
	for(i=0;i<n;i++)
	{
      scanf("%d",&a[i]);
        if (a[i]>=425)
			m= 1;
		else
			m= 0;
	}
	if(m=0)
		printf("����δͨ���ļ���");
	else
		printf("����ͨ���ļ���");
}
