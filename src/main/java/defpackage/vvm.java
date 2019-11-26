package defpackage;

import android.text.TextUtils;

/* renamed from: vvm */
public final class vvm implements xcp {
    private final vvn a;
    private aaga b;

    public vvm(vvn vvn) {
        this.a = vvn;
    }

    private final void a(aaga aaga) {
        a();
        this.b = aaga;
        this.a.a(this.b);
    }

    private final void a() {
        this.a.e();
        this.b = null;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{vpa.class, vqh.class};
        } else if (i == 0) {
            vpa vpa = (vpa) obj;
            int ordinal = vpa.a.ordinal();
            aaga aaga;
            aaga aaga2;
            if (ordinal == 1) {
                aaga = vpa.f;
                aaga2 = this.b;
                if (aaga2 == null || !TextUtils.equals(aaga2.l(), aaga.l())) {
                    a(aaga);
                    return null;
                }
            } else if (ordinal == 2) {
                aaga = vpa.f;
                aaga2 = this.b;
                if (!(aaga2 == aaga && TextUtils.equals(aaga2.l(), aaga.l()))) {
                    a(aaga);
                }
                if (this.a.c()) {
                    this.a.d();
                    return null;
                }
            } else if (ordinal == 3) {
                a();
                return null;
            }
        } else if (i == 1) {
            vqh vqh = (vqh) obj;
            this.a.a(vqh.a, vqh.b, vqh.c, vqh.d);
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
