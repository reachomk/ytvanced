package defpackage;

/* renamed from: adyy */
final class adyy implements adzc {
    private final /* synthetic */ adyw a;

    adyy(adyw adyw) {
        this.a = adyw;
    }

    public final void a() {
        synchronized (this.a.i) {
            this.a.h = 2;
        }
    }

    public final void b() {
        synchronized (this.a.i) {
            this.a.h = 0;
        }
    }
}
