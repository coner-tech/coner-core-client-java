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
import org.coner.core.client.model.GetEventResultsRegistrationResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResultsApi
 */
@Ignore
public class ResultsApiTest {

    private final ResultsApi api = new ResultsApi();

    
    /**
     * Get results for a registration at an event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventRegistrationResultsTest() throws ApiException {
        String eventId = null;
        String registrationId = null;
        GetEventResultsRegistrationResponse response = api.getEventRegistrationResults(eventId, registrationId);

        // TODO: test validations
    }
    
}
