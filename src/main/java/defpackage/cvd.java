package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cvd */
public abstract class cvd {
    public Map a = null;
    public ArrayList b = null;
    public float c;
    public long d = 0;

    public abstract float a(long j);

    /* Access modifiers changed, original: protected|final */
    public final cvd a(String str) {
        cvd b = b(str);
        if (b != null) {
            return b;
        }
        Object stringBuilder;
        Map map = this.a;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            Object obj = "";
            while (it.hasNext()) {
                String valueOf = String.valueOf(obj);
                String str2 = (String) it.next();
                StringBuilder stringBuilder2 = new StringBuilder((valueOf.length() + 2) + String.valueOf(str2).length());
                stringBuilder2.append(valueOf);
                valueOf = "'";
                stringBuilder2.append(valueOf);
                stringBuilder2.append(str2);
                stringBuilder2.append(valueOf);
                obj = stringBuilder2.toString();
                if (!it.hasNext()) {
                    obj = String.valueOf(obj).concat(", ");
                }
            }
            StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(obj).length() + 2);
            stringBuilder3.append("[");
            stringBuilder3.append(obj);
            stringBuilder3.append("]");
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "[]";
        }
        StringBuilder stringBuilder4 = new StringBuilder((String.valueOf(str).length() + 64) + String.valueOf(stringBuilder).length());
        stringBuilder4.append("Tried to get non-existent input '");
        stringBuilder4.append(str);
        stringBuilder4.append("'. Node only has these inputs: ");
        stringBuilder4.append(stringBuilder);
        throw new RuntimeException(stringBuilder4.toString());
    }

    /* Access modifiers changed, original: protected|final */
    public final cvd b() {
        if (c() <= 1) {
            return a("default_input");
        }
        throw new RuntimeException("Trying to get single input of node with multiple inputs!");
    }

    public final cvd b(String str) {
        Map map = this.a;
        return map != null ? (cvd) map.get(str) : null;
    }

    public final int c() {
        Map map = this.a;
        return map != null ? map.size() : 0;
    }

    /* Access modifiers changed, original: final */
    public final Collection d() {
        Map map = this.a;
        if (map == null) {
            return Collections.emptySet();
        }
        return map.values();
    }
}
