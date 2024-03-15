# Ping

Aplicação Java com container para exemplo

## Pré-requisitos

- Java 17+
- Docker 
- Acesso a internet
- Acesso ao Docker Hub

## Instalação

#### Clone

```
git clone https://github.com/J0ttaPM/checkpoint1.git
```

## Execução


#### Docker

* Criar imagem

```
docker build -t checkpoint1 .
```

* Executar container

spring.profiles.active=dev

```
docker run -d -p 8080:8080 -e PROFILE=<prd|dev|stg> checkpoint1
```

## Container Registry


#### Docker Hub

* Login

```
docker login -u jottapm
```

* Criar imagem pronta para upload (método 1 - criando nova imagem)


```
docker build -t jottapm checkpoint1 .
```


* Criar imagem pronta para upload (método 2 - renomeando imagem existente)


```
docker tag checkpoint1 jottapm/checkpoint1
```


* Upload de imagem para o Docker Hub


```
docker jottapm/checkpoint1 push
```



#### Navegação

- Base

http://localhost:8080/ping

- Endpoint que retorna string "Pong em dev", "Pong em prd" e "Pong em stg"



## Features (Funcionalidades)

- Múltiplos profiles

## Contatos

- Desenvolvedor 1 - joaopmarson@gmail.com
- Desenvolvedor 2 - rafinha-lima1@live.com

## Referencias
