package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: afhr */
public final class afhr extends afho {
    public afhr(Map map) {
        super(map);
    }

    public static Map a(oza oza) {
        HashMap hashMap = new HashMap();
        CharSequence s = oza.s();
        while (!TextUtils.isEmpty(s)) {
            String[] split = s.split(": ");
            if (split.length >= 2) {
                hashMap.put(split[0], split[1]);
            }
            s = oza.s();
        }
        return hashMap;
    }
}
