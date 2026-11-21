public class interfs{
    public static void main(String []args){
    
        /* interface */
        showspec(new acer());
        showspec(new asus());

    }
    public static void showspec(laptop l){
        l.keybord();
        l.screen();
    }
}

interface laptop{
    void keybord();
    void screen();
}

class acer implements laptop{
    public void keybord(){
        System.out.println("Acer have normal keybord");

    }

    public void screen(){
        System.out.println("Acer have 90hz screen");
    }
}

class asus implements laptop{
    public void keybord(){
        System.out.println("asus have rgb keybord");
    }
    public void screen(){
        System.out.println("asus have 120hz screen");
    }
}