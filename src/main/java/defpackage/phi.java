package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: phi */
public final class phi {
    private static final String[] a;
    private static final Map b = new HashMap(a.length);

    public static String a(int i) {
        if (i >= 0) {
            String[] strArr = a;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return null;
    }

    static {
        r0 = new String[10];
        int i = 0;
        r0[0] = "text1";
        r0[1] = "text2";
        r0[2] = "icon";
        r0[3] = "intent_action";
        r0[4] = "intent_data";
        r0[5] = "intent_data_id";
        r0[6] = "intent_extra_data";
        r0[7] = "suggest_large_icon";
        r0[8] = "intent_activity";
        r0[9] = "thing_proto";
        a = r0;
        while (true) {
            r0 = a;
            if (i < r0.length) {
                b.put(r0[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }
}
