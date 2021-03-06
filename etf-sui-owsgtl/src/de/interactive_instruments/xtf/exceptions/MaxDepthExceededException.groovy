/**
 * Copyright 2010-2019 interactive instruments GmbH
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
package de.interactive_instruments.xtf.exceptions;

import de.interactive_instruments.xtf.wfs.FeatureTypeProperty


public class MaxDepthExceededException extends SchemaAnalysisException {

	private static final long serialVersionUID = 1L;
	
	public MaxDepthExceededException(int maxDepth, FeatureTypeProperty path)
	{
		super("Max depth of "+maxDepth+" for a property path exceeded." +
				" This might be a defect in the SchemaAnalyzer or the schema structure is too complex." +
				" Path: "+path.getName());
	}
}