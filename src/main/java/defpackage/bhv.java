package defpackage;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: bhv */
final class bhv extends Property {
    bhv(Class cls, String str) {
        super(cls, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        return abe.G((View) obj);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        abe.a((View) obj, (Rect) obj2);
    }
}
