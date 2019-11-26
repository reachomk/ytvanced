package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: baqn */
public final class baqn implements Iterable {
    public final ArrayList a = new ArrayList();
    private final HashMap b = new HashMap();

    public baqn(Map map) {
        String str = (String) map.get("cookie");
        if (str != null) {
            for (String trim : str.split(";")) {
                String[] split = trim.trim().split("=");
                if (split.length == 2) {
                    this.b.put(split[0], split[1]);
                }
            }
        }
    }

    public final Iterator iterator() {
        return this.b.keySet().iterator();
    }
}
