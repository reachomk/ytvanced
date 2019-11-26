package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kvy */
final /* synthetic */ class kvy implements OnClickListener {
    private final kvw a;

    kvy(kvw kvw) {
        this.a = kvw;
    }

    public final void onClick(View view) {
        kvx kvx = this.a.j;
        ajzj ajzj = kvx.d;
        if (ajzj != null && ajzj.l != null) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", kvx.d);
            kvx.c.a(kvx.d.l, hashMap);
        }
    }
}
