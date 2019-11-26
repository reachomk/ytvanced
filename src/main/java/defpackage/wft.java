package defpackage;

import com.google.protos.youtube.api.innertube.UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint;
import java.util.Map;

/* renamed from: wft */
public final class wft implements aaap {
    private final wda a;
    private final wcq b;

    public wft(wda wda, wcq wcq) {
        this.a = (wda) amqw.a((Object) wda);
        this.b = (wcq) amqw.a((Object) wcq);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        wec wec = (wec) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", wec.class);
        wei b = wec.b();
        anxr access$000 = anxl.checkIsLite(UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.updateCommentDialogEndpoint);
        apxu.a(access$000);
        Object b2 = apxu.h.b(access$000.d);
        if (b2 == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b2);
        }
        UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint = (UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint) obj;
        ayrt ayrt = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.b;
        if (ayrt == null) {
            ayrt = ayrt.c;
        }
        aphg aphg;
        if (ayrt.a != 118523928) {
            access$000 = anxl.checkIsLite(UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.updateCommentDialogEndpoint);
            apxu.a(access$000);
            Object b3 = apxu.h.b(access$000.d);
            if (b3 == null) {
                b3 = access$000.b;
            } else {
                b3 = access$000.a(b3);
            }
            UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint2 = (UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint) b3;
            ayrt ayrt2 = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint2.b;
            if (ayrt2 == null) {
                ayrt2 = ayrt.c;
            }
            if (ayrt2.a == 122274699) {
                ajsn a = ((wcx) wec).a();
                wda wda = this.a;
                ayrt ayrt3 = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint2.b;
                if (ayrt3 == null) {
                    ayrt3 = ayrt.c;
                }
                apzd apzd = (apzd) ((anxo) (ayrt3.a == 122274699 ? (apza) ayrt3.b : apza.j).toBuilder());
                if ((((apza) apzd.instance).a & 8) == 0) {
                    xtl.c("No submit button specified for comment dialog.");
                    return;
                } else if ((apzd.a().a & 1) != 0) {
                    aphg = apzd.a().b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    if ((aphg.a & 2048) != 0) {
                        arml arml;
                        aphm aphm = (aphm) ((anxo) apzd.a().toBuilder());
                        aphg aphg2 = apzd.a().b;
                        if (aphg2 == null) {
                            aphg2 = aphg.s;
                        }
                        aphm.a(wda.a(aphg2));
                        apzd.copyOnWrite();
                        apza apza = (apza) apzd.instance;
                        apza.e = (aphj) ((anxl) aphm.build());
                        apza.a |= 8;
                        aygk aygk = ((apza) apzd.instance).d;
                        if (aygk == null) {
                            aygk = aygk.f;
                        }
                        aygk aygk2 = aygk;
                        aphg = apzd.a().b;
                        if (aphg == null) {
                            aphg = aphg.s;
                        }
                        apxu apxu2 = aphg.l;
                        if (apxu2 == null) {
                            apxu2 = apxu.d;
                        }
                        wdj wdj = new wdj(2, aygk2, b, a, null, null, null, apxu2, null);
                        apza apza2 = (apza) apzd.instance;
                        if ((apza2.a & 1) != 0) {
                            arml = apza2.b;
                            if (arml == null) {
                                arml = arml.f;
                            }
                        } else {
                            arml = null;
                        }
                        wda.a(wdj, null, null, ajqy.a(arml), null, false);
                        return;
                    }
                    xtl.c("No service endpoint specified for comment dialog.");
                    return;
                } else {
                    xtl.c("No button renderer specified for comment dialog.");
                    return;
                }
            }
            xtl.c("Executed UpdateCommentDialogEndpoint with no dialog.");
            return;
        }
        wcq wcq = this.b;
        ayrt ayrt4 = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.b;
        if (ayrt4 == null) {
            ayrt4 = ayrt.c;
        }
        ajrq ajrq = (ajrq) ajzv.a(ayrt4.a == 118523928 ? (apcl) ayrt4.b : apcl.A, ajrq.class);
        if (!wcq.g) {
            aphj aphj = ajrq.b;
            if (aphj != null) {
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                if ((aphg.a & 2048) != 0) {
                    or a2 = wcq.a.f().a();
                    wcq.a(a2);
                    wcq.f = wjv.a(ajrq);
                    wcq.f.am = new wcr(wcq, new wcw(wcq, wcq.f, b, wcq.e), ajrq);
                    wcq.f.a(a2, "backstage_post_dialog_fragment");
                    return;
                }
            }
            xtl.c("Command for post button is missing in BackstagePostDialogRenderer");
        }
    }
}
