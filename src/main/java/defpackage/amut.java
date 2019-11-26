package defpackage;

import java.io.Serializable;
import java.util.Map.Entry;

/* renamed from: amut */
class amut implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object[] a;
    private final Object[] b;

    amut(amur amur) {
        this.a = new Object[amur.size()];
        this.b = new Object[amur.size()];
        amxo amxo = (amxo) ((amuw) amur.entrySet()).iterator();
        int i = 0;
        while (amxo.hasNext()) {
            Entry entry = (Entry) amxo.next();
            this.a[i] = entry.getKey();
            this.b[i] = entry.getValue();
            i++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Object readResolve() {
        return a(new amuu(this.a.length));
    }

    /* Access modifiers changed, original: final */
    public final Object a(amuu amuu) {
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return amuu.b();
            }
            amuu.b(objArr[i], this.b[i]);
            i++;
        }
    }
}
