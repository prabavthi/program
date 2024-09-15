const arr = ["walk the dog", "go shopping", "exercise"];
const index = 3;
const value = "go to the pharmacy";

function insert(array, val, ind) {
  return ind >= arr.length
    ? array.concat(val)
    : array.reduce(
        (accumulator, currentValue, i) =>
          accumulator.concat(i === ind ? [val, currentValue] : currentValue),
        []
      );
}

console.log(insert(arr, value, index));
