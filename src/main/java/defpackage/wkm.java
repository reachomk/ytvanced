package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wkm */
final class wkm implements OnClickListener {
    private final /* synthetic */ apxu a;
    private final /* synthetic */ wjv b;

    wkm(wjv wjv, apxu apxu) {
        this.b = wjv;
        this.a = apxu;
    }

    public final void onClick(View view) {
        wkr wkr = new wkr(this.b);
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", wkr);
        this.b.aI = true;
        this.b.aa.a(this.a, hashMap);
    }
}
