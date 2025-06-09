package com.hyperForm.el.Services;
    
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import java.sql.Types;
import com.act21.impaktapps.core.resource.datasource.ImpaktAppsDataSource;
import com.act21.impaktapps.core.resource.ImpaktAppsResourceFactory;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class dataload{
         

      private static Logger logger = LogManager.getLogger(dataload.class.getName());

      private static dataload INSTANCE = null;
      

      public dataload(){
         
      }

      
      public static dataload getInstance(){
         if(INSTANCE == null){
               INSTANCE = new dataload();
         }
         return INSTANCE;
      }
      public void dataload_proced(){
         
     				
              
              ImpaktAppsDataSource impaktAppsDatasource = ((ImpaktAppsDataSource)ImpaktAppsResourceFactory.getResource("dbResource"));
              NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(impaktAppsDatasource.getDataSource());
              
              SqlParameterSource namedParameters = new MapSqlParameterSource();
              
              
              var query = """
              BEGIN
  INSERT_HARDCODED_JSON();
rollback; 
END;""";
              template.update(query,namedParameters);
              
              return;
  
      }
      


}