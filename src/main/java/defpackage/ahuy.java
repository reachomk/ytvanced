package defpackage;

import android.view.ViewGroup.LayoutParams;

/* renamed from: ahuy */
final class ahuy implements Runnable {
    private final /* synthetic */ LayoutParams a;
    private final /* synthetic */ ahuq b;

    ahuy(ahuq ahuq, LayoutParams layoutParams) {
        this.b = ahuq;
        this.a = layoutParams;
    }

    public final void run() {
        this.b.k.setLayoutParams(this.a);
    }
}
