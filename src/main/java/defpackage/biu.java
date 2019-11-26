package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;

/* renamed from: biu */
public final class biu extends aaj {
    private final /* synthetic */ ViewPager b;

    public biu(ViewPager viewPager) {
        this.b = viewPager;
    }

    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(a());
        if (accessibilityEvent.getEventType() == 4096) {
            bik bik = this.b.b;
            if (bik != null) {
                accessibilityEvent.setItemCount(bik.c());
                accessibilityEvent.setFromIndex(this.b.c);
                accessibilityEvent.setToIndex(this.b.c);
            }
        }
    }

    public final void a(View view, aca aca) {
        super.a(view, aca);
        aca.a((CharSequence) "androidx.viewpager.widget.ViewPager");
        aca.h(a());
        if (this.b.canScrollHorizontally(1)) {
            aca.a(4096);
        }
        if (this.b.canScrollHorizontally(-1)) {
            aca.a(8192);
        }
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        ViewPager viewPager;
        if (i != 4096) {
            if (i != 8192 || !this.b.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager = this.b;
            viewPager.b(viewPager.c - 1);
            return true;
        } else if (!this.b.canScrollHorizontally(1)) {
            return false;
        } else {
            viewPager = this.b;
            viewPager.b(viewPager.c + 1);
            return true;
        }
    }

    private final boolean a() {
        bik bik = this.b.b;
        return bik != null && bik.c() > 1;
    }
}
