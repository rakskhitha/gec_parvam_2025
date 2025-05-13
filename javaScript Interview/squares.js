function sumOfSquaresOfOddNumbers(arr) {
    return arr.filter(num => num % 2 !== 0)
        .map(num=>num**2);
}

const numbers1 = [1, 2, 3, 4, 5];
// const numbers2 = [2, 4, 6, 8, 10];
// const numbers3 = [1, 3, 5, 7, 9];
const ans= sumOfSquaresOfOddNumbers(numbers1);
console.log(sumOfSquaresOfOddNumbers(numbers1));
// console.log(sumOfSquaresOfOddNumbers(numbers2));
// console.log(sumOfSquaresOfOddNumbers(numbers3));
