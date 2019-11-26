package defpackage;

import android.view.ViewGroup;

/* renamed from: lef */
final /* synthetic */ class lef implements Runnable {
    private final leb a;

    lef(leb leb) {
        this.a = leb;
    }

    public final void run() {
        ViewGroup viewGroup = this.a.i;
        viewGroup.scrollTo(0, viewGroup.getBottom());
    }
}
