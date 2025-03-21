/*
 * Copyright 2012-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.actuate.metrics.web.reactive.server;

import io.micrometer.core.instrument.Tag;

import org.springframework.web.server.ServerWebExchange;

/**
 * A contributor of {@link Tag Tags} for WebFlux-based request handling. Typically used by
 * a {@link WebFluxTagsProvider} to provide tags in addition to its defaults.
 *
 * @author Andy Wilkinson
 * @since 2.3.0
 * @deprecated since 3.0.0 for removal in 3.2.0 in favor of
 * {@link org.springframework.http.observation.reactive.ServerRequestObservationConvention}
 */
@FunctionalInterface
@Deprecated(since = "3.0.0", forRemoval = true)
public interface WebFluxTagsContributor {

	/**
	 * Provides tags to be associated with metrics for the given {@code exchange}.
	 * @param exchange the exchange
	 * @param ex the current exception (may be {@code null})
	 * @return tags to associate with metrics for the request and response exchange
	 */
	Iterable<Tag> httpRequestTags(ServerWebExchange exchange, Throwable ex);

}
