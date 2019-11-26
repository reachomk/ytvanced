package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: gzh */
public final class gzh implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public gzh(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
    }

    public final /* synthetic */ Object get() {
        return new gze((Context) this.a.get(), (SharedPreferences) this.b.get(), this.c, this.d, bapx.b(this.e));
    }
}
