# springboot-keyckoak
springboot-keyckoak


realm:
* fenda-do-biquini

## app:
* app-siri-cascudo

## usuarios
* user1
* user2

## senha

12345678


## roles:
 - role_chapeiro

## como subir o kc
    $ docker-compose up

acesse http://localhost:8080 para ver o admin do kc

e cadastre realm, app, usuarios role e adicione a role ao app e aos usuarios. :)

http://localhost:8080/auth/realms/fenda-do-biquini/.well-known/openid-configuration

## Como subir o projeto
    $ ./gradlew bootRun -x test


# Postman
Existe uma colecao e um environment prontos na pasta postman
