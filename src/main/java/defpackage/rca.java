package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rca */
public final class rca extends rhf {
    private static rih d = new rih();
    private final Context e;

    public rca(qui qui, String str, String str2, qpa qpa, int i, Context context) {
        super(qui, str, str2, qpa, i, 29);
        this.e = context;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        this.b.o = "E";
        AtomicReference a = d.a(this.e.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.c.invoke(null, new Object[]{this.e}));
                }
            }
        }
        String str = (String) a.get();
        synchronized (this.b) {
            this.b.o = qri.a(str.getBytes(), true);
        }
    }
}
