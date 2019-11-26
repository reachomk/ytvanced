package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: afrt */
final class afrt implements Runnable, wxg {
    private final Object a;
    private final Object b;
    private final wxg c;
    private Object d;
    private final /* synthetic */ afrq e;

    public afrt(afrq afrq, Object obj, Object obj2, wxg wxg) {
        this.e = afrq;
        this.a = obj;
        this.b = obj2;
        this.c = wxg;
    }

    public final void a(Object obj, Object obj2) {
        this.d = obj2;
        afrq afrq = this.e;
        if (afrq.a != null) {
            Executor executor = afrq.b;
            if (executor != null) {
                executor.execute(this);
                return;
            } else {
                run();
                return;
            }
        }
        this.c.a(this.a, obj2);
    }

    public final void a(Object obj, Exception exception) {
        this.c.a(this.a, exception);
    }

    public final void run() {
        try {
            this.c.a(this.a, this.e.a.a(this.d));
        } catch (IOException e) {
            this.e.a(this.a, this.b, this.c, e);
        } catch (xwd e2) {
            this.e.a(this.a, this.b, this.c, e2);
        }
    }
}
