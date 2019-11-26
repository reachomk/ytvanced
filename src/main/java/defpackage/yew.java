package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yew */
final class yew implements OnClickListener {
    private final /* synthetic */ yet a;

    yew(yet yet) {
        this.a = yet;
    }

    public final void onClick(View view) {
        yet yet = this.a;
        if (yet.c != null && (yet.b.a & 64) != 0) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", yet);
            aaas aaas = yet.a;
            apxu apxu = yet.b.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
    }
}
