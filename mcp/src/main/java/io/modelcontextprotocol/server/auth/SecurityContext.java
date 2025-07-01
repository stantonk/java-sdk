package io.modelcontextprotocol.server.auth;

import java.security.Principal;

public record SecurityContext(Principal principal, String authHeader) {
	// absent SecurityContext marker
	public static final SecurityContext EMPTY = new SecurityContext(null, "");

	public boolean isEmpty() {
		return this == EMPTY;
	}

	public boolean isPresent() {
		return !isEmpty();
	}

}
