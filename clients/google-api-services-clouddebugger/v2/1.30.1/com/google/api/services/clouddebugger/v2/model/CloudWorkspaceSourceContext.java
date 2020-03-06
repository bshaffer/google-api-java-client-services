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

package com.google.api.services.clouddebugger.v2.model;

/**
 * A CloudWorkspaceSourceContext denotes a workspace at a particular snapshot.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Debugger API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudWorkspaceSourceContext extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the snapshot. An empty snapshot_id refers to the most recent snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String snapshotId;

  /**
   * The ID of the workspace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudWorkspaceId workspaceId;

  /**
   * The ID of the snapshot. An empty snapshot_id refers to the most recent snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.String getSnapshotId() {
    return snapshotId;
  }

  /**
   * The ID of the snapshot. An empty snapshot_id refers to the most recent snapshot.
   * @param snapshotId snapshotId or {@code null} for none
   */
  public CloudWorkspaceSourceContext setSnapshotId(java.lang.String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

  /**
   * The ID of the workspace.
   * @return value or {@code null} for none
   */
  public CloudWorkspaceId getWorkspaceId() {
    return workspaceId;
  }

  /**
   * The ID of the workspace.
   * @param workspaceId workspaceId or {@code null} for none
   */
  public CloudWorkspaceSourceContext setWorkspaceId(CloudWorkspaceId workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  @Override
  public CloudWorkspaceSourceContext set(String fieldName, Object value) {
    return (CloudWorkspaceSourceContext) super.set(fieldName, value);
  }

  @Override
  public CloudWorkspaceSourceContext clone() {
    return (CloudWorkspaceSourceContext) super.clone();
  }

}
