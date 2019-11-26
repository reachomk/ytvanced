package defpackage;

import android.database.DataSetObserver;
import android.support.design.tabs.TabLayout;

/* renamed from: jw */
public final class jw extends DataSetObserver {
    private final /* synthetic */ TabLayout a;

    public jw(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    public final void onChanged() {
        this.a.e();
    }

    public final void onInvalidated() {
        this.a.e();
    }
}
