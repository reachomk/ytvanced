package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: akny */
public final class akny extends aknr {
    public akna c;
    private final SparseIntArray d = new SparseIntArray();
    private final Set e = Collections.newSetFromMap(new WeakHashMap());
    private final SparseArray f = new SparseArray();

    public final void a(int i, int i2) {
        super.a(i, i2);
        this.d.put(i, i2);
    }

    public final aqj a(int i) {
        aqj a = super.a(i);
        akob c = c(i);
        c.d++;
        if (a != null) {
            c.a--;
            c.c++;
            this.e.remove(a.a);
        }
        return a;
    }

    public final void a(aqj aqj) {
        super.a(aqj);
        int i = aqj.f;
        akob c = c(i);
        i = Math.min(c.a + 1, this.d.get(i, this.b));
        c.a = i;
        c.b = Math.max(c.b, i);
        this.e.add(aqj.a);
    }

    public final String toString() {
        int i;
        int size = this.f.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 0;
        for (i = 0; i < size; i++) {
            Object stringBuilder;
            int keyAt = this.f.keyAt(i);
            akna akna = this.c;
            if (akna == null) {
                StringBuilder stringBuilder2 = new StringBuilder(13);
                stringBuilder2.append("[");
                stringBuilder2.append(keyAt);
                stringBuilder2.append("]");
                stringBuilder = stringBuilder2.toString();
            } else {
                stringBuilder = akna.b(keyAt) ? ((Class) akna.a.get(keyAt)).getSimpleName() : null;
            }
            arrayList.add(stringBuilder);
            if (stringBuilder.length() > i2) {
                i2 = stringBuilder.length();
            }
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        for (i = 0; i < this.f.size(); i++) {
            akob akob = (akob) this.f.valueAt(i);
            int i3 = akob.c;
            int i4 = akob.d;
            String str = (String) arrayList.get(i);
            StringBuilder stringBuilder4 = new StringBuilder(14);
            stringBuilder4.append("%-");
            stringBuilder4.append(i2 + 1);
            stringBuilder4.append("s");
            stringBuilder3.append(String.format(stringBuilder4.toString(), new Object[]{str}));
            stringBuilder3.append("\tcurrent=");
            stringBuilder3.append(akob.a);
            stringBuilder3.append("\thighwater=");
            stringBuilder3.append(akob.b);
            stringBuilder3.append("\thits=");
            stringBuilder3.append(akob.c);
            stringBuilder3.append('/');
            stringBuilder3.append(akob.d);
            stringBuilder3.append(9);
            stringBuilder3.append((int) (((((float) i3) * 100.0f) / ((float) i4)) + 0.5f));
            stringBuilder3.append("%\n");
        }
        return stringBuilder3.toString();
    }

    private final akob c(int i) {
        akob akob = (akob) this.f.get(i);
        if (akob != null) {
            return akob;
        }
        akob = new akob();
        this.f.put(i, akob);
        return akob;
    }
}
