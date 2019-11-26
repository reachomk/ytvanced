package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: amrl */
public final class amrl {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        str = String.valueOf(str);
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            try {
                obj = String.valueOf(obj);
            } catch (Exception e) {
                String name = obj.getClass().getName();
                String toHexString = Integer.toHexString(System.identityHashCode(obj));
                StringBuilder stringBuilder = new StringBuilder((name.length() + 1) + String.valueOf(toHexString).length());
                stringBuilder.append(name);
                stringBuilder.append('@');
                stringBuilder.append(toHexString);
                toHexString = stringBuilder.toString();
                Logger logger = Logger.getLogger("com.google.common.base.Strings");
                Level level = Level.WARNING;
                String valueOf = String.valueOf(toHexString);
                String str2 = "Exception during lenientFormat for ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                logger.logp(level, "com.google.common.base.Strings", "lenientToString", valueOf, e);
                name = e.getClass().getName();
                stringBuilder = new StringBuilder((String.valueOf(toHexString).length() + 9) + name.length());
                stringBuilder.append("<");
                stringBuilder.append(toHexString);
                stringBuilder.append(" threw ");
                stringBuilder.append(name);
                stringBuilder.append(">");
                obj = stringBuilder.toString();
            }
            objArr[i2] = obj;
            i2++;
        }
        StringBuilder stringBuilder2 = new StringBuilder(str.length() + (length << 4));
        length = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2) {
                break;
            }
            int indexOf = str.indexOf("%s", length);
            if (indexOf == -1) {
                break;
            }
            stringBuilder2.append(str, length, indexOf);
            length = i + 1;
            stringBuilder2.append(objArr[i]);
            int i3 = length;
            length = indexOf + 2;
            i = i3;
        }
        stringBuilder2.append(str, length, str.length());
        if (i < length2) {
            stringBuilder2.append(" [");
            int i4 = i + 1;
            stringBuilder2.append(objArr[i]);
            while (i4 < objArr.length) {
                stringBuilder2.append(", ");
                i = i4 + 1;
                stringBuilder2.append(objArr[i4]);
                i4 = i;
            }
            stringBuilder2.append(']');
        }
        return stringBuilder2.toString();
    }
}
