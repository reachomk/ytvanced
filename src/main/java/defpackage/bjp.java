package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: bjp */
final class bjp implements Callable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ int b;

    bjp(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public final /* synthetic */ Object call() {
        return bjm.b(this.a, this.b);
    }
}
