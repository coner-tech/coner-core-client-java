/*
 * coner-core-service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.19
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.coner.core.client.api;

import org.coner.core.client.ApiException;
import org.coner.core.client.model.AddCompetitionGroupRequest;
import org.coner.core.client.model.AddCompetitionGroupSetRequest;
import org.coner.core.client.model.CompetitionGroupApiEntity;
import org.coner.core.client.model.CompetitionGroupSetApiEntity;
import org.coner.core.client.model.ErrorMessage;
import org.coner.core.client.model.GetCompetitionGroupSetsResponse;
import org.coner.core.client.model.GetCompetitionGroupsResponse;
import org.coner.core.client.model.ValidationErrorMessage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompetitionGroupsApi
 */
@Ignore
public class CompetitionGroupsApiTest {

    private final CompetitionGroupsApi api = new CompetitionGroupsApi();

    
    /**
     * Add a new Competition Group Set
     *
     * Optionally include a list of Competition Group entities with ID to associate them
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTest() throws ApiException {
        AddCompetitionGroupSetRequest body = null;
        api.add(body);

        // TODO: test validations
    }
    
    /**
     * Add a Competition Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCompetitionGroupTest() throws ApiException {
        AddCompetitionGroupRequest body = null;
        api.addCompetitionGroup(body);

        // TODO: test validations
    }
    
    /**
     * Add a Competition Group to a Competition Group Set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCompetitionGroupToCompetitionGroupSetTest() throws ApiException {
        String competitionGroupSetId = null;
        String competitionGroupId = null;
        CompetitionGroupSetApiEntity response = api.addCompetitionGroupToCompetitionGroupSet(competitionGroupSetId, competitionGroupId);

        // TODO: test validations
    }
    
    /**
     * Get a Competition Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompetitionGroupTest() throws ApiException {
        String competitionGroupId = null;
        CompetitionGroupApiEntity response = api.getCompetitionGroup(competitionGroupId);

        // TODO: test validations
    }
    
    /**
     * Get a Competition Group Set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompetitionGroupSetTest() throws ApiException {
        String competitionGroupSetId = null;
        CompetitionGroupSetApiEntity response = api.getCompetitionGroupSet(competitionGroupSetId);

        // TODO: test validations
    }
    
    /**
     * Get all Competition Group Sets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompetitionGroupSetsTest() throws ApiException {
        GetCompetitionGroupSetsResponse response = api.getCompetitionGroupSets();

        // TODO: test validations
    }
    
    /**
     * Get all Competition Groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompetitionGroupsTest() throws ApiException {
        GetCompetitionGroupsResponse response = api.getCompetitionGroups();

        // TODO: test validations
    }
    
}
