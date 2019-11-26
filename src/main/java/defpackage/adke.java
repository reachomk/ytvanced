package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.protos.youtube.api.innertube.MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint;
import com.google.protos.youtube.api.innertube.MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint;
import java.util.concurrent.TimeUnit;

/* renamed from: adke */
public final class adke implements afxo {
    private static final String a = xtl.b("MDX.LivingRoomNotificationHandler");
    private final Context b;
    private final adkw c;
    private final adkk d;
    private final xsc e;
    private final adqf f;
    private final adhn g;
    private final SharedPreferences h;
    private final adkj i;
    private final boolean j;

    public adke(Context context, adkw adkw, adkk adkk, xsc xsc, adqf adqf, adhn adhn, SharedPreferences sharedPreferences, adkj adkj, boolean z) {
        this.b = context;
        this.c = adkw;
        this.d = adkk;
        this.e = xsc;
        this.f = adqf;
        this.g = adhn;
        this.h = sharedPreferences;
        this.i = adkj;
        this.j = z;
    }

    public final boolean a(aouo aouo) {
        if (!adke.c(aouo) && !adke.d(aouo)) {
            return false;
        }
        if (this.f.c() == null) {
            autt e = adke.e(aouo);
            if (e == null) {
                xtl.b(a, "Mdx playback descriptor is null.");
            } else {
                aure aure;
                if (adke.c(aouo)) {
                    aurg aurg;
                    aure aure2 = e.b;
                    if (aure2 == null) {
                        aure2 = aure.c;
                    }
                    if (aure2.a == 1) {
                        aurg = (aurg) aure2.b;
                    } else {
                        aurg = aurg.e;
                    }
                    if ((aurg.a & 2) == 0) {
                        aurg aurg2;
                        aure = e.b;
                        if (aure == null) {
                            aure = aure.c;
                        }
                        if (aure.a == 1) {
                            aurg2 = (aurg) aure.b;
                        } else {
                            aurg2 = aurg.e;
                        }
                        if ((aurg2.a & 1) == 0) {
                            xtl.b(a, "Endpoint did not contain a valid MdxScreen to connect to.");
                        }
                    }
                }
                if (!this.g.a(this.b).isEmpty()) {
                    e = adke.e(aouo);
                    if (adke.d(aouo) && adld.a(e)) {
                        b(aouo);
                        this.d.a("mdx.last_lr_notif_shown_is_multi_screen");
                        return false;
                    }
                    aure = e.b;
                    if (aure == null) {
                        aure = aure.c;
                    }
                    amqp a = adld.a(aure.a == 1 ? (aurg) aure.b : aurg.e, this.h, this.g, this.b);
                    if (a.a()) {
                        long b = this.c.b();
                        long a2 = this.e.a() - b;
                        if (b == 0 || a2 > TimeUnit.DAYS.toMillis(1) || this.j) {
                            b(aouo);
                            this.d.a(((bbs) a.b()).c);
                            return false;
                        }
                    }
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    private final void b(aouo aouo) {
        adkk adkk = this.d;
        aour aour = aouo.d;
        if (aour == null) {
            aour = aour.t;
        }
        adkk.a.edit().putInt("mdx.last_lr_notification_shown_id", aour.c).apply();
        adkk = this.d;
        adkk.a.edit().putLong("mdx.lr_notification_last_notif_shown_time_ms", this.e.a()).apply();
        adkk = this.d;
        aour aour2 = aouo.d;
        if (aour2 == null) {
            aour2 = aour.t;
        }
        adkk.a.edit().putString("mdx.last_lr_notification_shown_tag", aour2.b).apply();
        Object obj = this.i;
        obj.a.a(obj);
    }

    private static boolean c(aouo aouo) {
        anxp anxp = aouo.f;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.mdxPlaybackEndpoint);
        anxp.a(access$000);
        return anxp.h.a(access$000.d);
    }

    private static boolean d(aouo aouo) {
        anxp anxp = aouo.e;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint);
        anxp.a(access$000);
        return anxp.h.a(access$000.d);
    }

    private static autt e(aouo aouo) {
        autt autt = null;
        anxp anxp;
        anxr access$000;
        Object b;
        if (adke.c(aouo)) {
            anxp = aouo.f;
            if (anxp == null) {
                anxp = apxu.d;
            }
            access$000 = anxl.checkIsLite(MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.mdxPlaybackEndpoint);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint = (MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint) b;
            if ((mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.a & 1) != 0) {
                autt = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.b;
                if (autt == null) {
                    return autt.i;
                }
            }
        } else if (adke.d(aouo)) {
            anxp = aouo.e;
            if (anxp == null) {
                anxp = apxu.d;
            }
            access$000 = anxl.checkIsLite(MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint = (MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint) b;
            if ((mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.a & 2) != 0) {
                autt = mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.b;
                if (autt == null) {
                    return autt.i;
                }
            }
            return autt;
        }
        return autt;
    }
}
