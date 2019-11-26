package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ajfn */
public final class ajfn {
    public static final Map a;
    public static final Map b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        String str = "VSS_CMT";
        hashMap.put(str, Integer.valueOf(1));
        String str2 = "VSS_CPN";
        a.put(str2, Integer.valueOf(2));
        String str3 = "VSS_STATE";
        a.put(str3, Integer.valueOf(3));
        String str4 = "VSS_CONN";
        a.put(str4, Integer.valueOf(4));
        String str5 = "VSS_RT";
        a.put(str5, Integer.valueOf(5));
        String str6 = "VSS_VIS";
        a.put(str6, Integer.valueOf(6));
        String str7 = "VSS_UAO";
        a.put(str7, Integer.valueOf(7));
        hashMap = new HashMap();
        b = hashMap;
        hashMap.put(str, "-1");
        String str8 = "";
        b.put(str2, str8);
        b.put(str3, str8);
        str8 = "0";
        b.put(str4, str8);
        b.put(str5, str8);
        b.put(str6, str8);
        b.put(str7, str8);
    }
}
