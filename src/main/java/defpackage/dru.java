package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;

/* renamed from: dru */
public final class dru extends nd implements uyy, xcp {
    public xoi Z;
    public aanz aa;
    public usv ab;
    public uys ac;
    public bcaa ad;
    public xci ae;
    public afpu af;
    public acvx ag;
    public akkq ah;
    public uzn ai;
    public akoe aj;
    public dve ak;
    public zyw al;
    public aaey am;
    private apxu an;
    private uzf ao;
    private boolean ap;

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle == null) {
            bundle = this.j;
        }
        ((drx) xse.a(p())).a(this);
        this.ap = bundle.getBoolean("inProgress", false);
        a(1, (int) R.style.f526Theme.YouTube.FusionSignInFlowFragment);
        String str = "endpoint";
        if (bundle.containsKey(str)) {
            try {
                a((apxu) anxl.parseFrom(apxu.d, bundle.getByteArray(str), anxa.c()));
            } catch (anyg unused) {
            }
        }
    }

    public final void B() {
        super.B();
        this.ap = true;
        this.ae.a((Object) this);
        this.ao.a();
    }

    public final void ad_() {
        this.ae.b(this);
        super.ad_();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ao.b();
    }

    public final void i() {
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
        }
        super.i();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        axng axng;
        apxu apxu = this.an;
        apxu apxu2 = null;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(SignInEndpointOuterClass.signInEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            axng = (axng) b;
        } else {
            axng = null;
        }
        if (!(axng == null || (axng.a & 2) == 0)) {
            apxu2 = axng.b;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
        }
        apxu apxu3 = apxu2;
        drw drw = new drw(p(), this.Z, this.ag, this.ah, this.aj, this.ak, this.ad, this.am, p());
        this.ao = new drv(drw, p(), this.ai, this.aa, this.ab, this.ac, this.af, this, this.al, apxu3, this.ap);
        drw.f = this.ao;
        return drw.a;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        apxu apxu = this.an;
        if (apxu != null) {
            bundle.putByteArray("endpoint", apxu.toByteArray());
        }
        bundle.putBoolean("inProgress", this.ao.b);
    }

    public final void a(apxu apxu) {
        this.an = apxu;
        this.ag.a(acwl.U, apxu, null);
    }

    public final void a(uyw uyw) {
        if (uyw.a == uyz.CANCELLED) {
            f();
        }
        this.ae.d(uyw);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqf.class, afqh.class};
        } else if (i == 0) {
            f();
            return null;
        } else if (i == 1) {
            this.ap = false;
            f();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
