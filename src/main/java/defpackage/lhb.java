package defpackage;

import android.text.TextUtils;

/* renamed from: lhb */
public final class lhb implements aikd, xcp {
    public final bcaa a;
    public final xci b;
    private final bcaa c;
    private enm d;
    private long e;

    public lhb(bcaa bcaa, bcaa bcaa2, xci xci) {
        this.c = bcaa;
        this.a = bcaa2;
        this.b = xci;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        enm enm = (enm) obj;
        long j = this.e;
        enm enm2 = this.d;
        this.d = enm;
        if (enm2 != null) {
            enm2.a(j);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ahkm.class};
        } else if (i == 0) {
            ahkm ahkm = (ahkm) obj;
            String k = ((aizy) this.c.get()).k();
            if (!TextUtils.isEmpty(k)) {
                enm enm = this.d;
                if (enm != null) {
                    if (TextUtils.equals(k, enm.c())) {
                        this.e = ahkm.a;
                        return null;
                    }
                }
            }
            this.e = 0;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
