#include <stdio.h>
#include <stdlib.h>

int main(void){
	
	// const char * str = "100";
	// int a;
	// sscanf(str,"%d",&a);

	// printf("Int value is %d\n", a);

	// double value = atof("3.14");
	// printf("%f\n", value);

	int value = 1000;
	char buf[10];
	sprintf(buf,"%d",value);

	puts(buf);
	
	return EXIT_SUCCESS;
}