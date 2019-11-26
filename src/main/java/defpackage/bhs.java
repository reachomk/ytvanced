package defpackage;

import android.util.Property;
import android.view.View;

/* renamed from: bhs */
final class bhs extends Property {
    bhs(Class cls, String str) {
        super(cls, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(bht.b((View) obj));
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        bht.a((View) obj, ((Float) obj2).floatValue());
    }
}
