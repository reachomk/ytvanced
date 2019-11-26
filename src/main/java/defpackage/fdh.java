package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: fdh */
public final /* synthetic */ class fdh implements OnClickListener {
    private final fdi a;
    private final avls b;
    private final Map c;

    public fdh(fdi fdi, avls avls, Map map) {
        this.a = fdi;
        this.b = avls;
        this.c = map;
    }

    public final void onClick(View view) {
        fdi fdi = this.a;
        avls avls = this.b;
        Map map = this.c;
        aaas aaas = fdi.b;
        apxu apxu = avls.d;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, map);
    }
}
