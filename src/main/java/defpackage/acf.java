package defpackage;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

/* renamed from: acf */
public final class acf {
    public final Object a;

    public static acf a(int i, int i2, int i3, int i4, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            return new acf(CollectionItemInfo.obtain(i, i2, i3, i4, z, false));
        }
        return new acf(CollectionItemInfo.obtain(i, i2, i3, i4, z));
    }

    private acf(Object obj) {
        this.a = obj;
    }
}
