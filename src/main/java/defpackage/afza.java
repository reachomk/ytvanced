package defpackage;

import android.os.Bundle;

/* renamed from: afza */
public final class afza implements wxx {
    private final bcaa a;
    private final bcaa b;

    public afza(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final int a(Bundle bundle) {
        String string = bundle.getString("identityId");
        agvz a = afyy.a((agwc) this.a.get(), string);
        return a != null ? afyy.a(((aguh) this.b.get()).b(string, a)) : 1;
    }
}
