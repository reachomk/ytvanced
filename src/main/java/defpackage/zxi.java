package defpackage;

import android.app.Application;

/* renamed from: zxi */
public final class zxi implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    private zxi(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
    }

    public static zxi a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        return new zxi(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6);
    }

    public final /* synthetic */ Object get() {
        zxj zxj = new zxj();
        zxj.a = bapx.b(this.a);
        zxj.b = (Application) this.b.get();
        zxj.c = (aadw) this.c.get();
        zxj.d = bapx.b(this.d);
        zxj.e = bapx.b(this.e);
        this.f.get();
        return zxj;
    }
}
