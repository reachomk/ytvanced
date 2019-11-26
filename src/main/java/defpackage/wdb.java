package defpackage;

import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wdb */
final /* synthetic */ class wdb implements Runnable {
    private final wda a;
    private final wdj b;
    private final wkt c;

    wdb(wda wda, wdj wdj, wkt wkt) {
        this.a = wda;
        this.b = wdj;
        this.c = wkt;
    }

    public final void run() {
        apxu apxu;
        wda wda = this.a;
        wdj wdj = this.b;
        wkt wkt = this.c;
        aphg aphg = wdj.h;
        if (aphg == null) {
            apxu = null;
        } else {
            apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        if (apxu == null) {
            xpr.a(wda.a, (int) R.string.error_video_attachment_failed, 1);
            wkt.d();
            return;
        }
        wxe wxe = wdg.a;
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", wxe);
        wda.b.a(apxu, hashMap);
    }
}
