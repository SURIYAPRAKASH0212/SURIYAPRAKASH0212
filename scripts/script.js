/* console.log("Hello world");

console.log("Whats Happening");

let limit = 12345678910n;

console.log(limit+2025n);

console.log(typeof limit);

let num = 1234+5678;

let ans = `Ans = ${num}`;

console.log(ans);

let name = "Suriyaprakash";

let ans1 = `My Name is ${name}`;

console.log(ans); */

/* let name;

name = prompt('Enter your name : ');

let quiz;

quiz = confirm(`is your name is ${name} ?`);

console.log(quiz); */

// let name = 'Suriya';

// name = Number(name);

// console.log(name);

/* let num=4;
let fact=0;
for(let i=num;i>0;i--){
    fact=fact+i;
}
let bday=new Date('2006-12-02');
console.log(bday.getFullYear()); */

function nadd(n){
    if(n==0){
        return 0;
    }
    return n + nadd(n-1);
}

console.log(nadd(6));