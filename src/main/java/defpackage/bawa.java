package defpackage;

/* renamed from: bawa */
public enum bawa {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);
    
    public final int r;
    public final byte[] s;

    public static bawa a(String str) {
        return (bawa) Enum.valueOf(bawa.class, str);
    }

    private bawa(int i) {
        this.r = i;
        this.s = Integer.toString(i).getBytes(ampv.a);
    }

    public final bavx a() {
        return (bavx) bavx.a.get(this.r);
    }
}
