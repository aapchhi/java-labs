// 1 практика

static logic
logic (1) id= 1
logic (2) id= 1
ctor id= 100

//Сначала выполняется статический блок.
//Затем, при создании экземпляра, выполняются блоки инициализации (в порядке их объявления) и конструктор.
//Значение id в блоках инициализации до вызова конструктора равно 1, а в конструкторе оно изменяется на 100.