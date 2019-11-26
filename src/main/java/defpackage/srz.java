package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: srz */
public final class srz {
    public static final amul a = amul.a(sqm.class, srn.class, ssg.class, ssi.class, sra.class);

    public static Collection a(Map map) {
        return amsr.a(map.values(), ssc.a);
    }

    public static Collection b(Map map) {
        ArrayList arrayList = new ArrayList(amsr.a(map.values(), ssb.a));
        Collections.sort(arrayList, sse.a);
        return arrayList;
    }
}
