package defpackage;

/* renamed from: azzj */
public final class azzj extends Exception {
    public final azzi a;

    public azzj(azzi azzi, String str) {
        this(azzi, str, null);
    }

    public azzj(azzi azzi, Throwable th) {
        this(azzi, null, th);
    }

    public azzj(azzi azzi, String str, Throwable th) {
        super(str, th);
        this.a = azzi;
    }

    public final boolean a() {
        return this.a.g;
    }
}
