package defpackage;

import com.google.android.youtube.R;
import java.util.EnumMap;

/* renamed from: vtf */
public final class vtf {
    public static final EnumMap a;
    public boolean b;
    public final arwf c;
    public final arwf d;
    public final apxu e;
    public final apxu f;
    public final CharSequence g;
    public final CharSequence h;

    public vtf(aphv aphv) {
        arwf arwf;
        apxu apxu;
        CharSequence charSequence;
        amqw.a((Object) aphv);
        this.b = aphv.b;
        CharSequence charSequence2 = null;
        if ((aphv.a & 32) != 0) {
            arwf = aphv.d;
            if (arwf == null) {
                arwf = arwf.c;
            }
        } else {
            arwf = null;
        }
        this.c = arwf;
        if ((aphv.a & 2048) != 0) {
            arwf = aphv.j;
            if (arwf == null) {
                arwf = arwf.c;
            }
        } else {
            arwf = this.c;
        }
        this.d = arwf;
        if ((aphv.a & 512) != 0) {
            apxu = aphv.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        this.e = apxu;
        if ((aphv.a & 16384) != 0) {
            apxu = aphv.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        this.f = apxu;
        aodx aodx = aphv.n;
        if (aodx == null) {
            aodx = aodx.c;
        }
        aodv aodv = aodx.b;
        if (aodv == null) {
            aodv = aodv.c;
        }
        if ((aodv.a & 2) == 0) {
            charSequence = null;
        } else {
            aodx = aphv.n;
            if (aodx == null) {
                aodx = aodx.c;
            }
            aodv = aodx.b;
            if (aodv == null) {
                aodv = aodv.c;
            }
            charSequence = aodv.b;
        }
        this.g = charSequence;
        aodx = aphv.o;
        if (aodx == null) {
            aodx = aodx.c;
        }
        aodv = aodx.b;
        if (aodv == null) {
            aodv = aodv.c;
        }
        if ((aodv.a & 2) != 0) {
            aodx aodx2 = aphv.o;
            if (aodx2 == null) {
                aodx2 = aodx.c;
            }
            aodv aodv2 = aodx2.b;
            if (aodv2 == null) {
                aodv2 = aodv.c;
            }
            charSequence2 = aodv2.b;
        }
        this.h = charSequence2;
    }

    static {
        EnumMap enumMap = new EnumMap(arwh.class);
        a = enumMap;
        enumMap.put(arwh.LIKE, Integer.valueOf(R.drawable.quantum_ic_thumb_up_white_16));
        a.put(arwh.DISLIKE, Integer.valueOf(R.drawable.quantum_ic_thumb_down_white_16));
    }
}
