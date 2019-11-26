package defpackage;

import java.net.MulticastSocket;

/* renamed from: adds */
final class adds implements Runnable {
    private final /* synthetic */ MulticastSocket a;
    private final /* synthetic */ addo b;

    adds(addo addo, MulticastSocket multicastSocket) {
        this.b = addo;
        this.a = multicastSocket;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
