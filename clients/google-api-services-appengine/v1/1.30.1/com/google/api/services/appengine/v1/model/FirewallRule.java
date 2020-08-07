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

package com.google.api.services.appengine.v1.model;

/**
 * A single firewall rule that is evaluated against incoming traffic and provides an action to take
 * on matched requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FirewallRule extends com.google.api.client.json.GenericJson {

  /**
   * The action to take on matched requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * An optional string description of this rule. This field has a maximum length of 100 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules
   * with the lowest priority are evaluated first.A default rule at priority Int32.MaxValue matches
   * all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be
   * modified by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer priority;

  /**
   * IP address or range, defined using CIDR notation, of requests that this rule applies to. You
   * can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together.
   * Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32 or
   * 2001:0db8:0000:0042:0000:8a2e:0370:7334. Truncation will be silently performed on addresses
   * which are not properly truncated. For example, 1.2.3.4/24 is accepted as the same address as
   * 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as
   * 2001:db8::/32.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceRange;

  /**
   * The action to take on matched requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * The action to take on matched requests.
   * @param action action or {@code null} for none
   */
  public FirewallRule setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * An optional string description of this rule. This field has a maximum length of 100 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional string description of this rule. This field has a maximum length of 100 characters.
   * @param description description or {@code null} for none
   */
  public FirewallRule setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules
   * with the lowest priority are evaluated first.A default rule at priority Int32.MaxValue matches
   * all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be
   * modified by the user.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules
   * with the lowest priority are evaluated first.A default rule at priority Int32.MaxValue matches
   * all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be
   * modified by the user.
   * @param priority priority or {@code null} for none
   */
  public FirewallRule setPriority(java.lang.Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * IP address or range, defined using CIDR notation, of requests that this rule applies to. You
   * can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together.
   * Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32 or
   * 2001:0db8:0000:0042:0000:8a2e:0370:7334. Truncation will be silently performed on addresses
   * which are not properly truncated. For example, 1.2.3.4/24 is accepted as the same address as
   * 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as
   * 2001:db8::/32.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceRange() {
    return sourceRange;
  }

  /**
   * IP address or range, defined using CIDR notation, of requests that this rule applies to. You
   * can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together.
   * Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32 or
   * 2001:0db8:0000:0042:0000:8a2e:0370:7334. Truncation will be silently performed on addresses
   * which are not properly truncated. For example, 1.2.3.4/24 is accepted as the same address as
   * 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as
   * 2001:db8::/32.
   * @param sourceRange sourceRange or {@code null} for none
   */
  public FirewallRule setSourceRange(java.lang.String sourceRange) {
    this.sourceRange = sourceRange;
    return this;
  }

  @Override
  public FirewallRule set(String fieldName, Object value) {
    return (FirewallRule) super.set(fieldName, value);
  }

  @Override
  public FirewallRule clone() {
    return (FirewallRule) super.clone();
  }

}
