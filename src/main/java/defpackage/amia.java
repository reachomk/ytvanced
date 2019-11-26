package defpackage;

/* renamed from: amia */
final class amia implements amfo {
    private final String a;
    private final String b;
    private final amab c;
    private long d;

    public final void a(double d) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.d + 500 <= currentTimeMillis) {
            this.d = currentTimeMillis;
            this.c.a(this.a, this.b, d);
        }
    }

    /* synthetic */ amia(String str, String str2, amab amab) {
        this.a = str;
        this.b = str2;
        this.c = amab;
    }
}
