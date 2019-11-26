package defpackage;

import android.content.ContentResolver;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

/* renamed from: nld */
public final class nld {
    public static final Pattern a = Pattern.compile(" +");
    private static final Pattern d = Pattern.compile("\\W");
    private static nld e = new nld(new nlg[0]);
    private static Object f;
    public final nlg[] b;
    public final Pattern c;

    private nld(nlg[] nlgArr) {
        Arrays.sort(nlgArr);
        StringBuilder stringBuilder = new StringBuilder("(");
        for (int i = 0; i < nlgArr.length; i++) {
            if (i > 0) {
                stringBuilder.append(")|(");
            }
            stringBuilder.append(d.matcher(nlgArr[i].b).replaceAll("\\\\$0"));
        }
        stringBuilder.append(")");
        this.c = Pattern.compile(stringBuilder.toString());
        this.b = nlgArr;
    }

    public static synchronized nld a(ContentResolver contentResolver) {
        synchronized (nld.class) {
            Object a = rzt.a(contentResolver);
            nld nld;
            if (a == f) {
                nld = e;
                return nld;
            }
            Map a2 = rzt.a(contentResolver, "url:");
            ArrayList arrayList = new ArrayList();
            for (Entry entry : a2.entrySet()) {
                try {
                    String substring = ((String) entry.getKey()).substring(4);
                    String str = (String) entry.getValue();
                    if (!(str == null || str.length() == 0)) {
                        arrayList.add(new nlg(substring, str));
                    }
                } catch (nlf e) {
                    Log.e("UrlRules", "Invalid rule from Gservices", e);
                }
            }
            e = new nld((nlg[]) arrayList.toArray(new nlg[arrayList.size()]));
            f = a;
            nld = e;
            return nld;
        }
    }
}
