package defpackage;

import android.widget.RelativeLayout.LayoutParams;

/* renamed from: itd */
final /* synthetic */ class itd implements Runnable {
    private final ita a;
    private final LayoutParams b;
    private final LayoutParams c;

    itd(ita ita, LayoutParams layoutParams, LayoutParams layoutParams2) {
        this.a = ita;
        this.b = layoutParams;
        this.c = layoutParams2;
    }

    public final void run() {
        ita ita = this.a;
        LayoutParams layoutParams = this.b;
        LayoutParams layoutParams2 = this.c;
        ita.d.setLayoutParams(layoutParams);
        ita.e.setLayoutParams(layoutParams2);
    }
}
