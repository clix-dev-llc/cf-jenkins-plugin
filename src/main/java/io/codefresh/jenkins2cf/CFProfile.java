/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.codefresh.jenkins2cf;

import hudson.util.Secret;
import java.io.IOException;

/**
 *
 * @author antweiss
 */
public class CFProfile {
    private final String cfUser;
    private final Secret cfToken;
    private CFService[] services;
    private CFApi api;
    //private List<CFService> services;

    public CFProfile(String cfUser, Secret cfToken) throws IOException {
        this.cfUser = cfUser;
        this.cfToken = cfToken;
        this.api = new CFApi(this.cfToken);
        this.services = api.getServices();
    }
    
    public String getUser(){
        return this.cfUser;
    }
    
    public Secret getToken(){
        return this.cfToken;
    }
   
}