package defpackage;

import android.util.Property;
import android.view.View;

/* renamed from: fz */
public final class fz extends Property {
    public fz(Class cls, String str) {
        super(cls, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((View) obj).getLayoutParams().width);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        Float f = (Float) obj2;
        view.getLayoutParams().width = f.intValue();
        view.requestLayout();
    }
}
