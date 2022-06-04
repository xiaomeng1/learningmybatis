package com.learning.mybatis.vfs;

import org.apache.ibatis.io.VFS;

import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * @Author xiangli.meng
 * @create 2022/6/1 23:21
 */
public class MyVFS extends VFS {

    public boolean isValid() {
        return false;
    }

    protected List<String> list(URL url, String forPath) throws IOException {

        return null;
    }
}
