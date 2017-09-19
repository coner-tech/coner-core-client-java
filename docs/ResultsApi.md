# ResultsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEventRegistrationResults**](ResultsApi.md#getEventRegistrationResults) | **GET** /events/{eventId}/results/registration/{registrationId} | Get results for a registration at an event


<a name="getEventRegistrationResults"></a>
# **getEventRegistrationResults**
> GetEventResultsRegistrationResponse getEventRegistrationResults(eventId, registrationId)

Get results for a registration at an event



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.ResultsApi;


ResultsApi apiInstance = new ResultsApi();
String eventId = "eventId_example"; // String | Event ID
String registrationId = "registrationId_example"; // String | Registration ID
try {
    GetEventResultsRegistrationResponse result = apiInstance.getEventRegistrationResults(eventId, registrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getEventRegistrationResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| Event ID |
 **registrationId** | **String**| Registration ID |

### Return type

[**GetEventResultsRegistrationResponse**](GetEventResultsRegistrationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

