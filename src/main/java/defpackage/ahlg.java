package defpackage;

import android.animation.TypeEvaluator;

/* renamed from: ahlg */
final class ahlg implements TypeEvaluator {
    ahlg() {
    }

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Long l = (Long) obj;
        double longValue = (double) l.longValue();
        double d = (double) f;
        double longValue2 = (double) (((Long) obj2).longValue() - l.longValue());
        Double.isNaN(d);
        Double.isNaN(longValue2);
        d *= longValue2;
        Double.isNaN(longValue);
        return Long.valueOf((long) (longValue + d));
    }
}
