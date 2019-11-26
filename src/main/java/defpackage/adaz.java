package defpackage;

/* renamed from: adaz */
final class adaz extends Thread {
    private final /* synthetic */ adas a;

    adaz(adas adas, String str) {
        this.a = adas;
        super(str);
    }

    public final void run() {
        try {
            adbf a = this.a.c.a(new adyd().a());
            this.a.m = a.b();
        } catch (Exception e) {
            xtl.a(adas.a, "Error testing for buffered proxy. Will assume buffered proxy)", e);
            this.a.m = true;
        }
    }
}
