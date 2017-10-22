#include <stdio.h>
#include <stdlib.h>

int main(void){

	int i = 0;

	label:
	printf("%d\n", i);
	// printf("100\n");
	// printf("101\n");
	// printf("102\n");

	i++;
	if(i<20){
		goto label;
	}

	return EXIT_SUCCESS;
}