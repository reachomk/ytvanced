package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: eee */
public final /* synthetic */ class eee implements acxz {
    public static final acxz a = new eee();

    private eee() {
    }

    public final Map a(Object obj) {
        eea eea = (eea) obj;
        int i = eea.c;
        StringBuilder stringBuilder = new StringBuilder(16);
        stringBuilder.append("th");
        stringBuilder.append(i);
        stringBuilder.append("_tt");
        return Collections.singletonMap(stringBuilder.toString(), Integer.toString(eea.d));
    }
}
