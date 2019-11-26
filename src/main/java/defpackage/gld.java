package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import java.util.Map;

/* renamed from: gld */
public final class gld implements aaap {
    private final Context a;
    private final aaas b;
    private final acvx c;
    private final akvp d;

    public gld(Context context, aaas aaas, acvx acvx, akvp akvp) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (acvx) amqw.a((Object) acvx);
        this.d = akvp;
    }

    public final void a(apxu apxu, Map map) {
        aqhy aqhy;
        anxr access$000 = anxl.checkIsLite(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.confirmDialogEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint confirmDialogEndpointOuterClass$ConfirmDialogEndpoint = (ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint) b;
        Context context = this.a;
        aqhu aqhu = confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.b;
        if (aqhu == null) {
            aqhu = aqhu.c;
        }
        if ((aqhu.a & 1) != 0) {
            aqhu aqhu2 = confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.b;
            if (aqhu2 == null) {
                aqhu2 = aqhu.c;
            }
            aqhy = aqhu2.b;
            if (aqhy == null) {
                aqhy = aqhy.q;
            }
        } else {
            aqhy = null;
        }
        akcq.a(context, aqhy, this.b, this.c, true, null, xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), this.d);
    }
}
