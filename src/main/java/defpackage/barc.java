package defpackage;

/* renamed from: barc */
public enum barc implements baqz {
    SWITCH_PROTOCOL(101, "Switching Protocols"),
    e(200, r3),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NO_CONTENT(204, "No Content"),
    PARTIAL_CONTENT(206, "Partial Content"),
    MULTI_STATUS(207, "Multi-Status"),
    REDIRECT(301, "Moved Permanently"),
    REDIRECT_SEE_OTHER(303, "See Other"),
    NOT_MODIFIED(304, "Not Modified"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    NOT_ACCEPTABLE(406, "Not Acceptable"),
    REQUEST_TIMEOUT(408, "Request Timeout"),
    CONFLICT(409, "Conflict"),
    RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
    INTERNAL_ERROR(500, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");
    
    private final int w;
    private final String x;

    private barc(int i, String str) {
        this.w = i;
        this.x = str;
    }

    public final String a() {
        int i = this.w;
        String str = this.x;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
        stringBuilder.append(i);
        stringBuilder.append(" ");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
