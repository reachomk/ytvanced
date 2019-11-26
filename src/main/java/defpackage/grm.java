package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: grm */
final /* synthetic */ class grm implements Runnable {
    private final grl a;
    private final String b;

    grm(grl grl, String str) {
        this.a = grl;
        this.b = str;
    }

    public final void run() {
        grl grl = this.a;
        String str = this.b;
        grl.e = str;
        gro gro = new gro(grl);
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.services.social.query", str);
        hashMap.put("com.google.android.libraries.youtube.innertube.services.social.listener", gro);
        grl.a.a(grl.c, hashMap);
    }
}
