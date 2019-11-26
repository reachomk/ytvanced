package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: annc */
final class annc implements Executor, rye {
    public final psz a;
    public final Queue b = new ArrayDeque();
    public int c = 0;
    private final Handler d;

    public annc(psz psz) {
        this.a = psz;
        this.d = new Handler(psz.d);
    }

    public final void a(ryi ryi) {
        annf annf;
        synchronized (this.b) {
            if (this.c == 2) {
                annf = (annf) this.b.peek();
                pzr.a(annf != null);
            } else {
                annf = null;
            }
            this.c = 0;
        }
        if (annf != null) {
            annf.a();
        }
    }

    public final void execute(Runnable runnable) {
        this.d.post(runnable);
    }
}
