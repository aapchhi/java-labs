// 1 практика

// 1
int number = 2;
switch (number) {
    case 1:
        System.out.println("Number is 1");
        break;
    case 2:
        System.out.println("Number is 2");
        break;
    default:
        System.out.println("Number is not 1 or 2");
}

// 2
char letter = 'B';
switch (letter) {
    case 'A':
        System.out.println("Letter is A");
        break;
    case 'B':
        System.out.println("Letter is B");
        break;
    default:
        System.out.println("Letter is not A or B");
}

// 3
byte b = 1;
switch (b) {
    case 0:
        System.out.println("Byte is 0");
        break;
    case 1:
        System.out.println("Byte is 1");
        break;
    default:
        System.out.println("Byte is not 0 or 1");
}

// 4
short s = 3;
switch (s) {
    case 1:
        System.out.println("Short is 1");
        break;
    case 2:
        System.out.println("Short is 2");
        break;
    case 3:
        System.out.println("Short is 3");
        break;
    default:
        System.out.println("Short is not 1, 2, or 3");
}

// 5
String day = "Monday";
switch (day) {
    case "Monday":
        System.out.println("It's Monday");
        break;
    case "Tuesday":
        System.out.println("It's Tuesday");
        break;
    default:
        System.out.println("It's not Monday or Tuesday");
}

// 6
enum Color {
    RED, GREEN, BLUE
}

Color color = Color.GREEN;
switch (color) {
    case RED:
        System.out.println("Color is Red");
        break;
    case GREEN:
        System.out.println("Color is Green");
        break;
    case BLUE:
        System.out.println("Color is Blue");
        break;
}

// 2 практика

//Если a равно 1, то i будет установлено в 1, и выполнение выйдет из switch после break.
//Если a равно 2, то:
//i будет установлено в 2.
//Поскольку нет break, выполнение продолжится в case 3, и i будет установлено в 3.
//Затем выполнение выйдет из switch после break в case 3.
//Если a равно 3, то:
//i будет установлено в 3, и выполнение выйдет из switch после break.
//Если a не соответствует ни одному из case, то выполнится блок default, и i будет установлено в 0.
