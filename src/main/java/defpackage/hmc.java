package defpackage;

import android.view.ViewStub;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: hmc */
public final class hmc {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    public hmc(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) hmc.a((Object) bcaa, 1);
        this.b = (bcaa) hmc.a((Object) bcaa2, 2);
        this.c = (bcaa) hmc.a((Object) bcaa3, 3);
        this.d = (bcaa) hmc.a((Object) bcaa4, 4);
        this.e = (bcaa) hmc.a((Object) bcaa5, 5);
        this.f = (bcaa) hmc.a((Object) bcaa6, 6);
    }

    public final hlv a(ViewStub viewStub, hnf hnf) {
        return new hlv((ScheduledExecutorService) hmc.a((ScheduledExecutorService) this.a.get(), 1), (Executor) hmc.a((Executor) this.b.get(), 2), (agwc) hmc.a((agwc) this.c.get(), 3), (xci) hmc.a((xci) this.d.get(), 4), (ahdm) hmc.a((ahdm) this.e.get(), 5), (hng) hmc.a((hng) this.f.get(), 6), (ViewStub) hmc.a((Object) viewStub, 7), hnf);
    }

    private static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
