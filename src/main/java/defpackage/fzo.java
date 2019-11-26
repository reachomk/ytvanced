package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fzo */
public final class fzo {
    public final afpu a;
    public final xpt b;
    public final aazk c;
    public final xci d;
    public final Executor e;
    private final xoi f;

    public fzo(xpt xpt, xci xci, aazk aazk, xoi xoi, afpu afpu, Executor executor) {
        this.b = xpt;
        this.d = xci;
        this.c = aazk;
        this.f = xoi;
        this.a = afpu;
        this.e = executor;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Throwable th) {
        xtl.a("Error rating", th);
        this.f.c(th);
    }
}
