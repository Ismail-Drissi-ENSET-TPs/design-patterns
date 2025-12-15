package com.ismaildrs.testing;

import com.ismaildrs.testing.controllers.Client;
import com.ismaildrs.testing.proxy.CacheProxy;
import com.ismaildrs.testing.proxy.SecuredProxy;
import com.ismaildrs.testing.services.IService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        CacheProxy cacheProxy = new CacheProxy();
        SecuredProxy securedProxy = new SecuredProxy();
        securedProxy.setService(cacheProxy);
        securedProxy.setPassword("1234");
        client.setService(securedProxy);
        System.out.println(client.perform(5));
        System.out.println(client.perform(5));
        System.out.println(client.perform(5));

    }
}