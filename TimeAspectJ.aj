public aspect TimeAspectJ {	
    // Define a Pointcut is
    // collection of JoinPoint call sayHello of class HelloAspectJDemo.
    pointcut callGreetingTimer(): call(* HelloAspectJDemo.greeting()); 
    before() : callGreetingTimer() {
        System.out.println("Before call greeting");
    } 
    after() : callGreetingTimer()  {
        System.out.println("After call greeting");
    }  
}  