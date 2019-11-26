package defpackage;

/* renamed from: barb */
public final class barb extends Exception {
    public static final long serialVersionUID = 6569838532917408380L;
    public final barc a;

    public barb(barc barc, String str) {
        super(str);
        this.a = barc;
    }

    public barb(barc barc, String str, Exception exception) {
        super(str, exception);
        this.a = barc;
    }
}
