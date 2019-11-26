package defpackage;

import android.os.Bundle;
import java.util.Map;

/* renamed from: dya */
public final class dya implements aaap {
    private final nn a;
    private final dxz b;

    public dya(nn nnVar, dxz dxz) {
        this.a = (nn) amqw.a((Object) nnVar);
        this.b = (dxz) amqw.a((Object) dxz);
    }

    public final void a(apxu apxu, Map map) {
        if (!this.a.isFinishing()) {
            nt f = this.a.f();
            if (!f.h()) {
                nf a = this.b.a(apxu);
                Bundle bundle = a.j;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
                a.f(bundle);
                or a2 = f.a();
                a2.a(a, "DialogFragmentFromNavigation");
                a2.b();
            }
        }
    }
}
