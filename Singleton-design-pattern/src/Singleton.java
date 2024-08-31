public class Singleton {
    private static volatile Singleton singleton;
    // make constructor private
    private Singleton(){
    }

    // make this static to call the method without any instance
    public static Singleton getInstance(){
       if(singleton == null){
           synchronized (Singleton.class){
               if (singleton == null){
                   singleton = new Singleton();
               }
           }
       }
       return singleton;
    }
}

/*
Why is volatile keyword used ?

- Ensures Visibility: The volatile keyword guarantees that the writes to the singleton variable are visible to all threads.
Without volatile, there's a possibility that one thread could see a partially constructed object because of instruction reordering or caching by the CPU.

- Prevents Instruction Reordering: In the absence of volatile, the JVM could reorder the instructions so that the reference to the singleton instance is assigned before the constructor has finished executing.
 This could result in another thread seeing a non-null but not fully initialized object.
 */
