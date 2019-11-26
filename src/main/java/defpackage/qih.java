package defpackage;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: qih */
public final class qih {
    public final Context a;
    public final ScheduledExecutorService b;
    private qik c = new qik(this);
    private int d = 1;

    public qih(Context context) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.a = context.getApplicationContext();
        this.b = newSingleThreadScheduledExecutor;
    }

    public final synchronized ryi a(qiq qiq) {
        if (!this.c.a(qiq)) {
            this.c = new qik(this);
            this.c.a(qiq);
        }
        return qiq.b.a;
    }

    public final synchronized int a() {
        int i;
        i = this.d;
        this.d = i + 1;
        return i;
    }
}
