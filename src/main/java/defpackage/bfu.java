package defpackage;

import android.util.Property;

/* renamed from: bfu */
final class bfu extends Property {
    bfu(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        bfy bfy = (bfy) obj;
        float[] fArr = (float[]) obj2;
        System.arraycopy(fArr, 0, bfy.b, 0, fArr.length);
        bfy.a();
    }
}
