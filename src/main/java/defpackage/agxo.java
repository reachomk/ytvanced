package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: agxo */
final class agxo implements Executor {
    private final Handler a = new Handler(this.b.getMainLooper());
    private final /* synthetic */ agxl b;

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }

    /* synthetic */ agxo(agxl agxl) {
        this.b = agxl;
    }
}
