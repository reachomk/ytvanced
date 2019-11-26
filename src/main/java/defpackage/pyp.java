package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: pyp */
public final class pyp {
    public final Account a = null;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final rxv g;
    public Integer h;

    public static pyp a(Context context) {
        return new ptf(context).a();
    }

    public pyp(Account account, Set set, Map map, String str, String str2, rxv rxv) {
        Set unmodifiableSet;
        if (set != null) {
            unmodifiableSet = Collections.unmodifiableSet(set);
        } else {
            unmodifiableSet = Collections.EMPTY_SET;
        }
        this.b = unmodifiableSet;
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.d = map;
        this.e = str;
        this.f = str2;
        this.g = rxv;
        HashSet hashSet = new HashSet(this.b);
        for (pyr pyr : this.d.values()) {
            hashSet.addAll(pyr.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
