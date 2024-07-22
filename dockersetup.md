File : v3docker-compose.yml

 GATEWAY.IP: "172.18.0.4" 
- after containerised 
- docker-compose -f v3docker-compose.yml up
- <img width="457" alt="image" src="https://github.com/user-attachments/assets/9fd806ca-1e80-4988-a8cc-bf8f802a89ad">

  watch line [ api-gateway-1  | Your current IP address : 434220bd2c1a/172.18.0.4 ]
- replace the line no : 13 GATEWAY.IP: "172.18.0.4" to GATEWAY.IP: "current ip"  in v3docker-compose.yml 
-check in api-gateway service  In Console 
