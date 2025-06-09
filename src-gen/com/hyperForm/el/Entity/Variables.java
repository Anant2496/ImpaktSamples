package com.hyperForm.el.Entity;
    
import java.io.Serializable;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class Variables implements Serializable{
         

      private static Logger logger = LogManager.getLogger(Variables.class.getName());

      private Input input_v;
      private Output output_v;
      private Map<String, Object> payload;
      private boolean terminate;

      public Variables(){
         
         this.input_v = new Input();
         this.output_v = new Output();
         this.payload = new java.util.HashMap<String, Object>();
         this.terminate = false;
      
      }


      public Input getInput_v(){
         return this.input_v;
      }
      
         
      public void setInput_v(Input input_v){
         this.input_v = input_v;
      }
      
      public Output getOutput_v(){
         return this.output_v;
      }
      
         
      public void setOutput_v(Output output_v){
         this.output_v = output_v;
      }
      
      public Map<String, Object> getPayload(){
         return this.payload;
      }
      
         
      public void setPayload(Map<String, Object> payload){
         this.payload = payload;
      }
      
      public boolean getTerminate(){
         return this.terminate;
      }
      
         
      public void setTerminate(boolean terminate){
         this.terminate = terminate;
      }
      

}