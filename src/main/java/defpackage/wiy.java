package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wiy */
final /* synthetic */ class wiy implements OnClickListener {
    private final wiz a;
    private final akor b;
    private final aphg c;

    wiy(wiz wiz, akor akor, aphg aphg) {
        this.a = wiz;
        this.b = akor;
        this.c = aphg;
    }

    public final void onClick(View view) {
        wiz wiz = this.a;
        akor akor = this.b;
        aphg aphg = this.c;
        view.performHapticFeedback(1);
        Map hashMap = new HashMap(akor.b());
        String str = "commentThreadMutator";
        hashMap.put(str, akor.a(str));
        aaas aaas = wiz.a;
        apxu apxu = aphg.m;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, hashMap);
    }
}
