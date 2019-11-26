package defpackage;

import java.io.IOException;

/* renamed from: aejz */
final /* synthetic */ class aejz implements Runnable {
    private final aejy a;
    private final IOException b;

    aejz(aejy aejy, IOException iOException) {
        this.a = aejy;
        this.b = iOException;
    }

    public final void run() {
        aejy aejy = this.a;
        aejy.a.a(this.b);
    }
}
