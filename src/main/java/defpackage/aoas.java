package defpackage;

/* renamed from: aoas */
public final class aoas extends RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;

    public aoas() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final anyg a() {
        return new anyg(getMessage());
    }
}
