package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: azzt */
public final class azzt implements azyk {
    private final bciz a;

    public azzt(bciz bciz) {
        this.a = (bciz) amqw.a((Object) bciz);
    }

    public final azzh a(String str, String str2, azyn azyn, azyl azyl) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        amqw.a((Object) str);
        amqw.a((Object) str2);
        return new azzu(str, str2, azyn, this.a, newSingleThreadExecutor, new azzs(newSingleThreadExecutor), azyl != null ? new azzy(newSingleThreadExecutor, azyl) : null);
    }
}
