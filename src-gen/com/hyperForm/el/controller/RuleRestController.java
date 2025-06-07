package com.hyperForm.el.controller;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.MediaType;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.bind.annotation.RestController;

    import java.io.IOException;
    import java.util.Map;

    import com.act21.impaktapps.core.model.api.*;
    import com.act21.impaktapps.core.service.*;

    @RestController
    @RequestMapping("/api/execution")
    public class RuleRestController {

        @PostMapping(value = "/execute", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<?> execute(
                @RequestParam("ruleId") String ruleId,
                @RequestParam(name = "isAsync", required = false) boolean isAsync,
                @RequestParam("groupId") String groupId,
                @RequestParam("artifactId") String artifactId,
                @RequestParam("version") String version,
                @RequestBody Map<String, Object> data) {
            try {
                if (isAsync) {
                    RuleService.getInstance().executeAsync(groupId + '.' + artifactId + '.' + ruleId, data);
                    return new ResponseEntity<>("running in Async", HttpStatus.OK);
                } else {
                    return new ResponseEntity<>(RuleService.getInstance().execute(groupId + '.' + artifactId + '.' + ruleId, data), HttpStatus.OK);
                }
            } catch (Exception e) {
                String exceptionMessage = e.getMessage() != null ? e.getMessage() : e.getCause().getMessage();
                return new ResponseEntity<>(exceptionMessage, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        @PostMapping(value = "/runTest", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
        public String runTest(
                @RequestParam("ruleId") String ruleId,
                @RequestParam("groupId") String groupId,
                @RequestParam("artifactId") String artifactId,
                @RequestParam("version") String version, @RequestBody RunTestRequest testRequest)
                throws IOException {
            SimulationService.getInstance().start(testRequest.getTestIdList(), groupId + '.' + artifactId + '.' + ruleId, groupId, artifactId, version);
            return "Response Generated";
        }
    }