package com.smolop.design.patterns.singleton;

import java.time.LocalDateTime;
import java.util.Objects;

public class Singleton {

    private static Singleton instance;

    private LocalDateTime timestamp;

    private Singleton() {
        this.timestamp = LocalDateTime.now();
    }

    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Singleton singleton)) return false;
        if (!Objects.equals(this.hashCode(), singleton.hashCode())) return false;
        return Objects.equals(this.getTimestamp(), singleton.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp);
    }
}
