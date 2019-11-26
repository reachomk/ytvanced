package defpackage;

import java.io.IOException;

/* renamed from: aaiy */
final /* synthetic */ class aaiy implements Runnable {
    private final aaiz a;
    private final IOException b;

    aaiy(aaiz aaiz, IOException iOException) {
        this.a = aaiz;
        this.b = iOException;
    }

    public final void run() {
        aaiz aaiz = this.a;
        IOException iOException = this.b;
        nwq nwq = aaiz.o;
        if (nwq != null) {
            nwq.a(iOException);
        }
    }
}
