package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: rd */
final class rd implements Executor {
    private final Handler a;

    rd(Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable runnable) {
        if (!this.a.post(runnable)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(" is shutting down");
            throw new RejectedExecutionException(stringBuilder.toString());
        }
    }
}
