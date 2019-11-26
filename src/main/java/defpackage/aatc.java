package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aatc */
public final class aatc {
    public static List a(aqjo aqjo) {
        ArrayList arrayList = new ArrayList();
        for (aqjs aqjs : aqjo.c) {
            int i = aqjs.a;
            Object obj;
            if ((i & 1) != 0) {
                obj = aqjs.b;
                if (obj == null) {
                    obj = aqju.g;
                }
                arrayList.add(obj);
            } else if ((i & 2) != 0) {
                obj = aqjs.c;
                if (obj == null) {
                    obj = aqkc.h;
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
