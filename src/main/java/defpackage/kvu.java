package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: kvu */
final /* synthetic */ class kvu implements OnClickListener {
    private final kvv a;
    private final awtc b;
    private final Map c;

    kvu(kvv kvv, awtc awtc, Map map) {
        this.a = kvv;
        this.b = awtc;
        this.c = map;
    }

    public final void onClick(View view) {
        kvv kvv = this.a;
        awtc awtc = this.b;
        Map map = this.c;
        aaas aaas = kvv.a;
        apxu apxu = awtc.c;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, map);
    }
}
