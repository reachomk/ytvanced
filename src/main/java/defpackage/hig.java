package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: hig */
public final class hig implements xcp {
    public final Executor a;
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public Future c;
    private final bcaa d;
    private final hpd e;

    public hig(bcaa bcaa, Executor executor, hpd hpd) {
        this.d = bcaa;
        this.a = executor;
        this.e = hpd;
    }

    public final void a() {
        if (((ahdm) this.d.get()).a() == 1) {
            Future future = this.c;
            if (future != null) {
                future.cancel(false);
                this.c = null;
            }
            hpd hpd = this.e;
            this.c = hpd.d.submit(new hpj(hpd, new hil(this)));
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{agky.class, agkz.class};
        } else if (i == 0) {
            a();
            return null;
        } else if (i == 1) {
            a();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
