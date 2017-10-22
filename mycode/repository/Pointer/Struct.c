#include <stdio.h>
#include <stdlib.h>

//file(name,size)

// struct _File{
// 	const char *name;
// 	int size;	
// };

// typedef struct _File file;

typedef struct _File{
	const char *name;
	int size;
} File;

int main(void){

	//结构体初始化
	File file = {"hello.txt",200};
	// file.name = "hello.txt";
	// file.size = 100;

	printf("File name is %s,and file size is %d\n",file.name,file.size);
		
	return EXIT_SUCCESS;
}