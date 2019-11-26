package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bzf */
public final class bzf {
    private static final String b;
    private static final Map c;
    public final Map a = c;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder stringBuilder = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    stringBuilder.append(charAt);
                } else {
                    stringBuilder.append('?');
                }
            }
            property = stringBuilder.toString();
        }
        b = property;
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(b)) {
            hashMap.put("User-Agent", Collections.singletonList(new bzi(b)));
        }
        c = Collections.unmodifiableMap(hashMap);
    }
}
