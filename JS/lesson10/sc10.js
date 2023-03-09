d1.onmouseenter = function(){
   s1.innerText = "d1";
  console.log("d1.onmouseenter");
}
d1.onmouseleave = function(){
   s2.innerText = "d1";
  console.log("d1.onmouseleave");
} 
d2.addEventListener("mouseenter", function(){
   s1.innerText = "d2";
  console.log("d2.onmouseenter");
})
d2.addEventListener("mouseleave", function(){
   s2.innerText = "d2";
  console.log("d2.onmouseleave");
})


d1.onmouseover = function(){
  s1.innerText = "d1";
 console.log("d1.onmouseover");
}
d1.onmouseout = function(){
  s2.innerText = "d1";
 console.log("d1.onmouseout");
} 
d2.addEventListener("mouseover", function(){
  s1.innerText = "d2";
 console.log("d2.onmouseover");
})
d2.addEventListener("mouseout", function(){
  s2.innerText = "d2";
 console.log("d2.onmouseout");
})