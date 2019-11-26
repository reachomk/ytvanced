package defpackage;

import android.util.Property;
import android.view.View;

/* renamed from: fy */
public final class fy extends Property {
    public fy(Class cls, String str) {
        super(cls, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((View) obj).getLayoutParams().height);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        Float f = (Float) obj2;
        view.getLayoutParams().height = f.intValue();
        view.requestLayout();
    }
}
