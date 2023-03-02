class Botton {
    constructor(text){
        this.text = text;
    }
    show(){
        document.write(           
            '<div id=btn1 style=' +
            '"width: 150px;'+
            'height: 50px;'+
            'padding: 10px;'+
            'margin: 10px 20px;'+
            'background: red;' +
            'vertical-align: middle;'+
            'display: table-cell;'+
            'text-align: center;">'+
            '<a href = "#btn3">' + this.text + '</a></div>'      
        );
    }
}
class ColorBotton extends Botton{
    constructor(text, color){
        super(text);
        this.color = color;
    }
    show(){      
        document.write(
            '<div id=btn1 style=' +
            '"width: 150px;'+
            'height: 50px;'+
            'padding: 10px;'+
            'margin: 10px 20px;'+
            'background:'+ this.color +';'+
            'vertical-align: middle;'+
            'display: table-cell;'+
            'text-align: center;">'+
            '<a href = "#btn3">' + this.text + '</a></div>'      
        );
    }
}
btn1 = new Botton("Press me");
btn2 = new ColorBotton("Cancle", "blue");
btn1.show();
btn2.show();

