# RunsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRawTimeToFirstRunInSequenceLackingOne**](RunsApi.md#addRawTimeToFirstRunInSequenceLackingOne) | **POST** /events/{eventId}/runs/rawTimes | Add a raw time to the first run in sequence lacking one, or to a new run created on-the-fly if no runs lack a raw time
[**addRun**](RunsApi.md#addRun) | **POST** /events/{eventId}/runs | Add a new run
[**getEventRuns**](RunsApi.md#getEventRuns) | **GET** /events/{eventId}/runs | Get a list of all runs at an event
[**getRun**](RunsApi.md#getRun) | **GET** /events/{eventId}/runs/{runId} | Get a specific run


<a name="addRawTimeToFirstRunInSequenceLackingOne"></a>
# **addRawTimeToFirstRunInSequenceLackingOne**
> RunApiEntity addRawTimeToFirstRunInSequenceLackingOne(eventId, body)

Add a raw time to the first run in sequence lacking one, or to a new run created on-the-fly if no runs lack a raw time



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.RunsApi;


RunsApi apiInstance = new RunsApi();
String eventId = "eventId_example"; // String | Event ID
AddRawTimeToFirstRunLackingRequest body = new AddRawTimeToFirstRunLackingRequest(); // AddRawTimeToFirstRunLackingRequest | Time
try {
    RunApiEntity result = apiInstance.addRawTimeToFirstRunInSequenceLackingOne(eventId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RunsApi#addRawTimeToFirstRunInSequenceLackingOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| Event ID |
 **body** | [**AddRawTimeToFirstRunLackingRequest**](AddRawTimeToFirstRunLackingRequest.md)| Time |

### Return type

[**RunApiEntity**](RunApiEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRun"></a>
# **addRun**
> addRun(eventId, body)

Add a new run



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.RunsApi;


RunsApi apiInstance = new RunsApi();
String eventId = "eventId_example"; // String | Event ID
AddRunRequest body = new AddRunRequest(); // AddRunRequest | Run
try {
    apiInstance.addRun(eventId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RunsApi#addRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| Event ID |
 **body** | [**AddRunRequest**](AddRunRequest.md)| Run |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventRuns"></a>
# **getEventRuns**
> GetEventRunsResponse getEventRuns(eventId)

Get a list of all runs at an event



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.RunsApi;


RunsApi apiInstance = new RunsApi();
String eventId = "eventId_example"; // String | Event ID
try {
    GetEventRunsResponse result = apiInstance.getEventRuns(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RunsApi#getEventRuns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| Event ID |

### Return type

[**GetEventRunsResponse**](GetEventRunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRun"></a>
# **getRun**
> RunApiEntity getRun(eventId, runId)

Get a specific run



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.RunsApi;


RunsApi apiInstance = new RunsApi();
String eventId = "eventId_example"; // String | Event ID
String runId = "runId_example"; // String | Run ID
try {
    RunApiEntity result = apiInstance.getRun(eventId, runId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RunsApi#getRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| Event ID |
 **runId** | **String**| Run ID |

### Return type

[**RunApiEntity**](RunApiEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

