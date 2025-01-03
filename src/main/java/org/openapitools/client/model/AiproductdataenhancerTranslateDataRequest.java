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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.AiProductDataEnhancer.JSON;

/**
 * AiproductdataenhancerTranslateDataRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-20T14:54:03.495312875Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
  private List<AiproductdataenhancerDataToTranslate> dataToTranslate = new ArrayList<>();

  public AiproductdataenhancerTranslateDataRequest() {
  }

  public AiproductdataenhancerTranslateDataRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
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
   */
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
   */
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
   */
  @javax.annotation.Nullable
  public List<AiproductdataenhancerDataToTranslate> getDataToTranslate() {
    return dataToTranslate;
  }

  public void setDataToTranslate(List<AiproductdataenhancerDataToTranslate> dataToTranslate) {
    this.dataToTranslate = dataToTranslate;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AiproductdataenhancerTranslateDataRequest instance itself
   */
  public AiproductdataenhancerTranslateDataRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
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
        Objects.equals(this.dataToTranslate, aiproductdataenhancerTranslateDataRequest.dataToTranslate)&&
        Objects.equals(this.additionalProperties, aiproductdataenhancerTranslateDataRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, targetLanguage, sourceLanguage, dataToTranslate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiproductdataenhancerTranslateDataRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    targetLanguage: ").append(toIndentedString(targetLanguage)).append("\n");
    sb.append("    sourceLanguage: ").append(toIndentedString(sourceLanguage)).append("\n");
    sb.append("    dataToTranslate: ").append(toIndentedString(dataToTranslate)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AiproductdataenhancerTranslateDataRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiproductdataenhancerTranslateDataRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
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

