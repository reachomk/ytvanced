package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: jsw */
final /* synthetic */ class jsw implements OnClickListener {
    private final jsx a;

    jsw(jsx jsx) {
        this.a = jsx;
    }

    public final void onClick(View view) {
        jsx jsx = this.a;
        aphg aphg = jsx.f;
        if (aphg != null) {
            apxu apxu;
            Map a = jsx.a(aphg);
            aaas aaas = jsx.e;
            aphg aphg2 = jsx.f;
            if ((aphg2.a & 4096) != 0) {
                apxu = aphg2.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = null;
            }
            aaas.a(apxu, a);
        }
    }
}
