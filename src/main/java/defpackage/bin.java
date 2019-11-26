package defpackage;

import androidx.viewpager.widget.ViewPager;

/* renamed from: bin */
public final class bin implements Runnable {
    private final /* synthetic */ ViewPager a;

    public bin(ViewPager viewPager) {
        this.a = viewPager;
    }

    public final void run() {
        this.a.a(0);
        this.a.c();
    }
}
