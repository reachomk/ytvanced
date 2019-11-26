package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;

/* renamed from: afnd */
public final class afnd implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private afnd(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static afnd a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new afnd(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public final /* synthetic */ Object get() {
        return new afna((Context) this.a.get(), (afms) this.b.get(), (SharedPreferences) this.c.get(), (SparseArray) this.d.get());
    }
}
