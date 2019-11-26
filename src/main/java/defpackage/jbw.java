package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: jbw */
public final class jbw {
    public final Activity a;
    public final aavm b;
    public final Handler c;
    private final Executor d;

    public jbw(Activity activity, Executor executor, aavm aavm, Handler handler) {
        this.a = activity;
        this.d = executor;
        this.b = aavm;
        this.c = handler;
    }

    public final void a(String str, String str2) {
        jca.a(this.c, this.a, str, false);
        this.d.execute(new jbv(this, str2));
    }
}
