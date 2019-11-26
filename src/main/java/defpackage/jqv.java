package defpackage;

import android.view.View;

/* renamed from: jqv */
final /* synthetic */ class jqv implements akok {
    private final jqr a;
    private final int b;

    jqv(jqr jqr, int i) {
        this.a = jqr;
        this.b = i;
    }

    public final boolean a(View view) {
        jqr jqr = this.a;
        int i = this.b;
        jqr.a.e(i);
        amqp amqp = jqr.b;
        jqr.b = amqp.b(Integer.valueOf(i));
        if (amqp.a() && ((Integer) amqp.b()).intValue() == i) {
            jqr.b = ampo.a;
        }
        jqr.d.e_(jqq.a(amqp, jqr.b));
        boolean z = true;
        if (jqr.b.a()) {
            jqr.a(((Integer) jqr.b.b()).intValue(), true);
        }
        if (amqp.a()) {
            jqr.a(((Integer) amqp.b()).intValue(), false);
        }
        if (amqp.a() && ((Integer) amqp.b()).intValue() == i) {
            jqr.k();
            jqr.j();
        } else if (amqp.a()) {
            z = false;
        } else {
            jqr.k();
            return false;
        }
        return z;
    }
}
