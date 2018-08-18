export const strToNumber = function(strNum) {
  var cardNumber = 0;
  switch(strNum){
    case 'ONE' : cardNumber = 1;
      break;
    case 'TWO' : cardNumber = 2;
      break;
    case 'THREE' : cardNumber = 3;
      break;
    case 'FOUR' : cardNumber = 4;
      break;
    case 'FIVE' : cardNumber = 5;
      break;
    case 'SIX' : cardNumber = 6;
      break;
    case 'SEVEN' : cardNumber = 7;
      break;
    case 'EIGHT' : cardNumber = 8;
      break;
    case 'NINE' : cardNumber = 9;
      break;
    case 'TEN' : cardNumber = 10;
      break;
    case 'JACK' : cardNumber = strNum.toLowerCase();
      break;
    case 'QUEEN' : cardNumber = strNum.toLowerCase();
      break;
    case 'KING' : cardNumber = strNum.toLowerCase();
      break;
    case 'ACE' : cardNumber = strNum.toLowerCase();
      break;
  }
  return cardNumber;
};
