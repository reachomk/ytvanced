package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.YouTubeApplication;

/* renamed from: dkq */
final class dkq implements adzw {
    private final adzy a;
    private volatile Object b = new baqe();
    private volatile Object c = new baqe();
    private final /* synthetic */ diu d;

    public final void a(adzu adzu) {
        Object obj = this.c;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof baqe) {
                    View view = (View) baqd.a(this.a.a, "Cannot return null from a non-@Nullable @Provides method");
                    tbk tbk = (tbk) baqd.a(((YouTubeApplication) uhl.a(this.d.a)).e().l(), "Cannot return null from a non-@Nullable @Provides method");
                    adzv adzv = (adzv) baqd.a(this.a.b, "Cannot return null from a non-@Nullable @Provides method");
                    obj2 = this.b;
                    if (obj2 instanceof baqe) {
                        Object obj3;
                        synchronized (obj2) {
                            obj3 = this.b;
                            if (obj3 instanceof baqe) {
                                obj3 = aeac.a(this.d.ck(), this.d.ow());
                                this.b = bapx.a(this.b, obj3);
                            }
                        }
                        obj2 = obj3;
                    }
                    adzr adzr = new adzr(view, tbk, adzv, (aeab) obj2, this.d.s());
                    this.c = bapx.a(this.c, adzr);
                }
            }
            obj = obj2;
        }
        adzu.a = (adzr) obj;
    }

    /* synthetic */ dkq(diu diu, adzy adzy) {
        this.d = diu;
        this.a = adzy;
    }
}
