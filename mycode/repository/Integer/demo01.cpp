#include <stdio.h>

int main(void)
{
	int i = 10;
	int k = 20;
	int m;

	//m = (3>2) && (k=8);
	m = (1>2) || (k=8);
	printf("m = %d, k = %d\n", m, k);

	return 0;
}