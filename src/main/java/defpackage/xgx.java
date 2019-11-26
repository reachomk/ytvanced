package defpackage;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map.Entry;

/* renamed from: xgx */
public final class xgx {
    public final ArrayList a = new ArrayList();

    private xgx() {
    }

    public final xgx a(String str, String str2) {
        this.a.add(new SimpleImmutableEntry(str, str2));
        return this;
    }

    public final xgx a(Collection collection) {
        this.a.addAll(collection);
        return this;
    }

    public final boolean a(String str) {
        for (int i = 0; i < this.a.size(); i++) {
            if (str.equalsIgnoreCase((String) ((Entry) this.a.get(i)).getKey())) {
                return true;
            }
        }
        return false;
    }

    public final xgy a() {
        return new xgy(this.a);
    }

    /* synthetic */ xgx(byte b) {
    }
}
