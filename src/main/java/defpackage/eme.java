package defpackage;

/* renamed from: eme */
public final class eme {
    private final emd a;
    private String b;

    public eme(emd emd) {
        this.a = emd;
    }

    public final void a() {
        if (this.b == null) {
            this.b = this.a.b();
        }
    }

    public final void b() {
        String str = this.b;
        if (str != null) {
            this.a.a(str);
            this.b = null;
        }
    }
}
