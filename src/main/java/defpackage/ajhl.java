package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;

/* renamed from: ajhl */
public final /* synthetic */ class ajhl implements Runnable {
    private final ajhi a;
    private final Uri b;
    private final wxi c;

    public ajhl(ajhi ajhi, Uri uri, wxi wxi) {
        this.a = ajhi;
        this.b = uri;
        this.c = wxi;
    }

    public final void run() {
        ajhi ajhi = this.a;
        Uri uri = this.b;
        wxi wxi = this.c;
        try {
            xwi xwi;
            String uri2 = uri.toString();
            xwk xwk = ajhi.b;
            InputStream openStream = new URL(uri2).openStream();
            if (ajhq.a != null) {
                xwi = ajhq.a;
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("application/x-rawcc", Integer.valueOf(1));
                hashMap.put("text/vtt", Integer.valueOf(2));
                xwh xwh = new xwh();
                xwh.a("/MPD", new ajht());
                xwh.a("/MPD/Period", new ajhs());
                xwh.a("/MPD/Period/SegmentList", new ajhv());
                xwh.a("/MPD/Period/SegmentList/SegmentTimeline/S", new ajhu());
                xwh.a("/MPD/Period/AdaptationSet", new ajhx(hashMap));
                xwh.a("/MPD/Period/AdaptationSet/Representation/BaseURL", new ajhw());
                xwh.a("/MPD/Period/AdaptationSet/Representation/SegmentList/SegmentURL", new ajhz());
                xwi = xwh.a();
                ajhq.a = xwi;
            }
            ajhm ajhm = (ajhm) xwk.a(openStream, xwi);
            ajhm.d = uri2;
            ajhi.c = new ajhn(ajhm.e, ajhm.f, ajhm.d, ajhm.c);
            wxi.a(null, ajhi.c);
        } catch (Exception e) {
            wxi.a(uri.toString(), e);
        }
    }
}
