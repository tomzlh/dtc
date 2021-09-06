
package com.ops.sc.core.rest;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Constants for HTTP.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Http {
    
    public static final String GET = "GET";
    
    public static final String POST = "POST";
    
    public static final String HEAD = "HEAD";
    
    public static final String PUT = "PUT";
    
    public static final String PATCH = "PATCH";
    
    public static final String OPTIONS = "OPTIONS";
    
    public static final String DELETE = "DELETE";
    
    public static final String TRACE = "TRACE";
    
    public static final String CONNECT = "CONNECT";
    
    public static final String DEFAULT_CONTENT_TYPE = "application/json; charset=utf-8";
}
