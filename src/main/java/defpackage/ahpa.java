package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;

/* renamed from: ahpa */
public final class ahpa extends ahqm {
    public final ViewGroup i;
    public final Handler j = new Handler(Looper.getMainLooper());
    public ahph k;

    public ahpa(Context context, ViewGroup viewGroup, float f, float f2, ahpn ahpn, bcaa bcaa) {
        float f3 = f;
        float f4 = f2;
        super(f3, f4, ahsm.a(1.0f, 1.0f, ahqm.m), ahpn, bcaa);
        amqw.a((Object) context);
        this.i = (ViewGroup) amqw.a((Object) viewGroup);
        a(f, f2, 0.0f);
        this.j.post(new ahpd(this, context, f3, f4, viewGroup));
    }

    public final void bd_() {
        if (this.k != null) {
            this.j.post(new ahpc(this));
        }
        super.bd_();
    }

    public final void m_(boolean z) {
        this.l = z;
        if (this.k != null) {
            this.j.post(new ahpf(this, z));
        }
    }
}
