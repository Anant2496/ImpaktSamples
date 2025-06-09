package com.hyperForm.el.Entity;
    
import java.io.Serializable;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Output implements Serializable{
         

      private static Logger logger = LogManager.getLogger(Output.class.getName());

      private HyperformMessage hm;

      public Output(){
         
         this.hm = new HyperformMessage();
      
      }


      public HyperformMessage getHm(){
         return this.hm;
      }
      
         
      public void setHm(HyperformMessage hm){
         this.hm = hm;
      }
      

}