package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;

/* renamed from: uqq */
public final class uqq extends ufe implements OnItemClickListener {
    public uyp Z;
    public xci aa;
    public apxu ab;
    private uym ac;

    /* Access modifiers changed, original: protected|final */
    public final int W() {
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final String X() {
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final OnItemClickListener Y() {
        return this;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((uqs) xse.a(p())).a(this);
        if (bundle == null) {
            bundle = this.j;
        }
        String str = "endpoint";
        if (bundle.containsKey(str)) {
            try {
                this.ab = (apxu) anxl.parseFrom(apxu.d, bundle.getByteArray(str), anxa.c());
            } catch (anyg unused) {
            }
        }
    }

    public final void W_() {
        View view = this.K;
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
        }
        super.W_();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.aa.d(new uyw(uyz.CANCELLED, false, null));
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        apxu apxu = this.ab;
        if (apxu != null) {
            bundle.putByteArray("endpoint", apxu.toByteArray());
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        axng axng;
        apxu apxu = this.ab;
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
        this.Z.a(this.ac, apxu2);
        dismiss();
    }

    public static uqq a(uym uym, apxu apxu) {
        uqq uqq = new uqq();
        Bundle bundle = new Bundle();
        if (apxu != null) {
            bundle.putByteArray("endpoint", apxu.toByteArray());
        }
        uqq.f(bundle);
        uqq.ac = uym;
        return uqq;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ListAdapter Z() {
        ufi ufi = new ufi(p());
        uqp uqp = new uqp(p().getString(R.string.turn_off_incognito));
        uqp.d = ra.a(p(), (int) R.drawable.quantum_ic_incognito_circle_grey600_36);
        uqp.a(xwe.a(p(), R.attr.ytTextPrimary, -16777216));
        ufi.add(uqp);
        return ufi;
    }
}
