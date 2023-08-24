interface I{
  //method we can define in the interface using `default` keyword. 
  default public void show(){
       System.out.println("This is default show method.");
   }
}

class HelloWorld implements I{ // implementing Interface I.
    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        h.show(); //directly calling the default method defined in the interface.
    }
}

/*
output:
This is default show method.
*/
