#include <stdio.h>

int main(){

	// int32_t a = 8;
	// int32_t b = 6;

	// if(a>b){
	// 	printf("Max num is a,%d\n", a);
	// }else{
	// 	printf("Max num is b,%d\n", b);
	// }

	int32_t score = 90;

	if(score>80){
		printf("Fine\n");
	}else if(score>=60){
		printf("OK\n");
	}else{
		printf("Fail\n");
	}

	return 0;
}