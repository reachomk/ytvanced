package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: sfx */
final /* synthetic */ class sfx implements Executor {
    private final Handler a;

    public sfx(Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
