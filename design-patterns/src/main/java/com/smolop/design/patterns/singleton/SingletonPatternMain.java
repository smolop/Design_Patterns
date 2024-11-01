package com.smolop.design.patterns.singleton;

public class SingletonPatternMain {

    private SingletonPatternMain() {
    }

    public static void execute() {
        System.out.println("Start singleton pattern.");

        Singleton singletonOne = Singleton.getInstance();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
        }
        Singleton singletonTwo = Singleton.getInstance();

        System.out.printf("singletonOne.getTimestamp(): %s; singletonTwo.getTimestamp(): %s;%nAre timestamp equals? : %s%n",
                singletonOne.getTimestamp(),
                singletonTwo.getTimestamp(),
                singletonOne.getTimestamp().equals(singletonTwo.getTimestamp()));

        System.out.printf("singletonOne.hashCode(): %s; singletonTwo.hashCode(): %s;%nAre hashCode equals? : %s%n",
                singletonOne.hashCode(),
                singletonTwo.hashCode(),
                singletonOne.hashCode() == singletonTwo.hashCode());

        System.out.printf("singletonOne.equals(singletonTwo)? = %s%n", singletonOne.equals(singletonOne));

        System.out.println("Singleton pattern finished.");
    }

}
