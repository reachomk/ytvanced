package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ajfu */
public final class ajfu implements afog {
    public static final aulc[] a = new aulc[]{aulc.USER_AUTH, aulc.VISITOR_ID, aulc.PLUS_PAGE_ID};
    private static final int e = ((int) TimeUnit.DAYS.toHours(30));
    public final ajfs b;
    public final aqtq c;
    public aulg d;
    private final afpu f;
    private final aapd g;
    private afmw h;

    public ajfu(afpu afpu, aapd aapd, ajfs ajfs, zyw zyw) {
        this.f = (afpu) amqw.a((Object) afpu);
        this.g = (aapd) amqw.a((Object) aapd);
        this.b = (ajfs) amqw.a((Object) ajfs);
        this.c = ajfm.a((zyw) amqw.a((Object) zyw));
    }

    public final String a() {
        return "attestation";
    }

    public final void a(String str, afoa afoa, List list) {
        afpt a = this.f.a(str);
        if (a == null) {
            a = afpt.g;
            xtl.d("Cannot resolve Identity from identityId. Dispatching as Identity.SIGNED_OUT.");
        }
        afot afot = ((afob) afoa).a;
        aapd aapd = this.g;
        aaml aape = new aape(aapd.c, a, afot.a, afot.b);
        for (njz c : list) {
            aoxl aoxl = (aoxl) aoxm.c.createBuilder();
            try {
                aoxl.mergeFrom(c.c(), anxa.c());
                aape.a.add((aoxm) ((anxl) aoxl.build()));
            } catch (anyg unused) {
                afpc.a(2, afpf.logging, "AttestationDelayedEventDispatcher.dispatchEvents() could not deserialize AttestationObjectId");
            }
        }
        if (!aape.n()) {
            aapd aapd2 = this.g;
            aapd2.a.a(aape, new ajfx(this, a));
        }
    }

    public final afmw b() {
        if (this.h == null) {
            aqtz aqtz = (aqtz) aqtw.e.createBuilder();
            aqtq aqtq = this.c;
            if (aqtq == null || (aqtq.a & 8) == 0) {
                aqtz.a(e);
                aqtz.b(30);
            } else {
                aqtw aqtw = aqtq.e;
                if (aqtw == null) {
                    aqtw = aqtw.e;
                }
                aqtz.a(aqtw.b);
                aqtw = this.c.e;
                if (aqtw == null) {
                    aqtw = aqtw.e;
                }
                aqtz.b(aqtw.c);
            }
            this.h = new ajfw(aqtz);
        }
        return this.h;
    }
}
