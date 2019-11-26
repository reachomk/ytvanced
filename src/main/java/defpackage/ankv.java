package defpackage;

import java.util.concurrent.Future;

/* renamed from: ankv */
public final class ankv {
    public static Object a(Future future) {
        Object obj = null;
        while (true) {
            try {
                future = future.get();
                break;
            } catch (InterruptedException unused) {
                obj = 1;
            } catch (Throwable th) {
                if (obj != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (obj != null) {
            Thread.currentThread().interrupt();
        }
        return future;
    }
}
