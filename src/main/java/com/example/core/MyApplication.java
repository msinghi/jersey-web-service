package com.example.core;

import org.glassfish.jersey.server.ResourceConfig;

import com.example.resources.HelloWorldResource;

public class MyApplication extends ResourceConfig {

    public MyApplication() throws Exception {
        register(HelloWorldResource.class);
    }
}
