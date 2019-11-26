package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jqw */
final /* synthetic */ class jqw implements OnClickListener {
    private final jqr a;

    jqw(jqr jqr) {
        this.a = jqr;
    }

    public final void onClick(View view) {
        jqr jqr = this.a;
        if (jqr.b.a() && ((Integer) jqr.b.b()).intValue() != 0) {
            jqr.a(0, true);
            jqr.a(((Integer) jqr.b.b()).intValue(), false);
            int intValue = ((Integer) jqr.b.b()).intValue();
            jqr.b = ampo.a;
            jqr.d.e_(jqq.a(amqp.b(Integer.valueOf(intValue)), ampo.a));
            jqr.j();
        } else if (jqr.b.a() && ((Integer) jqr.b.b()).intValue() == 0) {
            xtl.d("Should not be possible for Default chip to be selected.");
        } else {
            xtl.d("Default chip should always be selected when no current selection exists.");
        }
    }
}
