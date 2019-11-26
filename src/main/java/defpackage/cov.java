package defpackage;

import androidx.viewpager.widget.ViewPager;

/* renamed from: cov */
final class cov implements Runnable {
    private final /* synthetic */ ViewPager a;
    private final /* synthetic */ coy b;

    cov(ViewPager viewPager, coy coy) {
        this.a = viewPager;
        this.b = coy;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
