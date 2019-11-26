package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: ahqs */
final class ahqs implements Runnable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ float b;
    private final /* synthetic */ float c;
    private final /* synthetic */ ViewGroup d;
    private final /* synthetic */ ahqt e;

    ahqs(ahqt ahqt, Context context, float f, float f2, ViewGroup viewGroup) {
        this.e = ahqt;
        this.a = context;
        this.b = f;
        this.c = f2;
        this.d = viewGroup;
    }

    public final void run() {
        ahqt ahqt = this.e;
        ahqt.j = new ahrc(this.a, ahqt);
        ahqt = this.e;
        ahqt.j.addOnLayoutChangeListener(ahqt);
        this.e.j.setLayoutParams(new LayoutParams(ahqm.b(this.b), ahqm.b(this.c)));
        this.e.j.setVisibility(0);
        this.d.addView(this.e.j);
        this.e.j.setTextColor(-1);
        this.e.j.setTextSize(5.0f);
        this.e.j.setTypeface(null, 1);
        this.e.j.invalidate();
    }
}
