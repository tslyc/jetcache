/**
 * Created on  13-09-09 18:58
 */
package com.taobao.geek.cache;

/**
 * @author yeli.hl
 */
public class CacheException extends RuntimeException {
    private static final long serialVersionUID = -9066209768410752667L;

    public CacheException(String message) {
        super(message);
    }

    public CacheException(String message, Throwable cause) {
        super(message, cause);
    }
}
