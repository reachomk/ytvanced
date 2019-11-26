package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint;
import java.util.Map;

/* renamed from: aaxi */
public final class aaxi implements aaap {
    public final xoi a;
    public final Context b;
    public final aaas c;
    private final aaxk d;

    public aaxi(Context context, aaxk aaxk, xoi xoi, aaas aaas) {
        this.d = (aaxk) amqw.a((Object) aaxk);
        this.a = (xoi) amqw.a((Object) xoi);
        this.b = (Context) amqw.a((Object) context);
        this.c = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        aaxj a = this.d.a();
        a.a(aabc.a(apxu));
        anxr access$000 = anxl.checkIsLite(FlagEndpointOuterClass$FlagEndpoint.flagEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        FlagEndpointOuterClass$FlagEndpoint flagEndpointOuterClass$FlagEndpoint = (FlagEndpointOuterClass$FlagEndpoint) b;
        a.a = flagEndpointOuterClass$FlagEndpoint.b;
        int a2 = arkc.a(flagEndpointOuterClass$FlagEndpoint.c);
        if (a2 == 0) {
            a2 = 1;
        }
        a.p = a2;
        a.b = (String) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.services.flags.user_comments", String.class);
        a.c = ((Boolean) xsb.c(map, "com.google.android.libraries.youtube.innertube.services.flags.legal_checkbox_checked", Boolean.valueOf(false))).booleanValue();
        a.d = (asor) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.services.flags.legal_report_details", asor.class);
        a.e = (asoz) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.services.flags.video_report_details", asoz.class);
        afsw afsw = (afsw) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", afsw.class);
        if (afsw == null) {
            afsw = new aaxl(this, map);
        }
        this.d.a(a, afsw);
    }
}
