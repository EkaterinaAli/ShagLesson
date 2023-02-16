//1. Подсчитать сумму всех чисел в заданном пользователем
//диапазоне. 
/*var a = Number(prompt("Введите а", 0 ));
var b = Number(prompt("Введите b", 0 ));
var sum = 0;
for (let i =a; i < b; i++){
    sum = sum+i;

}
alert("Cумма " + sum);
console.log("Cумма " + sum);
document.write("Cумма " + sum);*/

//2. Запросить 2 числа и найти только наибольший общий
//делитель
/*var a = Number(prompt("Введите первое число", 0 ));
var b = Number(prompt("Введите второе число", 0 ));
while (a!=b) {
    if (a>b) {
      a = a -b;
    }
    else {
      b = b - a;
    }
  }
  nod = a;
  document.write("Наибольший общий делитель " + nod);*/

  //3.Запросить у пользователя число и вывести все делители
  //этого числа. 
 /* let number = prompt("Введите число для рачета его делителей");
  let str='';
for (let n = 1; n <= number; n++){
    let a = number % n
    if(a==0){
    str = n+ ',';
    }
}

document.writeln("Делители " + str);
*/
/*
//Определить количество цифр в введенном числе.
var num = parseInt(prompt("Введите положительное число"));
var k = 0;
while (num > 0){
    k++;
    num = parseInt(num/10);
    console.log(num)
}
alert("количество цифр " + k);*/
//5. Запросить у пользователя 10 чисел и подсчитать, сколько
//он ввел положительных, отрицательных и нулей. При этом
//также посчитать, сколько четных и нечетных. Вывести
//статистику на экран. Учтите, что достаточно одной переменной (не 10) для ввода чисел пользователем
/*var pol = 0;
var otr = 0;
var nuli = 0;
var chet = 0;
var nechet =0;
for (let i = 1; i<10; i++){
    let num = prompt("Введите число");
    if (num >0) pol++;
    else if (num < 0) otr++;
    else if (num ==0) nuli++;
    if (num % 2==0) chet++;
    else nechet++;
}
document.write("положительных, " + pol);*/
/*6. Зациклить калькулятор. Запросить у пользователя 2 числа
и знак, решить пример, вывести результат и спросить, хочет ли
 он решить еще один пример. И так до тех пор, пока
пользователь не откажется.
    answer = "yes"
    do{
    var num1 = parseInt(prompt("Введите положительное число"));
    var num2 = parseInt(prompt("Введите положительное число"));
    var sign = prompt("Введите знак операции", '+');
    var res =0;
    switch(sign){
        case "+": res = num1+num2; break;
        case "-": res = num1-num2; break;
        case "*": res = num1*num2; break;
        case "/": res = num1/num2; break;
        default: res= "нет такого значка"
    }
    console.log(res);
    answer = prompt("Введите yes для продолжения и любое другое для выхода "+ 'yes')
    }while(answer == "yes");*/

    /*Запросить у пользователя число и на сколько цифр его
    сдвинуть. Сдвинуть цифры числа и вывести результат (если
    число 123456 сдвинуть на 2 цифры, то получится 345612).*/

    let str = prompt("Введите число!");
        let k = prompt("На сколько цифр его сдвинуть?");
 
        console.log(str.slice(k) + str.slice(0, k));

