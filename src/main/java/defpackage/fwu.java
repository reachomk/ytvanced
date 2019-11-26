package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint;
import java.util.Map;

/* renamed from: fwu */
public final class fwu implements aaap {
    private final Context a;
    private final adqf b;

    public fwu(Context context, adqf adqf) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (adqf) amqw.a((Object) adqf);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.removeFromRemoteQueueEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        String str = ((RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint) b).b;
        adqe c = this.b.c();
        if (c != null && c.d() == 1) {
            c.f(str);
            xpr.a(this.a, (int) R.string.video_removed_from_tv_queue, 0);
        }
    }
}
