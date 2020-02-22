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

package com.google.api.services.container.model;

/**
 * These upgrade settings control the level of parallelism and the level of disruption caused by an
 * upgrade.
 *
 * maxUnavailable controls the number of nodes that can be simultaneously unavailable.
 *
 * maxSurge controls the number of additional nodes that can be added to the node pool temporarily
 * for the time of the upgrade to increase the number of available nodes.
 *
 * (maxUnavailable + maxSurge) determines the level of parallelism (how many nodes are being
 * upgraded at the same time).
 *
 * Note: upgrades inevitably introduce some disruption since workloads need to be moved from old
 * nodes to new, upgraded ones. Even if maxUnavailable=0, this holds true. (Disruption stays within
 * the limits of PodDisruptionBudget, if it is configured.)
 *
 * Consider a hypothetical node pool with 5 nodes having maxSurge=2, maxUnavailable=1. This means
 * the upgrade process upgrades 3 nodes simultaneously. It creates 2 additional (upgraded) nodes,
 * then it brings down 3 old (not yet upgraded) nodes at the same time. This ensures that there are
 * always at least 4 nodes available.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpgradeSettings extends com.google.api.client.json.GenericJson {

  /**
   * The maximum number of nodes that can be created beyond the current size of the node pool during
   * the upgrade process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxSurge;

  /**
   * The maximum number of nodes that can be simultaneously unavailable during the upgrade process.
   * A node is considered available if its status is Ready.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxUnavailable;

  /**
   * The maximum number of nodes that can be created beyond the current size of the node pool during
   * the upgrade process.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxSurge() {
    return maxSurge;
  }

  /**
   * The maximum number of nodes that can be created beyond the current size of the node pool during
   * the upgrade process.
   * @param maxSurge maxSurge or {@code null} for none
   */
  public UpgradeSettings setMaxSurge(java.lang.Integer maxSurge) {
    this.maxSurge = maxSurge;
    return this;
  }

  /**
   * The maximum number of nodes that can be simultaneously unavailable during the upgrade process.
   * A node is considered available if its status is Ready.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxUnavailable() {
    return maxUnavailable;
  }

  /**
   * The maximum number of nodes that can be simultaneously unavailable during the upgrade process.
   * A node is considered available if its status is Ready.
   * @param maxUnavailable maxUnavailable or {@code null} for none
   */
  public UpgradeSettings setMaxUnavailable(java.lang.Integer maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return this;
  }

  @Override
  public UpgradeSettings set(String fieldName, Object value) {
    return (UpgradeSettings) super.set(fieldName, value);
  }

  @Override
  public UpgradeSettings clone() {
    return (UpgradeSettings) super.clone();
  }

}