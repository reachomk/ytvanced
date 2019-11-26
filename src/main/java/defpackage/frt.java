package defpackage;

import android.os.Bundle;

/* renamed from: frt */
public final class frt implements ymx {
    private final nt a;

    public frt(nt ntVar) {
        this.a = (nt) amqw.a((Object) ntVar);
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("key", str);
        yjo yjo = new yjo();
        yjo.f(bundle);
        yjo.a(this.a, null);
    }

    public final void b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("key", str);
        yjh yjh = new yjh();
        yjh.f(bundle);
        yjh.a(this.a, null);
    }
}
