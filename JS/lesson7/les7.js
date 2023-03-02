class List {
    constructor(values){
        this.values = values;
    }
       print(){
        this.values.sort();
        document.write('<p> <ol>');
         for (const elem of this.values){
             document.write("<li>" + elem + "</li>");
        }
        document.write('</ol> </p>');
    }
    add(elem){
        this.values.push(elem);
    }
    clear(){
        this.values.length = 0;
    }
}
sp1 = ['banan','apple', 'kiwi','peach', 'onion' ];
sp2 = ['C#', 'Java', 'pyton', 'JS'];
l1 = new List(sp1);
l1.print();
l1.add('milon');
l1.print();
l1.clear();
for(elem of sp2) l1.add(elem);
l1.print();

