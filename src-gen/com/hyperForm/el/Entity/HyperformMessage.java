package com.hyperForm.el.Entity;
    
import java.io.Serializable;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class HyperformMessage implements Serializable{
         

      private static Logger logger = LogManager.getLogger(HyperformMessage.class.getName());

      private String id;
      private String corelationId;
      private String businessKey;
      private Map<String, Object> additionalArgs;
      private Map<String, Object> payload;
      private String messageType;
      private String replyTo;

      public HyperformMessage(){
         
         this.id = "";
         this.corelationId = "";
         this.businessKey = "";
         this.additionalArgs = new java.util.HashMap<String, Object>();
         this.payload = new java.util.HashMap<String, Object>();
         this.messageType = "";
         this.replyTo = "";
      
      }


      public String getId(){
         return this.id;
      }
      
         
      public void setId(String id){
         this.id = id;
      }
      
      public String getCorelationId(){
         return this.corelationId;
      }
      
         
      public void setCorelationId(String corelationId){
         this.corelationId = corelationId;
      }
      
      public String getBusinessKey(){
         return this.businessKey;
      }
      
         
      public void setBusinessKey(String businessKey){
         this.businessKey = businessKey;
      }
      
      public Map<String, Object> getAdditionalArgs(){
         return this.additionalArgs;
      }
      
         
      public void setAdditionalArgs(Map<String, Object> additionalArgs){
         this.additionalArgs = additionalArgs;
      }
      
      public Map<String, Object> getPayload(){
         return this.payload;
      }
      
         
      public void setPayload(Map<String, Object> payload){
         this.payload = payload;
      }
      
      public String getMessageType(){
         return this.messageType;
      }
      
         
      public void setMessageType(String messageType){
         this.messageType = messageType;
      }
      
      public String getReplyTo(){
         return this.replyTo;
      }
      
         
      public void setReplyTo(String replyTo){
         this.replyTo = replyTo;
      }
      

}