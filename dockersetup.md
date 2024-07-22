File : v3docker-compose.yml

 GATEWAY.IP: "172.18.0.4" 
- after containerised 
- docker-compose -f v3docker-compose.yml up
- <img width="457" alt="image" src="https://github.com/user-attachments/assets/9fd806ca-1e80-4988-a8cc-bf8f802a89ad">

  watch line [ api-gateway-1  | Your current IP address : 434220bd2c1a/172.18.0.4 ]
- replace the line no : 13 GATEWAY.IP: "172.18.0.4" to GATEWAY.IP: "current ip"  in v3docker-compose.yml 
-check in api-gateway service  In Console 

Eureka disovery Serice URL: http://localhost:8010/

Create User
1) PostMan : Url: http://localhost:8082/users-ws/users
Request: {
    "firstName":"venkat",
    "lastName":"krisn",
    "email":"hnhd@test.com",
    "password":"12345678"
}

2) Login
   http://localhost:8082/users-ws/users/login
   Request: {"email":"admin@test.com", "password":"12345678"}
   Response in Header get token and user id.
   <img width="606" alt="image" src="https://github.com/user-attachments/assets/953675f3-dd7b-4bd5-a9b6-69d2519d91bd">
3) Status port dynamic check url : http://localhost:8082/users-ws/users/status/check
   In Request Header past token as per below screenshot
   <img width="516" alt="image" src="https://github.com/user-attachments/assets/fc815455-ad0d-4b54-b4d6-fa5350438a97">
4) Get UserId URL
     http://localhost:8082/users-ws/users/125c7ba5-26f4-4b33-98db-45e1c978c8af
    <img width="516" alt="image" src="https://github.com/user-attachments/assets/fc815455-ad0d-4b54-b4d6-fa5350438a97">

    




