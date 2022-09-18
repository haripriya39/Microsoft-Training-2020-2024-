#include<stdio.h>
int main()
{
  int N;
  scanf("%d",&N);
  for(int i=1;i<=N;i++)
  {
    for(int j=N;j>=i;j--)
    {
      printf("%d ",j);
    }
    printf("\n");
  }
  return 0;
}
