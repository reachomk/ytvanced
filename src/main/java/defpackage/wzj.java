package defpackage;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: wzj */
public final class wzj implements baqa {
    private final bcaa a;
    private final bcaa b;

    private wzj(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static wzj a(bcaa bcaa, bcaa bcaa2) {
        return new wzj(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return (anjz) baqd.a(ankc.a((ScheduledExecutorService) ((amqp) this.a.get()).a(new wzg((Set) this.b.get()))), "Cannot return null from a non-@Nullable @Provides method");
    }
}
