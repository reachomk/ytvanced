package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: sea */
public final /* synthetic */ class sea implements Runnable {
    private final seb a;

    public sea(seb seb) {
        this.a = seb;
    }

    public final void run() {
        seb seb = this.a;
        anko anko = seb.b.a;
        if (anko != null && anko.isDone()) {
            try {
                seb.c = (sfq) anjf.a(seb.b.a);
                sef sef = seb.a;
                if (sef != null) {
                    sef.a(seb.c);
                    seb.c = null;
                }
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
