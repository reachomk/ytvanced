package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: tge */
public final class tge extends tgc {
    public final /* bridge */ /* synthetic */ String a() {
        return "com.google.android.gms";
    }

    public final Dialog a(int i, Activity activity, OnCancelListener onCancelListener) {
        if (psl.c(activity, i)) {
            i = 18;
        }
        return psf.a.a(activity, i, 17, onCancelListener);
    }

    public final /* synthetic */ int b(Context context) {
        return psl.d(context);
    }

    public final /* synthetic */ void a(int i, Context context) {
        psf psf = psf.a;
        if (psl.c(context, i) || (i == 9 && psl.a(context, "com.android.vending"))) {
            psf.b(context);
        } else {
            psf.a(context, i);
        }
    }

    public final /* bridge */ /* synthetic */ int a(Context context) {
        return psi.a(context);
    }
}
