package io.modelcontextprotocol.server.auth;

public record AuthContext(String principal, String authHeader) {
	// absent AuthContext marker
	public static final AuthContext EMPTY = new AuthContext("", "");

	public boolean isEmpty() {
		return this == EMPTY;
	}

	public boolean isPresent() {
		return !isEmpty();
	}

}
