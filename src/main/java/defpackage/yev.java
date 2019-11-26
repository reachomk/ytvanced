package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yev */
final class yev implements OnClickListener {
    private final /* synthetic */ yet a;

    yev(yet yet) {
        this.a = yet;
    }

    public final void onClick(View view) {
        yet yet = this.a;
        int i = yet.d;
        if (i != 3 && i != 5) {
            alkz alkz = yet.c;
            if (alkz != null && alkz.d() != null && (yet.c.d().a & 2048) != 0) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", yet);
                aaas aaas = yet.a;
                apxu apxu = yet.c.d().l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, hashMap);
            }
        }
    }
}
