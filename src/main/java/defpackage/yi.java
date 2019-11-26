package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: yi */
final class yi implements Callable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ yg b;
    private final /* synthetic */ int c;
    private final /* synthetic */ String d;

    yi(Context context, yg ygVar, int i, String str) {
        this.a = context;
        this.b = ygVar;
        this.c = i;
        this.d = str;
    }

    public final /* synthetic */ Object call() {
        yo a = yj.a(this.a, this.b, this.c);
        if (a.a != null) {
            yj.a.a(this.d, a.a);
        }
        return a;
    }
}
