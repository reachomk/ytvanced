package defpackage;

import com.google.protos.youtube.api.innertube.CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint;
import java.util.Map;

/* renamed from: fxw */
public final class fxw implements aaap {
    private final bcaa a;
    private final aizy b;

    public fxw(bcaa bcaa, aizy aizy) {
        this.a = (bcaa) amqw.a((Object) bcaa);
        this.b = (aizy) amqw.a((Object) aizy);
    }

    public final void a(apxu apxu, Map map) {
        CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint;
        anxr access$000 = anxl.checkIsLite(CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.createBackstagePostDialogEndpoint);
        apxu.a(access$000);
        anze anze = null;
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.createBackstagePostDialogEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint = (CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint) b;
        } else {
            createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint = null;
        }
        if (createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint != null) {
            aqqn aqqn = createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.b;
            if (aqqn == null) {
                aqqn = aqqn.c;
            }
            if (aqqn.a == 118523928) {
                aqqn aqqn2 = createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.b;
                if (aqqn2 == null) {
                    aqqn2 = aqqn.c;
                }
                anze = aqqn2.a == 118523928 ? (apcl) aqqn2.b : apcl.A;
            }
        }
        if (anze != null) {
            if (this.b.c()) {
                this.b.b();
            }
            ((wcq) this.a.get()).a((ajrq) ajzv.a(anze, ajrq.class), new fxv((Runnable) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", Runnable.class), (wef) xsb.a(map, (Object) "com.google.android.libraries.youtube.comment.comment_thread_created_callback", wef.class)));
            return;
        }
        xtl.c("Executed CreateBackstagePostDialogEndpoint with no BackstagePostDialogRenderer.");
    }
}
