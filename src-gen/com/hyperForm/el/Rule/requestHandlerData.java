package com.hyperForm.el.Rule;
    
import java.io.Serializable;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.hyperForm.el.Entity.Variables;

public class requestHandlerData implements Serializable{
         

      private static Logger logger = LogManager.getLogger(requestHandlerData.class.getName());

      @JsonUnwrapped
      private Variables var;

      public requestHandlerData(){
         
         this.var = null;
      
      }


      public Variables getVar(){
         return this.var;
      }
      
         
      public void setVar(Variables var){
         this.var = var;
      }
      

}