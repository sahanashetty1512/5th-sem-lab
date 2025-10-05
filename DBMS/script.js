// script.js
function calculate(operation) {
  const num1 = parseFloat(document.getElementById('input1').value);
  const num2 = parseFloat(document.getElementById('input2').value);
  let result;

  switch (operation) {
    case 'add':
      result = num1 + num2;
      break;
    case 'subtract':
      result = num1 - num2;
      break;
    case 'multiply':
      result = num1 * num2;
      break;
    case 'divide':
      result = num2 !== 0 ? num1 / num2 : 'Error: Division by zero';
      break;
    case 'remainder':
      result = num2 !== 0 ? num1 % num2 : 'Error: Division by zero';
      break;
    case 'power':
      result = Math.pow(num1, num2);
      break;
    case 'squareRoot':
      result = num1 >= 0 ? Math.sqrt(num1).toFixed(4) : 'Error: Negative input';
      break;
    case 'square':
      result = Math.pow(num1, 2);
      break;
    default:
      result = 'Invalid operation';
  }

  document.getElementById('result').innerText = 'Result: ' + result;
}
