package defpackage;

/* renamed from: baqv */
public enum baqv {
    GET,
    PUT,
    POST,
    DELETE,
    HEAD,
    OPTIONS,
    TRACE,
    CONNECT,
    PATCH,
    PROPFIND,
    PROPPATCH,
    MKCOL,
    MOVE,
    COPY,
    LOCK,
    UNLOCK;

    static baqv a(String str) {
        if (str != null) {
            try {
                return (baqv) Enum.valueOf(baqv.class, str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
