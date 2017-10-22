#include <stdio.h>
#include <stdlib.h>

int main(void){
	
	//wirte
	/*FILE *f = fopen("data.text","w");
	if(f){
		
		int i = 0;
		for (i=0;i<100;++i){
			fprintf(f, "Item %d\n", i);
		}
		
		fclose(f);
	}else{
		printf("Can not write to file");
	}*/
	
	//read
	FILE *f = fopen("data.text","r");
	if(f){

		int a;
		fscanf(f,"Item %d\n",&a);
		fscanf(f,"Item %d\n",&a);
		printf("Num read is %d\n", a);

		fclose(f);
	}else{
		printf("Can not read file");
	}


	return EXIT_SUCCESS;
}