package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.google.protos.youtube.api.innertube.CopyTextEndpointOuterClass$CopyTextEndpoint;
import java.util.Map;

/* renamed from: dxu */
public final class dxu implements aaap {
    private final Context a;
    private final aaas b;

    public dxu(Context context, aaas aaas) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        CopyTextEndpointOuterClass$CopyTextEndpoint copyTextEndpointOuterClass$CopyTextEndpoint = (CopyTextEndpointOuterClass$CopyTextEndpoint) b;
        ((ClipboardManager) this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text/plain", copyTextEndpointOuterClass$CopyTextEndpoint.b));
        this.b.a(copyTextEndpointOuterClass$CopyTextEndpoint.c, null);
    }
}
