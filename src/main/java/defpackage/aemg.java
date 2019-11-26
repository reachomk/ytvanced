package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aemg */
final class aemg implements aemn {
    private final aeoh a;
    private final xto b;
    private final zzl c;

    public aemg(aaje aaje, ScheduledExecutorService scheduledExecutorService, aeoh aeoh, zzl zzl) {
        this.a = (aeoh) amqw.a((Object) aeoh);
        this.c = (zzl) amqw.a((Object) zzl);
        this.b = new aemf("LazyOnesieRequest", aaje, aeoh);
        arvt b = this.c.b();
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            avtg avtg = auuo.c;
            if (avtg == null) {
                avtg = avtg.k;
            }
            avte avte = avtg.e;
            if (avte == null) {
                avte = avte.x;
            }
            if (avte.h) {
                this.b.a((Executor) scheduledExecutorService);
            }
        }
    }

    public final byte[] a() {
        atbq atbq = (atbq) this.b.get();
        return atbq != null ? atbq.toByteArray() : null;
    }

    public final atbq b() {
        return (atbq) this.b.get();
    }

    public final void a(aajh aajh, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            aajh.a(this.a.a(bArr, bArr2, bArr3));
        } catch (aeok unused) {
            aajh.a("response decryption error");
        }
    }
}
