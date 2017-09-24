# CompetitionGroupsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](CompetitionGroupsApi.md#add) | **POST** /competitionGroups/sets | Add a new Competition Group Set
[**addCompetitionGroup**](CompetitionGroupsApi.md#addCompetitionGroup) | **POST** /competitionGroups | Add a Competition Group
[**addCompetitionGroupToCompetitionGroupSet**](CompetitionGroupsApi.md#addCompetitionGroupToCompetitionGroupSet) | **POST** /competitionGroups/sets/{competitionGroupSetId}/competitionGroups/{competitionGroupId} | Add a Competition Group to a Competition Group Set
[**getCompetitionGroup**](CompetitionGroupsApi.md#getCompetitionGroup) | **GET** /competitionGroups/{competitionGroupId} | Get a Competition Group
[**getCompetitionGroupSet**](CompetitionGroupsApi.md#getCompetitionGroupSet) | **GET** /competitionGroups/sets/{competitionGroupSetId} | Get a Competition Group Set
[**getCompetitionGroupSets**](CompetitionGroupsApi.md#getCompetitionGroupSets) | **GET** /competitionGroups/sets | Get all Competition Group Sets
[**getCompetitionGroups**](CompetitionGroupsApi.md#getCompetitionGroups) | **GET** /competitionGroups | Get all Competition Groups


<a name="add"></a>
# **add**
> add(body)

Add a new Competition Group Set

Optionally include a list of Competition Group entities with ID to associate them

### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.CompetitionGroupsApi;


CompetitionGroupsApi apiInstance = new CompetitionGroupsApi();
AddCompetitionGroupSetRequest body = new AddCompetitionGroupSetRequest(); // AddCompetitionGroupSetRequest | Competition Group Set
try {
    apiInstance.add(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionGroupsApi#add");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddCompetitionGroupSetRequest**](AddCompetitionGroupSetRequest.md)| Competition Group Set | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCompetitionGroup"></a>
# **addCompetitionGroup**
> addCompetitionGroup(body)

Add a Competition Group



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.CompetitionGroupsApi;


CompetitionGroupsApi apiInstance = new CompetitionGroupsApi();
AddCompetitionGroupRequest body = new AddCompetitionGroupRequest(); // AddCompetitionGroupRequest | Competition Group
try {
    apiInstance.addCompetitionGroup(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionGroupsApi#addCompetitionGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddCompetitionGroupRequest**](AddCompetitionGroupRequest.md)| Competition Group | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCompetitionGroupToCompetitionGroupSet"></a>
# **addCompetitionGroupToCompetitionGroupSet**
> CompetitionGroupSetApiEntity addCompetitionGroupToCompetitionGroupSet(competitionGroupSetId, competitionGroupId)

Add a Competition Group to a Competition Group Set



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.CompetitionGroupsApi;


CompetitionGroupsApi apiInstance = new CompetitionGroupsApi();
String competitionGroupSetId = "competitionGroupSetId_example"; // String | Competition Group Set ID
String competitionGroupId = "competitionGroupId_example"; // String | Competition Group ID
try {
    CompetitionGroupSetApiEntity result = apiInstance.addCompetitionGroupToCompetitionGroupSet(competitionGroupSetId, competitionGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionGroupsApi#addCompetitionGroupToCompetitionGroupSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **competitionGroupSetId** | **String**| Competition Group Set ID |
 **competitionGroupId** | **String**| Competition Group ID |

### Return type

[**CompetitionGroupSetApiEntity**](CompetitionGroupSetApiEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompetitionGroup"></a>
# **getCompetitionGroup**
> CompetitionGroupApiEntity getCompetitionGroup(competitionGroupId)

Get a Competition Group



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.CompetitionGroupsApi;


CompetitionGroupsApi apiInstance = new CompetitionGroupsApi();
String competitionGroupId = "competitionGroupId_example"; // String | Competition Group ID
try {
    CompetitionGroupApiEntity result = apiInstance.getCompetitionGroup(competitionGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionGroupsApi#getCompetitionGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **competitionGroupId** | **String**| Competition Group ID |

### Return type

[**CompetitionGroupApiEntity**](CompetitionGroupApiEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompetitionGroupSet"></a>
# **getCompetitionGroupSet**
> CompetitionGroupSetApiEntity getCompetitionGroupSet(competitionGroupSetId)

Get a Competition Group Set



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.CompetitionGroupsApi;


CompetitionGroupsApi apiInstance = new CompetitionGroupsApi();
String competitionGroupSetId = "competitionGroupSetId_example"; // String | Competition Group Set ID
try {
    CompetitionGroupSetApiEntity result = apiInstance.getCompetitionGroupSet(competitionGroupSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionGroupsApi#getCompetitionGroupSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **competitionGroupSetId** | **String**| Competition Group Set ID |

### Return type

[**CompetitionGroupSetApiEntity**](CompetitionGroupSetApiEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompetitionGroupSets"></a>
# **getCompetitionGroupSets**
> GetCompetitionGroupSetsResponse getCompetitionGroupSets()

Get all Competition Group Sets



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.CompetitionGroupsApi;


CompetitionGroupsApi apiInstance = new CompetitionGroupsApi();
try {
    GetCompetitionGroupSetsResponse result = apiInstance.getCompetitionGroupSets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionGroupsApi#getCompetitionGroupSets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetCompetitionGroupSetsResponse**](GetCompetitionGroupSetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompetitionGroups"></a>
# **getCompetitionGroups**
> GetCompetitionGroupsResponse getCompetitionGroups()

Get all Competition Groups



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.CompetitionGroupsApi;


CompetitionGroupsApi apiInstance = new CompetitionGroupsApi();
try {
    GetCompetitionGroupsResponse result = apiInstance.getCompetitionGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompetitionGroupsApi#getCompetitionGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetCompetitionGroupsResponse**](GetCompetitionGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

