package defpackage;

import android.os.Build.VERSION;
import com.google.protos.youtube.api.innertube.PermissionEndpointOuterClass$PermissionEndpoint;
import java.util.Locale;
import java.util.Map;

/* renamed from: alhx */
public final class alhx implements aaap {
    public final aaas a;
    private final acwa b;

    public alhx(aaas aaas, acwa acwa) {
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = (acwa) amqw.a((Object) acwa);
    }

    public final void a(apxu apxu, Map map) {
        if (VERSION.SDK_INT >= 23) {
            allb allb = (allb) xsb.a(map, (Object) "permission_requester", allb.class);
            acvx a = alia.a(map, this.b);
            anxr access$000 = anxl.checkIsLite(PermissionEndpointOuterClass$PermissionEndpoint.permissionEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            PermissionEndpointOuterClass$PermissionEndpoint permissionEndpointOuterClass$PermissionEndpoint = (PermissionEndpointOuterClass$PermissionEndpoint) b;
            alhw alhw = new alhw(this, allb, permissionEndpointOuterClass$PermissionEndpoint, a);
            avwc avwc = permissionEndpointOuterClass$PermissionEndpoint.f;
            if (avwc == null) {
                avwc = avwc.c;
            }
            if (allb.a(avwc)) {
                alhw.b(false);
            } else {
                aqhy aqhy;
                avwa avwa = permissionEndpointOuterClass$PermissionEndpoint.g;
                if (avwa == null) {
                    avwa = avwa.d;
                }
                if ((avwa.a & 1) != 0) {
                    avwa = permissionEndpointOuterClass$PermissionEndpoint.g;
                    if (avwa == null) {
                        avwa = avwa.d;
                    }
                    aqhy = avwa.b;
                    if (aqhy == null) {
                        aqhy = aqhy.q;
                    }
                } else {
                    aqhy = null;
                }
                avwc avwc2 = permissionEndpointOuterClass$PermissionEndpoint.f;
                if (avwc2 == null) {
                    avwc2 = avwc.c;
                }
                allb.a(avwc2, aqhy, alhw);
                if (aqhy != null) {
                    avwc avwc3 = permissionEndpointOuterClass$PermissionEndpoint.f;
                    if (avwc3 == null) {
                        avwc3 = avwc.c;
                    }
                    avwe a2 = avwe.a(avwc3.b);
                    if (a2 == null) {
                        a2 = avwe.INVALID;
                    }
                    if (a2.ordinal() == 1) {
                        alhx.a(a, acwl.g);
                        return;
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "%s is not supported", new Object[]{a2}));
                }
            }
        }
    }

    public static void a(acvx acvx, acwl acwl) {
        acvx.a(acwl, null, null);
        acvx.b(acwc.CLIENT_CONFIRM_BUTTON_RENDERER, null);
        acvx.b(acwc.CLIENT_CANCEL_BUTTON_RENDERER, null);
    }
}
