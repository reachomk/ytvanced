package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bazp */
public interface bazp extends Closeable {
    bazv a(SocketAddress socketAddress, bazs bazs, basa basa);

    ScheduledExecutorService a();

    void close();
}
