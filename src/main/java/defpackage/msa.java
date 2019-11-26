package defpackage;

import java.util.Arrays;

/* renamed from: msa */
public final class msa extends aamz {
    public msa(aamd aamd, afpu afpu, asmp asmp) {
        super(aamd, afpu.c(), "embedded_player", asmp);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        asmq asmq;
        asmo asmo;
        asmp asmp = (asmp) c();
        asmm asmm = (asmm) asmp.instance;
        if (asmm.b == 2) {
            asmq = (asmq) asmm.c;
        } else {
            asmq = asmq.d;
        }
        int isEmpty = asmq.b.isEmpty() ^ 1;
        asmm asmm2 = (asmm) asmp.instance;
        if (asmm2.b == 3) {
            asmo = (asmo) asmm2.c;
        } else {
            asmo = asmo.d;
        }
        amqw.b((asmo.b.isEmpty() ^ 1) ^ isEmpty);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{c()});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof msa)) {
            return false;
        }
        return amqq.a(c(), ((msa) obj).c());
    }
}
