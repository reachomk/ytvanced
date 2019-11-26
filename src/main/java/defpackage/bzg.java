package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bzg */
public final class bzg implements bzb {
    private final Map b;
    private volatile Map c;

    bzg(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final Map a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    HashMap hashMap = new HashMap();
                    for (Entry entry : this.b.entrySet()) {
                        List list = (List) entry.getValue();
                        StringBuilder stringBuilder = new StringBuilder();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String a = ((bzd) list.get(i)).a();
                            if (!TextUtils.isEmpty(a)) {
                                stringBuilder.append(a);
                                if (i != list.size() - 1) {
                                    stringBuilder.append(',');
                                }
                            }
                        }
                        String stringBuilder2 = stringBuilder.toString();
                        if (!TextUtils.isEmpty(stringBuilder2)) {
                            hashMap.put((String) entry.getKey(), stringBuilder2);
                        }
                    }
                    this.c = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
        stringBuilder.append("LazyHeaders{headers=");
        stringBuilder.append(valueOf);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bzg)) {
            return false;
        }
        return this.b.equals(((bzg) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
