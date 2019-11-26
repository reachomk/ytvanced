package defpackage;

import android.os.Bundle;

/* renamed from: pxk */
public final class pxk implements pte, pth {
    public final pso a;
    public pxn b;
    private final boolean c;

    public pxk(pso pso, boolean z) {
        this.a = pso;
        this.c = z;
    }

    public final void a(Bundle bundle) {
        a();
        this.b.a(bundle);
    }

    public final void a(int i) {
        a();
        this.b.a(i);
    }

    public final void a(psa psa) {
        a();
        this.b.a(psa, this.a, this.c);
    }

    private final void a() {
        pzr.a(this.b, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
