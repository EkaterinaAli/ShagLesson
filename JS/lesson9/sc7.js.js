colorBlock.addEventListener("click", function(){
   /* colorBlock.style.backgroundColor =
    "rgb(" +
    Math.round(255*Math.random()) +
    "," +
    Math.round(255*Math.random()) +
    "," +
    Math.round(255*Math.random()) +
    ")" ;*/
    let colors = ["red", "green", "yellow"];
    let index = Math.round(2*Math.random());

    colorBlock.style.backgroundColor = colors[index];})