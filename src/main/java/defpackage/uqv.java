package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import java.util.concurrent.Executor;

/* renamed from: uqv */
public final class uqv extends nd implements uyy, xcp {
    public xoi Z;
    public aanz aa;
    public xci ab;
    public acvx ac;
    public akkq ad;
    public uzn ae;
    public uys af;
    public akoe ag;
    public afpu ah;
    public Executor ai;
    public Executor aj;
    public apxu ak;
    private uzf al;
    private usv am;
    private boolean an;

    public static uqv a(apxu apxu) {
        Bundle bundle = new Bundle();
        if (apxu != null) {
            bundle.putByteArray("endpoint", apxu.toByteArray());
        }
        uqv uqv = new uqv();
        uqv.f(bundle);
        return uqv;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle == null) {
            bundle = this.j;
        }
        ((uqy) xse.a(p())).a(this);
        this.am = new usv(this.aa, this.ae, this.aj, this.ai);
        this.an = bundle.getBoolean("inProgress", false);
        a(1, 0);
        String str = "endpoint";
        if (bundle.containsKey(str)) {
            try {
                this.ak = (apxu) anxl.parseFrom(apxu.d, bundle.getByteArray(str), anxa.c());
            } catch (anyg unused) {
            }
        }
    }

    public final void B() {
        super.B();
        this.an = true;
        this.ab.a((Object) this);
        this.al.a();
    }

    public final void ad_() {
        this.ab.b(this);
        super.ad_();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.al.b();
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
        apxu apxu;
        apxu apxu2 = this.ak;
        if (apxu2 != null) {
            anxr access$000 = anxl.checkIsLite(SignInEndpointOuterClass.signInEndpoint);
            apxu2.a(access$000);
            Object b = apxu2.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            axng = (axng) b;
        } else {
            axng = null;
        }
        if (axng == null || (axng.a & 2) == 0) {
            apxu = null;
        } else {
            apxu2 = axng.b;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            apxu = apxu2;
        }
        uzg uzg = new uzg(p().getApplicationContext(), this.Z, this.ac, this.ad, this.ag);
        this.al = new uzf(uzg, p(), this.ae, this.aa, this.am, this.ah, this.af, this, apxu, this.an);
        uzg.f = this.al;
        this.ac.a(acwl.U, this.ak, null);
        return uzg.a;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("inProgress", this.al.b);
        apxu apxu = this.ak;
        if (apxu != null) {
            bundle.putByteArray("endpoint", apxu.toByteArray());
        }
    }

    public final void a(uyw uyw) {
        this.ab.d(uyw);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqf.class};
        } else if (i == 0) {
            this.an = false;
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
