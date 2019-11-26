package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: juc */
public final class juc extends juv implements xcp {
    private final fga e;

    public juc(zyw zyw, fhk fhk, jtw jtw, fga fga, jty jty, xci xci, fgc fgc, xpt xpt, RecyclerView recyclerView, akpd akpd, aknh aknh, ent ent) {
        super(zyw, fhk, jtw, fga, jty, xci, fgc, xpt, recyclerView, akpd, aknh, ent);
        this.e = fga;
    }

    public final void c() {
    }

    public final int j() {
        return 0;
    }

    public final int k() {
        return 0;
    }

    public final void a(boolean z) {
        super.a(z);
        this.e.a(false);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != juc.class) {
            return jua.a(this, obj, i);
        }
        Class[] clsArr;
        if (i == -1) {
            clsArr = new Class[]{gzx.class};
        } else if (i == 0) {
            a((gzx) obj);
            clsArr = null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
