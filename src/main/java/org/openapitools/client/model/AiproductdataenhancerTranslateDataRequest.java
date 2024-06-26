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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AiproductdataenhancerDataToTranslate;
import org.openapitools.client.model.AiproductdataenhancerLanguageCode;

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
 * AiproductdataenhancerTranslateDataRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-29T14:49:19.891260503Z[Etc/UTC]")
public class AiproductdataenhancerTranslateDataRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_TARGET_LANGUAGE = "targetLanguage";
  @SerializedName(SERIALIZED_NAME_TARGET_LANGUAGE)
  private AiproductdataenhancerLanguageCode targetLanguage = AiproductdataenhancerLanguageCode.UNKNOWN;

  public static final String SERIALIZED_NAME_SOURCE_LANGUAGE = "sourceLanguage";
  @SerializedName(SERIALIZED_NAME_SOURCE_LANGUAGE)
  private AiproductdataenhancerLanguageCode sourceLanguage = AiproductdataenhancerLanguageCode.UNKNOWN;

  public static final String SERIALIZED_NAME_DATA_TO_TRANSLATE = "dataToTranslate";
  @SerializedName(SERIALIZED_NAME_DATA_TO_TRANSLATE)
  private List<AiproductdataenhancerDataToTranslate> dataToTranslate;

  public AiproductdataenhancerTranslateDataRequest() {
  }

  public AiproductdataenhancerTranslateDataRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public AiproductdataenhancerTranslateDataRequest targetLanguage(AiproductdataenhancerLanguageCode targetLanguage) {
    this.targetLanguage = targetLanguage;
    return this;
  }

   /**
   * Get targetLanguage
   * @return targetLanguage
  **/
  @javax.annotation.Nullable
  public AiproductdataenhancerLanguageCode getTargetLanguage() {
    return targetLanguage;
  }

  public void setTargetLanguage(AiproductdataenhancerLanguageCode targetLanguage) {
    this.targetLanguage = targetLanguage;
  }


  public AiproductdataenhancerTranslateDataRequest sourceLanguage(AiproductdataenhancerLanguageCode sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
    return this;
  }

   /**
   * Get sourceLanguage
   * @return sourceLanguage
  **/
  @javax.annotation.Nullable
  public AiproductdataenhancerLanguageCode getSourceLanguage() {
    return sourceLanguage;
  }

  public void setSourceLanguage(AiproductdataenhancerLanguageCode sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
  }


  public AiproductdataenhancerTranslateDataRequest dataToTranslate(List<AiproductdataenhancerDataToTranslate> dataToTranslate) {
    this.dataToTranslate = dataToTranslate;
    return this;
  }

  public AiproductdataenhancerTranslateDataRequest addDataToTranslateItem(AiproductdataenhancerDataToTranslate dataToTranslateItem) {
    if (this.dataToTranslate == null) {
      this.dataToTranslate = new ArrayList<>();
    }
    this.dataToTranslate.add(dataToTranslateItem);
    return this;
  }

   /**
   * Get dataToTranslate
   * @return dataToTranslate
  **/
  @javax.annotation.Nullable
  public List<AiproductdataenhancerDataToTranslate> getDataToTranslate() {
    return dataToTranslate;
  }

  public void setDataToTranslate(List<AiproductdataenhancerDataToTranslate> dataToTranslate) {
    this.dataToTranslate = dataToTranslate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiproductdataenhancerTranslateDataRequest aiproductdataenhancerTranslateDataRequest = (AiproductdataenhancerTranslateDataRequest) o;
    return Objects.equals(this.tenantId, aiproductdataenhancerTranslateDataRequest.tenantId) &&
        Objects.equals(this.targetLanguage, aiproductdataenhancerTranslateDataRequest.targetLanguage) &&
        Objects.equals(this.sourceLanguage, aiproductdataenhancerTranslateDataRequest.sourceLanguage) &&
        Objects.equals(this.dataToTranslate, aiproductdataenhancerTranslateDataRequest.dataToTranslate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, targetLanguage, sourceLanguage, dataToTranslate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiproductdataenhancerTranslateDataRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    targetLanguage: ").append(toIndentedString(targetLanguage)).append("\n");
    sb.append("    sourceLanguage: ").append(toIndentedString(sourceLanguage)).append("\n");
    sb.append("    dataToTranslate: ").append(toIndentedString(dataToTranslate)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("targetLanguage");
    openapiFields.add("sourceLanguage");
    openapiFields.add("dataToTranslate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AiproductdataenhancerTranslateDataRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AiproductdataenhancerTranslateDataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AiproductdataenhancerTranslateDataRequest is not found in the empty JSON string", AiproductdataenhancerTranslateDataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AiproductdataenhancerTranslateDataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AiproductdataenhancerTranslateDataRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      // validate the optional field `targetLanguage`
      if (jsonObj.get("targetLanguage") != null && !jsonObj.get("targetLanguage").isJsonNull()) {
        AiproductdataenhancerLanguageCode.validateJsonElement(jsonObj.get("targetLanguage"));
      }
      // validate the optional field `sourceLanguage`
      if (jsonObj.get("sourceLanguage") != null && !jsonObj.get("sourceLanguage").isJsonNull()) {
        AiproductdataenhancerLanguageCode.validateJsonElement(jsonObj.get("sourceLanguage"));
      }
      if (jsonObj.get("dataToTranslate") != null && !jsonObj.get("dataToTranslate").isJsonNull()) {
        JsonArray jsonArraydataToTranslate = jsonObj.getAsJsonArray("dataToTranslate");
        if (jsonArraydataToTranslate != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dataToTranslate").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dataToTranslate` to be an array in the JSON string but got `%s`", jsonObj.get("dataToTranslate").toString()));
          }

          // validate the optional field `dataToTranslate` (array)
          for (int i = 0; i < jsonArraydataToTranslate.size(); i++) {
            AiproductdataenhancerDataToTranslate.validateJsonElement(jsonArraydataToTranslate.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiproductdataenhancerTranslateDataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiproductdataenhancerTranslateDataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiproductdataenhancerTranslateDataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiproductdataenhancerTranslateDataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AiproductdataenhancerTranslateDataRequest>() {
           @Override
           public void write(JsonWriter out, AiproductdataenhancerTranslateDataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AiproductdataenhancerTranslateDataRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AiproductdataenhancerTranslateDataRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AiproductdataenhancerTranslateDataRequest
  * @throws IOException if the JSON string is invalid with respect to AiproductdataenhancerTranslateDataRequest
  */
  public static AiproductdataenhancerTranslateDataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiproductdataenhancerTranslateDataRequest.class);
  }

 /**
  * Convert an instance of AiproductdataenhancerTranslateDataRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

