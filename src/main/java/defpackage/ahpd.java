package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: ahpd */
final /* synthetic */ class ahpd implements Runnable {
    private final ahpa a;
    private final Context b;
    private final float c;
    private final float d;
    private final ViewGroup e;

    ahpd(ahpa ahpa, Context context, float f, float f2, ViewGroup viewGroup) {
        this.a = ahpa;
        this.b = context;
        this.c = f;
        this.d = f2;
        this.e = viewGroup;
    }

    public final void run() {
        ahpa ahpa = this.a;
        Context context = this.b;
        float f = this.c;
        float f2 = this.d;
        ViewGroup viewGroup = this.e;
        ahpa.k = new ahph(context, ahpa);
        ahpa.k.setOrientation(0);
        ahpa.k.setLayoutParams(new LayoutParams(ahqm.b(f), ahqm.b(f2)));
        viewGroup.addView(ahpa.k);
    }
}
