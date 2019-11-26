package defpackage;

/* renamed from: acee */
final /* synthetic */ class acee implements Runnable {
    private final acef a;
    private final Class b;

    acee(acef acef, Class cls) {
        this.a = acef;
        this.b = cls;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
