package defpackage;

import android.text.Spanned;
import com.google.protos.youtube.api.innertube.UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint;
import java.util.Map;

/* renamed from: wfy */
public final class wfy implements aaap {
    private final wda a;

    public wfy(wda wda) {
        this.a = (wda) amqw.a((Object) wda);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.updateCommentReplyDialogEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint = (UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint) b;
        ayrx ayrx = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.b;
        if (ayrx == null) {
            ayrx = ayrx.c;
        }
        if (ayrx.a == 97806346) {
            Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
            wda wda = this.a;
            ayrx ayrx2 = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.b;
            if (ayrx2 == null) {
                ayrx2 = ayrx.c;
            }
            aqak aqak = ayrx2.a == 97806346 ? (aqak) ayrx2.b : aqak.p;
            wei b2 = ((wec) c).b();
            ajsn a = ((wcx) c).a();
            if ((aqak.a & 32) != 0) {
                aphj aphj = aqak.e;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                if ((aphj.a & 1) != 0) {
                    aphj = aqak.e;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    aphg aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    if ((aphg.a & 2048) != 0) {
                        arml arml;
                        aphg aphg2;
                        aqak = wda.a(aqak);
                        aygk aygk = aqak.b;
                        if (aygk == null) {
                            aygk = aygk.f;
                        }
                        aygk aygk2 = aygk;
                        arml arml2 = null;
                        if ((aqak.a & 4096) != 0) {
                            arml = aqak.l;
                            if (arml == null) {
                                arml = arml.f;
                            }
                        } else {
                            arml = null;
                        }
                        Spanned a2 = ajqy.a(arml);
                        aphj aphj2 = aqak.e;
                        if (aphj2 == null) {
                            aphj2 = aphj.d;
                        }
                        aphg aphg3 = aphj2.b;
                        if (aphg3 == null) {
                            aphg3 = aphg.s;
                        }
                        apxu apxu2 = aphg3.l;
                        if (apxu2 == null) {
                            apxu2 = apxu.d;
                        }
                        apxu apxu3 = apxu2;
                        if ((aqak.a & 128) != 0) {
                            aphj2 = aqak.g;
                            if (aphj2 == null) {
                                aphj2 = aphj.d;
                            }
                            aphg3 = aphj2.b;
                            if (aphg3 == null) {
                                aphg3 = aphg.s;
                            }
                            aphg2 = aphg3;
                        } else {
                            aphg2 = null;
                        }
                        wdj wdj = new wdj(2, aygk2, b2, a, a2, null, null, apxu3, aphg2);
                        if ((aqak.a & 8) != 0) {
                            arml2 = aqak.c;
                            if (arml2 == null) {
                                arml2 = arml.f;
                            }
                        }
                        wda.a(wdj, null, null, aabb.a(arml2, wda.b, false), null, false);
                        return;
                    }
                    xtl.c("No service endpoint specified for comment dialog.");
                    return;
                }
                xtl.c("No button renderer specified for comment dialog.");
                return;
            }
            xtl.c("No reply button specified for comment dialog.");
            return;
        }
        xtl.c("Executed UpdateCommentReplyDialogEndpoint with no CommentReplyDialogRenderer.");
    }
}
