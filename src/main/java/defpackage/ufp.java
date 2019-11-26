package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: ufp */
final /* synthetic */ class ufp implements Callable {
    private final Context a;

    ufp(Context context) {
        this.a = context;
    }

    public final Object call() {
        return ra.b(this.a);
    }
}
