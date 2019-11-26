package defpackage;

import android.content.Context;

/* renamed from: aflm */
public final class aflm implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aflm(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aflm a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aflm(bcaa, bcaa2, bcaa3);
    }

    public static afmi a(afmv afmv, Context context) {
        Object obj;
        Object obj2 = xul.a(context) ? afmk.TV : !xss.a(context) ? afmk.MOBILE : afmk.TABLET;
        amro amro = afmv.d;
        Object packageName = amro != null ? (String) amro.get() : context.getPackageName();
        amro amro2 = afmv.e;
        if (amro2 != null) {
            obj = (String) amro2.get();
        } else {
            obj = xul.b(context);
        }
        return (afmi) baqd.a(new afmi((String) afmm.a(packageName, 1), (String) afmm.a(obj, 2), (afmk) afmm.a(obj2, 3), (afmn) afmm.a(afmv.b, 4)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        afmv afmv = (afmv) this.a.get();
        this.b.get();
        return aflm.a(afmv, (Context) this.c.get());
    }
}
