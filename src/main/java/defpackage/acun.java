package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: acun */
public final class acun implements afog {
    public final acty a;
    public final acul b;
    public final afoi c;
    public final Executor d;
    private final abcz e;
    private final afpu f;
    private final zzf g;

    public acun(acty acty, abcz abcz, acul acul, afpu afpu, zzf zzf, Executor executor, afoi afoi) {
        this.a = (acty) amqw.a((Object) acty);
        this.e = (abcz) amqw.a((Object) abcz);
        this.b = (acul) amqw.a((Object) acul);
        this.f = (afpu) amqw.a((Object) afpu);
        this.g = (zzf) amqw.a((Object) zzf);
        this.c = (afoi) amqw.a((Object) afoi);
        this.d = (Executor) amqw.a((Object) executor);
    }

    public final String a() {
        return "event_logging";
    }

    public final void a(String str, afoa afoa, List list) {
        afpt a = this.f.a(str);
        String str2 = "GEL_DELAYED_EVENT_DEBUG";
        if (a == null) {
            a = afpt.g;
            xtl.b(str2, "Cannot resolve Identity from identityId. Dispatching as Identity.SIGNED_OUT.");
        }
        afpt afpt = a;
        afob afob = (afob) afoa;
        afot afot = afob.a;
        abda a2 = this.e.a(afpt, afos.a(afot, this.f), afot.b);
        for (njz c : list) {
            asmz asmz = (asmz) asmw.f.createBuilder();
            try {
                asmz.mergeFrom(c.c(), anxa.c());
                a2.d.add((asmw) ((anxl) asmz.build()));
            } catch (anyg unused) {
                xtl.a(str2, String.valueOf(getClass().getCanonicalName()).concat(" could not deserialize ClientEvent"));
            }
        }
        if (!a2.n()) {
            if (this.b.a()) {
                acty acty = this.a;
                actv actv = null;
                if (afpt != null) {
                    String str3 = "no_event_id_found";
                    String string = acty.a.getString(acty.c(afpt), str3);
                    long b = acty.b(afpt);
                    if (!(string.equals(str3) || b == -1)) {
                        actv = new actv(string, b);
                    }
                }
                if (actv != null) {
                    str2 = actv.a;
                    long j = actv.b;
                    a2.a = str2;
                    a2.b = j;
                }
            }
            a2.c = afob.b;
            this.e.a(a2, new acuq(this, a2, list, str, afot, afpt));
        }
    }

    public final afmw b() {
        zzg v = this.g.v();
        if (v.b == null) {
            aqtw aqtw;
            aqtu aqtu = v.a;
            if ((aqtu.a & 128) != 0) {
                aqtw = aqtu.e;
                if (aqtw == null) {
                    aqtw = aqtw.e;
                }
            } else {
                aqtw = null;
            }
            v.b = new zzj(aqtw);
        }
        return v.b;
    }
}
