/*
 * coner-core-service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.coner.core.client.api;

import org.coner.core.client.ApiException;
import org.coner.core.client.model.AddRawTimeToFirstRunLackingRequest;
import org.coner.core.client.model.AddRunRequest;
import org.coner.core.client.model.ErrorMessage;
import org.coner.core.client.model.GetEventRunsResponse;
import org.coner.core.client.model.RunApiEntity;
import org.coner.core.client.model.ValidationErrorMessage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RunsApi
 */
@Ignore
public class RunsApiTest {

    private final RunsApi api = new RunsApi();

    
    /**
     * Add a raw time to the first run in sequence lacking one, or to a new run created on-the-fly if no runs lack a raw time
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRawTimeToFirstRunInSequenceLackingOneTest() throws ApiException {
        String eventId = null;
        AddRawTimeToFirstRunLackingRequest body = null;
        RunApiEntity response = api.addRawTimeToFirstRunInSequenceLackingOne(eventId, body);

        // TODO: test validations
    }
    
    /**
     * Add a new run
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRunTest() throws ApiException {
        String eventId = null;
        AddRunRequest body = null;
        api.addRun(eventId, body);

        // TODO: test validations
    }
    
    /**
     * Get a list of all runs at an event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventRunsTest() throws ApiException {
        String eventId = null;
        GetEventRunsResponse response = api.getEventRuns(eventId);

        // TODO: test validations
    }
    
    /**
     * Get a specific run
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRunTest() throws ApiException {
        String eventId = null;
        String runId = null;
        RunApiEntity response = api.getRun(eventId, runId);

        // TODO: test validations
    }
    
}
