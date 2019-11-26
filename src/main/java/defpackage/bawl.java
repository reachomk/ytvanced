package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bawl */
final class bawl implements bazp {
    private final ScheduledExecutorService a = ((ScheduledExecutorService) bbhf.a(bbby.m));
    private final Executor b;
    private final int c;
    private final boolean d;
    private final bawo e;
    private final bbht f;
    private final boolean g = true;

    public final bazv a(SocketAddress socketAddress, bazs bazs, basa basa) {
        return new bawt(this.e, (InetSocketAddress) socketAddress, bazs.a, bazs.c, bazs.b, this.b, this.c, false, this.f);
    }

    public final ScheduledExecutorService a() {
        return this.a;
    }

    public final void close() {
        if (this.g) {
            bbhf.a(bbby.m, this.a);
        }
    }

    /* synthetic */ bawl(bawo bawo, Executor executor, int i, bbht bbht) {
        this.c = i;
        this.d = false;
        this.e = bawo;
        this.b = (Executor) amqw.a((Object) executor, (Object) "executor");
        this.f = (bbht) amqw.a((Object) bbht, (Object) "transportTracer");
    }
}
