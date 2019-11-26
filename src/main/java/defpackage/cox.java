package defpackage;

import androidx.viewpager.widget.ViewPager;

/* renamed from: cox */
public final class cox implements Runnable {
    private final /* synthetic */ ViewPager a;
    private final /* synthetic */ coy b;

    public cox(coy coy, ViewPager viewPager) {
        this.b = coy;
        this.a = viewPager;
    }

    public final void run() {
        this.a.c(this.b);
    }
}
