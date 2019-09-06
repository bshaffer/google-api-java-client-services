/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * Represents a CIDR range which can be used to assign addresses.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PublicAdvertisedPrefixPublicDelegatedPrefix extends com.google.api.client.json.GenericJson {

  /**
   * The name of the public delegated prefix
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The region of the public delegated prefix if it is regional. If absent, the prefix is global.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * The status of the public delegated prefix. Possible values are: ACTIVE: The public delegated
   * prefix is active DRAINED: The public delegated prefix is drained.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The name of the public delegated prefix
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the public delegated prefix
   * @param name name or {@code null} for none
   */
  public PublicAdvertisedPrefixPublicDelegatedPrefix setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The region of the public delegated prefix if it is regional. If absent, the prefix is global.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * The region of the public delegated prefix if it is regional. If absent, the prefix is global.
   * @param region region or {@code null} for none
   */
  public PublicAdvertisedPrefixPublicDelegatedPrefix setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * The status of the public delegated prefix. Possible values are: ACTIVE: The public delegated
   * prefix is active DRAINED: The public delegated prefix is drained.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the public delegated prefix. Possible values are: ACTIVE: The public delegated
   * prefix is active DRAINED: The public delegated prefix is drained.
   * @param status status or {@code null} for none
   */
  public PublicAdvertisedPrefixPublicDelegatedPrefix setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public PublicAdvertisedPrefixPublicDelegatedPrefix set(String fieldName, Object value) {
    return (PublicAdvertisedPrefixPublicDelegatedPrefix) super.set(fieldName, value);
  }

  @Override
  public PublicAdvertisedPrefixPublicDelegatedPrefix clone() {
    return (PublicAdvertisedPrefixPublicDelegatedPrefix) super.clone();
  }

}
