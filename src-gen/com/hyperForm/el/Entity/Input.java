package com.hyperForm.el.Entity;
    
import java.io.Serializable;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.lang.String;

public class Input implements Serializable{
         

      private static Logger logger = LogManager.getLogger(Input.class.getName());

      private String vari1;
      private HyperformMessage hm;

      public Input(){
         
         this.vari1 = "";
         this.hm = new HyperformMessage();
      
      }


      public String getVari1(){
         return this.vari1;
      }
      
         
      public void setVari1(String vari1){
         this.vari1 = vari1;
      }
      
      public HyperformMessage getHm(){
         return this.hm;
      }
      
         
      public void setHm(HyperformMessage hm){
         this.hm = hm;
      }
      

}