# EventsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEvent**](EventsApi.md#addEvent) | **POST** /events | Add an Event
[**addRawTimeToFirstRunInSequenceLackingOne**](EventsApi.md#addRawTimeToFirstRunInSequenceLackingOne) | **POST** /events/{eventId}/runs/rawTimes | Add a raw time to the first run in sequence lacking one, or to a new run created on-the-fly if no runs lack a raw time
[**addRegistration**](EventsApi.md#addRegistration) | **POST** /events/{eventId}/registrations | Add a new registration
[**addRun**](EventsApi.md#addRun) | **POST** /events/{eventId}/runs | Add a new run
[**getEvent**](EventsApi.md#getEvent) | **GET** /events/{eventId} | Get an Event
[**getEventRegistrationResults**](EventsApi.md#getEventRegistrationResults) | **GET** /events/{eventId}/results/registration/{registrationId} | Get results for a registration at an event
[**getEventRegistrations**](EventsApi.md#getEventRegistrations) | **GET** /events/{eventId}/registrations | Get a list of all registrations at an event
[**getEventRuns**](EventsApi.md#getEventRuns) | **GET** /events/{eventId}/runs | Get a list of all runs at an event
[**getEvents**](EventsApi.md#getEvents) | **GET** /events | Get a list of all events
[**getRegistration**](EventsApi.md#getRegistration) | **GET** /events/{eventId}/registrations/{registrationId} | Get a specific registration
[**getRun**](EventsApi.md#getRun) | **GET** /events/{eventId}/runs/{runId} | Get a specific run


<a name="addEvent"></a>
# **addEvent**
> addEvent(body)

Add an Event



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
AddEventRequest body = new AddEventRequest(); // AddEventRequest | Event
try {
    apiInstance.addEvent(body);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#addEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddEventRequest**](AddEventRequest.md)| Event |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRawTimeToFirstRunInSequenceLackingOne"></a>
# **addRawTimeToFirstRunInSequenceLackingOne**
> RunApiEntity addRawTimeToFirstRunInSequenceLackingOne(eventId, body)

Add a raw time to the first run in sequence lacking one, or to a new run created on-the-fly if no runs lack a raw time



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String eventId = "eventId_example"; // String | Event ID
AddRawTimeToFirstRunLackingRequest body = new AddRawTimeToFirstRunLackingRequest(); // AddRawTimeToFirstRunLackingRequest | Time
try {
    RunApiEntity result = apiInstance.addRawTimeToFirstRunInSequenceLackingOne(eventId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#addRawTimeToFirstRunInSequenceLackingOne");
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

<a name="addRegistration"></a>
# **addRegistration**
> addRegistration(eventId, body)

Add a new registration



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String eventId = "eventId_example"; // String | Event ID
AddRegistrationRequest body = new AddRegistrationRequest(); // AddRegistrationRequest | Registration
try {
    apiInstance.addRegistration(eventId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#addRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| Event ID |
 **body** | [**AddRegistrationRequest**](AddRegistrationRequest.md)| Registration |

### Return type

null (empty response body)

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
//import org.coner.core.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String eventId = "eventId_example"; // String | Event ID
AddRunRequest body = new AddRunRequest(); // AddRunRequest | Run
try {
    apiInstance.addRun(eventId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#addRun");
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

<a name="getEvent"></a>
# **getEvent**
> EventApiEntity getEvent(eventId)

Get an Event



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String eventId = "eventId_example"; // String | Event ID
try {
    EventApiEntity result = apiInstance.getEvent(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| Event ID |

### Return type

[**EventApiEntity**](EventApiEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventRegistrationResults"></a>
# **getEventRegistrationResults**
> GetEventResultsRegistrationResponse getEventRegistrationResults(eventId, registrationId)

Get results for a registration at an event



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String eventId = "eventId_example"; // String | Event ID
String registrationId = "registrationId_example"; // String | Registration ID
try {
    GetEventResultsRegistrationResponse result = apiInstance.getEventRegistrationResults(eventId, registrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEventRegistrationResults");
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

<a name="getEventRegistrations"></a>
# **getEventRegistrations**
> GetEventRegistrationsResponse getEventRegistrations(eventId)

Get a list of all registrations at an event



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String eventId = "eventId_example"; // String | Event ID
try {
    GetEventRegistrationsResponse result = apiInstance.getEventRegistrations(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEventRegistrations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| Event ID |

### Return type

[**GetEventRegistrationsResponse**](GetEventRegistrationsResponse.md)

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
//import org.coner.core.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String eventId = "eventId_example"; // String | Event ID
try {
    GetEventRunsResponse result = apiInstance.getEventRuns(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEventRuns");
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

<a name="getEvents"></a>
# **getEvents**
> GetEventsResponse getEvents()

Get a list of all events



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
try {
    GetEventsResponse result = apiInstance.getEvents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEvents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetEventsResponse**](GetEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRegistration"></a>
# **getRegistration**
> RegistrationApiEntity getRegistration(eventId, registrationId)

Get a specific registration



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String eventId = "eventId_example"; // String | Event ID
String registrationId = "registrationId_example"; // String | Registration ID
try {
    RegistrationApiEntity result = apiInstance.getRegistration(eventId, registrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| Event ID |
 **registrationId** | **String**| Registration ID |

### Return type

[**RegistrationApiEntity**](RegistrationApiEntity.md)

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
//import org.coner.core.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String eventId = "eventId_example"; // String | Event ID
String runId = "runId_example"; // String | Run ID
try {
    RunApiEntity result = apiInstance.getRun(eventId, runId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getRun");
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

