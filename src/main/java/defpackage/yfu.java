package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yfu */
final class yfu implements OnClickListener {
    private final /* synthetic */ yfr a;

    yfu(yfr yfr) {
        this.a = yfr;
    }

    public final void onClick(View view) {
        yfr yfr = this.a;
        if ((yfr.c.a & 2) != 0) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", yfr);
            aaas aaas = yfr.a;
            apxu apxu = yfr.c.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
    }
}
