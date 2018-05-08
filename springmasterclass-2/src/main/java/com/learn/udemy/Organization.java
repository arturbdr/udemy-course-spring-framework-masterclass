package com.learn.udemy;

public class Organization {

    private final SampleBeanForInjectionInOrganization sampleBeanForInjectionInOrganization;
    private String simpleProperty;

    public Organization(SampleBeanForInjectionInOrganization sampleBeanForInjectionInOrganization) {
        this.sampleBeanForInjectionInOrganization = sampleBeanForInjectionInOrganization;
    }

    public void doStuff() {
        final String simpleMessage = String.format("this is a simple message with random int %s and the property %s", sampleBeanForInjectionInOrganization.getRandomInt(), getSimpleProperty());
        System.out.println("simpleMessage = " + simpleMessage);

    }

    public String getSimpleProperty() {
        return simpleProperty;
    }

    public void setSimpleProperty(String simpleProperty) {
        this.simpleProperty = simpleProperty;
    }
}
