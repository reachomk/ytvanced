package defpackage;

import android.support.design.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: kd */
public final class kd implements biw {
    public int a;
    public int b;
    private final WeakReference c;

    public kd(TabLayout tabLayout) {
        this.c = new WeakReference(tabLayout);
    }

    public final void a(int i) {
        this.a = this.b;
        this.b = i;
    }

    public final void a(int i, float f, int i2) {
        TabLayout tabLayout = (TabLayout) this.c.get();
        if (tabLayout != null) {
            int i3 = this.b;
            boolean z = true;
            boolean z2 = i3 != 2 || this.a == 1;
            if (i3 == 2 && this.a == 0) {
                z = false;
            }
            tabLayout.a(i, f, z2, z);
        }
    }

    public final void b(int i) {
        TabLayout tabLayout = (TabLayout) this.c.get();
        if (tabLayout != null && tabLayout.c() != i && i < tabLayout.b()) {
            int i2 = this.b;
            boolean z = false;
            if (i2 == 0 || (i2 == 2 && this.a == 0)) {
                z = true;
            }
            tabLayout.a(tabLayout.a(i), z);
        }
    }
}
