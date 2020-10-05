/*
 * Copyright (c) 2020 Uber Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.uber.rss.clients;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReadClientDataOptions {
  private final Collection<Long> latestTaskAttemptIds;
  private final long dataAvailablePollInterval;
  private final long dataAvailableWaitTime;

  public ReadClientDataOptions(Collection<Long> latestTaskAttemptIds, long dataAvailablePollInterval, long dataAvailableWaitTime) {
    this.latestTaskAttemptIds = Collections.unmodifiableCollection(new ArrayList<>(latestTaskAttemptIds));
    this.dataAvailablePollInterval = dataAvailablePollInterval;
    this.dataAvailableWaitTime = dataAvailableWaitTime;
  }

  public Collection<Long> getLatestTaskAttemptIds() {
    return latestTaskAttemptIds;
  }

  public long getDataAvailablePollInterval() {
    return dataAvailablePollInterval;
  }

  public long getDataAvailableWaitTime() {
    return dataAvailableWaitTime;
  }

  @Override
  public String toString() {
    return "WriteClientDataOptions{" +
        "latestTaskAttemptIds=" + latestTaskAttemptIds +
        ", dataAvailablePollInterval=" + dataAvailablePollInterval +
        ", dataAvailableWaitTime=" + dataAvailableWaitTime +
        '}';
  }
}
