package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: sed */
public final /* synthetic */ class sed implements Runnable {
    private final seb a;

    public sed(seb seb) {
        this.a = seb;
    }

    public final void run() {
        seb seb = this.a;
        anko anko = seb.e.a;
        if (anko != null && anko.isDone()) {
            try {
                seb.d = (sfq) anjf.a(seb.e.a);
                sef sef = seb.a;
                if (sef != null) {
                    sef.b(seb.d);
                    seb.d = null;
                }
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
