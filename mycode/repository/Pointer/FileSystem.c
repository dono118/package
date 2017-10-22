#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void){

	//write file
	/*FILE * f = fopen("data.text","w");

	if(f != NULL){
		// fputc('A',f);
		fputs("Hello World!",f);
		fclose(f);		
	}else{
		puts("Can not save file");
	}*/

	//read file
	FILE *f = fopen("data.text","r");
	if(f){
		// char ch = fgetc(f);
		// printf("%c\n", ch);
		
		char buf[100];
		// fgets(buf,6,f);
		// puts(buf);
		memset(buf,0,100);
		for(int i=0;i<100;i++){
			char ch = fgetc(f);
			if(ch!=EOF){
				buf[i]=ch;
			}else{
				break;
			}
		}

		printf("%s\n", buf);
		fclose(f);
	}else{
		puts("Can read file");
	}
	
	puts("End");
	return EXIT_SUCCESS;
}