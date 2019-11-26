package defpackage;

import android.view.View;

/* renamed from: dix */
final class dix implements adzm {
    private final adzo a;
    private volatile Object b = new baqe();
    private volatile Object c = new baqe();
    private final /* synthetic */ diu d;

    private final aeab a() {
        Object obj = this.b;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof baqe) {
                    obj2 = aeac.a(this.d.ck(), this.d.ow());
                    this.b = bapx.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (aeab) obj;
    }

    public final void a(adzk adzk) {
        Object obj = this.c;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof baqe) {
                    adze adze = new adze((View) baqd.a(this.a.a, "Cannot return null from a non-@Nullable @Provides method"), (adzl) baqd.a(this.a.b, "Cannot return null from a non-@Nullable @Provides method"), this.d.aM(), this.d.cd(), this.d.k(), a(), this.d.s());
                    this.c = bapx.a(this.c, adze);
                }
            }
            obj = obj2;
        }
        adzk.a = (adze) obj;
        adzk.b = a();
    }

    /* synthetic */ dix(diu diu, adzo adzo) {
        this.d = diu;
        this.a = adzo;
    }
}
