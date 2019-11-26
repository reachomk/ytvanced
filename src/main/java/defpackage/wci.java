package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import com.google.android.youtube.R;
import java.util.Iterator;

/* renamed from: wci */
public final class wci extends ahor implements ahpv, ahrv {
    private static final float c = ahsl.a(120.0f);
    private static final float e = ahsl.a(40.0f);
    private static final String f = yx.a().a(" · ");
    public final wcm a;
    public wcj b;
    private final ahrt g;
    private final ahqt h;
    private final Resources i;

    public wci(Resources resources, Handler handler, ahpn ahpn, ahry ahry, ahrt ahrt) {
        this.i = resources;
        this.g = ahrt;
        this.a = new wcm(resources, ahrt.b, (ahpn) ahpn.clone(), ahry.a.c());
        this.a.c = new wch(this, handler);
        this.h = ahrt.b.a((ahpn) ahpn.clone(), c, e);
        this.h.c(2.0f);
        this.h.a(-1);
        this.h.b(17);
        this.a.b(0.0f, ahsl.a(-180.0f), 0.0f);
        this.h.b(0.0f, ahsl.a(-40.0f), 0.0f);
        a(this.h);
        a(this.a);
        ahrt.e.add(this);
        b(ahrt.e());
    }

    public final boolean c(ahnj ahnj) {
        return false;
    }

    public final void a(boolean z) {
        this.l = z ^ 1;
        this.g.c();
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final void a() {
        this.a.n_(true);
    }

    public final void b(int i) {
        this.h.a(this.i.getString(R.string.ad_minimized, new Object[]{f, xvd.b((long) (i / 1000))}));
    }

    public final void b(boolean z) {
        this.h.m_(z);
    }

    public final boolean a(ahnj ahnj) {
        Iterator it = iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                ahqb ahqb = (ahqb) it.next();
                if (ahqb instanceof ahpv) {
                    if (z || ((ahpv) ahqb).a(ahnj)) {
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    public final boolean b(ahnj ahnj) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ahqb ahqb = (ahqb) it.next();
            if ((ahqb instanceof ahpv) && !((ahpv) ahqb).b(ahnj)) {
                return false;
            }
        }
        return true;
    }
}
