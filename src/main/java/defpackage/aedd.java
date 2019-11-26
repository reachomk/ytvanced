package defpackage;

import android.content.SharedPreferences;

/* renamed from: aedd */
public final class aedd implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    private aedd(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
    }

    public static aedd a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        return new aedd(bcaa, bcaa2, bcaa3, bcaa4, bcaa5);
    }

    public static aecx a(zzf zzf, bcaa bcaa, xta xta, bapu bapu, SharedPreferences sharedPreferences) {
        return (aecx) baqd.a(aecv.a.a(zzf, bcaa, xta, bapu, sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aedd.a((zzf) this.a.get(), this.b, (xta) this.c.get(), bapx.b(this.d), (SharedPreferences) this.e.get());
    }
}
