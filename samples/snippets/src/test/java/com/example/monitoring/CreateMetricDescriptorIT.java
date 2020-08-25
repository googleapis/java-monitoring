/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.monitoring;

import static com.google.common.truth.Truth.assertThat;
import static junit.framework.TestCase.assertNotNull;

import com.google.monitoring.v3.ProjectName;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Tests for create metric descriptor sample. */
@RunWith(JUnit4.class)
public class CreateMetricDescriptorIT {

  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final ProjectName PROJECT_NAME = ProjectName.of(PROJECT_ID);
  private static final String TYPE = "custom.googleapis.com/invoice/paid/amount";
  private ByteArrayOutputStream bout;
  private PrintStream out;

  private static void requireEnvVar(String varName) {
    assertNotNull(
        "Environment variable '%s' is required to perform these tests.".format(varName),
        System.getenv(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_CLOUD_PROJECT");
  }

  @Before
  public void setUp() {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    System.setOut(out);
  }

  @After
  public void tearDown() throws IOException {
    System.setOut(null);
    // clean up
    DeleteMetricDescriptor.deleteMetricDescriptor(PROJECT_ID, PROJECT_NAME.toString());
  }

  @Test
  public void testCreateMetricDescriptor() throws IOException {
    CreateMetricDescriptor.createMetricDescriptor(PROJECT_ID, TYPE);
    assertThat(bout.toString()).contains("metric descriptor created successfully");
  }
}
