package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: alvi */
public final class alvi {
    public final long a;
    public final alvj b;
    public final Handler c;
    public final alvh d;
    public final Thread e = new alvl(this, "ANRGuard-Thread");

    public alvi(Context context, alxx alxx, alvh alvh, alvj alvj) {
        this.b = alvj;
        this.d = alvh;
        this.c = new Handler(context.getMainLooper());
        aycw aycw = ((aydm) alxx.get()).h;
        if (aycw == null) {
            aycw = aycw.e;
        }
        this.a = (long) aycw.b;
    }
}
