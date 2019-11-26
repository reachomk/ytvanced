package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: adnl */
final /* synthetic */ class adnl implements Runnable {
    private final adnm a;
    private final List b;
    private final String c;
    private final adpw d;

    adnl(adnm adnm, List list, String str, adpw adpw) {
        this.a = adnm;
        this.b = list;
        this.c = str;
        this.d = adpw;
    }

    public final void run() {
        adnm adnm = this.a;
        Collection collection = this.b;
        String str = this.c;
        adpw adpw = this.d;
        adnh adnh = adnm.a;
        aikc aikc = adnh.m;
        adnh.d.d = false;
        List d = adnh.d();
        aikc.a(0, 0, aikc.a(0));
        aikc.a(0, 0, collection);
        adnh.d.d = true;
        xtq.a(d, adnh.d(), new adnk(adnh));
        adnm.a.g.execute(new adno(adnm, str, adpw));
    }
}
