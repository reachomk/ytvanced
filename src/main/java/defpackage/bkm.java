package defpackage;

import java.util.Comparator;

/* renamed from: bkm */
final class bkm implements Comparator {
    bkm() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        zz zzVar = (zz) obj2;
        float floatValue = ((Float) ((zz) obj).b).floatValue();
        float floatValue2 = ((Float) zzVar.b).floatValue();
        if (floatValue2 > floatValue) {
            i = 1;
        } else if (floatValue > floatValue2) {
            return -1;
        } else {
            i = 0;
        }
        return i;
    }
}
