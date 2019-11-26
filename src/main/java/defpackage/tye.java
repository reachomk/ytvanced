package defpackage;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: tye */
final class tye implements RejectedExecutionHandler {
    private tye() {
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        String valueOf = String.valueOf(runnable);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 30);
        stringBuilder.append("Service rejected execution of ");
        stringBuilder.append(valueOf);
        tyv.b("PrimesExecutors", stringBuilder.toString(), new Object[0]);
    }

    /* synthetic */ tye(byte b) {
    }
}
