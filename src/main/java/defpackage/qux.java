package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: qux */
public final class qux {
    private static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static quy a(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            quy quy = (quy) it.next();
            if (quy.a()) {
                return quy;
            }
        }
        str = String.valueOf(str);
        String str2 = "No KMS client does support: ";
        throw new GeneralSecurityException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
