package defpackage;

import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;

/* renamed from: ch */
public final class ch extends ca {
    public static final ch c = new ch();
    private static final ResourceBundle d = new bo();
    public Map a;
    public Map b;
    private final Map e = new HashMap();

    private ch() {
    }

    public final void a() {
        synchronized (this) {
        }
        if (this.a == null) {
            Map treeMap;
            Map treeMap2;
            try {
                ResourceBundle resourceBundle = d;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                treeMap = new TreeMap();
                for (Object[] objArr2 : objArr) {
                    treeMap.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                treeMap2 = new TreeMap();
                for (Object[] objArr22 : objArr3) {
                    treeMap2.put((String) objArr22[0], (String) objArr22[1]);
                }
            } catch (MissingResourceException unused) {
                treeMap = Collections.emptyMap();
                treeMap2 = Collections.emptyMap();
            }
            synchronized (this) {
                if (this.a == null) {
                    this.a = treeMap;
                    this.b = treeMap2;
                }
            }
        }
    }

    public final bt a(String str) {
        boolean containsKey;
        Object[][] objArr;
        bt btVar;
        synchronized (this.e) {
            containsKey = this.e.containsKey(str);
            objArr = null;
            btVar = containsKey ? (bt) this.e.get(str) : null;
        }
        if (!containsKey) {
            try {
                for (Object[] objArr2 : (Object[][]) d.getObject("rules")) {
                    if (str.equals(objArr2[0])) {
                        objArr = (Object[][]) objArr2[1];
                        break;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                for (Object[] objArr22 : objArr) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append("; ");
                    }
                    stringBuilder.append((String) objArr22[0]);
                    stringBuilder.append(": ");
                    stringBuilder.append((String) objArr22[1]);
                }
                btVar = bt.a(stringBuilder.toString());
            } catch (ParseException | MissingResourceException unused) {
            }
            synchronized (this.e) {
                if (this.e.containsKey(str)) {
                    btVar = (bt) this.e.get(str);
                } else {
                    this.e.put(str, btVar);
                }
            }
        }
        return btVar;
    }
}
