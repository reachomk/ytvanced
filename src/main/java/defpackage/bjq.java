package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: bjq */
final class bjq implements Callable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ String b;

    bjq(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final /* synthetic */ Object call() {
        return bjm.c(this.a, this.b);
    }
}
