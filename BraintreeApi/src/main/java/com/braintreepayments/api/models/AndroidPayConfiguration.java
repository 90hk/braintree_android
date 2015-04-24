package com.braintreepayments.api.models;

public class AndroidPayConfiguration {

    private boolean enabled;
    private String environment;
    private String displayName;

    public boolean getEnabled() {
        return enabled;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getDisplayName() {
        return displayName;
    }
}
