package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: wog */
final /* synthetic */ class wog implements OnClickListener {
    private final wof a;
    private final aphg b;
    private final akor c;

    wog(wof wof, aphg aphg, akor akor) {
        this.a = wof;
        this.b = aphg;
        this.c = akor;
    }

    public final void onClick(View view) {
        wof wof = this.a;
        Object obj = this.b;
        akor akor = this.c;
        wof.a = false;
        wnb wnb = wof.e;
        if (wnb != null) {
            wnb.b();
        }
        wof.c.a();
        Map a = acwi.a(obj);
        a.putAll(akor.b());
        aaas aaas = wof.b;
        apxu apxu = obj.l;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, a);
    }
}
