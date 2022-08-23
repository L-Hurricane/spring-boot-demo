# 接口列表

## 不需要权限校验的接口

1. GET http://localhost:8080/article/{id}
2. GET http://localhost:8080/articles
3. GET http://localhost:8080/add?id=3&author=author3&title=title3&content=content3&modify_time=2022-03-03
4. POST http://localhost:8080/add
`
{
    "id":"3",
    "author":"author3",
    "title":"title3",
    "content":"content3",
    "city":"city3",
    "length":"1",
    "modify_time":"2022-03-03 22:22:22"
}
`

## 需要登录后才可使用的解耦

1. GET http://localhost:8080/login?username={username}&password={password} 返回后续使用的cookie
2. GET http://localhost:8080/security/article/{id}?cookie={cookie}
3. GET http://localhost:8080/security/articles?cookie={cookie}