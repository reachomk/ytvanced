package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: wnn */
final /* synthetic */ class wnn implements OnClickListener {
    private final wnj a;
    private final aphg b;
    private final akor c;

    wnn(wnj wnj, aphg aphg, akor akor) {
        this.a = wnj;
        this.b = aphg;
        this.c = akor;
    }

    public final void onClick(View view) {
        wnj wnj = this.a;
        Object obj = this.b;
        akor akor = this.c;
        wnj.c.a();
        Map a = acwi.a(obj);
        a.putAll(akor.b());
        aaas aaas = wnj.a;
        apxu apxu = obj.l;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, a);
    }
}
