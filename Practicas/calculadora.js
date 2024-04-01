
function calculadora(){
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let oper = document.getElementById("oper").value;
    let result = 0;

    switch(oper){
        case "+":
            result = parseFloat(num1) + parseFloat(num2);
            break;
        case "-":
            result = parseFloat(num1) - parseFloat(num2);
            break;
        case "*":
            result = parseFloat(num1) * parseFloat(num2);
            break;
        case "/":
            result = parseFloat(num1) / parseFloat(num2);
            break;
    }

    document.getElementById("result").value = result;
    console.log(result);
    return false; //para não atualizar a página

    
}