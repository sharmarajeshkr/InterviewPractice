package com.sharma.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    public String value() default "";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface JsonSerializable {
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonElement {
    public String key() default "";
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
 @interface Init {
}


@JsonSerializable
 class Person {

    @JsonElement
    private String firstName;

    @JsonElement
    private String lastName;

    @JsonElement(key = "personAge")
    private String age;

    private String address;

    @Init
    private void initNames() {
        this.firstName = this.firstName.substring(0, 1).toUpperCase()
                + this.firstName.substring(1);
        this.lastName = this.lastName.substring(0, 1).toUpperCase()
                + this.lastName.substring(1);
    }



}





















class Car {
    @JsonField("making")
    private final String make;
    @JsonField
    private final String model;
    private final String year;

    public Car(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}

class MyCustomAnnotationImplemention implements MyCustomAnnotation{

    @Override
    public int studentAge() {
        return 0;
    }

    @Override
    public String studentName() {
        return null;
    }

    @Override
    public String stdentAddress() {
        return null;
    }

    @Override
    public String studentStram() {
        return null;
    }


    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
