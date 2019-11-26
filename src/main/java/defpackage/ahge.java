package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: ahge */
public final class ahge implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    private ahge(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
    }

    public static ahge a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        return new ahge(bcaa, bcaa2, bcaa3, bcaa4, bcaa5);
    }

    public final /* synthetic */ Object get() {
        return new ahfv((Context) this.a.get(), (aiqf) this.b.get(), (aajk) this.c.get(), (Executor) this.d.get(), (bcud) this.e.get());
    }
}
