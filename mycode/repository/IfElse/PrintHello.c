#include <stdio.h>
#include <stdlib.h>

#define WIN 1
#define LINUX 2
#define MAC 3

void sayHello(){

#if PLATFORM==WIN
	printf("Hello Windows\n");
#elif PLATFORM==LINUX
	printf("Hello Linux\n");
#elif PLATFORM==MAC
	printf("Hello Mac\n");
#else
	printf("Unknow Platform\n");
#endif

}

typedef void(*SimpleFunc)();

int main(void){

	// sayHello();

	// void(*fp)(int,int,const char*) = &sayHello;
	// fp(0,0,"");

	SimpleFunc fp = &sayHello;
	fp();

	//puts("Hello World!");
	
	return EXIT_SUCCESS;
}