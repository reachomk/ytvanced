package defpackage;

import android.util.Property;

/* renamed from: upi */
final class upi extends Property {
    private final /* synthetic */ upg a;

    public upi(upg upg) {
        this.a = upg;
        super(Float.TYPE, "value");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((upj) obj).a);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((upj) obj).a = ((Float) obj2).floatValue();
        this.a.invalidateSelf();
    }
}
