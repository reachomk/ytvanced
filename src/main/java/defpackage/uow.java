package defpackage;

import android.util.Property;

/* renamed from: uow */
final class uow extends Property {
    public uow() {
        super(Float.TYPE, "revealState");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((uov) obj).e);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        uov uov = (uov) obj;
        uov.e = ((Float) obj2).floatValue();
        uov.invalidateSelf();
    }
}
