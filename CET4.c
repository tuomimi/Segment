#include<stdio.h>

main()
{
	int i,m,n;
	int a[8];
	printf("请输入你考四级的次数n：");
	scanf("%d",&n);
        printf("请输入您的四级成绩：");
	for(i=0;i<n;i++)
	{
           scanf("%d",&a[i]);
           if (a[i]>=425)
		m= 1;
           else
		m= 0;
	}
	if(m=0)
		printf("您还未通过四级！");
	else
		printf("您已通过四级！");
}
