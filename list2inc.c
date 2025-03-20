#include <stdio.h>

struct Node {
    int roll;
    struct Node *next;
};

void insert(struct Node *head) {
    struct Node *ob = (struct Node *)malloc(sizeof(struct Node));
    printf("Enter roll: ");
    scanf("%d", &ob->roll);
    ob->next = head->next;
    head->next = ob;
}

void display(struct Node *head) {
    struct Node *temp = head->next;
    while (temp != NULL) {
        printf("%d\n", temp->roll);
        temp = temp->next;
    }
}

int main() {
    struct Node *head = (struct Node *)malloc(sizeof(struct Node));
    head->next = NULL;
    insert(head);
    insert(head);
    insert(head);
    display(head);
    return 0;
}