package defpackage;

/* renamed from: aagp */
public enum aagp {
    SINGLE_ANSWERS("single-answer"),
    MULTI_SELECT("multi-select"),
    UNSUPPORTED("unsupported");
    
    private final String d;

    private aagp(String str) {
        this.d = (String) amqw.a((Object) str);
    }

    public static aagp a(String str) {
        for (aagp aagp : aagp.values()) {
            if (aagp.d.equals(str)) {
                return aagp;
            }
        }
        return UNSUPPORTED;
    }
}
