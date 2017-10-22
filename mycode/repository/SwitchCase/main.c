#include "stdio.h"

#define UP 1
#define DOWN 2
#define LEFT 3
#define RIGHT 4

int main(){

	int32_t dir = UP;

	switch (dir){
		case UP:
			printf("Go up\n");
			break;
		case DOWN:
			printf("Go Down\n");
			break;
		case LEFT:
			printf("Go Left\n");
			break;
		case RIGHT:
			printf("Go Right\n");
			break;
		default:
			printf("Dir unknow\n");
	}

	return 0;
}