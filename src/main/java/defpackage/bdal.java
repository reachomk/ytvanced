package defpackage;

import java.util.Iterator;

/* renamed from: bdal */
final class bdal implements Runnable {
    private final /* synthetic */ bdaj a;

    bdal(bdaj bdaj) {
        this.a = bdaj;
    }

    public final void run() {
        bdaj bdaj = this.a;
        if (!bdaj.c.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator it = bdaj.c.iterator();
            while (it.hasNext()) {
                bdam bdam = (bdam) it.next();
                if (bdam.a > nanoTime) {
                    return;
                }
                if (bdaj.c.remove(bdam)) {
                    bdaj.d.b(bdam);
                }
            }
        }
    }
}
