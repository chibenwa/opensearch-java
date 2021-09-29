/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._core.bulk;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: _global.bulk.IndexResponseItem
@JsonpDeserializable
public final class IndexResponseItem extends ResponseItemBase implements ResponseItemVariant {
	// ---------------------------------------------------------------------------------------------

	public IndexResponseItem(Builder builder) {
		super(builder);

	}

	public IndexResponseItem(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link ResponseItem} variant type
	 */
	@Override
	public String _variantType() {
		return "index";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexResponseItem}.
	 */
	public static class Builder extends ResponseItemBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IndexResponseItem> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexResponseItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexResponseItem build() {

			return new IndexResponseItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexResponseItem}
	 */
	public static final JsonpDeserializer<IndexResponseItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexResponseItem::setupIndexResponseItemDeserializer, Builder::build);

	protected static void setupIndexResponseItemDeserializer(DelegatingDeserializer<IndexResponseItem.Builder> op) {
		ResponseItemBase.setupResponseItemBaseDeserializer(op);

	}

}
