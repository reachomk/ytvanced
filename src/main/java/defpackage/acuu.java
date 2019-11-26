package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: acuu */
public final class acuu implements afog {
    public final acty a;
    public final acul b;
    public final afoi c;
    public final Executor d;
    public final afmw e = new acut();
    private final abcz f;
    private final afpu g;

    public acuu(acty acty, acul acul, abcz abcz, afpu afpu, Executor executor, afoi afoi) {
        this.a = (acty) amqw.a((Object) acty);
        this.f = (abcz) amqw.a((Object) abcz);
        this.b = (acul) amqw.a((Object) acul);
        this.g = (afpu) amqw.a((Object) afpu);
        this.c = (afoi) amqw.a((Object) afoi);
        this.d = (Executor) amqw.a((Object) executor);
    }

    public final String a() {
        return "event_logging_fixed_batch_retry";
    }

    public final void a(String str, afoa afoa, List list) {
        afpt a = this.g.a(str);
        if (a == null) {
            a = afpt.g;
            xtl.d("Cannot resolve Identity from identityId in EventLoggingRequestRetryDelayedEventDispatcher. Dispatching as Identity.SIGNED_OUT.");
        }
        afot afot = ((afob) afoa).a;
        for (njz njz : list) {
            asnc asnc = (asnc) asnd.g.createBuilder();
            try {
                asnc.mergeFrom(njz.c(), anxa.c());
                abda a2 = this.f.a(a, afos.a(afot, this.g), afot.b);
                asnd asnd = (asnd) ((anxl) asnc.build());
                if (asnd.e.size() != 0) {
                    a2.d = asnd.e;
                }
                if ((asnd.a & 4) != 0) {
                    asnj asnj = asnd.d;
                    if (asnj == null) {
                        asnj = asnj.d;
                    }
                    a2.a = asnj.b;
                    asnj asnj2 = asnd.d;
                    if (asnj2 == null) {
                        asnj2 = asnj.d;
                    }
                    a2.b = asnj2.c;
                }
                if (!a2.n()) {
                    this.f.a(a2, new acuw(this, njz, a));
                }
            } catch (anyg unused) {
                xtl.c("EventLoggingRequestRetryDelayedEventDispatcher.dispatchEvents() could not deserialize EventLoggingRequest");
            }
        }
    }

    public final afmw b() {
        return this.e;
    }
}
