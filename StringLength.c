#include <stdio.h>
void main() {
    char s[100];
    int length = 0;

    printf("Enter a string: ");
    scanf("%s", s); 
    
    while (s[length] != '\0') {
        length++;
    }

    printf("The length of the string is: %d\n", length);
}