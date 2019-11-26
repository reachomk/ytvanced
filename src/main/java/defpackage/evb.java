package defpackage;

import com.google.protos.youtube.api.innertube.BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint;
import java.util.Map;

/* renamed from: evb */
public final class evb implements aaap {
    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.browseSectionListReloadEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint = (BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint) b;
        apgq apgq = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.b;
        if (apgq == null) {
            apgq = apgq.c;
        }
        if ((apgq.a & 1) != 0) {
            akvd akvd = (akvd) xsb.a(map, (Object) "sectionListController", akvd.class);
            if (akvd != null) {
                apgq apgq2;
                if (akvd instanceof akui) {
                    akui akui = (akui) akvd;
                    apgq2 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.b;
                    if (apgq2 == null) {
                        apgq2 = apgq.c;
                    }
                    awzv awzv = apgq2.b;
                    if (awzv == null) {
                        awzv = awzv.d;
                    }
                    akui.a(awzv);
                    return;
                }
                apgq2 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.b;
                if (apgq2 == null) {
                    apgq2 = apgq.c;
                }
                b = apgq2.b;
                if (b == null) {
                    b = awzv.d;
                }
                akvd.a(ajtj.a(b));
            }
        }
    }
}
