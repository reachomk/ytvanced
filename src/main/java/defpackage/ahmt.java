package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;

/* renamed from: ahmt */
public final class ahmt extends ahqm {
    public final ViewGroup i;
    public final Handler j;
    public ahmw k;

    public ahmt(ViewGroup viewGroup, Context context, Handler handler, ahpn ahpn, bcaa bcaa, float f, boolean z) {
        super(f, f, ahsm.a(f, f, ahqm.m), ahpn, bcaa);
        this.i = (ViewGroup) amqw.a((Object) viewGroup);
        this.j = (Handler) amqw.a((Object) handler);
        handler.post(new ahms(this, z, context, f, viewGroup));
    }

    public final void e(ahnj ahnj) {
    }

    public final void m_(boolean z) {
        this.l = z;
        this.j.post(new ahmu(this, z));
    }

    public final void bd_() {
        this.j.post(new ahmx(this));
        super.bd_();
    }
}
