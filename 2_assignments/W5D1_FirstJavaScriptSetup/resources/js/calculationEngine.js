export function calculate(number1, number2, operator){
    let result;
    if (operator === "*") {
        result = number1*number2;
    } else if (operator === "/" && number2 !== 0) {
        result = number1/number2;
    } else if (operator === "+") {
        result = number1+number2;
    } else if (operator === "-") {
        result = number1-number2;
    } else {
        result = "This operator does not exist! Please enter one of the following symbols: *!/+-";
    }
    return result;
}
