package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: rl */
final class rl extends FutureTask {
    private final /* synthetic */ rj a;

    rl(rj rjVar, Callable callable) {
        this.a = rjVar;
        super(callable);
    }

    /* Access modifiers changed, original: protected|final */
    public final void done() {
        String str = "An error occurred while executing doInBackground()";
        try {
            this.a.b(get());
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(str, e2.getCause());
        } catch (CancellationException unused) {
            this.a.b(null);
        } catch (Throwable th) {
            RuntimeException runtimeException = new RuntimeException(str, th);
        }
    }
}
