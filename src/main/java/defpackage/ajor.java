package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ajor */
public final class ajor implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    private ajor(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
    }

    public static ajor a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        return new ajor(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6);
    }

    public final /* synthetic */ Object get() {
        return new ajoo(this.a, (ScheduledExecutorService) this.b.get(), this.c, (ahjf) this.d.get(), (Handler) this.e.get(), (Executor) this.f.get());
    }
}
