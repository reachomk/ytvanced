package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint;
import java.util.Map;

/* renamed from: dxc */
public final class dxc implements aaap {
    private final Context a;
    private final aaas b;

    public dxc(Context context, aaas aaas) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aogp aogp = ((AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint) b).b;
        if (aogp == null) {
            aogp = aogp.c;
        }
        aril aril = aogp.b;
        if (aril == null) {
            aril = aril.g;
        }
        akcr.a(this.a, aril, this.b, xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"));
    }
}
