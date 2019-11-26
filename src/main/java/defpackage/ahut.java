package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

/* renamed from: ahut */
final class ahut implements Runnable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ LayoutParams b;
    private final /* synthetic */ ViewGroup c;
    private final /* synthetic */ ahuq d;

    ahut(ahuq ahuq, Context context, LayoutParams layoutParams, ViewGroup viewGroup) {
        this.d = ahuq;
        this.a = context;
        this.b = layoutParams;
        this.c = viewGroup;
    }

    public final void run() {
        ahuq ahuq = this.d;
        ahuq.k = new ahva(this.a, ahuq);
        this.d.k.setLayoutParams(this.b);
        this.c.addView(this.d.k);
    }
}
