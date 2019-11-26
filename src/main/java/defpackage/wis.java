package defpackage;

import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: wis */
final class wis implements OnPreDrawListener {
    private final /* synthetic */ ajsn a;
    private final /* synthetic */ wih b;

    wis(wih wih, ajsn ajsn) {
        this.b = wih;
        this.a = ajsn;
    }

    public final boolean onPreDraw() {
        this.b.r.getViewTreeObserver().removeOnPreDrawListener(this.b.m);
        wih wih = this.b;
        wih.m = null;
        int lineCount = wih.r.getLineCount();
        wih wih2 = this.b;
        if (lineCount > wih2.l) {
            wih2.s.setVisibility(0);
        }
        wih2 = this.b;
        if (lineCount == wih2.l + 1 && wih2.s.getLineCount() > 0) {
            if (this.b.r.getLayout().getLineWidth(lineCount - 1) < this.b.s.getLayout().getLineWidth(0)) {
                this.b.b(this.a);
            }
        }
        return true;
    }
}
