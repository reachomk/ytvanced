package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: wzt */
public class wzt implements Executor {
    private final Handler a;

    public wzt(Handler handler) {
        this.a = (Handler) amqw.a((Object) handler);
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
