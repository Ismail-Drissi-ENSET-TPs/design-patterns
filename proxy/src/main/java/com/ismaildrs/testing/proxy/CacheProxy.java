package com.ismaildrs.testing.proxy;

import com.ismaildrs.testing.services.IService;
import com.ismaildrs.testing.services.ServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements IService {
    private IService service = new ServiceImpl();
    private Map<Integer, Double> cache = new HashMap<Integer, Double>();

    @Override
    public double compute(int t) {
        if(!cache.containsKey(t)){
            cache.put(t,service.compute(t));
            return cache.get(t);
        } else {
            return cache.get(t);
        }
    }
}
