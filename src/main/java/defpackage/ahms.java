package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: ahms */
final /* synthetic */ class ahms implements Runnable {
    private final ahmt a;
    private final boolean b;
    private final Context c;
    private final float d;
    private final ViewGroup e;

    ahms(ahmt ahmt, boolean z, Context context, float f, ViewGroup viewGroup) {
        this.a = ahmt;
        this.b = z;
        this.c = context;
        this.d = f;
        this.e = viewGroup;
    }

    public final void run() {
        ahqm ahqm = this.a;
        boolean z = this.b;
        Context context = this.c;
        float f = this.d;
        ViewGroup viewGroup = this.e;
        ahqm.k = new ahmw(context, ahqm, ahsl.b(f), z, !z ? 16842872 : 16842871);
        viewGroup.addView(ahqm.k);
        ahqm.k.invalidate();
    }
}
