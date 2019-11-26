package defpackage;

import android.text.TextUtils;

/* renamed from: ljj */
final class ljj implements xcp {
    private final /* synthetic */ lja a;

    ljj(lja lja) {
        this.a = lja;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{vpa.class, vvk.class};
        } else if (i == 0) {
            vpa vpa = (vpa) obj;
            aaga aaga = vpa.f;
            if (aaga == null || aaga.q() == null) {
                this.a.b(null);
            } else {
                this.a.b(vpa.f.q().c());
            }
        } else if (i == 1) {
            vvk vvk = (vvk) obj;
            lja lja = this.a;
            CharSequence a = vvk.a();
            if (!TextUtils.equals(lja.p, a)) {
                lja.p = a;
                if (lja.a == 1) {
                    lja.e.a(lja.p);
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
