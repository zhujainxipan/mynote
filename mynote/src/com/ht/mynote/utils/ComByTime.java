package com.ht.mynote.utils;

import java.io.File;
import java.util.Comparator;

/**
 * Created by IntelliJ IDEA
 * Project: com.ht.mynote.utils
 * Author: 安诺爱成长
 * Email: 1399487511@qq.com
 * Date: 2015/5/2
 */
public class ComByTime implements Comparator<File>{


    @Override
    public int compare(File file, File t1) {
        if (file.lastModified() > t1.lastModified()) {
            return -1;
        }
        else
            return 1;
    }
}
