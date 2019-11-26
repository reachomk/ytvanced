package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jxg */
final class jxg implements OnClickListener {
    private final /* synthetic */ azhu a;
    private final /* synthetic */ jxe b;

    jxg(jxe jxe, azhu azhu) {
        this.b = jxe;
        this.a = azhu;
    }

    public final void onClick(View view) {
        aaas aaas = this.b.a;
        apxu apxu = this.a.e;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
