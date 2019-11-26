package defpackage;

import android.support.design.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;

/* renamed from: ju */
public final class ju implements bit {
    public boolean a;
    private final /* synthetic */ TabLayout b;

    public ju(TabLayout tabLayout) {
        this.b = tabLayout;
    }

    public final void a(ViewPager viewPager, bik bik) {
        TabLayout tabLayout = this.b;
        if (tabLayout.v == viewPager) {
            tabLayout.a(bik, this.a);
        }
    }
}
