package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;

/* renamed from: aqi */
public class aqi extends aaj {
    public final RecyclerView b;
    public final aaj c = new aql(this);

    public aqi(RecyclerView recyclerView) {
        this.b = recyclerView;
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.b.q();
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (!a()) {
            apn apn = this.b.n;
            if (apn != null) {
                RecyclerView recyclerView = apn.j;
                return apn.a(recyclerView.e, recyclerView.L, i, bundle);
            }
        }
        return false;
    }

    public void a(View view, aca aca) {
        super.a(view, aca);
        if (!a()) {
            apn apn = this.b.n;
            if (apn != null) {
                acc acc;
                RecyclerView recyclerView = apn.j;
                apw apw = recyclerView.e;
                aqh aqh = recyclerView.L;
                if (recyclerView.canScrollVertically(-1) || apn.j.canScrollHorizontally(-1)) {
                    aca.a(8192);
                    aca.h(true);
                }
                if (apn.j.canScrollVertically(1) || apn.j.canScrollHorizontally(1)) {
                    aca.a(4096);
                    aca.h(true);
                }
                int a = apn.a(apw, aqh);
                int b = apn.b(apw, aqh);
                if (VERSION.SDK_INT >= 21) {
                    acc = new acc(CollectionInfo.obtain(a, b, false, 0));
                } else {
                    acc = new acc(CollectionInfo.obtain(a, b, false));
                }
                aca.a.setCollectionInfo((CollectionInfo) acc.a);
            }
        }
    }

    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !a()) {
            apn apn = ((RecyclerView) view).n;
            if (apn != null) {
                apn.a(accessibilityEvent);
            }
        }
    }
}
