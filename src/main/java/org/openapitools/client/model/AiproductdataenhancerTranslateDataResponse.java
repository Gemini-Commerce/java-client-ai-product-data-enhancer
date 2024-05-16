/*
 * aiproductdataenhancer/service.proto
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: version not set
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_AiProductDataEnhancer.JSON;

/**
 * AiproductdataenhancerTranslateDataResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-16T14:31:04.308734802Z[Etc/UTC]")
public class AiproductdataenhancerTranslateDataResponse {
  public static final String SERIALIZED_NAME_DATA_TRANSLATED = "dataTranslated";
  @SerializedName(SERIALIZED_NAME_DATA_TRANSLATED)
  private Map<String, String> dataTranslated = new HashMap<>();

  public static final String SERIALIZED_NAME_CONFIDENCE_RATE = "confidenceRate";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE_RATE)
  private Float confidenceRate;

  public static final String SERIALIZED_NAME_COMPLETION_RATE = "completionRate";
  @SerializedName(SERIALIZED_NAME_COMPLETION_RATE)
  private Float completionRate;

  public AiproductdataenhancerTranslateDataResponse() {
  }

  public AiproductdataenhancerTranslateDataResponse dataTranslated(Map<String, String> dataTranslated) {
    this.dataTranslated = dataTranslated;
    return this;
  }

  public AiproductdataenhancerTranslateDataResponse putDataTranslatedItem(String key, String dataTranslatedItem) {
    if (this.dataTranslated == null) {
      this.dataTranslated = new HashMap<>();
    }
    this.dataTranslated.put(key, dataTranslatedItem);
    return this;
  }

   /**
   * Get dataTranslated
   * @return dataTranslated
  **/
  @javax.annotation.Nullable
  public Map<String, String> getDataTranslated() {
    return dataTranslated;
  }

  public void setDataTranslated(Map<String, String> dataTranslated) {
    this.dataTranslated = dataTranslated;
  }


  public AiproductdataenhancerTranslateDataResponse confidenceRate(Float confidenceRate) {
    this.confidenceRate = confidenceRate;
    return this;
  }

   /**
   * Get confidenceRate
   * @return confidenceRate
  **/
  @javax.annotation.Nullable
  public Float getConfidenceRate() {
    return confidenceRate;
  }

  public void setConfidenceRate(Float confidenceRate) {
    this.confidenceRate = confidenceRate;
  }


  public AiproductdataenhancerTranslateDataResponse completionRate(Float completionRate) {
    this.completionRate = completionRate;
    return this;
  }

   /**
   * Get completionRate
   * @return completionRate
  **/
  @javax.annotation.Nullable
  public Float getCompletionRate() {
    return completionRate;
  }

  public void setCompletionRate(Float completionRate) {
    this.completionRate = completionRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiproductdataenhancerTranslateDataResponse aiproductdataenhancerTranslateDataResponse = (AiproductdataenhancerTranslateDataResponse) o;
    return Objects.equals(this.dataTranslated, aiproductdataenhancerTranslateDataResponse.dataTranslated) &&
        Objects.equals(this.confidenceRate, aiproductdataenhancerTranslateDataResponse.confidenceRate) &&
        Objects.equals(this.completionRate, aiproductdataenhancerTranslateDataResponse.completionRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTranslated, confidenceRate, completionRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiproductdataenhancerTranslateDataResponse {\n");
    sb.append("    dataTranslated: ").append(toIndentedString(dataTranslated)).append("\n");
    sb.append("    confidenceRate: ").append(toIndentedString(confidenceRate)).append("\n");
    sb.append("    completionRate: ").append(toIndentedString(completionRate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("dataTranslated");
    openapiFields.add("confidenceRate");
    openapiFields.add("completionRate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AiproductdataenhancerTranslateDataResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AiproductdataenhancerTranslateDataResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AiproductdataenhancerTranslateDataResponse is not found in the empty JSON string", AiproductdataenhancerTranslateDataResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AiproductdataenhancerTranslateDataResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AiproductdataenhancerTranslateDataResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiproductdataenhancerTranslateDataResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiproductdataenhancerTranslateDataResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiproductdataenhancerTranslateDataResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiproductdataenhancerTranslateDataResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AiproductdataenhancerTranslateDataResponse>() {
           @Override
           public void write(JsonWriter out, AiproductdataenhancerTranslateDataResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AiproductdataenhancerTranslateDataResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AiproductdataenhancerTranslateDataResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AiproductdataenhancerTranslateDataResponse
  * @throws IOException if the JSON string is invalid with respect to AiproductdataenhancerTranslateDataResponse
  */
  public static AiproductdataenhancerTranslateDataResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiproductdataenhancerTranslateDataResponse.class);
  }

 /**
  * Convert an instance of AiproductdataenhancerTranslateDataResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

