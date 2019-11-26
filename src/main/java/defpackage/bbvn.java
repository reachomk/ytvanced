package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbvn */
public final class bbvn implements bbmm {
    private final AtomicReference a;

    public bbvn(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final void b(bbmo bbmo) {
        bbvo bbvo;
        bbvl bbvl = new bbvl(bbmo);
        bbmo.a((bbnc) bbvl);
        loop0:
        while (true) {
            bbvo = (bbvo) this.a.get();
            if (bbvo == null || bbvo.c()) {
                bbvo bbvo2 = new bbvo(this.a);
                if (this.a.compareAndSet(bbvo, bbvo2)) {
                    bbvo = bbvo2;
                } else {
                    continue;
                }
            }
            while (true) {
                bbvl[] bbvlArr = (bbvl[]) bbvo.b.get();
                if (bbvlArr == bbvo.a) {
                    continue;
                    break;
                }
                int length = bbvlArr.length;
                bbvl[] bbvlArr2 = new bbvl[(length + 1)];
                System.arraycopy(bbvlArr, 0, bbvlArr2, 0, length);
                bbvlArr2[length] = bbvl;
                if (bbvo.b.compareAndSet(bbvlArr, bbvlArr2)) {
                    break loop0;
                }
            }
        }
        if (!bbvl.compareAndSet(null, bbvo)) {
            bbvo.a(bbvl);
        }
    }
}
