package defpackage;

import android.text.TextUtils;
import java.util.LinkedHashSet;

/* renamed from: bcfm */
final class bcfm {
    public static String a(Iterable iterable) {
        if (iterable != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (String str : iterable) {
                bcgg.a(TextUtils.isEmpty(str) ^ 1, (Object) "individual scopes cannot be null or empty");
                linkedHashSet.add(str);
            }
            if (!linkedHashSet.isEmpty()) {
                return TextUtils.join(" ", linkedHashSet);
            }
        }
        return null;
    }
}
