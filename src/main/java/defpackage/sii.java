package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: sii */
final /* synthetic */ class sii implements Runnable {
    private final sij a;

    sii(sij sij) {
        this.a = sij;
    }

    public final void run() {
        sij sij = this.a;
        anko anko = sij.a.a;
        if (anko != null && anko.isDone()) {
            try {
                sij.a((sfq) anjf.a(sij.a.a));
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
