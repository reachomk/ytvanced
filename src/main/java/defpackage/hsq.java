package defpackage;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: hsq */
public final class hsq implements Comparator {
    private final boolean a;
    private final int b;

    /* renamed from: a */
    public final int compare(aqey aqey, aqey aqey2) {
        int compareTo;
        if (this.b == 3) {
            if (this.a) {
                compareTo = hsq.a(aqey2).compareTo(hsq.a(aqey));
            } else {
                compareTo = hsq.a(aqey).compareTo(hsq.a(aqey2));
            }
            return compareTo;
        }
        if (this.a) {
            compareTo = hsq.b(aqey2).compareTo(hsq.b(aqey));
        } else {
            compareTo = hsq.b(aqey).compareTo(hsq.b(aqey2));
        }
        return compareTo;
    }

    private static Long a(aqey aqey) {
        aqfc aqfc;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aqeu aqeu = aqey.l;
        if (aqeu == null) {
            aqeu = aqeu.c;
        }
        if (aqeu.a == 135744618) {
            aqfc = (aqfc) aqeu.b;
        } else {
            aqfc = aqfc.c;
        }
        return Long.valueOf(timeUnit.toMillis(aqfc.b));
    }

    private static String b(aqey aqey) {
        arml arml;
        arml arml2 = null;
        if ((aqey.a & 1) != 0) {
            arml = aqey.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        if (ajqy.a(arml) == null) {
            return "";
        }
        if ((aqey.a & 1) != 0) {
            arml2 = aqey.f;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        return ampq.a(ajqy.a(arml2).toString());
    }

    public hsq(int i, boolean z) {
        this.b = i;
        this.a = z;
    }
}
