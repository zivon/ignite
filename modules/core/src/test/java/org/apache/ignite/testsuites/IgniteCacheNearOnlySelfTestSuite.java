/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.testsuites;

import java.util.Collection;
import junit.framework.TestSuite;
import org.apache.ignite.internal.processors.cache.distributed.dht.GridCacheClientOnlySelfTest;
import org.apache.ignite.internal.processors.cache.distributed.near.GridCacheNearOnlySelfTest;
import org.apache.ignite.internal.processors.cache.distributed.near.GridCacheNearOnlyTopologySelfTest;
import org.apache.ignite.testframework.GridTestUtils;

/**
 * Test suite for near-only cache.
 */
public class IgniteCacheNearOnlySelfTestSuite {
    /**
     * @return Suite.
     */
    public static TestSuite suite() {
        return suite(null);
    }

    /**
     * @param ignoredTests Ignored tests.
     * @return IgniteCache test suite.
     */
    public static TestSuite suite(Collection<Class> ignoredTests) {
        TestSuite suite = new TestSuite("Near-only cache test suite.");

        GridTestUtils.addTestIfNeeded(suite,GridCacheClientOnlySelfTest.CasePartitionedAtomic.class, ignoredTests);
        GridTestUtils.addTestIfNeeded(suite,GridCacheClientOnlySelfTest.CasePartitionedTransactional.class, ignoredTests);
        GridTestUtils.addTestIfNeeded(suite,GridCacheClientOnlySelfTest.CaseReplicatedAtomic.class, ignoredTests);
        GridTestUtils.addTestIfNeeded(suite,GridCacheClientOnlySelfTest.CaseReplicatedTransactional.class, ignoredTests);

        GridTestUtils.addTestIfNeeded(suite,GridCacheNearOnlyTopologySelfTest.class, ignoredTests);

        GridTestUtils.addTestIfNeeded(suite,GridCacheNearOnlySelfTest.CasePartitionedAtomic.class, ignoredTests);
        GridTestUtils.addTestIfNeeded(suite,GridCacheNearOnlySelfTest.CasePartitionedTransactional.class, ignoredTests);
        GridTestUtils.addTestIfNeeded(suite,GridCacheNearOnlySelfTest.CaseReplicatedAtomic.class, ignoredTests);
        GridTestUtils.addTestIfNeeded(suite,GridCacheNearOnlySelfTest.CaseReplicatedTransactional.class, ignoredTests);

        return suite;
    }
}