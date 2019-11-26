package defpackage;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bayd */
final class bayd implements bazp {
    public final Executor a;
    private final bazp b;

    bayd(bazp bazp, Executor executor) {
        this.b = (bazp) amqw.a((Object) bazp, (Object) "delegate");
        this.a = (Executor) amqw.a((Object) executor, (Object) "appExecutor");
    }

    public final bazv a(SocketAddress socketAddress, bazs bazs, basa basa) {
        return new bayg(this, this.b.a(socketAddress, bazs, basa), bazs.a);
    }

    public final ScheduledExecutorService a() {
        return this.b.a();
    }

    public final void close() {
        this.b.close();
    }
}
