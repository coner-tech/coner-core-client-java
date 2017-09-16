# RegistrationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRegistration**](RegistrationsApi.md#addRegistration) | **POST** /events/{eventId}/registrations | Add a new registration
[**getEventRegistrations**](RegistrationsApi.md#getEventRegistrations) | **GET** /events/{eventId}/registrations | Get a list of all registrations at an event
[**getRegistration**](RegistrationsApi.md#getRegistration) | **GET** /events/{eventId}/registrations/{registrationId} | Get a specific registration


<a name="addRegistration"></a>
# **addRegistration**
> addRegistration(eventId, body)

Add a new registration



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.RegistrationsApi;


RegistrationsApi apiInstance = new RegistrationsApi();
String eventId = "eventId_example"; // String | Event ID
AddRegistrationRequest body = new AddRegistrationRequest(); // AddRegistrationRequest | Registration
try {
    apiInstance.addRegistration(eventId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationsApi#addRegistration");
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

<a name="getEventRegistrations"></a>
# **getEventRegistrations**
> GetEventRegistrationsResponse getEventRegistrations(eventId)

Get a list of all registrations at an event



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.RegistrationsApi;


RegistrationsApi apiInstance = new RegistrationsApi();
String eventId = "eventId_example"; // String | Event ID
try {
    GetEventRegistrationsResponse result = apiInstance.getEventRegistrations(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationsApi#getEventRegistrations");
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

<a name="getRegistration"></a>
# **getRegistration**
> RegistrationApiEntity getRegistration(eventId, registrationId)

Get a specific registration



### Example
```java
// Import classes:
//import org.coner.core.client.ApiException;
//import org.coner.core.client.api.RegistrationsApi;


RegistrationsApi apiInstance = new RegistrationsApi();
String eventId = "eventId_example"; // String | Event ID
String registrationId = "registrationId_example"; // String | Registration ID
try {
    RegistrationApiEntity result = apiInstance.getRegistration(eventId, registrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationsApi#getRegistration");
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

