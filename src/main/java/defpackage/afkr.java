package defpackage;

import android.util.Base64;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: afkr */
public final class afkr {
    private final SortedMap a = new TreeMap();

    public final afkr a(String str, boolean z) {
        this.a.put(str, String.format("%b", new Object[]{Boolean.valueOf(z)}));
        return this;
    }

    public final afkr a(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public final afkr a(String str, long j) {
        this.a.put(str, String.format("%d", new Object[]{Long.valueOf(j)}));
        return this;
    }

    public final afkr a(String str, byte[] bArr) {
        amqw.a((Object) bArr);
        this.a.put(str, Base64.encodeToString(bArr, 0));
        return this;
    }

    public final String a() {
        Set<Entry> entrySet = this.a.entrySet();
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : entrySet) {
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append(":");
            stringBuilder.append((String) entry.getValue());
            stringBuilder.append("/");
        }
        return stringBuilder.toString();
    }
}
