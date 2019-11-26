package defpackage;

import com.google.protos.youtube.api.innertube.PermissionEndpointOuterClass$PermissionEndpoint;
import java.util.Locale;

/* renamed from: alhw */
final class alhw implements alla {
    private final allb a;
    private final acvx b;
    private PermissionEndpointOuterClass$PermissionEndpoint c;
    private final /* synthetic */ alhx d;

    public final void a() {
        g();
    }

    public final void a(boolean z) {
        if (z) {
            f();
        }
        acvx acvx = this.b;
        avwc avwc = this.c.f;
        if (avwc == null) {
            avwc = avwc.c;
        }
        avwe a = avwe.a(avwc.b);
        if (a == null) {
            a = avwe.INVALID;
        }
        if (a.ordinal() == 1) {
            alhx.a(acvx, acwl.h);
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is not supported", new Object[]{a}));
    }

    public final void b() {
        g();
    }

    public final void c() {
        f();
    }

    public final void d() {
        g();
    }

    public final void b(boolean z) {
        if (z) {
            f();
        }
        avvy avvy = (avvy) ((anxo) this.c.toBuilder());
        int i = ((PermissionEndpointOuterClass$PermissionEndpoint) avvy.instance).b;
        apxu a;
        PermissionEndpointOuterClass$PermissionEndpoint permissionEndpointOuterClass$PermissionEndpoint;
        if (i == 3) {
            a = a(avvy.a());
            avvy.copyOnWrite();
            permissionEndpointOuterClass$PermissionEndpoint = (PermissionEndpointOuterClass$PermissionEndpoint) avvy.instance;
            if (a != null) {
                permissionEndpointOuterClass$PermissionEndpoint.c = a;
                permissionEndpointOuterClass$PermissionEndpoint.b = 3;
                this.d.a.a(avvy.a(), null);
            } else {
                throw new NullPointerException();
            }
        } else if (i == 6) {
            a = a(avvy.b());
            avvy.copyOnWrite();
            permissionEndpointOuterClass$PermissionEndpoint = (PermissionEndpointOuterClass$PermissionEndpoint) avvy.instance;
            if (a != null) {
                permissionEndpointOuterClass$PermissionEndpoint.c = a;
                permissionEndpointOuterClass$PermissionEndpoint.b = 6;
                this.d.a.a(avvy.b(), amur.a("permission_requester", this.a));
            } else {
                throw new NullPointerException();
            }
        }
        this.c = (PermissionEndpointOuterClass$PermissionEndpoint) ((anxl) avvy.build());
    }

    public final void e() {
        PermissionEndpointOuterClass$PermissionEndpoint permissionEndpointOuterClass$PermissionEndpoint = this.c;
        int i = permissionEndpointOuterClass$PermissionEndpoint.d;
        if (i == 5) {
            acvx acvx = this.b;
            avwc avwc = permissionEndpointOuterClass$PermissionEndpoint.f;
            if (avwc == null) {
                avwc = avwc.c;
            }
            avwe a = avwe.a(avwc.b);
            if (a == null) {
                a = avwe.INVALID;
            }
            if (a.ordinal() == 1) {
                avvx avvx;
                alhx.a(acvx, acwl.f);
                permissionEndpointOuterClass$PermissionEndpoint = this.c;
                if (permissionEndpointOuterClass$PermissionEndpoint.d == 5) {
                    avvx = (avvx) permissionEndpointOuterClass$PermissionEndpoint.e;
                } else {
                    avvx = avvx.c;
                }
                if ((avvx.a & 1) != 0) {
                    avvx avvx2;
                    allb allb = this.a;
                    PermissionEndpointOuterClass$PermissionEndpoint permissionEndpointOuterClass$PermissionEndpoint2 = this.c;
                    if (permissionEndpointOuterClass$PermissionEndpoint2.d == 5) {
                        avvx2 = (avvx) permissionEndpointOuterClass$PermissionEndpoint2.e;
                    } else {
                        avvx2 = avvx.c;
                    }
                    aqhy aqhy = avvx2.b;
                    if (aqhy == null) {
                        aqhy = aqhy.q;
                    }
                    allb.a(aqhy, this);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is not supported", new Object[]{a}));
        } else if (i == 7) {
            this.d.a.a((apxu) permissionEndpointOuterClass$PermissionEndpoint.e, null);
        }
    }

    private final apxu a(apxu apxu) {
        avjh avjh = (avjh) avjf.h.createBuilder();
        avjh.a(this.b.d());
        if (!(this.b.c() == null || this.b.c().e == null)) {
            avjh.a(this.b.c().e.aH);
        }
        apxx apxx = (apxx) ((anxo) apxu.toBuilder());
        apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
        return (apxu) ((anxl) apxx.build());
    }

    private final void f() {
        this.b.a(3, new acvs(acwc.CLIENT_CONFIRM_BUTTON_RENDERER), null);
    }

    private final void g() {
        this.b.a(3, new acvs(acwc.CLIENT_CANCEL_BUTTON_RENDERER), null);
    }

    /* synthetic */ alhw(alhx alhx, allb allb, PermissionEndpointOuterClass$PermissionEndpoint permissionEndpointOuterClass$PermissionEndpoint, acvx acvx) {
        this.d = alhx;
        this.a = allb;
        this.c = permissionEndpointOuterClass$PermissionEndpoint;
        this.b = acvx;
    }
}
