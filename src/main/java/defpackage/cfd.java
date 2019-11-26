package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: cfd */
public final class cfd {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final List b = new ArrayList();
    public boolean c;

    public final boolean a(cfz cfz, boolean z) {
        if (cfz == null) {
            return true;
        }
        boolean z2 = this.b.remove(cfz) || this.a.remove(cfz);
        if (z2) {
            cfz.b();
            if (z) {
                cfz.h();
                return true;
            }
        }
        return z2;
    }

    public final String toString() {
        String obj = super.toString();
        int size = this.a.size();
        boolean z = this.c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 41);
        stringBuilder.append(obj);
        stringBuilder.append("{numRequests=");
        stringBuilder.append(size);
        stringBuilder.append(", isPaused=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
