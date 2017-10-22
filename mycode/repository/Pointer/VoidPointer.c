#include <stdio.h>
#include <stdlib.h>

int main(void){
	
	// const void *data = "Hello World";
	// printf("%s\n", data);

	void *data = malloc(8);
	int *intData = (int *)data;
	intData[0] = 10000;

	printf("%d\n", intData[0]);
	free(data);
	
	return EXIT_SUCCESS;
}