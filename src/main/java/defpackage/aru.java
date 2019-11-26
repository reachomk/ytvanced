package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;

/* renamed from: aru */
public final class aru extends Property {
    public aru(Class cls, String str) {
        super(cls, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).c);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).a(((Float) obj2).floatValue());
    }
}
