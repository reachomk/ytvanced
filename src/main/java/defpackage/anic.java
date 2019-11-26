package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: anic */
public abstract class anic extends aniz implements Runnable {
    private anjv a;
    private Object f;

    public static anjv a(anjv anjv, anim anim, Executor executor) {
        amqw.a((Object) executor);
        anib anib = new anib(anjv, anim);
        anjv.a(anib, ankc.a(executor, anib));
        return anib;
    }

    public abstract Object a(Object obj, Object obj2);

    public abstract void b(Object obj);

    public static anjv a(anjv anjv, amqd amqd, Executor executor) {
        amqw.a((Object) amqd);
        anie anie = new anie(anjv, amqd);
        anjv.a(anie, ankc.a(executor, anie));
        return anie;
    }

    anic(anjv anjv, Object obj) {
        this.a = (anjv) amqw.a((Object) anjv);
        this.f = amqw.a(obj);
    }

    public final void run() {
        Future future = this.a;
        Object obj = this.f;
        int i = 1;
        int isCancelled = isCancelled() | (future == null ? 1 : 0);
        if (obj != null) {
            i = 0;
        }
        if ((isCancelled | i) == 0) {
            this.a = null;
            if (future.isCancelled()) {
                a((anjv) future);
                return;
            }
            try {
                Object a;
                try {
                    a = a(obj, anjf.a(future));
                    b(a);
                } catch (Throwable th) {
                    a = th;
                    a((Throwable) a);
                } finally {
                    this.f = null;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                a(e.getCause());
            } catch (RuntimeException e2) {
                a(e2);
            } catch (Error e22) {
                a(e22);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        a(this.a);
        this.a = null;
        this.f = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final String ax_() {
        String valueOf;
        StringBuilder stringBuilder;
        Object stringBuilder2;
        anjv anjv = this.a;
        Object obj = this.f;
        String ax_ = super.ax_();
        if (anjv != null) {
            valueOf = String.valueOf(anjv);
            stringBuilder = new StringBuilder(valueOf.length() + 16);
            stringBuilder.append("inputFuture=[");
            stringBuilder.append(valueOf);
            stringBuilder.append("], ");
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = "";
        }
        if (obj != null) {
            String valueOf2 = String.valueOf(obj);
            stringBuilder = new StringBuilder((String.valueOf(stringBuilder2).length() + 11) + valueOf2.length());
            stringBuilder.append(stringBuilder2);
            stringBuilder.append("function=[");
            stringBuilder.append(valueOf2);
            stringBuilder.append("]");
            return stringBuilder.toString();
        } else if (ax_ == null) {
            return null;
        } else {
            valueOf = String.valueOf(stringBuilder2);
            return ax_.length() == 0 ? new String(valueOf) : valueOf.concat(ax_);
        }
    }
}
