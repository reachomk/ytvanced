package defpackage;

/* renamed from: aizl */
public final class aizl {
    public static final aizl a = new aizl(aizn.NEXT);
    public static final aizl b = new aizl(aizn.PREVIOUS);
    public static final aizl c = new aizl(aizn.AUTOPLAY);
    public static final aizl d = new aizl(aizn.AUTONAV);
    public final aizn e;
    public final aiqq f;
    public final aiqw g;

    private aizl(aizn aizn) {
        this(aizn, null, null, (byte) 0);
    }

    public static final int a(boolean z) {
        return z ? 2 : 1;
    }

    public aizl(aizn aizn, aiqq aiqq) {
        this(aizn, aiqq, null, (byte) 0);
    }

    public aizl(aizn aizn, aiqq aiqq, aiqw aiqw) {
        this(aizn, aiqq, aiqw, (byte) 0);
    }

    private aizl(aizn aizn, aiqq aiqq, aiqw aiqw, byte b) {
        this.e = aizn;
        this.f = aiqq;
        this.g = aiqw;
    }
}
