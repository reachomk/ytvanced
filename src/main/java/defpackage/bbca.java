package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: bbca */
final class bbca implements bbhj {
    bbca() {
    }

    public final String toString() {
        return "grpc-default-executor";
    }

    public final /* synthetic */ void a(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    public final /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(bbby.b("grpc-default-executor-%d"));
    }
}
