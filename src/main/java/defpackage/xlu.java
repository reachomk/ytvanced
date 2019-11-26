package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: xlu */
public final class xlu {
    private final xlq a;
    private final Context b;

    public xlu(xlq xlq, Context context) {
        if (xlq == null) {
            xlq = xlq.a;
        }
        this.a = xlq;
        this.b = (Context) amqw.a((Object) context);
    }

    public final void a() {
        if (VERSION.SDK_INT >= 26) {
            for (xls xls : this.a.a()) {
                Context context = this.b;
                if (VERSION.SDK_INT >= 26) {
                    xlr.a(context, xls.a, context.getString(xls.b), xls.c, xls.d, xls.e);
                }
            }
        }
    }
}
