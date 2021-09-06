
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
```sh
docker run -d --name my_database -p 5432:5432 -e POSTGRES_PASSWORD=trung123 -e PGDATA=/var/lib/postgresql/data/pgdata -v /Volumes/DATA/study/web_pet/learn_database/database_practise:/var/lib/postgresql/data postgres
```

## Note: port pgadmin4 80
```sh
docker run --rm -p 9080:80 -e 'PGADMIN_DEFAULT_EMAIL=admin@web.com' \
    -e 'PGADMIN_DEFAULT_PASSWORD=trung4321' -d dpage/pgadmin4
```

