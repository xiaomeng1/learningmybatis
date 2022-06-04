package com.learning.mybatis.cache;

import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author xiangli.meng
 * @create 2022/6/2 8:50
 */
public class MyCache implements Cache {

    private String id;

    private Log logger = LogFactory.getLog(MyCache.class);
    private Map<Object, Object> container = new ConcurrentHashMap<Object, Object>();

    public MyCache(String id) {
        this.id = id;
    }

    public String getId() {
        logger.debug("get id");
        return id;
    }

    public void putObject(Object key, Object value) {
        logger.debug("put map for the key {}" + key);
        container.put(key, value);

    }

    public Object getObject(Object key) {
        logger.debug("===============================" + key);
        return container.get(key);
    }

    public Object removeObject(Object key) {
        return container.remove(key);
    }

    public void clear() {
        container.clear();
    }

    public int getSize() {
        return container.size();
    }
}
