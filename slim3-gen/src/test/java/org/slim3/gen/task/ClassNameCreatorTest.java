/*
 * Copyright 2004-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.slim3.gen.task;

import junit.framework.TestCase;

/**
 * @author taedium
 * 
 */
public class ClassNameCreatorTest extends TestCase {

    /**
     * 
     * @throws Exception
     */
    public void testCreateClassName() throws Exception {
        ClassNameCreator creator = new ClassNameCreator("aaa", "Bbb");
        assertEquals("aaa.Bbb", creator.createClassName());
    }

    /**
     * 
     * @throws Exception
     */
    public void testCreateClassName_defaultPackage() throws Exception {
        ClassNameCreator creator = new ClassNameCreator(null, "Bbb");
        assertEquals("Bbb", creator.createClassName());
    }

    /**
     * 
     * @throws Exception
     */
    public void testCreateTestCaseClassName() throws Exception {
        ClassNameCreator creator = new ClassNameCreator("aaa", "Bbb");
        assertEquals("aaa.BbbTest", creator.createTestCaseClassName());
    }

    /**
     * 
     * @throws Exception
     */
    public void testCreateTestCaseClassName_defaultPackage() throws Exception {
        ClassNameCreator creator = new ClassNameCreator(null, "Bbb");
        assertEquals("BbbTest", creator.createTestCaseClassName());
    }
}