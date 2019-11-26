package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: csz */
public final class csz {
    public final Map a = new HashMap();

    public final boolean a(String str, cma cma) {
        str = csz.a(str, cma.l);
        return this.a.containsKey(str) && ((Integer) this.a.get(str)).intValue() == 1;
    }

    public final void a(String str, cma cma, int i) {
        this.a.put(csz.a(str, cma.l), Integer.valueOf(i));
    }

    private static String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
