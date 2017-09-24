# HandicapGroupsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](HandicapGroupsApi.md#add) | **POST** /handicapGroups/sets | Add a new Handicap Group Set
[**addHandicapGroup**](HandicapGroupsApi.md#addHandicapGroup) | **POST** /handicapGroups | Add a Handicap Group
[**addHandicapGroupToHandicapGroupSet**](HandicapGroupsApi.md#addHandicapGroupToHandicapGroupSet) | **POST** /handicapGroups/sets/{handicapGroupSetId}/handicapGroups/{handicapGroupId} | Add a Handicap Group to a Handicap Group Set
[**getHandicapGroup**](HandicapGroupsApi.md#getHandicapGroup) | **GET** /handicapGroups/{handicapGroupId} | Get a Handicap Group
[**getHandicapGroupSet**](HandicapGroupsApi.md#getHandicapGroupSet) | **GET** /handicapGroups/sets/{handicapGroupSetId} | Get a Handicap Group Set
[**getHandicapGroupSets**](HandicapGroupsApi.md#getHandicapGroupSets) | **GET** /handicapGroups/sets | Get all Handicap Group Sets
[**getHandicapGroups**](HandicapGroupsApi.md#getHandicapGroups) | **GET** /handicapGroups | Get all Handicap Groups


<a name="add"></a>
# **add**
> add(body)

Add a new Handicap Group Set

Optionally include a set of Handicap Group entities with ID to associate them

### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.HandicapGroupsApi;


HandicapGroupsApi apiInstance = new HandicapGroupsApi();
AddHandicapGroupSetRequest body = new AddHandicapGroupSetRequest(); // AddHandicapGroupSetRequest | Handicap Group Set
try {
    apiInstance.add(body);
} catch (ApiException e) {
    System.err.println("Exception when calling HandicapGroupsApi#add");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddHandicapGroupSetRequest**](AddHandicapGroupSetRequest.md)| Handicap Group Set | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addHandicapGroup"></a>
# **addHandicapGroup**
> addHandicapGroup(body)

Add a Handicap Group



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.HandicapGroupsApi;


HandicapGroupsApi apiInstance = new HandicapGroupsApi();
AddHandicapGroupRequest body = new AddHandicapGroupRequest(); // AddHandicapGroupRequest | Handicap Group
try {
    apiInstance.addHandicapGroup(body);
} catch (ApiException e) {
    System.err.println("Exception when calling HandicapGroupsApi#addHandicapGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddHandicapGroupRequest**](AddHandicapGroupRequest.md)| Handicap Group | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addHandicapGroupToHandicapGroupSet"></a>
# **addHandicapGroupToHandicapGroupSet**
> HandicapGroupSetApiEntity addHandicapGroupToHandicapGroupSet(handicapGroupSetId, handicapGroupId)

Add a Handicap Group to a Handicap Group Set



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.HandicapGroupsApi;


HandicapGroupsApi apiInstance = new HandicapGroupsApi();
String handicapGroupSetId = "handicapGroupSetId_example"; // String | Handicap Group Set ID
String handicapGroupId = "handicapGroupId_example"; // String | Handicap Group ID
try {
    HandicapGroupSetApiEntity result = apiInstance.addHandicapGroupToHandicapGroupSet(handicapGroupSetId, handicapGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HandicapGroupsApi#addHandicapGroupToHandicapGroupSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handicapGroupSetId** | **String**| Handicap Group Set ID |
 **handicapGroupId** | **String**| Handicap Group ID |

### Return type

[**HandicapGroupSetApiEntity**](HandicapGroupSetApiEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHandicapGroup"></a>
# **getHandicapGroup**
> HandicapGroupApiEntity getHandicapGroup(handicapGroupId)

Get a Handicap Group



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.HandicapGroupsApi;


HandicapGroupsApi apiInstance = new HandicapGroupsApi();
String handicapGroupId = "handicapGroupId_example"; // String | Handicap Group ID
try {
    HandicapGroupApiEntity result = apiInstance.getHandicapGroup(handicapGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HandicapGroupsApi#getHandicapGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handicapGroupId** | **String**| Handicap Group ID |

### Return type

[**HandicapGroupApiEntity**](HandicapGroupApiEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHandicapGroupSet"></a>
# **getHandicapGroupSet**
> HandicapGroupSetApiEntity getHandicapGroupSet(handicapGroupSetId)

Get a Handicap Group Set



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.HandicapGroupsApi;


HandicapGroupsApi apiInstance = new HandicapGroupsApi();
String handicapGroupSetId = "handicapGroupSetId_example"; // String | Handicap Group Set ID
try {
    HandicapGroupSetApiEntity result = apiInstance.getHandicapGroupSet(handicapGroupSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HandicapGroupsApi#getHandicapGroupSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handicapGroupSetId** | **String**| Handicap Group Set ID |

### Return type

[**HandicapGroupSetApiEntity**](HandicapGroupSetApiEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHandicapGroupSets"></a>
# **getHandicapGroupSets**
> GetHandicapGroupSetsResponse getHandicapGroupSets()

Get all Handicap Group Sets



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.HandicapGroupsApi;


HandicapGroupsApi apiInstance = new HandicapGroupsApi();
try {
    GetHandicapGroupSetsResponse result = apiInstance.getHandicapGroupSets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HandicapGroupsApi#getHandicapGroupSets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetHandicapGroupSetsResponse**](GetHandicapGroupSetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHandicapGroups"></a>
# **getHandicapGroups**
> GetHandicapGroupsResponse getHandicapGroups()

Get all Handicap Groups



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.HandicapGroupsApi;


HandicapGroupsApi apiInstance = new HandicapGroupsApi();
try {
    GetHandicapGroupsResponse result = apiInstance.getHandicapGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HandicapGroupsApi#getHandicapGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetHandicapGroupsResponse**](GetHandicapGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

