package defpackage;

/* renamed from: aer */
final class aer implements amf {
    private final /* synthetic */ aek a;

    aer(aek aek) {
        this.a = aek;
    }

    public final void a() {
        aek aek = this.a;
        ame ame = aek.d;
        if (ame != null) {
            ame.h();
        }
        if (aek.g != null) {
            aek.b.getDecorView().removeCallbacks(aek.h);
            if (aek.g.isShowing()) {
                try {
                    aek.g.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            aek.g = null;
        }
        aek.o();
        afc e = aek.e(0);
        if (e != null) {
            aiw aiw = e.h;
            if (aiw != null) {
                aiw.close();
            }
        }
    }
}
