package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: jea */
final /* synthetic */ class jea implements OnClickListener {
    private final jdv a;
    private final jfb b;
    private final List c;

    jea(jdv jdv, jfb jfb, List list) {
        this.a = jdv;
        this.b = jfb;
        this.c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        jdv jdv = this.a;
        jfb jfb = this.b;
        List list = this.c;
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Integer.valueOf(i));
        i = jfb.a();
        aaas aaas = jdv.a;
        apxu apxu = ((axgs) list.get(i)).d;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, hashMap);
        if (jdv.e != i) {
            for (jdn a : jdv.b.a) {
                a.a(i);
            }
        }
        jdv.a(Boolean.valueOf(true));
        jdv.e = i;
        dialogInterface.dismiss();
    }
}
