package defpackage;

import android.os.Bundle;
import java.util.Map;

/* renamed from: ftg */
public final class ftg implements aaap {
    public final xoi a;
    private final nn b;
    private final afpu c;
    private final afqe d;

    public ftg(nn nnVar, afpu afpu, afqe afqe, xoi xoi) {
        this.b = nnVar;
        this.c = afpu;
        this.d = afqe;
        this.a = xoi;
    }

    public final void a(apxu apxu, Map map) {
        if (this.c.a()) {
            a(apxu);
        } else {
            this.d.a(this.b, null, new ftf(this, apxu));
        }
    }

    public final void a(apxu apxu) {
        nf gwq = new gwq();
        Bundle bundle = gwq.j;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
        gwq.f(bundle);
        this.b.f().a().a(gwq, "DialogFragmentFromNavigation").b();
    }
}
