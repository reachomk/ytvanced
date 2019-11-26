package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
import java.util.Map;

/* renamed from: alij */
public final class alij implements aaap {
    public final Context a;
    public final aaas b;
    private final abdj c;
    private final acvx d;

    public alij(Context context, abdj abdj, aaas aaas, acvx acvx) {
        this.a = (Context) amqw.a((Object) context);
        this.c = (abdj) amqw.a((Object) abdj);
        this.b = (aaas) amqw.a((Object) aaas);
        this.d = (acvx) amqw.a((Object) acvx);
    }

    public final void a(apxu apxu, Map map) {
        aqhx aqhx = (aqhx) aqhy.q.createBuilder();
        aqhx.a(ajqy.a(this.a.getString(R.string.publish_and_share_confirm_dialog_title)));
        aqhx.b(ajqy.a(this.a.getString(R.string.publish_and_share_confirm_dialog_body)));
        aphm aphm = (aphm) aphj.d.createBuilder();
        aphf aphf = (aphf) aphg.s.createBuilder();
        aphf.a(ajqy.a(this.a.getString(R.string.publish_and_share_confirm_dialog_confirm_button)));
        aphm.a(aphf);
        aqhx.copyOnWrite();
        aqhy aqhy = (aqhy) aqhx.instance;
        aqhy.f = (aphj) ((anxl) aphm.build());
        aqhy.a |= 32;
        aphm = (aphm) aphj.d.createBuilder();
        aphf = (aphf) aphg.s.createBuilder();
        aphf.a(ajqy.a(this.a.getString(R.string.cancel)));
        aphm.a(aphf);
        aqhx.copyOnWrite();
        aqhy = (aqhy) aqhx.instance;
        aqhy.g = (aphj) ((anxl) aphm.build());
        aqhy.a |= 64;
        akcq.a(this.a, (aqhy) ((anxl) aqhx.build()), this.b, this.d, new alii(this, apxu, map), map);
    }

    public final void b(apxu apxu, Map map) {
        Object obj;
        xpr.a(this.a, (int) R.string.publishing_private_video_progress, 0);
        anxr access$000 = anxl.checkIsLite(SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.sharePrivateVideoEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint = (SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint) obj;
        asxv asxv = (asxv) asxw.u.createBuilder();
        asxv.a(sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.b);
        asxi asxi = (asxi) asxf.c.createBuilder();
        asxi.a(awnx.UNLISTED);
        asxv.a(asxi);
        this.c.a(asxv, new alil(this, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint, map), apxu.b.d());
    }
}
