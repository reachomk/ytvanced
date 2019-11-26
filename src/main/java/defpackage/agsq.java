package defpackage;

import android.text.TextUtils;

/* renamed from: agsq */
final class agsq implements anjg {
    private final agps a;
    private final String b;
    private final boolean c = false;
    private final int d;

    public final void a(Object obj) {
        amqp amqp;
        agps agps = this.a;
        if (TextUtils.isEmpty(this.b)) {
            amqp = ampo.a;
        } else {
            amqp = amqp.b(this.b);
        }
        agps.a(amqp, this.d, 2);
    }

    public final void a(Throwable th) {
    }

    /* synthetic */ agsq(agps agps, String str, int i) {
        this.b = str;
        this.a = agps;
        this.d = i;
    }
}
