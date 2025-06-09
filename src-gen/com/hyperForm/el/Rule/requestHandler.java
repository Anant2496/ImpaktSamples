package com.hyperForm.el.Rule;
    
import com.act21.impaktapps.core.model.api.Rule;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import com.act21.impaktapps.core.utils.HelperFunctions;
import com.hyperForm.el.Services.dataload;

public class requestHandler implements Rule{
         

      private static Logger logger = LogManager.getLogger(requestHandler.class.getName());


      public requestHandler(){
         
      }

      @Override
      public requestHandlerData execute(Object data) {
         if(!(data instanceof requestHandlerData)){
            data = HelperFunctions.getInstance().convertValue(data, requestHandlerData.class); 
         }
         execute((requestHandlerData) data);
         return (requestHandlerData) data;
      }
         
   
      
      public void execute(requestHandlerData var){
         
		var.getVar().getInput_v().setVari1("one");
		var.getVar().setPayload(HelperFunctions.getInstance().toMap(var.getVar().getOutput_v().getHm().getPayload()));
		var.getVar().getPayload().put("terminate", true);
		var.getVar().getOutput_v().getHm().setPayload(var.getVar().getPayload());
		var.getVar().getOutput_v().getHm().setCorelationId(var.getVar().getInput_v().getHm().getId());
		var.getVar().getOutput_v().getHm().setMessageType("payoutDataLoadResponse");
		dataload.getInstance().dataload_proced();
      }
      


}