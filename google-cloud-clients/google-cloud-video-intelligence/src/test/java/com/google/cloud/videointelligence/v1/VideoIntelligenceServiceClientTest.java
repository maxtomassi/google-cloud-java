/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.videointelligence.v1;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class VideoIntelligenceServiceClientTest {
  private static MockVideoIntelligenceService mockVideoIntelligenceService;
  private static MockServiceHelper serviceHelper;
  private VideoIntelligenceServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockVideoIntelligenceService = new MockVideoIntelligenceService();
    serviceHelper =
        new MockServiceHelper(
            "in-process-1", Arrays.<MockGrpcService>asList(mockVideoIntelligenceService));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    VideoIntelligenceServiceSettings settings =
        VideoIntelligenceServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = VideoIntelligenceServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void annotateVideoTest() throws Exception {
    AnnotateVideoResponse expectedResponse = AnnotateVideoResponse.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("annotateVideoTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockVideoIntelligenceService.addResponse(resultOperation);

    String inputUri = "gs://videodemomaker/cat.mp4";
    Feature featuresElement = Feature.LABEL_DETECTION;
    List<Feature> features = Arrays.asList(featuresElement);

    AnnotateVideoResponse actualResponse = client.annotateVideoAsync(inputUri, features).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockVideoIntelligenceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AnnotateVideoRequest actualRequest = (AnnotateVideoRequest) actualRequests.get(0);

    Assert.assertEquals(inputUri, actualRequest.getInputUri());
    Assert.assertEquals(features, actualRequest.getFeaturesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void annotateVideoExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockVideoIntelligenceService.addException(exception);

    try {
      String inputUri = "gs://videodemomaker/cat.mp4";
      Feature featuresElement = Feature.LABEL_DETECTION;
      List<Feature> features = Arrays.asList(featuresElement);

      client.annotateVideoAsync(inputUri, features).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
