package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dxr */
final class dxr implements OnCancelListener, OnDismissListener {
    private final OnDismissListener a;
    private final aqlv b;
    private boolean c;
    private final /* synthetic */ dxs d;

    public dxr(dxs dxs, OnDismissListener onDismissListener, aqlv aqlv) {
        this.d = dxs;
        this.a = onDismissListener;
        this.b = aqlv;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.c = true;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.c) {
            OnDismissListener onDismissListener = this.a;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(dialogInterface);
            }
            aphj aphj = this.b.f;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 2048) != 0) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                aaas aaas = this.d.a;
                aphj aphj2 = this.b.f;
                if (aphj2 == null) {
                    aphj2 = aphj.d;
                }
                aphg aphg2 = aphj2.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                apxu apxu = aphg2.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, hashMap);
            }
        }
    }
}
