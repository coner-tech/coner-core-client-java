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
import org.coner.core.client.model.AddEventRequest;
import org.coner.core.client.model.AddRawTimeToFirstRunLackingRequest;
import org.coner.core.client.model.AddRegistrationRequest;
import org.coner.core.client.model.AddRunRequest;
import org.coner.core.client.model.ErrorMessage;
import org.coner.core.client.model.EventApiEntity;
import org.coner.core.client.model.GetEventRegistrationsResponse;
import org.coner.core.client.model.GetEventResultsRegistrationResponse;
import org.coner.core.client.model.GetEventRunsResponse;
import org.coner.core.client.model.GetEventsResponse;
import org.coner.core.client.model.RegistrationApiEntity;
import org.coner.core.client.model.RunApiEntity;
import org.coner.core.client.model.ValidationErrorMessage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
@Ignore
public class EventsApiTest {

    private final EventsApi api = new EventsApi();

    
    /**
     * Add an Event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEventTest() throws ApiException {
        AddEventRequest body = null;
        api.addEvent(body);

        // TODO: test validations
    }
    
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
     * Add a new registration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRegistrationTest() throws ApiException {
        String eventId = null;
        AddRegistrationRequest body = null;
        api.addRegistration(eventId, body);

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
     * Get an Event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventTest() throws ApiException {
        String eventId = null;
        EventApiEntity response = api.getEvent(eventId);

        // TODO: test validations
    }
    
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
    
    /**
     * Get a list of all registrations at an event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventRegistrationsTest() throws ApiException {
        String eventId = null;
        GetEventRegistrationsResponse response = api.getEventRegistrations(eventId);

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
     * Get a list of all events
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsTest() throws ApiException {
        GetEventsResponse response = api.getEvents();

        // TODO: test validations
    }
    
    /**
     * Get a specific registration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRegistrationTest() throws ApiException {
        String eventId = null;
        String registrationId = null;
        RegistrationApiEntity response = api.getRegistration(eventId, registrationId);

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
