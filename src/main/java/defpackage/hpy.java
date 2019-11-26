package defpackage;

import android.os.Handler;

/* renamed from: hpy */
public final class hpy implements xcp {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    private final Handler d;

    public hpy(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, Handler handler) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = handler;
    }

    public final void a(String str) {
        this.d.post(new hqb(this, str));
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{fid.class};
        } else if (i == 0) {
            auac auac = ((fid) obj).b;
            if ((auac == auac.LIKE || auac == auac.INDIFFERENT) && ((ahdm) this.a.get()).b()) {
                String str;
                for (agqk agqk : ((agwc) this.b.get()).b().n().a()) {
                    agqi agqi = agqk.a;
                    if (agqi.a.startsWith("LL")) {
                        agpy agpy = agqi.c;
                        if (agpy != null && agpy.e) {
                            str = agqi.a;
                            break;
                        }
                    }
                }
                str = null;
                if (str != null) {
                    a(str);
                    return null;
                }
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
