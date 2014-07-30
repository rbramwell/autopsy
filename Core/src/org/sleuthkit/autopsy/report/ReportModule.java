 /*
 *
 * Autopsy Forensic Browser
 * 
 * Copyright 2012 Basis Technology Corp.
 * 
 * Copyright 2012 42six Solutions.
 * Contact: aebadirad <at> 42six <dot> com
 * Project Contact/Architect: carrier <at> sleuthkit <dot> org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.report;

/**
 * Interface for report modules that plug in to the reporting infrastructure.
 */
interface ReportModule {

    /**
     * Get the name of the report this module generates.
     */
    public String getName();

    /**
     * Gets a one-line, user friendly description of the type of report this
     * module generates.
     */
    public String getDescription();

    /**
     * Gets the relative path of the report file, if any, generated by this
     * module. The path should be relative to the time stamp subdirectory of
     * reports directory.
     *
     * @return Report file path relative to the time stamp subdirectory reports
     * directory, may be null if the module does not produce a report file.
     */
    public String getRelativeFilePath();
}
