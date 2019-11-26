package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: afgr */
public final class afgr extends Exception {
    private afgr() {
    }

    private afgr(String str) {
        super(str);
    }

    public static afgr a() {
        return new afgr();
    }

    public static afgr a(Collection collection, Set set, Set set2, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        String str = ";";
        if (i != Integer.MAX_VALUE) {
            stringBuilder.append("maxallowed.");
            stringBuilder.append(i);
            stringBuilder.append(str);
        }
        if (i2 != Integer.MAX_VALUE) {
            stringBuilder.append("maxmobile.");
            stringBuilder.append(i2);
            stringBuilder.append(str);
        }
        stringBuilder.append("supported");
        String str2 = ".";
        if (set != null) {
            for (Integer num : set) {
                stringBuilder.append(str2);
                stringBuilder.append(num);
            }
        }
        if (set2 != null) {
            for (Integer num2 : set2) {
                stringBuilder.append(str2);
                stringBuilder.append(num2);
            }
        }
        stringBuilder.append(";available");
        if (collection != null) {
            for (aahr aahr : collection) {
                stringBuilder.append(str2);
                stringBuilder.append(aahr.b());
            }
        }
        return new afgr(stringBuilder.toString());
    }
}
