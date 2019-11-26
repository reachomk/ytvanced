package defpackage;

/* renamed from: rhq */
public final class rhq extends RuntimeException {
    public rhq() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final rfk a() {
        return new rfk(getMessage());
    }
}
