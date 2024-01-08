package com.example.TestProject.Section3.GameLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependenciesInjectionExample {

    // field injection
    // @Autowired
    Dependency1 dependency1;
    // @Autowired
    Dependency2 dependency2;


//    // setter injection
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        this.dependency2 = dependency2;
//    }

// constructor injection
    // even when @autowired in constructor injection is commented autowired still works
   // @Autowired
    // use mainly Constructor-based injection
    public DependenciesInjectionExample(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "1. " + dependency1 + " 2. " + dependency2;
    }
}

@Component
class Dependency1{

}
@Component
class Dependency2{

}