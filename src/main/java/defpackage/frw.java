package defpackage;

import android.os.Bundle;

/* renamed from: frw */
public final class frw implements ysc {
    private final nt a;

    public frw(nt ntVar) {
        this.a = (nt) amqw.a((Object) ntVar);
    }

    public final void a(String str, String str2) {
        amqw.a((Object) str);
        yjr yjr = new yjr();
        Bundle bundle = new Bundle();
        bundle.putString("key", str);
        bundle.putString("header_key", str2);
        yjr.f(bundle);
        yjr.a(this.a, null);
    }
}
