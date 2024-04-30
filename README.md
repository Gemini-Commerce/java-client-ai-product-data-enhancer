# openapi-java-client

aiproductdataenhancer/service.proto
- API version: version not set
  - Build date: 2024-04-30T15:19:43.952856902Z[Etc/UTC]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AiProductDataEnhancerApi* | [**aiProductDataEnhancerFillProductData**](docs/AiProductDataEnhancerApi.md#aiProductDataEnhancerFillProductData) | **POST** /aiproductdataenhancer.AiProductDataEnhancer/FillProductData | 


## Documentation for Models

 - [AiproductdataenhancerFillProductDataRequest](docs/AiproductdataenhancerFillProductDataRequest.md)
 - [AiproductdataenhancerFillProductDataResponse](docs/AiproductdataenhancerFillProductDataResponse.md)
 - [AiproductdataenhancerLanguageCode](docs/AiproductdataenhancerLanguageCode.md)
 - [AiproductdataenhancerProductDataToFill](docs/AiproductdataenhancerProductDataToFill.md)
 - [AiproductdataenhancerProductInformation](docs/AiproductdataenhancerProductInformation.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [RpcStatus](docs/RpcStatus.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="geminiAuthorization"></a>
### geminiAuthorization

- **Type**: API key
- **API key parameter name**: X-Gem-Token
- **Location**: HTTP header

<a id="standardAuthorization"></a>
### standardAuthorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



