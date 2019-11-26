package defpackage;

import java.io.IOException;

/* renamed from: nog */
final class nog implements Runnable {
    private final /* synthetic */ IOException a;
    private final /* synthetic */ noc b;

    nog(noc noc, IOException iOException) {
        this.b = noc;
        this.a = iOException;
    }

    public final void run() {
        noc noc = this.b;
        noc.c.a(noc.b, this.a);
    }
}
