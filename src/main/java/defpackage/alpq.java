package defpackage;

import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: alpq */
public final class alpq {
    public static List a(Collection collection, aovk aovk) {
        if (collection == null || aovk == null || aovk.a.size() == 0) {
            return Collections.emptyList();
        }
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : collection) {
            String str = resolveInfo.activityInfo.applicationInfo.packageName;
            if (!TextUtils.isEmpty(str)) {
                hashSet.add(str);
            }
        }
        ArrayList arrayList = new ArrayList(hashSet.size());
        for (aovm aovm : aovk.a) {
            if (hashSet.contains(aovm.c)) {
                arrayList.add(Integer.valueOf(aovm.b));
            }
        }
        return arrayList;
    }

    public static Integer a(String str, aovk aovk) {
        if (!(aovk == null || TextUtils.isEmpty(str))) {
            for (aovm aovm : aovk.a) {
                if (TextUtils.equals(str, aovm.c)) {
                    return Integer.valueOf(aovm.b);
                }
            }
        }
        return null;
    }
}
