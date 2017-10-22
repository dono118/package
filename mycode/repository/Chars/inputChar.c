#include <stdio.h>
#include <stdlib.h>

int main(void){
	puts("Please input a char");

	char inputChar = getchar();

	printf("%c\n", inputChar);
	return EXIT_SUCCESS;
}