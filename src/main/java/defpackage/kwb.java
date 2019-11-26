package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kwb */
final /* synthetic */ class kwb implements OnClickListener {
    private final kvw a;

    kwb(kvw kvw) {
        this.a = kvw;
    }

    public final void onClick(View view) {
        kvx kvx = this.a.j;
        ajzj ajzj = kvx.d;
        if (ajzj != null) {
            awsw awsw = ajzj.h;
            if (awsw != null && awsw.a == 62897987 && (((awtc) awsw.b).a & 4) != 0) {
                awtc awtc;
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", kvx.d);
                aaas aaas = kvx.c;
                awsw awsw2 = kvx.d.h;
                if (awsw2.a == 62897987) {
                    awtc = (awtc) awsw2.b;
                } else {
                    awtc = awtc.d;
                }
                apxu apxu = awtc.c;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, hashMap);
            }
        }
    }
}
