package defpackage;

import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;

/* renamed from: wsi */
final /* synthetic */ class wsi implements akyw {
    private final wsj a;

    wsi(wsj wsj) {
        this.a = wsj;
    }

    public final void a(aphf aphf) {
        wsj wsj = this.a;
        if (aphf != null && wsj.c != null) {
            apxu b = aphf.b();
            anxr access$000 = anxl.checkIsLite(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.confirmDialogEndpoint);
            b.a(access$000);
            if (!b.h.a(access$000.d)) {
                b = aphf.b();
                access$000 = anxl.checkIsLite(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint);
                b.a(access$000);
                if (!b.h.a(access$000.d)) {
                    return;
                }
            }
            wsj.c.a(3, new acvs(aphf.b().b), null);
        }
    }
}
