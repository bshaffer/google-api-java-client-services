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

package com.google.api.services.monitoring.v3.model;

/**
 * A condition type that allows alert policies to be defined using Monitoring Query Language
 * (https://cloud.google.com/monitoring/mql).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MonitoringQueryLanguageCondition extends com.google.api.client.json.GenericJson {

  /**
   * The amount of time that a time series must violate the threshold to be considered failing.
   * Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are
   * supported. If an invalid value is given, an error will be returned. When choosing a duration,
   * it is useful to keep in mind the frequency of the underlying time series data (which may also
   * be affected by any alignments specified in the aggregations field); a good duration is long
   * enough so that a single outlier does not generate spurious alerts, but short enough that
   * unhealthy states are detected and alerted on quickly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * Monitoring Query Language (https://cloud.google.com/monitoring/mql) query that outputs a
   * boolean stream.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * The number/percent of time series for which the comparison must hold in order for the condition
   * to trigger. If unspecified, then the condition will trigger if the comparison is true for any
   * of the time series that have been identified by filter and aggregations, or by the ratio, if
   * denominator_filter and denominator_aggregations are specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Trigger trigger;

  /**
   * The amount of time that a time series must violate the threshold to be considered failing.
   * Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are
   * supported. If an invalid value is given, an error will be returned. When choosing a duration,
   * it is useful to keep in mind the frequency of the underlying time series data (which may also
   * be affected by any alignments specified in the aggregations field); a good duration is long
   * enough so that a single outlier does not generate spurious alerts, but short enough that
   * unhealthy states are detected and alerted on quickly.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * The amount of time that a time series must violate the threshold to be considered failing.
   * Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are
   * supported. If an invalid value is given, an error will be returned. When choosing a duration,
   * it is useful to keep in mind the frequency of the underlying time series data (which may also
   * be affected by any alignments specified in the aggregations field); a good duration is long
   * enough so that a single outlier does not generate spurious alerts, but short enough that
   * unhealthy states are detected and alerted on quickly.
   * @param duration duration or {@code null} for none
   */
  public MonitoringQueryLanguageCondition setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Monitoring Query Language (https://cloud.google.com/monitoring/mql) query that outputs a
   * boolean stream.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Monitoring Query Language (https://cloud.google.com/monitoring/mql) query that outputs a
   * boolean stream.
   * @param query query or {@code null} for none
   */
  public MonitoringQueryLanguageCondition setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * The number/percent of time series for which the comparison must hold in order for the condition
   * to trigger. If unspecified, then the condition will trigger if the comparison is true for any
   * of the time series that have been identified by filter and aggregations, or by the ratio, if
   * denominator_filter and denominator_aggregations are specified.
   * @return value or {@code null} for none
   */
  public Trigger getTrigger() {
    return trigger;
  }

  /**
   * The number/percent of time series for which the comparison must hold in order for the condition
   * to trigger. If unspecified, then the condition will trigger if the comparison is true for any
   * of the time series that have been identified by filter and aggregations, or by the ratio, if
   * denominator_filter and denominator_aggregations are specified.
   * @param trigger trigger or {@code null} for none
   */
  public MonitoringQueryLanguageCondition setTrigger(Trigger trigger) {
    this.trigger = trigger;
    return this;
  }

  @Override
  public MonitoringQueryLanguageCondition set(String fieldName, Object value) {
    return (MonitoringQueryLanguageCondition) super.set(fieldName, value);
  }

  @Override
  public MonitoringQueryLanguageCondition clone() {
    return (MonitoringQueryLanguageCondition) super.clone();
  }

}
