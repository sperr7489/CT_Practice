let test= ["전자"]
console.log([...test, ...test])

var a = ['바람', '비', '불'];
var myVar1 = a.join();      // myVar1에 '바람,비,불'을 대입
var myVar2 = a.join(', ');  // myVar2에 '바람, 비, 불'을 대입
var myVar3 = a.join(' + '); // myVar3에 '바람 + 비 + 불'을 대입
var myVar4 = a.join('');    // myVar4에 '바람비불'을 대입

console.log("myvar1 : ",myVar1)
console.log("myvar2 : ",myVar2)
console.log("myvar3 : ",myVar3)
console.log("myvar4 : ",myVar4)

let { kichang ,kisung} ={ 1: "천재",2:"바보"}
console.log(kisung)