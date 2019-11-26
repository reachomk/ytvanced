package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;
import java.util.Map;

/* renamed from: iil */
final /* synthetic */ class iil implements OnLongClickListener {
    private final iim a;
    private final arnq b;
    private final Map c;

    iil(iim iim, arnq arnq, Map map) {
        this.a = iim;
        this.b = arnq;
        this.c = map;
    }

    public final boolean onLongClick(View view) {
        iim iim = this.a;
        arnq arnq = this.b;
        Map map = this.c;
        if ((arnq.a & 2) == 0) {
            return false;
        }
        aaas aaas = iim.h;
        apxu apxu = arnq.c;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, map);
        return true;
    }
}
