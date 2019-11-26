package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: xje */
public abstract class xje {
    private final String a;

    protected xje(String str) {
        this.a = String.valueOf(str).concat(" gzip");
    }

    public abstract boolean a(String str);

    public final void a(bckw bckw, Collection collection) {
        String str;
        Iterator it = collection.iterator();
        Object obj = 1;
        while (true) {
            str = "User-Agent";
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            String str2 = (String) entry.getKey();
            if (a(str2)) {
                bckw.b(str2, (String) entry.getValue());
            }
            if (obj != null) {
                if (str.equals(str2)) {
                    obj = null;
                }
            }
        }
        if (obj != null) {
            bckw.b(str, this.a);
        }
    }
}
