package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: dub */
public final class dub implements baqa {
    private final bcaa a;
    private final bcaa b;

    public dub(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(xul.a((Context) this.a.get(), (SharedPreferences) this.b.get()));
    }
}
