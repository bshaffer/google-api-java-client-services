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

package com.google.api.services.ml.v1.model;

/**
 * Message holding configuration options for explaining model predictions. Currently, the only
 * supported mechanism to explain a model's prediction is through attributing its output back to its
 * inputs which is essentially a credit assignment task. We support multiple attribution methods,
 * some specific to particular frameworks like Tensorflow and XGBoost. Next idx: 7.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AI Platform Training & Prediction API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1ExplanationConfig extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudMlV1IntegratedGradientsAttribution integratedGradientsAttribution;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudMlV1SampledShapleyAttribution sampledShapleyAttribution;

  /**
   * @return value or {@code null} for none
   */
  public GoogleCloudMlV1IntegratedGradientsAttribution getIntegratedGradientsAttribution() {
    return integratedGradientsAttribution;
  }

  /**
   * @param integratedGradientsAttribution integratedGradientsAttribution or {@code null} for none
   */
  public GoogleCloudMlV1ExplanationConfig setIntegratedGradientsAttribution(GoogleCloudMlV1IntegratedGradientsAttribution integratedGradientsAttribution) {
    this.integratedGradientsAttribution = integratedGradientsAttribution;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GoogleCloudMlV1SampledShapleyAttribution getSampledShapleyAttribution() {
    return sampledShapleyAttribution;
  }

  /**
   * @param sampledShapleyAttribution sampledShapleyAttribution or {@code null} for none
   */
  public GoogleCloudMlV1ExplanationConfig setSampledShapleyAttribution(GoogleCloudMlV1SampledShapleyAttribution sampledShapleyAttribution) {
    this.sampledShapleyAttribution = sampledShapleyAttribution;
    return this;
  }

  @Override
  public GoogleCloudMlV1ExplanationConfig set(String fieldName, Object value) {
    return (GoogleCloudMlV1ExplanationConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1ExplanationConfig clone() {
    return (GoogleCloudMlV1ExplanationConfig) super.clone();
  }

}