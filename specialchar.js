const str = "how$are$you";
console.log("special character :" + str);
const regex = /[^A-Za-z0-9]/;
if (regex.test(str)) console.log("String contains special characters");
else console.log("String does not contain any special character.");
