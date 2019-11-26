package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: ufs */
final /* synthetic */ class ufs implements Callable {
    private final Context a;

    ufs(Context context) {
        this.a = context;
    }

    public final Object call() {
        return ra.c(this.a);
    }
}
