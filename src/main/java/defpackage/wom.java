package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: wom */
final /* synthetic */ class wom implements OnClickListener {
    private final won a;
    private final avvn b;
    private final Map c;

    wom(won won, avvn avvn, Map map) {
        this.a = won;
        this.b = avvn;
        this.c = map;
    }

    public final void onClick(View view) {
        won won = this.a;
        avvn avvn = this.b;
        Map map = this.c;
        aaas aaas = won.b;
        apxu apxu = avvn.d;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, map);
    }
}
