package com.hlhj.api.security;

/**
 * 令牌管理器
 *
 * @author huangdaiyi
 * @since 1.0.0
 */
public interface TokenManager {

    String createToken(String username);

    boolean checkToken(String token);
}
