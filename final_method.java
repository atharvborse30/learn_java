class FinalDemo {
    //create a final method
    public static void main(String[] args){
        System.out.println("This is a final method");
    }
}

class final_method extends FinalDemo{
    //try to override final method
    public final void display(){
        System.out.println("The final method is overriden");
    }

    public static void main(String[] args){
        final_method obj = new final_method();
        obj.display();
    }
    
}