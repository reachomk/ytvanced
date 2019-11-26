package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: vww */
final class vww implements vwv {
    private final /* synthetic */ vwu a;

    vww(vwu vwu) {
        this.a = vwu;
    }

    public final void a(int[] iArr) {
        vwu vwu = this.a;
        if (vwu.g != null) {
            Object arrayList = new ArrayList();
            for (int valueOf : iArr) {
                arrayList.add(Integer.valueOf(valueOf));
            }
            vtb vtb = vwu.g;
            vtb.e = vtb.a.a();
            vtb.f = Collections.unmodifiableList((List) amqw.a(arrayList));
            vwu.c.a(vwu.g);
        }
        vwu.c.c();
        vwu.a(vra.SURVEY_ENDED);
    }

    public final void a(Bundle bundle) {
        vwu vwu = this.a;
        Map hashMap = new HashMap();
        if (bundle != null) {
            hashMap.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
        }
        aagi aagi = vwu.e;
        if (aagi != null && aagi.Y() != null) {
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", vwu.b);
            vwu.a.a(vwu.e.Y(), hashMap);
        }
    }

    public final void a(int i, int i2) {
        vwu vwu = this.a;
        vtb vtb = vwu.g;
        if (vtb != null) {
            vtb.g = true;
            vtb.a();
            vwu.c.a(vwu.g);
        }
        vwu.c.a(i, i2);
        vwu.a(vra.USER_SKIPPED);
    }
}
