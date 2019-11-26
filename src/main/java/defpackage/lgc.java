package defpackage;

import android.os.Bundle;

/* renamed from: lgc */
final class lgc implements lgf {
    private final bcaa a;
    private final bcaa b;
    private final boolean c;
    private final boolean d;
    private aiqq e;
    private ajcp f;

    lgc(bcaa bcaa, bcaa bcaa2, boolean z, boolean z2) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = z;
        this.d = z2;
    }

    public final void a(Bundle bundle) {
        this.e = (aiqq) bundle.getParcelable("playback_start_descriptor");
        this.f = (ajcp) bundle.getParcelable("playback_service_state");
    }

    public final void b(Bundle bundle) {
        bundle.putParcelable("playback_start_descriptor", this.e);
        bundle.putParcelable("playback_service_state", lgm.a ? this.f : null);
    }

    public final void a(ajcp ajcp) {
        if (ajcp != null) {
            this.e = ajcp.a;
            lgp.a(this.e, (aizy) this.a.get());
            this.f = ajcp;
            return;
        }
        this.e = null;
        this.f = null;
    }

    public final boolean a() {
        if (this.e != null) {
            aizy aizy = (aizy) this.a.get();
            enm enm = (enm) ((aikf) this.b.get()).b();
            if (enm != null && aiqx.a(this.e, enm.e()) && !aizy.b(this.e)) {
                return b();
            }
            if (!(this.c || enm != null || this.d)) {
                return b();
            }
        }
        return false;
    }

    private final boolean b() {
        if (this.f != null) {
            aikf aikf = (aikf) this.b.get();
            ajcp ajcp = this.f;
            amqw.a((Object) ajcp);
            aiqq aiqq = ajcp.a;
            if (aiqq != null) {
                aikq aikq = aikf.b;
                aikc aikc = aikf.f;
                aikr b = aikf.a.b(aiqq);
                Object a = aikq.a();
                aikc.a(b);
                aikq.b(a);
                if (amqq.a(b, aikb.a(aikc))) {
                    ((aizy) aikq.a.get()).a(ajcp);
                    return true;
                }
            }
            return false;
        }
        aiqq aiqq2 = this.e;
        if (aiqq2 == null) {
            return false;
        }
        aiqq2.a(true);
        ((aizy) this.a.get()).a(this.e);
        return true;
    }
}
