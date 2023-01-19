//single Inheritence 
class Parent{

    void message(){
        System.out.println("Parent message work hard ");
    }

}

class Child1 extends Parent{
    void message(){
        System.out.println("Listen to parent");
    }
}

class Child2 extends Child1{
    void message(){
        System.out.println("Listen to child1 ");
    }


    public static void main(String []args){

        Parent p1 = new Parent();

        //Child1 c1 = new Parent();  cant create instance of a parent of type child
        //Child2 c2 = new Parent();
        //Child1 c3 = new Parent();


        Parent c5 = new Child1();
        Parent c6 = new Child2();

        Child1 c1 = new Child1();
        Child1 c2 = new Child2();

        Child2 c3 =  new Child2();

        p1.message();
        c5.message();
        c6.message();
        c1.message();
        c2.message();
        c3.message();

        

        
    

    }
}