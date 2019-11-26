package defpackage;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: pgt */
public class pgt {
    public static String a(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof String) {
            if (TextUtils.isEmpty((String) obj)) {
                return str;
            }
            return obj.toString();
        } else if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return str;
            }
            return obj.toString();
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() == 0) {
                return str;
            }
            return obj.toString();
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return str;
            }
            return obj.toString();
        } else if (!(obj instanceof Boolean)) {
            String str2 = ", ";
            StringBuilder stringBuilder;
            if (obj instanceof List) {
                stringBuilder = new StringBuilder();
                if (i > 0) {
                    stringBuilder.append("[");
                }
                List list = (List) obj;
                int length = stringBuilder.length();
                for (Object next : list) {
                    if (stringBuilder.length() > length) {
                        stringBuilder.append(str2);
                    }
                    stringBuilder.append(pgt.a(next, i + 1));
                }
                if (i > 0) {
                    stringBuilder.append("]");
                }
                return stringBuilder.toString();
            } else if (!(obj instanceof Map)) {
                return obj.toString();
            } else {
                stringBuilder = new StringBuilder();
                Object obj2 = null;
                int i2 = 0;
                for (Entry entry : new TreeMap((Map) obj).entrySet()) {
                    String a = pgt.a(entry.getValue(), i + 1);
                    if (!TextUtils.isEmpty(a)) {
                        if (i > 0 && obj2 == null) {
                            stringBuilder.append("{");
                            i2 = stringBuilder.length();
                            obj2 = 1;
                        }
                        if (stringBuilder.length() > i2) {
                            stringBuilder.append(str2);
                        }
                        stringBuilder.append((String) entry.getKey());
                        stringBuilder.append('=');
                        stringBuilder.append(a);
                    }
                }
                if (obj2 != null) {
                    stringBuilder.append("}");
                }
                return stringBuilder.toString();
            }
        } else if (((Boolean) obj).booleanValue()) {
            return obj.toString();
        } else {
            return str;
        }
    }
}
