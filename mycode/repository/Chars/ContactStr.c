#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void){
	
	const char * str = "Hello";
	const char * str1 = "World";

	const uint32_t DIST_LEN = 100;
	char dist[DIST_LEN];
	memset(dist,0,DIST_LEN);

	strcat(dist,str);
	strcat(dist," ");
	// strcat(dist,str1);
	strncat(dist,str1,3);

	puts(dist);
	return EXIT_SUCCESS;
}