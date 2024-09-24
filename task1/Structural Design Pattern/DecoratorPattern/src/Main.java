public class Main {
    public static void main(String[] args) {

        Text text1 = new PlainText("Educational Initatives");
        text1= new BoldDecorator(text1);
        text1 = new ItalicDecorator(text1);
        text1 = new UnderlineDecorator(text1);
        Text text2 = new PlainText("Coding Assignment");
        text2= new BoldDecorator(text2);
        
        System.out.println(text1.getContent()); 
        System.out.println(text2.getContent()); 
    }
}