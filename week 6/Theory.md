**1. Что такое цикл?**

Конструкция, которая позволяет многократно выполнять один и тот же участок кода.

**2. Что такое шаг и итерация цикла?**

Одно выполнение тела цикла.

**3. Какие типы циклов вы знаете?**

while - цикл с предусловием, do .. while - цикл с постусловием, for - цикл со счетчиком, foreach.. - цикл для каждого, разновидность цикла for..

**4. Какова синтаксическая структура каждого типа циклов (кроме циклов foreach..)?**

Цикл while: `while (<условие>) {<тело цикла>}`
Цикл do .. while: `do {<тело цикла>} while (<условие>)`
Цикл for: `for (<начальное действие>, <условие>, <действие после итерации>) {<тело цикла>}`

**5. Что располагается в параметрах “начальное действие” и “действие после итерации” в цикле for?**

“Начальное действие” - место, в котором объявляется счетчик цикла, но может быть произведено любое другое действие. Данная часть выполняется только один раз перед началом цикла.
“Действие после итерации” - действие, которое будет выполнено после каждой итерации (шага), если она не была прервана. Обычно, увеличивается счетчик цикла, который был объявлен в параметре “начальное действие”, но может быть совершено и любое другое действие. 

**6. Что такое область видимости переменной?**

Свойство быть доступными из тех или иных частей кода, то есть различимых областей программы. 

**7. Каковы особенности области видимости переменной, объявленной в параметре “начальное действие” цикла for?**

Область видимости только в пределах цикла for, чтобы получить доступ к переменной i за пределами цикла, её нужно объявить за пределами цикла.

**8. Для чего нужны операторы break и continue?**

break - прервать выполнение цикла, continue - для пропуска какого-либо шага и перехода к следующему. 

**9. Какие способы задания бесконечного цикла вы знаете?**

При помощи цикла while, задав в качестве условия true, также с циклом do .. while.
При помощи цикла for, не задавая никаких параметров. 