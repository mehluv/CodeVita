#include<stdio.h>
#include<malloc.h>

struct set;

typedef struct node
{
	int i;
	int j;
	struct node* next;
	struct set *rep;
}node;

typedef struct set
{
	node* start;
	int size;
}set;

set* makeSet(node* n)
{
	n->next=NULL;
	set* s=(set*)malloc(sizeof(set));
	s->start=n;
	n->rep=s;
	s->size=1;
	return s;
}

set* find(node* n)
{
	if(n==n->rep->start)
		return n->rep;
	else
		return find(n->rep->start);
}

set* un(set* a, set* b)
{
	if(b->size>a->size)
		return un(b,a);
	node* t=a->start;
	while(t->next!=NULL)
		t=t->next;
	t->next=b->start;
	t=t->next;
	while(t!=NULL)
	{
//		printf("changing %d's rep to %d",t->index,a->start->index);
		t->rep=a;
		t=t->next;
	}
	a->size+=b->size;
//	free(b);
	return a;
}

int isItBordered(int i, int j)
{

}

int main()
{
	int i;
	fopen("tmp.txt","w");
	char* a=(int*)malloc(61*sizeof(int));
	for(i=0;i<8;j++)
	{
		fscanf("%s", a);
		for(j=0;j<61;i++)
		{
			if(a[j]=='#')
			{
				node* n1=(node*)malloc(sizeof(node));
				n1->i=i;
				n1->j=j;
			}
		}
	}
}
