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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/** Tests for enable disable an alert policy sample. */
public class EnableDisableAlertPolicyIT {
  private static final String PROJECT_ID = requireEnvVar("GOOGLE_CLOUD_PROJECT");
  private ByteArrayOutputStream bout;
  private String alertPolicyId;
  private String alertPolicyDisplayName;
  private PrintStream out;

  private static String requireEnvVar(String varName) {
    String value = System.getenv(varName);
    assertNotNull(
        "Environment variable " + varName + " is required to perform these tests.",
        System.getenv(varName));
    return value;
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_CLOUD_PROJECT");
  }

  @Before
  public void setUp() throws IOException {
    alertPolicyDisplayName = "alert_policy_name_" + UUID.randomUUID().toString().substring(0, 8);
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    System.setOut(out);
    // create an alert policy
    CreateAlertPolicy.createAlertPolicy(PROJECT_ID, alertPolicyDisplayName);
    String result = bout.toString();
    alertPolicyId = result.substring(result.indexOf(":") + 1, result.length() - 2);
    bout.reset();
    out.flush();
    System.setOut(out);
  }

  @After
  public void tearDown() throws IOException {
    // delete an alert policy for clean up
    DeleteAlertPolicy.deleteAlertPolicy(alertPolicyId);
    // restores print statements in the original method
    bout.reset();
    out.flush();
    System.out.flush();
  }

  @Test
  public void enableDisableAlertPolicyTest() throws IOException {
    EnableDisableAlertPolicy.enableDisableAlertPolicy(alertPolicyId, true, alertPolicyDisplayName);
    assertThat(bout.toString()).contains("alert policy enable disable status:");
  }
}
