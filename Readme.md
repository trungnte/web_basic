
# Run docker postgres with PQSL or pgadmin4
## 1. Using pgadmin4
Pull docker pgadmin4
```sh
docker pull dpage/pgadmin4
```

## 2. Run daemon docker postgres
```sh
docker run -d --name my_database -p 5432:5432 -e POSTGRES_PASSWORD=trung123 postgres
```

## 3. Run docker pgadmin4
```sh
docker run --rm -p 80:80 -e 'PGADMIN_DEFAULT_EMAIL=trung.nt.e@gmail.com' \
    -e 'PGADMIN_DEFAULT_PASSWORD=trung4321' -d dpage/pgadmin4
```

## 4. Using web browser to communicate with postgres
> localhost:80

## 5. Get IP Address of docker postgres
```sh
docker inspect my_database | grep IP
```

## 6. Use pgadmin4 connect to postgres!

## Mount volumes my_database

On Mac
```sh
docker run -d --name my_database -p 5432:5432 -e POSTGRES_PASSWORD=trung123 -e PGDATA=/var/lib/postgresql/data/pgdata -v /Volumes/DATA/study/web_pet/learn_database/database_practise:/var/lib/postgresql/data postgres
```

On Window
```sh
docker run -d --name my_database -p 5432:5432 -e POSTGRES_PASSWORD=trung123 -e PGDATA=/var/lib/postgresql/data/pgdata -v D:\datamac\study\web_pet\learn_database\database_practise:/var/lib/postgresql/data postgres
```


## Note: port pgadmin4 80
```sh
docker run --rm -p 9080:80 -e 'PGADMIN_DEFAULT_EMAIL=admin@web.com' -e 'PGADMIN_DEFAULT_PASSWORD=trung4321' -d dpage/pgadmin4
```

## Connect to psql with docker

Find the docker-container-id in which the postgres is running using the below command. 

```sh
docker ps -a
```

Run the below command to enter into the container (with the ID from step-1). 

```sh
docker exec -it <PSQL-Container-ID> bash
```

Authenticate to start using as postgres user. 

```sh
psql -h localhost -p 5432 -U postgres -W
```

Enter the password used while creating the PSQL server container.

Basic command at PSQL
\l : list database
\connect or \c
\c <database-name> :switch to 'database-name'