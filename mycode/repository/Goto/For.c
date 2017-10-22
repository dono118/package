#include <stdio.h>
#include <stdlib.h>

int main(void){

	for(int i=1;i<=9;i++){
		for(int j=1;j<=i;j++){
			printf("%d*%d=%d\t",i,j,i*j);

			if(i*j>24){
				goto end;
			}
		}
		printf("\n");
	}
	end:

	return EXIT_SUCCESS;
}