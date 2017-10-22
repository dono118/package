#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>

int main(void){
	
	// int32_t len = 10;
	// int32_t arr[len];
	// //clear array
	// for(int a=0;a<len;a++){
	// 	arr[a]=0;
	// }

	// for(int32_t i=0;i<len;i++){
	// 	printf("index %d,and value is %d\n", i,arr[i]);
	// }

	// int arr[] = {1,2,5,7,3,8};

	// for(int i=0;i<6;i++){
	// 	printf("%d\n", arr[i]);
	// }

	// int arr[3][4];
	// //clear arr
	// for(int i=0;i<3;i++){
	// 	for(int j=0;j<4;j++){
	// 		arr[i][j]=0;
	// 	}
	// }
	// for(int i=0;i<3;i++){
	// 	for(int j=0;j<4;j++){
	// 		arr[i][j]=0;
	// 	}
	// }

	int arr[3][4] = {
		{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12}
	};
	for(int i=0;i<3;i++){
		for(int j=0;j<4;j++){
			printf("index(%d,%d),%d\n", i,j,arr[i][j]);
		}
	}


	return EXIT_SUCCESS;
}