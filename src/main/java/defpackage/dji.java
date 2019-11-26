package defpackage;

import android.widget.ListView;

/* renamed from: dji */
final class dji implements adux {
    private final aduz a;
    private volatile Object b = new baqe();
    private final /* synthetic */ diu c;

    public final void a(aduv aduv) {
        Object obj = this.b;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof baqe) {
                    aduo aduo = new aduo((ListView) baqd.a(this.a.a, "Cannot return null from a non-@Nullable @Provides method"), this.c.s());
                    aduo.a = (adur) baqd.a(this.a.b, "Cannot return null from a non-@Nullable @Provides method");
                    aduo.b = this.c.em();
                    this.c.el();
                    this.b = bapx.a(this.b, aduo);
                    obj2 = aduo;
                }
            }
            obj = obj2;
        }
        aduv.a = (aduo) obj;
    }

    /* synthetic */ dji(diu diu, aduz aduz) {
        this.c = diu;
        this.a = aduz;
    }
}
