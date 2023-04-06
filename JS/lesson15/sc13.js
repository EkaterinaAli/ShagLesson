/*let monster = {
    type: "dragon",
    hp:20.0,
    attack:10,
    gold:100,
    idDead:false
}*/
//let jsonMonster = JSON.stringify(monster);
//alert(jsonMonster);
let badExample = {
    [Symbol("id")]: 1,
    property: undefined,
    Foo() {
    console.log("Hi!");
    }
   }
   //let emptyStr = JSON.stringify(badExample);
   //alert(emptyStr);
  /* let warrior = {
       name: "bowman",
       attack: 5,
       hp:20,
       isRange: true
   }
   let bow ={
       type: "block",
       damage:3,
       range:10
   }
   bow.parent = warrior;
   warrior.child = bow;
   let fail = JSON.stringify(warrior)
   console.log(fail)*/
   
   let backpack = {
       type: "backpack",
       stationary: false,
       content:["sword","book","potion"]

   }

   let chest = {
    type: "chest",
    stationary: true,
    content:["arror","helmet","shiled"]
   }
   function cheskStationary(key,value){
       if (key === "stationary" && value == true){
           return undefined;
       }
       return value;
   }
   //let chest1 = JSON.stringify(chest,cheskStationary,2)
   //alert (chest1)
   
  let monsterStr = '{"type":"dragon","hp":20.0,"attack":10,"gold":100,"idDead":false}'
  let monster = JSON.parse(monsterStr);
  alert(monster.type)
  alert(monster.hp);
