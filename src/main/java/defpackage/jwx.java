package defpackage;

import android.os.Bundle;

/* renamed from: jwx */
public final class jwx implements lcm {
    public final aaas a;
    private final nn b;
    private final bcaa c;

    public jwx(nn nnVar, bcaa bcaa, aaas aaas) {
        this.b = nnVar;
        this.c = bcaa;
        this.a = aaas;
    }

    public final void a() {
        if (this.b.e.a.a(z.RESUMED)) {
            String b = b();
            jwp jwp = new jwp();
            Bundle bundle = new Bundle();
            bundle.putString("VIDEO_ID_KEY", b);
            jwp.f(bundle);
            jwp.w();
            jwp.ap = new jww(this);
            jwp.a(this.b.f(), null);
        }
    }

    public final String b() {
        return ((aizy) this.c.get()).k();
    }
}
