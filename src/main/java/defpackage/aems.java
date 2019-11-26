package defpackage;

import java.io.IOException;
import java.util.Set;

/* renamed from: aems */
final class aems implements Runnable, noa {
    private nmx a;
    private nrq b;
    private final int c;
    private final String d;
    private final byte[] e;
    private final /* synthetic */ aemq f;

    public aems(aemq aemq, int i, String str, byte[] bArr) {
        this.f = aemq;
        this.c = i;
        this.d = str;
        this.e = bArr;
    }

    public final int a(nrb nrb, int i, boolean z) {
        return 0;
    }

    public final void a(long j, int i, int i2, int i3, byte[] bArr) {
    }

    public final void a(npv npv) {
    }

    public final void a(nwz nwz, int i) {
    }

    public final void run() {
        nrc nuz;
        nvq nvq = new nvq(aemq.a);
        nvj nvj = new nvj(this.e);
        if (((Set) aahv.aw.get()).contains(Integer.valueOf(this.c))) {
            nuz = new nuz();
        } else {
            nuz = new nsr();
        }
        nnx nnx = new nnx(nuz);
        try {
            nrb nqx = new nqx(nvj, nvq.c, nvj.a(nvq));
            nnx.a((noa) this);
            do {
            } while (nnx.a(nqx) == 0);
        } catch (IOException | InterruptedException unused) {
        }
        if (this.a == null) {
            afpc.a(2, afpf.onesie, "Failed to extract a media format from init segment.");
            return;
        }
        String a = aajy.a(this.c, this.d);
        String str = this.f.b;
        nmx nmx = this.a;
        this.f.a(new aemp(nvj, nvq, new nom(a, str, nmx.h, nmx.i, nmx.q, nmx.r), this.a, this.b, (long) this.e.length));
    }

    public final void a(nmx nmx) {
        this.a = nmx;
    }

    public final void a(nrq nrq) {
        this.b = nrq;
    }
}
