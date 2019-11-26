package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* renamed from: anig */
abstract class anig extends anif implements Runnable {
    public amuh b;
    public final boolean c = false;
    private final boolean d;
    private final /* synthetic */ anid e;

    anig(anid anid, amuh amuh, boolean z) {
        this.e = anid;
        super(amuh.size());
        this.b = (amuh) amqw.a((Object) amuh);
        this.d = z;
    }

    public abstract void a(boolean z, int i, Object obj);

    public abstract void b();

    /* Access modifiers changed, original: 0000 */
    public void c() {
    }

    public final void run() {
        a();
    }

    private final void a(Throwable th) {
        amqw.a((Object) th);
        if (th instanceof Error) {
            anid.a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture$RunningState", "handleException", "Input Future failed with Error", th);
        }
    }

    public final void a(int i, Future future) {
        boolean z = true;
        if (this.e.isDone() && !this.e.isCancelled()) {
            z = false;
        }
        amqw.b(z, (Object) "Future was done before all dependencies completed");
        try {
            amqw.b(future.isDone(), (Object) "Tried to set value from future which is not done");
            if (this.d && !future.isCancelled()) {
                a(false, i, anjf.a(future));
            }
        } catch (ExecutionException e) {
            a(e.getCause());
        } catch (Throwable th) {
            a(th);
        }
    }

    public final void a() {
        int a = anif.a.a(this);
        int i = 0;
        amqw.b(a >= 0, (Object) "Less than 0 remaining futures");
        if (a == 0) {
            if (this.d) {
                amxo amxo = (amxo) this.b.iterator();
                while (amxo.hasNext()) {
                    int i2 = i + 1;
                    a(i, (anjv) amxo.next());
                    i = i2;
                }
            }
            b();
        }
    }
}
