package defpackage;

import android.support.design.floatingactionbutton.ExtendedFloatingActionButton;
import android.util.Property;
import android.view.View;

/* renamed from: ga */
public final class ga extends Property {
    public ga(Class cls, String str) {
        super(cls, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((ExtendedFloatingActionButton) ((View) obj)).a().b.a);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Float f = (Float) obj2;
        float intValue = (float) f.intValue();
        ((ExtendedFloatingActionButton) ((View) obj)).a().a(intValue, intValue, intValue, intValue);
    }
}
