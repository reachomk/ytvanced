package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jxh */
final class jxh implements OnClickListener {
    private final /* synthetic */ jxe a;

    jxh(jxe jxe) {
        this.a = jxe;
    }

    public final void onClick(View view) {
        jxe jxe = this.a;
        jxe.b ^= 1;
        jxe.b();
    }
}
