package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: fks */
public final class fks {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public final Handler b;

    public fks(Context context) {
        this.b = new Handler(context.getMainLooper());
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.b.removeCallbacksAndMessages(null);
    }
}
