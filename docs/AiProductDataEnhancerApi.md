# AiProductDataEnhancerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiProductDataEnhancerFillProductData**](AiProductDataEnhancerApi.md#aiProductDataEnhancerFillProductData) | **POST** /aiproductdataenhancer.AiProductDataEnhancer/FillProductData |  |
| [**aiProductDataEnhancerFillProductDataCheck**](AiProductDataEnhancerApi.md#aiProductDataEnhancerFillProductDataCheck) | **POST** /aiproductdataenhancer.AiProductDataEnhancer/FillProductDataCheck |  |
| [**aiProductDataEnhancerTranslateData**](AiProductDataEnhancerApi.md#aiProductDataEnhancerTranslateData) | **POST** /aiproductdataenhancer.AiProductDataEnhancer/TranslateData |  |


<a id="aiProductDataEnhancerFillProductData"></a>
# **aiProductDataEnhancerFillProductData**
> AiproductdataenhancerFillProductDataResponse aiProductDataEnhancerFillProductData(body)



### Example
```java
// Import classes:
import GeminiCommerce_AiProductDataEnhancer.ApiClient;
import GeminiCommerce_AiProductDataEnhancer.ApiException;
import GeminiCommerce_AiProductDataEnhancer.Configuration;
import GeminiCommerce_AiProductDataEnhancer.models.*;
import org.openapitools.client.api.AiProductDataEnhancerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AiProductDataEnhancerApi apiInstance = new AiProductDataEnhancerApi(defaultClient);
    AiproductdataenhancerFillProductDataRequest body = new AiproductdataenhancerFillProductDataRequest(); // AiproductdataenhancerFillProductDataRequest | 
    try {
      AiproductdataenhancerFillProductDataResponse result = apiInstance.aiProductDataEnhancerFillProductData(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiProductDataEnhancerApi#aiProductDataEnhancerFillProductData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**AiproductdataenhancerFillProductDataRequest**](AiproductdataenhancerFillProductDataRequest.md)|  | |

### Return type

[**AiproductdataenhancerFillProductDataResponse**](AiproductdataenhancerFillProductDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="aiProductDataEnhancerFillProductDataCheck"></a>
# **aiProductDataEnhancerFillProductDataCheck**
> AiproductdataenhancerFillProductDataCheckResponse aiProductDataEnhancerFillProductDataCheck(body)



### Example
```java
// Import classes:
import GeminiCommerce_AiProductDataEnhancer.ApiClient;
import GeminiCommerce_AiProductDataEnhancer.ApiException;
import GeminiCommerce_AiProductDataEnhancer.Configuration;
import GeminiCommerce_AiProductDataEnhancer.models.*;
import org.openapitools.client.api.AiProductDataEnhancerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AiProductDataEnhancerApi apiInstance = new AiProductDataEnhancerApi(defaultClient);
    AiproductdataenhancerFillProductDataCheckRequest body = new AiproductdataenhancerFillProductDataCheckRequest(); // AiproductdataenhancerFillProductDataCheckRequest | 
    try {
      AiproductdataenhancerFillProductDataCheckResponse result = apiInstance.aiProductDataEnhancerFillProductDataCheck(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiProductDataEnhancerApi#aiProductDataEnhancerFillProductDataCheck");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**AiproductdataenhancerFillProductDataCheckRequest**](AiproductdataenhancerFillProductDataCheckRequest.md)|  | |

### Return type

[**AiproductdataenhancerFillProductDataCheckResponse**](AiproductdataenhancerFillProductDataCheckResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="aiProductDataEnhancerTranslateData"></a>
# **aiProductDataEnhancerTranslateData**
> AiproductdataenhancerTranslateDataResponse aiProductDataEnhancerTranslateData(body)



### Example
```java
// Import classes:
import GeminiCommerce_AiProductDataEnhancer.ApiClient;
import GeminiCommerce_AiProductDataEnhancer.ApiException;
import GeminiCommerce_AiProductDataEnhancer.Configuration;
import GeminiCommerce_AiProductDataEnhancer.models.*;
import org.openapitools.client.api.AiProductDataEnhancerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AiProductDataEnhancerApi apiInstance = new AiProductDataEnhancerApi(defaultClient);
    AiproductdataenhancerTranslateDataRequest body = new AiproductdataenhancerTranslateDataRequest(); // AiproductdataenhancerTranslateDataRequest | 
    try {
      AiproductdataenhancerTranslateDataResponse result = apiInstance.aiProductDataEnhancerTranslateData(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiProductDataEnhancerApi#aiProductDataEnhancerTranslateData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**AiproductdataenhancerTranslateDataRequest**](AiproductdataenhancerTranslateDataRequest.md)|  | |

### Return type

[**AiproductdataenhancerTranslateDataResponse**](AiproductdataenhancerTranslateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

