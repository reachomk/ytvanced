package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: lsv */
public final class lsv extends akvm implements xcp {
    public List a;
    public int b;
    public int c;

    public lsv(akvz akvz, xci xci, akao akao, ajwd ajwd, akvj akvj, akxt akxt, amqp amqp, akyd akyd) {
        super(akvz, xci, akao, ajwd, akvj, akxt, akyd, amqp);
        this.e.a(new akwa(this));
        xci xci2 = xci;
        xci.a((Object) this, lsv.class);
    }

    public final void g() {
        List list = this.a;
        if (list != null) {
            a(list);
        }
        this.b++;
    }

    public final void a(Collection collection) {
        Collection collection2 = this.l;
        collection2.clear();
        collection2.addAll(collection);
        this.g.a(collection2);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != lsv.class) {
            return akuj.a((akty) this, obj, i);
        }
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{gzx.class};
        } else if (i == 0) {
            gzx gzx = (gzx) obj;
            if (gzx.b() != null) {
                a(gzx.d, gzx.b());
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
