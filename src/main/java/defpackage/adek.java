package defpackage;

import com.google.protos.youtube.api.innertube.MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint;
import java.util.Map;

/* renamed from: adek */
public final class adek implements aaap {
    private static final String a = xtl.b("MDX.MdxPlaybackCommand");
    private final adgw b;
    private final adqf c;
    private final aczo d;

    public adek(adgw adgw, adqf adqf, aczo aczo) {
        this.b = adgw;
        this.c = adqf;
        this.d = aczo;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.mdxPlaybackEndpoint);
        apxu.a(access$000);
        String str = "Mdx playback endpoint not filled";
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.mdxPlaybackEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint = (MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint) obj;
            if ((mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.a & 1) != 0) {
                autt autt = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.b;
                if (autt == null) {
                    autt = autt.i;
                }
                aure aure = autt.b;
                if (aure == null) {
                    aure = aure.c;
                }
                if (aure.a == 1) {
                    autt = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.b;
                    if (autt == null) {
                        autt = autt.i;
                    }
                    aure = autt.b;
                    if (aure == null) {
                        aure = aure.c;
                    }
                    aurg aurg = aure.a == 1 ? (aurg) aure.b : aurg.e;
                    autt autt2;
                    if (!aurg.d.isEmpty()) {
                        adgw adgw = this.b;
                        autt = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.b;
                        if (autt == null) {
                            autt = autt.i;
                        }
                        aure = autt.b;
                        if (aure == null) {
                            aure = aure.c;
                        }
                        bbs a = adgw.a((aure.a == 1 ? (aurg) aure.b : aurg.e).d);
                        if (a != null) {
                            bbs bbs = adgw.a;
                            if (!(bbs == null || !adhn.a(a.c, bbs.c) || this.c.c() == null)) {
                                adqe c = this.c.c();
                                autt2 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.b;
                                if (autt2 == null) {
                                    autt2 = autt.i;
                                }
                                c.b(adpw.a(autt2));
                                return;
                            }
                        }
                        adgw = this.b;
                        autt = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.b;
                        if (autt == null) {
                            autt = autt.i;
                        }
                        aure = autt.b;
                        if (aure == null) {
                            aure = aure.c;
                        }
                        if (aure.a == 1) {
                            aurg = (aurg) aure.b;
                        } else {
                            aurg = aurg.e;
                        }
                        str = aurg.d;
                        autt2 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.b;
                        if (autt2 == null) {
                            autt2 = autt.i;
                        }
                        adpw a2 = adpw.a(autt2);
                        a = adgw.a(str);
                        if (a != null) {
                            adgw.b(a, a2);
                        }
                    } else if (!aurg.c.isEmpty()) {
                        autt2 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.b;
                        if (autt2 == null) {
                            autt2 = autt.i;
                        }
                        aczt a3 = aczq.g().a(aurg.c).b(aurg.b).a(adpw.a(autt2).k().a((apxu.a & 1) != 0 ? apxu.b.d() : null).e());
                        xtl.c(a, "starting background playback");
                        this.d.a(a3.a());
                    }
                    return;
                }
                xtl.b(a, "Endpoint did not contain a MdxDevice or MdxScreen to connect to.");
                return;
            }
            xtl.b(a, str);
            return;
        }
        xtl.b(a, str);
    }
}
