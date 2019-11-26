package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: vcn */
public final class vcn implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;

    private vcn(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
        this.h = bcaa8;
        this.i = bcaa9;
    }

    public static vcn a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9) {
        return new vcn(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa8, bcaa9);
    }

    public final /* synthetic */ Object get() {
        Object a;
        Context context = (Context) this.a.get();
        zyw zyw = (zyw) this.b.get();
        vdj vdj = (vdj) this.c.get();
        vdg vdg = (vdg) this.d.get();
        tar tar = (tar) this.e.get();
        bapu b = bapx.b(this.f);
        xsc xsc = (xsc) this.g.get();
        SharedPreferences sharedPreferences = (SharedPreferences) this.h.get();
        afpu afpu = (afpu) this.i.get();
        if (vdj.h()) {
            a = new vms(context, vdj.a(), vdg.a(), vdg.b(), tar, b, zyw, xsc, sharedPreferences, afpu).a();
        } else {
            a = new vms(context, vdj.a(), vdg.a(), vdg.b(), tar).a();
        }
        return (vmr) baqd.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
