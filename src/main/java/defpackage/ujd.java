package defpackage;

import android.util.Property;

/* renamed from: ujd */
final class ujd extends Property {
    public ujd() {
        super(Float.TYPE, "transitionProgress");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((uiz) obj).a);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((uiz) obj).a(((Float) obj2).floatValue());
    }
}
