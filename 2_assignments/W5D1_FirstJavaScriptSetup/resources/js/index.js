/*let number1 = Number(prompt("Please Enter your first number:", ""));
let operator = prompt("Please enter an operator:", "");
let number2 = Number(prompt("Please enter your second number:", ""));*/
/*let result;

alert("The result ist: " + calculate(number1, number2, operator));*/

import {calculate} from "./calculationEngine.js";

function onClickAdd(){
    let number1 = Number(prompt("Please Enter your 1st number:", ""))
    let number2 = Number(prompt("Please Enter your 2nd number:", ""))
    alert(calculate(number1, number2, "+"));
}

function onClickSubtract(){
    let number1 = Number(prompt("Please Enter your 1st number:", ""))
    let number2 = Number(prompt("Please Enter your 2nd number:", ""))
    alert(calculate(number1, number2, "-"));
}

function onClickDivide(){
    let number1 = Number(prompt("Please Enter your 1st number:", ""))
    let number2 = Number(prompt("Please Enter your 2nd number:", ""))
    alert(calculate(number1, number2, "/"));
}

function onClickMultiply(){
    let number1 = Number(prompt("Please Enter your 1st number:", ""))
    let number2 = Number(prompt("Please Enter your 2nd number:", ""))
    alert(calculate(number1, number2, "*"));
}

document.getElementById("1").addEventListener("click", onClickAdd);
document.getElementById("2").addEventListener("click", onClickSubtract);
document.getElementById("3").addEventListener("click", onClickDivide);
document.getElementById("4").addEventListener("click", onClickMultiply);