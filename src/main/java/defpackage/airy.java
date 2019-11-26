package defpackage;

import android.util.Pair;
import java.util.concurrent.TimeUnit;

/* renamed from: airy */
final class airy extends afsx {
    private final abfj a;
    private final String f;
    private final acxt g;
    private final /* synthetic */ airv h;

    public final /* synthetic */ void a(Object obj) {
        boolean z;
        aakj aakj = (aakj) obj;
        if (aakj != null) {
            z = this.a.i;
        }
        aakj = this.h.a(this.f, aakj);
        z = aira.a(aakj, this.h.e);
        Object obj2 = null;
        if (aakj != null && aiqr.a(aakj.l())) {
            obj2 = 1;
        }
        if (!(this.h.f == null || aakj == null || aakj.n() == null)) {
            awdg awdg = aakj.n().c;
            if ((awdg.b & 4096) != 0) {
                aoui aoui = awdg.C;
                if (aoui == null) {
                    aoui = aoui.c;
                }
                if (!(!aoui.b || z || obj2 == null)) {
                    this.h.f.put(this.a.a(), new Pair(aakj, Long.valueOf(this.h.e.b() + TimeUnit.SECONDS.toMillis((long) akcm.a(aakj.a).e))));
                }
            }
        }
        this.h.d.d(new ahjt(this.a.g));
        acxt acxt = this.g;
        if (acxt != null) {
            acxt.a("ps_r");
            acxt = this.g;
            atyl atyl = (atyl) atyi.l.createBuilder();
            atyl.a(this.a.g);
            acxt.a((atyi) ((anxl) atyl.build()));
        }
        a_(aakj);
    }

    /* synthetic */ airy(airv airv, abfj abfj, String str, acxt acxt) {
        this.h = airv;
        this.a = (abfj) amqw.a((Object) abfj);
        this.f = (String) amqw.a((Object) str);
        this.g = acxt;
    }
}
