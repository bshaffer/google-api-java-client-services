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
 * Represents a regional Commitment resource.
 *
 * Creating a commitment resource means that you are purchasing a committed use contract with an
 * explicit start and end time. You can create commitments based on vCPUs and memory usage and
 * receive discounted rates. For full details, read Signing Up for Committed Use Discounts. (==
 * resource_for beta.regionCommitments ==) (== resource_for v1.regionCommitments ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Commitment extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] Commitment end time in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endTimestamp;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#commitment for commitments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The plan for this commitment, which determines duration and discount rate. The currently
   * supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String plan;

  /**
   * [Output Only] URL of the region where this commitment may be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * List of reservations in this commitment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Reservation> reservations;

  /**
   * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource
   * commitments must occur together.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceCommitment> resources;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Commitment start time in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startTimestamp;

  /**
   * [Output Only] Status of the commitment with regards to eventual expiration (each commitment has
   * an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] An optional, human-readable explanation of the status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * The type of commitment, which affects the discount rate and the eligible resources. Type
   * MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Commitment setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public Commitment setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] Commitment end time in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndTimestamp() {
    return endTimestamp;
  }

  /**
   * [Output Only] Commitment end time in RFC3339 text format.
   * @param endTimestamp endTimestamp or {@code null} for none
   */
  public Commitment setEndTimestamp(java.lang.String endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public Commitment setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#commitment for commitments.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#commitment for commitments.
   * @param kind kind or {@code null} for none
   */
  public Commitment setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public Commitment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The plan for this commitment, which determines duration and discount rate. The currently
   * supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
   * @return value or {@code null} for none
   */
  public java.lang.String getPlan() {
    return plan;
  }

  /**
   * The plan for this commitment, which determines duration and discount rate. The currently
   * supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
   * @param plan plan or {@code null} for none
   */
  public Commitment setPlan(java.lang.String plan) {
    this.plan = plan;
    return this;
  }

  /**
   * [Output Only] URL of the region where this commitment may be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where this commitment may be used.
   * @param region region or {@code null} for none
   */
  public Commitment setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * List of reservations in this commitment.
   * @return value or {@code null} for none
   */
  public java.util.List<Reservation> getReservations() {
    return reservations;
  }

  /**
   * List of reservations in this commitment.
   * @param reservations reservations or {@code null} for none
   */
  public Commitment setReservations(java.util.List<Reservation> reservations) {
    this.reservations = reservations;
    return this;
  }

  /**
   * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource
   * commitments must occur together.
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceCommitment> getResources() {
    return resources;
  }

  /**
   * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource
   * commitments must occur together.
   * @param resources resources or {@code null} for none
   */
  public Commitment setResources(java.util.List<ResourceCommitment> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Commitment setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Commitment start time in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartTimestamp() {
    return startTimestamp;
  }

  /**
   * [Output Only] Commitment start time in RFC3339 text format.
   * @param startTimestamp startTimestamp or {@code null} for none
   */
  public Commitment setStartTimestamp(java.lang.String startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  /**
   * [Output Only] Status of the commitment with regards to eventual expiration (each commitment has
   * an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] Status of the commitment with regards to eventual expiration (each commitment has
   * an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
   * @param status status or {@code null} for none
   */
  public Commitment setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] An optional, human-readable explanation of the status.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * [Output Only] An optional, human-readable explanation of the status.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public Commitment setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * The type of commitment, which affects the discount rate and the eligible resources. Type
   * MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of commitment, which affects the discount rate and the eligible resources. Type
   * MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines.
   * @param type type or {@code null} for none
   */
  public Commitment setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Commitment set(String fieldName, Object value) {
    return (Commitment) super.set(fieldName, value);
  }

  @Override
  public Commitment clone() {
    return (Commitment) super.clone();
  }

}
