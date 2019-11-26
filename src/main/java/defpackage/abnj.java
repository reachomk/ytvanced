package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: abnj */
public final class abnj implements aboi {
    public final abnd a;
    public final abnm b;
    public final abng c;
    public final ScheduledExecutorService d;

    public abnj(abnd abnd, abnm abnm, abng abng, ScheduledExecutorService scheduledExecutorService) {
        this.a = (abnd) amqw.a((Object) abnd);
        this.b = (abnm) amqw.a((Object) abnm);
        this.c = (abng) amqw.a((Object) abng);
        this.d = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
    }

    public final abnp a(abod abod) {
        anjv a;
        anjv a2 = anjf.a(new abni(this, abod), this.d);
        if ((this.a.a() || this.a.b()) && !abod.d.isEmpty()) {
            a = anjf.a(new abnl(this, abod), this.d);
        } else {
            a = anjf.a(abnp.d);
        }
        anjj anjj = new anjj(amul.a(new anjv[]{anjf.a(anjf.a(a2), (long) this.a.g(), TimeUnit.MILLISECONDS, this.d), a}));
        anij abnk = new abnk(this, r1, a, a2);
        try {
            return (abnp) new anis(anjj.a, this.d, abnk).get();
        } catch (InterruptedException | ExecutionException unused) {
            return abnp.d;
        }
    }
}
