{
      "resources": [

         {
                "name": "defaultThreadPool",
      "type": "PoolResource",
      "poolName": "demo","maxPoolSize": 10,"corePoolSize": 10
            }
            
         ,{
               "name" : "dbResource",
      "type" : "JDBCResource",
      "properties" : {
         "driver" : "oracle.jdbc.driver.OracleDriver",
         "username" : "hyperform_db",
         "password" : "hyperform_db",
         "url" : "jdbc:oracle:thin:@localhost:1521:orcl",
         "autocommit" : true,
      "lobProperties" : {
            "wrapAsLob": false,
            "streamAsLob": false,
            "createTempLob": false
         },"poolProperties" : {
         "poolName" : "",
            "transactionIsolation": "",
            "connectionTestQuery": "",
            "connectionInitSql" : "",
            "catalog" : ""
            }
      }

            }
            ]
      }