package defpackage;

import java.util.Map;

/* renamed from: bcfo */
public final class bcfo {
    public static final bcfl a = bcfl.b(1000, "invalid_request");
    public static final bcfl b = bcfl.b(1004, "invalid_scope");
    public static final bcfl c = bcfl.b(1007, null);
    public static final bcfl d = bcfl.b(1008, null);
    public static final bcfl e = bcfl.a(9, "Response state param did not match request state");
    public static final Map f = bcfl.a(a, g, h, i, b, j, k, c, d);
    private static final bcfl g = bcfl.b(1001, "unauthorized_client");
    private static final bcfl h = bcfl.b(1002, "access_denied");
    private static final bcfl i = bcfl.b(1003, "unsupported_response_type");
    private static final bcfl j = bcfl.b(1005, "server_error");
    private static final bcfl k = bcfl.b(1006, "temporarily_unavailable");
}
