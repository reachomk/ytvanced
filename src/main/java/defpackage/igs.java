package defpackage;

import android.text.TextUtils;

/* renamed from: igs */
final class igs implements xcp {
    private final /* synthetic */ igp a;

    igs(igp igp) {
        this.a = igp;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{elx.class};
        } else if (i == 0) {
            elx elx = (elx) obj;
            igq igq = this.a.e;
            if (igq != null && TextUtils.equals(igq.a, elx.a)) {
                this.a.a.m();
                return null;
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
