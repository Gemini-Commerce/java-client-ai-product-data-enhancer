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
import java.util.HashMap;
import java.util.List;
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
 * AiproductdataenhancerProductDataToFill
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-23T15:10:13.802504333Z[Etc/UTC]")
public class AiproductdataenhancerProductDataToFill {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE_SET = "valueSet";
  @SerializedName(SERIALIZED_NAME_VALUE_SET)
  private List<String> valueSet;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = new HashMap<>();

  public AiproductdataenhancerProductDataToFill() {
  }

  public AiproductdataenhancerProductDataToFill name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AiproductdataenhancerProductDataToFill valueSet(List<String> valueSet) {
    this.valueSet = valueSet;
    return this;
  }

  public AiproductdataenhancerProductDataToFill addValueSetItem(String valueSetItem) {
    if (this.valueSet == null) {
      this.valueSet = new ArrayList<>();
    }
    this.valueSet.add(valueSetItem);
    return this;
  }

   /**
   * Get valueSet
   * @return valueSet
  **/
  @javax.annotation.Nullable
  public List<String> getValueSet() {
    return valueSet;
  }

  public void setValueSet(List<String> valueSet) {
    this.valueSet = valueSet;
  }


  public AiproductdataenhancerProductDataToFill metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public AiproductdataenhancerProductDataToFill putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata is an optional field to provide additional information to the AI like, max length, min length, field description, etc.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiproductdataenhancerProductDataToFill aiproductdataenhancerProductDataToFill = (AiproductdataenhancerProductDataToFill) o;
    return Objects.equals(this.name, aiproductdataenhancerProductDataToFill.name) &&
        Objects.equals(this.valueSet, aiproductdataenhancerProductDataToFill.valueSet) &&
        Objects.equals(this.metadata, aiproductdataenhancerProductDataToFill.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, valueSet, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiproductdataenhancerProductDataToFill {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valueSet: ").append(toIndentedString(valueSet)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("valueSet");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AiproductdataenhancerProductDataToFill
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AiproductdataenhancerProductDataToFill.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AiproductdataenhancerProductDataToFill is not found in the empty JSON string", AiproductdataenhancerProductDataToFill.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AiproductdataenhancerProductDataToFill.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AiproductdataenhancerProductDataToFill` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("valueSet") != null && !jsonObj.get("valueSet").isJsonNull() && !jsonObj.get("valueSet").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueSet` to be an array in the JSON string but got `%s`", jsonObj.get("valueSet").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiproductdataenhancerProductDataToFill.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiproductdataenhancerProductDataToFill' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiproductdataenhancerProductDataToFill> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiproductdataenhancerProductDataToFill.class));

       return (TypeAdapter<T>) new TypeAdapter<AiproductdataenhancerProductDataToFill>() {
           @Override
           public void write(JsonWriter out, AiproductdataenhancerProductDataToFill value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AiproductdataenhancerProductDataToFill read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AiproductdataenhancerProductDataToFill given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AiproductdataenhancerProductDataToFill
  * @throws IOException if the JSON string is invalid with respect to AiproductdataenhancerProductDataToFill
  */
  public static AiproductdataenhancerProductDataToFill fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiproductdataenhancerProductDataToFill.class);
  }

 /**
  * Convert an instance of AiproductdataenhancerProductDataToFill to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

