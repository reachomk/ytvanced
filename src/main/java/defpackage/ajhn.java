package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

@Deprecated
/* renamed from: ajhn */
public final class ajhn {
    private final SparseArray a;
    private final boolean b;

    ajhn(TreeMap treeMap, SparseArray sparseArray, String str, boolean z) {
        amqw.a((Object) treeMap);
        this.a = (SparseArray) amqw.a((Object) sparseArray);
        amqw.a((Object) str);
        this.b = z;
    }

    private final synchronized List b() {
        List list;
        if (this.b) {
            list = (List) this.a.get(1);
        } else {
            list = (List) this.a.get(2);
        }
        return list;
    }

    public final synchronized List a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (this.b) {
            arrayList.add(ajis.a("CC1", "rawcc", "0"));
            arrayList.add(ajis.a("CC3", "rawcc", "1"));
        } else {
            for (ajhp ajhp : b()) {
                String str = ajhp.b;
                if (str != null) {
                    arrayList.add(ajis.a(new Locale(str).getDisplayName(Locale.getDefault()), "", ajhp.b));
                }
            }
        }
        return arrayList;
    }
}
