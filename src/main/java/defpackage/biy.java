package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* renamed from: biy */
public final class biy extends DataSetObserver {
    private final /* synthetic */ ViewPager a;

    public biy(ViewPager viewPager) {
        this.a = viewPager;
    }

    public final void onChanged() {
        this.a.b();
    }

    public final void onInvalidated() {
        this.a.b();
    }
}
