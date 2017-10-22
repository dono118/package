#include <stdio.h>
#include <stdlib.h>

typedef struct _Student{
	const char *name;
	int age;
} Student;

Student * createStudent(const char *name,int age){
	Student *s1 = (Student *)malloc(sizeof(Student));
	s1->name = name;
	s1->age = age;
	// Student * s2 = s1;
	// s1->age = 20;

	// printf("(s1.name=%s,s1.age=%d),(s2.name=%s,s2.age=%d)\n", s1->name,s1->age,s2->name,s2->age);
		return s1;
}

void deleteStudent(Student *p){
	free(p);
}

int main(void){
	Student * s = createStudent("lisi",20);

	printf("name=%s,age=%d\n",s->name,s->age);

	deleteStudent(s);

	return EXIT_SUCCESS;
}