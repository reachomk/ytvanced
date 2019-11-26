package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bbhi */
final class bbhi implements bbhm {
    bbhi() {
    }

    public final ScheduledExecutorService a() {
        return Executors.newSingleThreadScheduledExecutor(bbby.b("grpc-shared-destroyer-%d"));
    }
}
