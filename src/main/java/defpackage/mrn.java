package defpackage;

import android.util.SparseArray;

/* renamed from: mrn */
final class mrn implements afmg {
    private static final byte[] a = new byte[]{(byte) -54, (byte) 124, (byte) 80, (byte) 116, (byte) -38, (byte) 56, (byte) -87, (byte) -51, (byte) -4, (byte) 50, (byte) -50, (byte) 22, (byte) -96, (byte) 112, (byte) -46, (byte) 104, (byte) 114, (byte) -73, (byte) 62, (byte) -10, (byte) -80, (byte) -20, (byte) 38, (byte) 42, (byte) 37, (byte) -106, (byte) 98, (byte) -107, (byte) 17, (byte) -45, (byte) -21, (byte) -104};
    private static final byte[] b = new byte[]{(byte) -54, (byte) 124, (byte) 80, (byte) 116, (byte) -38, (byte) 56, (byte) -87, (byte) -51, (byte) -4, (byte) 50, (byte) -50, (byte) 22, (byte) -96, (byte) 112, (byte) -46, (byte) 104, (byte) 114, (byte) -73, (byte) 62, (byte) -10, (byte) -80, (byte) -20, (byte) 38, (byte) 42, (byte) 37, (byte) -106, (byte) 98, (byte) -107, (byte) 17, (byte) -45, (byte) -21, (byte) -104};
    private static final SparseArray c;
    private final boolean d;
    private final mni e;

    mrn(boolean z, mni mni) {
        this.e = mni;
        this.d = z;
    }

    public final String a() {
        return !this.d ? "AIzaSyCjc_pVEDi4qsv5MtC2dMXzpIaDoRFLsxw" : "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w";
    }

    public final SparseArray b() {
        if (this.d) {
            return mrq.a;
        }
        return c;
    }

    public final String c() {
        if (this.d) {
            return "YouTubeApplication";
        }
        r0 = new Object[3];
        mni mni = this.e;
        r0[0] = mni.a;
        r0[1] = mni.b;
        r0[2] = mni.c;
        return String.format("%s_%s_%s", r0);
    }

    static {
        SparseArray sparseArray = new SparseArray();
        c = sparseArray;
        sparseArray.put(0, a);
        c.put(1, b);
    }
}
