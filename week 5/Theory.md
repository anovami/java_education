**1. Что такое оператор ветвления?**
Конструкция, в которой в зависимости от истинности некоторого условия, выполняется одно из нескольких действий.

**2. Какие типы операторов ветвления вам известны?**

`if .. else`, `switch .. case`, `? : `.

**3. Какова синтаксическая структура каждого типа операторов ветвления?**

if .. else: 

       `if (<условие>) {<действие>}
       
       else if (<условие>) {<действие>}
       
       else {<действие>}`
       
switch .. case: 

`switch (переменная, которую сравниваем) {

case <переменная1, с которой сравниваем>:

<действие1>;

break;

case <переменная2, с которой сравниваем>:

<действие2>;

break;

default:

<действие>;

break;`

        
тернарный оператор :? : 

`<условие> ? <действие, если условие истинно> : <действие, если условие ложно>`

**4. Что означают ключевые слова “if”, “if else”, “else”. В каком случае их нужно использовать?**

“if” - если условие выполняется, сделай то-то, использовать при одном условии.
“else if” -  иначе если - добавление условий для проверки, можно использовать несколько, помимо первого if.
“else” - иначе, что делать если ни одно из условий не удовлетворяется.

**5. Какие типы данных можно использовать в операторе switch .. case?**

byte, Byte, short, Short, int, Integer, char, Character, Enum, String.

**6. В каком случае необходимо убрать ключевое слово “break” из оператора switch .. case?**

Для того чтобы объединить два условия case.

**7. Что такое тип Enum?**

Класс перечисления, который помогает ограничить множество допустимых значений для некоторого типа данных.

**9. В каком случае лучше использовать оператор ветвления switch .. case, в каком случае тернарный?**

Тернарный оператор лучше всего использовать для выражений, содержащих только одно условие для проверки и одной действие при каждом исходе. В остальных случаях для читаемости кода лучше использовать switch .. case или if .. else.
