# 接口列表

## 不需要权限校验的接口

1. http://localhost:8080/article/{id}
2. http://localhost:8080/articles

## 需要登录后才可使用的解耦

1. http://localhost:8080/login?username={username}&password={password} 返回后续使用的cookie
2. http://localhost:8080/security/article/{id}?cookie={cookie}
3. http://localhost:8080/security/articles?cookie={cookie}