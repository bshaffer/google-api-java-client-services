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
 * Represents an Interconnect Attachment (VLAN) resource.
 *
 * You can use Interconnect attachments (VLANS) to connect your Virtual Private Cloud networks to
 * your on-premises networks through an Interconnect. For more information, read  Creating VLAN
 * Attachments. (== resource_for beta.interconnectAttachments ==) (== resource_for
 * v1.interconnectAttachments ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InterconnectAttachment extends com.google.api.client.json.GenericJson {

  /**
   * Determines whether this Attachment will carry packets. Not present for PARTNER_PROVIDER.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean adminEnabled;

  /**
   * Provisioned bandwidth capacity for the interconnect attachment. For attachments of type
   * DEDICATED, the user can set the bandwidth. For attachments of type PARTNER, the Google Partner
   * that is operating the interconnect must set the bandwidth. Output only for PARTNER type,
   * mutable for PARTNER_PROVIDER and DEDICATED, and can take one of the following values: -
   * BPS_50M: 50 Mbit/s  - BPS_100M: 100 Mbit/s  - BPS_200M: 200 Mbit/s  - BPS_300M: 300 Mbit/s  -
   * BPS_400M: 400 Mbit/s  - BPS_500M: 500 Mbit/s  - BPS_1G: 1 Gbit/s  - BPS_2G: 2 Gbit/s  - BPS_5G:
   * 5 Gbit/s  - BPS_10G: 10 Gbit/s  - BPS_20G: 20 Gbit/s  - BPS_50G: 50 Gbit/s
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bandwidth;

  /**
   * Up to 16 candidate prefixes that can be used to restrict the allocation of cloudRouterIpAddress
   * and customerRouterIpAddress for this attachment. All prefixes must be within link-local address
   * space (169.254.0.0/16) and must be /29 or shorter (/28, /27, etc). Google will attempt to
   * select an unused /29 from the supplied candidate prefix(es). The request will fail if all
   * possible /29s are in use on Google?s edge. If not supplied, Google will randomly select an
   * unused /29 from all of link-local space.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> candidateSubnets;

  /**
   * [Output Only] IPv4 address + prefix length to be configured on Cloud Router Interface for this
   * interconnect attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cloudRouterIpAddress;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * [Output Only] IPv4 address + prefix length to be configured on the customer router subinterface
   * for this interconnect attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerRouterIpAddress;

  /**
   * An optional description of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Desired availability domain for the attachment. Only available for type PARTNER, at creation
   * time, and can take one of the following values: - AVAILABILITY_DOMAIN_ANY  -
   * AVAILABILITY_DOMAIN_1  - AVAILABILITY_DOMAIN_2 For improved reliability, customers should
   * configure a pair of attachments, one per availability domain. The selected availability domain
   * will be provided to the Partner via the pairing key, so that the provisioned circuit will lie
   * in the specified domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String edgeAvailabilityDomain;

  /**
   * [Output Only] Google reference ID, to be used when raising support tickets with Google or
   * otherwise to debug backend connectivity issues. [Deprecated] This field is not used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googleReferenceId;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * URL of the underlying Interconnect object that this attachment's traffic will traverse through.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interconnect;

  /**
   * [Output Only] Type of the resource. Always compute#interconnectAttachment for interconnect
   * attachments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A fingerprint for the labels being applied to this InterconnectAttachment, which is essentially
   * a hash of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an InterconnectAttachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelFingerprint;

  /**
   * Labels to apply to this InterconnectAttachment resource. These can be later modified by the
   * setLabels method. Each label key/value must comply with RFC1035. Label values may be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

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
   * [Output Only] The current status of whether or not this interconnect attachment is functional,
   * which can take one of the following values: - OS_ACTIVE: The attachment has been turned up and
   * is ready to use.  - OS_UNPROVISIONED: The attachment is not ready to use yet, because turnup is
   * not complete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationalStatus;

  /**
   * [Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not present for DEDICATED]. The
   * opaque identifier of an PARTNER attachment used to initiate provisioning with a selected
   * partner. Of the form "XXXXX/region/domain"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pairingKey;

  /**
   * Optional BGP ASN for the router supplied by a Layer 3 Partner if they configured BGP on behalf
   * of the customer. Output only for PARTNER type, input only for PARTNER_PROVIDER, not available
   * for DEDICATED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long partnerAsn;

  /**
   * Informational metadata about Partner attachments from Partners to display to customers. Output
   * only for for PARTNER type, mutable for PARTNER_PROVIDER, not available for DEDICATED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InterconnectAttachmentPartnerMetadata partnerMetadata;

  /**
   * [Output Only] Information specific to an InterconnectAttachment. This property is populated if
   * the interconnect that this is attached to is of type DEDICATED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InterconnectAttachmentPrivateInfo privateInterconnectInfo;

  /**
   * [Output Only] URL of the region where the regional interconnect attachment resides. You must
   * specify this field as part of the HTTP request URL. It is not settable as a field in the
   * request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * URL of the Cloud Router to be used for dynamic routing. This router must be in the same region
   * as this InterconnectAttachment. The InterconnectAttachment will automatically connect the
   * Interconnect to the network & region within which the Cloud Router is configured.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String router;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] The current state of this attachment's functionality. Enum values ACTIVE and
   * UNPROVISIONED are shared by DEDICATED/PRIVATE, PARTNER, and PARTNER_PROVIDER interconnect
   * attachments, while enum values PENDING_PARTNER, PARTNER_REQUEST_RECEIVED, and PENDING_CUSTOMER
   * are used for only PARTNER and PARTNER_PROVIDER interconnect attachments. This state can take
   * one of the following values: - ACTIVE: The attachment has been turned up and is ready to use.
   * - UNPROVISIONED: The attachment is not ready to use yet, because turnup is not complete.  -
   * PENDING_PARTNER: A newly-created PARTNER attachment that has not yet been configured on the
   * Partner side.  - PARTNER_REQUEST_RECEIVED: A PARTNER attachment is in the process of
   * provisioning after a PARTNER_PROVIDER attachment was created that references it.  -
   * PENDING_CUSTOMER: A PARTNER or PARTNER_PROVIDER attachment that is waiting for a customer to
   * activate it.  - DEFUNCT: The attachment was deleted externally and is no longer functional.
   * This could be because the associated Interconnect was removed, or because the other side of a
   * Partner attachment was deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The type of interconnect attachment this is, which can take one of the following values: -
   * DEDICATED: an attachment to a Dedicated Interconnect.  - PARTNER: an attachment to a Partner
   * Interconnect, created by the customer.  - PARTNER_PROVIDER: an attachment to a Partner
   * Interconnect, created by the partner.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only specified at creation
   * time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer vlanTag8021q;

  /**
   * Determines whether this Attachment will carry packets. Not present for PARTNER_PROVIDER.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdminEnabled() {
    return adminEnabled;
  }

  /**
   * Determines whether this Attachment will carry packets. Not present for PARTNER_PROVIDER.
   * @param adminEnabled adminEnabled or {@code null} for none
   */
  public InterconnectAttachment setAdminEnabled(java.lang.Boolean adminEnabled) {
    this.adminEnabled = adminEnabled;
    return this;
  }

  /**
   * Provisioned bandwidth capacity for the interconnect attachment. For attachments of type
   * DEDICATED, the user can set the bandwidth. For attachments of type PARTNER, the Google Partner
   * that is operating the interconnect must set the bandwidth. Output only for PARTNER type,
   * mutable for PARTNER_PROVIDER and DEDICATED, and can take one of the following values: -
   * BPS_50M: 50 Mbit/s  - BPS_100M: 100 Mbit/s  - BPS_200M: 200 Mbit/s  - BPS_300M: 300 Mbit/s  -
   * BPS_400M: 400 Mbit/s  - BPS_500M: 500 Mbit/s  - BPS_1G: 1 Gbit/s  - BPS_2G: 2 Gbit/s  - BPS_5G:
   * 5 Gbit/s  - BPS_10G: 10 Gbit/s  - BPS_20G: 20 Gbit/s  - BPS_50G: 50 Gbit/s
   * @return value or {@code null} for none
   */
  public java.lang.String getBandwidth() {
    return bandwidth;
  }

  /**
   * Provisioned bandwidth capacity for the interconnect attachment. For attachments of type
   * DEDICATED, the user can set the bandwidth. For attachments of type PARTNER, the Google Partner
   * that is operating the interconnect must set the bandwidth. Output only for PARTNER type,
   * mutable for PARTNER_PROVIDER and DEDICATED, and can take one of the following values: -
   * BPS_50M: 50 Mbit/s  - BPS_100M: 100 Mbit/s  - BPS_200M: 200 Mbit/s  - BPS_300M: 300 Mbit/s  -
   * BPS_400M: 400 Mbit/s  - BPS_500M: 500 Mbit/s  - BPS_1G: 1 Gbit/s  - BPS_2G: 2 Gbit/s  - BPS_5G:
   * 5 Gbit/s  - BPS_10G: 10 Gbit/s  - BPS_20G: 20 Gbit/s  - BPS_50G: 50 Gbit/s
   * @param bandwidth bandwidth or {@code null} for none
   */
  public InterconnectAttachment setBandwidth(java.lang.String bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

  /**
   * Up to 16 candidate prefixes that can be used to restrict the allocation of cloudRouterIpAddress
   * and customerRouterIpAddress for this attachment. All prefixes must be within link-local address
   * space (169.254.0.0/16) and must be /29 or shorter (/28, /27, etc). Google will attempt to
   * select an unused /29 from the supplied candidate prefix(es). The request will fail if all
   * possible /29s are in use on Google?s edge. If not supplied, Google will randomly select an
   * unused /29 from all of link-local space.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCandidateSubnets() {
    return candidateSubnets;
  }

  /**
   * Up to 16 candidate prefixes that can be used to restrict the allocation of cloudRouterIpAddress
   * and customerRouterIpAddress for this attachment. All prefixes must be within link-local address
   * space (169.254.0.0/16) and must be /29 or shorter (/28, /27, etc). Google will attempt to
   * select an unused /29 from the supplied candidate prefix(es). The request will fail if all
   * possible /29s are in use on Google?s edge. If not supplied, Google will randomly select an
   * unused /29 from all of link-local space.
   * @param candidateSubnets candidateSubnets or {@code null} for none
   */
  public InterconnectAttachment setCandidateSubnets(java.util.List<java.lang.String> candidateSubnets) {
    this.candidateSubnets = candidateSubnets;
    return this;
  }

  /**
   * [Output Only] IPv4 address + prefix length to be configured on Cloud Router Interface for this
   * interconnect attachment.
   * @return value or {@code null} for none
   */
  public java.lang.String getCloudRouterIpAddress() {
    return cloudRouterIpAddress;
  }

  /**
   * [Output Only] IPv4 address + prefix length to be configured on Cloud Router Interface for this
   * interconnect attachment.
   * @param cloudRouterIpAddress cloudRouterIpAddress or {@code null} for none
   */
  public InterconnectAttachment setCloudRouterIpAddress(java.lang.String cloudRouterIpAddress) {
    this.cloudRouterIpAddress = cloudRouterIpAddress;
    return this;
  }

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
  public InterconnectAttachment setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * [Output Only] IPv4 address + prefix length to be configured on the customer router subinterface
   * for this interconnect attachment.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerRouterIpAddress() {
    return customerRouterIpAddress;
  }

  /**
   * [Output Only] IPv4 address + prefix length to be configured on the customer router subinterface
   * for this interconnect attachment.
   * @param customerRouterIpAddress customerRouterIpAddress or {@code null} for none
   */
  public InterconnectAttachment setCustomerRouterIpAddress(java.lang.String customerRouterIpAddress) {
    this.customerRouterIpAddress = customerRouterIpAddress;
    return this;
  }

  /**
   * An optional description of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource.
   * @param description description or {@code null} for none
   */
  public InterconnectAttachment setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Desired availability domain for the attachment. Only available for type PARTNER, at creation
   * time, and can take one of the following values: - AVAILABILITY_DOMAIN_ANY  -
   * AVAILABILITY_DOMAIN_1  - AVAILABILITY_DOMAIN_2 For improved reliability, customers should
   * configure a pair of attachments, one per availability domain. The selected availability domain
   * will be provided to the Partner via the pairing key, so that the provisioned circuit will lie
   * in the specified domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.
   * @return value or {@code null} for none
   */
  public java.lang.String getEdgeAvailabilityDomain() {
    return edgeAvailabilityDomain;
  }

  /**
   * Desired availability domain for the attachment. Only available for type PARTNER, at creation
   * time, and can take one of the following values: - AVAILABILITY_DOMAIN_ANY  -
   * AVAILABILITY_DOMAIN_1  - AVAILABILITY_DOMAIN_2 For improved reliability, customers should
   * configure a pair of attachments, one per availability domain. The selected availability domain
   * will be provided to the Partner via the pairing key, so that the provisioned circuit will lie
   * in the specified domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.
   * @param edgeAvailabilityDomain edgeAvailabilityDomain or {@code null} for none
   */
  public InterconnectAttachment setEdgeAvailabilityDomain(java.lang.String edgeAvailabilityDomain) {
    this.edgeAvailabilityDomain = edgeAvailabilityDomain;
    return this;
  }

  /**
   * [Output Only] Google reference ID, to be used when raising support tickets with Google or
   * otherwise to debug backend connectivity issues. [Deprecated] This field is not used.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoogleReferenceId() {
    return googleReferenceId;
  }

  /**
   * [Output Only] Google reference ID, to be used when raising support tickets with Google or
   * otherwise to debug backend connectivity issues. [Deprecated] This field is not used.
   * @param googleReferenceId googleReferenceId or {@code null} for none
   */
  public InterconnectAttachment setGoogleReferenceId(java.lang.String googleReferenceId) {
    this.googleReferenceId = googleReferenceId;
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
  public InterconnectAttachment setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * URL of the underlying Interconnect object that this attachment's traffic will traverse through.
   * @return value or {@code null} for none
   */
  public java.lang.String getInterconnect() {
    return interconnect;
  }

  /**
   * URL of the underlying Interconnect object that this attachment's traffic will traverse through.
   * @param interconnect interconnect or {@code null} for none
   */
  public InterconnectAttachment setInterconnect(java.lang.String interconnect) {
    this.interconnect = interconnect;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#interconnectAttachment for interconnect
   * attachments.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#interconnectAttachment for interconnect
   * attachments.
   * @param kind kind or {@code null} for none
   */
  public InterconnectAttachment setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this InterconnectAttachment, which is essentially
   * a hash of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an InterconnectAttachment.
   * @see #decodeLabelFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelFingerprint() {
    return labelFingerprint;
  }

  /**
   * A fingerprint for the labels being applied to this InterconnectAttachment, which is essentially
   * a hash of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an InterconnectAttachment.
   * @see #getLabelFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeLabelFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(labelFingerprint);
  }

  /**
   * A fingerprint for the labels being applied to this InterconnectAttachment, which is essentially
   * a hash of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an InterconnectAttachment.
   * @see #encodeLabelFingerprint()
   * @param labelFingerprint labelFingerprint or {@code null} for none
   */
  public InterconnectAttachment setLabelFingerprint(java.lang.String labelFingerprint) {
    this.labelFingerprint = labelFingerprint;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this InterconnectAttachment, which is essentially
   * a hash of the labels set used for optimistic locking. The fingerprint is initially generated by
   * Compute Engine and changes after every request to modify or update labels. You must always
   * provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an InterconnectAttachment.
   * @see #setLabelFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public InterconnectAttachment encodeLabelFingerprint(byte[] labelFingerprint) {
    this.labelFingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(labelFingerprint);
    return this;
  }

  /**
   * Labels to apply to this InterconnectAttachment resource. These can be later modified by the
   * setLabels method. Each label key/value must comply with RFC1035. Label values may be empty.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels to apply to this InterconnectAttachment resource. These can be later modified by the
   * setLabels method. Each label key/value must comply with RFC1035. Label values may be empty.
   * @param labels labels or {@code null} for none
   */
  public InterconnectAttachment setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
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
  public InterconnectAttachment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] The current status of whether or not this interconnect attachment is functional,
   * which can take one of the following values: - OS_ACTIVE: The attachment has been turned up and
   * is ready to use.  - OS_UNPROVISIONED: The attachment is not ready to use yet, because turnup is
   * not complete.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationalStatus() {
    return operationalStatus;
  }

  /**
   * [Output Only] The current status of whether or not this interconnect attachment is functional,
   * which can take one of the following values: - OS_ACTIVE: The attachment has been turned up and
   * is ready to use.  - OS_UNPROVISIONED: The attachment is not ready to use yet, because turnup is
   * not complete.
   * @param operationalStatus operationalStatus or {@code null} for none
   */
  public InterconnectAttachment setOperationalStatus(java.lang.String operationalStatus) {
    this.operationalStatus = operationalStatus;
    return this;
  }

  /**
   * [Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not present for DEDICATED]. The
   * opaque identifier of an PARTNER attachment used to initiate provisioning with a selected
   * partner. Of the form "XXXXX/region/domain"
   * @return value or {@code null} for none
   */
  public java.lang.String getPairingKey() {
    return pairingKey;
  }

  /**
   * [Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not present for DEDICATED]. The
   * opaque identifier of an PARTNER attachment used to initiate provisioning with a selected
   * partner. Of the form "XXXXX/region/domain"
   * @param pairingKey pairingKey or {@code null} for none
   */
  public InterconnectAttachment setPairingKey(java.lang.String pairingKey) {
    this.pairingKey = pairingKey;
    return this;
  }

  /**
   * Optional BGP ASN for the router supplied by a Layer 3 Partner if they configured BGP on behalf
   * of the customer. Output only for PARTNER type, input only for PARTNER_PROVIDER, not available
   * for DEDICATED.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPartnerAsn() {
    return partnerAsn;
  }

  /**
   * Optional BGP ASN for the router supplied by a Layer 3 Partner if they configured BGP on behalf
   * of the customer. Output only for PARTNER type, input only for PARTNER_PROVIDER, not available
   * for DEDICATED.
   * @param partnerAsn partnerAsn or {@code null} for none
   */
  public InterconnectAttachment setPartnerAsn(java.lang.Long partnerAsn) {
    this.partnerAsn = partnerAsn;
    return this;
  }

  /**
   * Informational metadata about Partner attachments from Partners to display to customers. Output
   * only for for PARTNER type, mutable for PARTNER_PROVIDER, not available for DEDICATED.
   * @return value or {@code null} for none
   */
  public InterconnectAttachmentPartnerMetadata getPartnerMetadata() {
    return partnerMetadata;
  }

  /**
   * Informational metadata about Partner attachments from Partners to display to customers. Output
   * only for for PARTNER type, mutable for PARTNER_PROVIDER, not available for DEDICATED.
   * @param partnerMetadata partnerMetadata or {@code null} for none
   */
  public InterconnectAttachment setPartnerMetadata(InterconnectAttachmentPartnerMetadata partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
    return this;
  }

  /**
   * [Output Only] Information specific to an InterconnectAttachment. This property is populated if
   * the interconnect that this is attached to is of type DEDICATED.
   * @return value or {@code null} for none
   */
  public InterconnectAttachmentPrivateInfo getPrivateInterconnectInfo() {
    return privateInterconnectInfo;
  }

  /**
   * [Output Only] Information specific to an InterconnectAttachment. This property is populated if
   * the interconnect that this is attached to is of type DEDICATED.
   * @param privateInterconnectInfo privateInterconnectInfo or {@code null} for none
   */
  public InterconnectAttachment setPrivateInterconnectInfo(InterconnectAttachmentPrivateInfo privateInterconnectInfo) {
    this.privateInterconnectInfo = privateInterconnectInfo;
    return this;
  }

  /**
   * [Output Only] URL of the region where the regional interconnect attachment resides. You must
   * specify this field as part of the HTTP request URL. It is not settable as a field in the
   * request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the regional interconnect attachment resides. You must
   * specify this field as part of the HTTP request URL. It is not settable as a field in the
   * request body.
   * @param region region or {@code null} for none
   */
  public InterconnectAttachment setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * URL of the Cloud Router to be used for dynamic routing. This router must be in the same region
   * as this InterconnectAttachment. The InterconnectAttachment will automatically connect the
   * Interconnect to the network & region within which the Cloud Router is configured.
   * @return value or {@code null} for none
   */
  public java.lang.String getRouter() {
    return router;
  }

  /**
   * URL of the Cloud Router to be used for dynamic routing. This router must be in the same region
   * as this InterconnectAttachment. The InterconnectAttachment will automatically connect the
   * Interconnect to the network & region within which the Cloud Router is configured.
   * @param router router or {@code null} for none
   */
  public InterconnectAttachment setRouter(java.lang.String router) {
    this.router = router;
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
  public InterconnectAttachment setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] The current state of this attachment's functionality. Enum values ACTIVE and
   * UNPROVISIONED are shared by DEDICATED/PRIVATE, PARTNER, and PARTNER_PROVIDER interconnect
   * attachments, while enum values PENDING_PARTNER, PARTNER_REQUEST_RECEIVED, and PENDING_CUSTOMER
   * are used for only PARTNER and PARTNER_PROVIDER interconnect attachments. This state can take
   * one of the following values: - ACTIVE: The attachment has been turned up and is ready to use.
   * - UNPROVISIONED: The attachment is not ready to use yet, because turnup is not complete.  -
   * PENDING_PARTNER: A newly-created PARTNER attachment that has not yet been configured on the
   * Partner side.  - PARTNER_REQUEST_RECEIVED: A PARTNER attachment is in the process of
   * provisioning after a PARTNER_PROVIDER attachment was created that references it.  -
   * PENDING_CUSTOMER: A PARTNER or PARTNER_PROVIDER attachment that is waiting for a customer to
   * activate it.  - DEFUNCT: The attachment was deleted externally and is no longer functional.
   * This could be because the associated Interconnect was removed, or because the other side of a
   * Partner attachment was deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * [Output Only] The current state of this attachment's functionality. Enum values ACTIVE and
   * UNPROVISIONED are shared by DEDICATED/PRIVATE, PARTNER, and PARTNER_PROVIDER interconnect
   * attachments, while enum values PENDING_PARTNER, PARTNER_REQUEST_RECEIVED, and PENDING_CUSTOMER
   * are used for only PARTNER and PARTNER_PROVIDER interconnect attachments. This state can take
   * one of the following values: - ACTIVE: The attachment has been turned up and is ready to use.
   * - UNPROVISIONED: The attachment is not ready to use yet, because turnup is not complete.  -
   * PENDING_PARTNER: A newly-created PARTNER attachment that has not yet been configured on the
   * Partner side.  - PARTNER_REQUEST_RECEIVED: A PARTNER attachment is in the process of
   * provisioning after a PARTNER_PROVIDER attachment was created that references it.  -
   * PENDING_CUSTOMER: A PARTNER or PARTNER_PROVIDER attachment that is waiting for a customer to
   * activate it.  - DEFUNCT: The attachment was deleted externally and is no longer functional.
   * This could be because the associated Interconnect was removed, or because the other side of a
   * Partner attachment was deleted.
   * @param state state or {@code null} for none
   */
  public InterconnectAttachment setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The type of interconnect attachment this is, which can take one of the following values: -
   * DEDICATED: an attachment to a Dedicated Interconnect.  - PARTNER: an attachment to a Partner
   * Interconnect, created by the customer.  - PARTNER_PROVIDER: an attachment to a Partner
   * Interconnect, created by the partner.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of interconnect attachment this is, which can take one of the following values: -
   * DEDICATED: an attachment to a Dedicated Interconnect.  - PARTNER: an attachment to a Partner
   * Interconnect, created by the customer.  - PARTNER_PROVIDER: an attachment to a Partner
   * Interconnect, created by the partner.
   * @param type type or {@code null} for none
   */
  public InterconnectAttachment setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only specified at creation
   * time.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVlanTag8021q() {
    return vlanTag8021q;
  }

  /**
   * The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only specified at creation
   * time.
   * @param vlanTag8021q vlanTag8021q or {@code null} for none
   */
  public InterconnectAttachment setVlanTag8021q(java.lang.Integer vlanTag8021q) {
    this.vlanTag8021q = vlanTag8021q;
    return this;
  }

  @Override
  public InterconnectAttachment set(String fieldName, Object value) {
    return (InterconnectAttachment) super.set(fieldName, value);
  }

  @Override
  public InterconnectAttachment clone() {
    return (InterconnectAttachment) super.clone();
  }

}
