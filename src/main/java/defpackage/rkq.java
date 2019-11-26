package defpackage;

import android.os.IInterface;

/* renamed from: rkq */
final /* synthetic */ class rkq implements qmo {
    public static final qmo a = new rkq();

    private rkq() {
    }

    public final Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        if (queryLocalInterface instanceof rkg) {
            return (rkg) queryLocalInterface;
        }
        return new rkf(obj);
    }
}
