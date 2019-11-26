package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hmz */
final /* synthetic */ class hmz implements OnClickListener {
    private final hmx a;
    private final aaas b;

    hmz(hmx hmx, aaas aaas) {
        this.a = hmx;
        this.b = aaas;
    }

    public final void onClick(View view) {
        hmx hmx = this.a;
        aaas aaas = this.b;
        if (hmx.e != null) {
            jif jif = hmx.d;
            if (jif != null) {
                jif.a(hmx, hmx.c);
            }
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.rendering.presenter.PresentContext", hmx.b);
            aaas.a(hmx.e, hashMap);
        }
    }
}
