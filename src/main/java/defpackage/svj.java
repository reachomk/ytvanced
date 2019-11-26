package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: svj */
public class svj {
    private static final Map a = new HashMap();

    public static int a(Context context, bapb bapb) {
        for (int i = 0; i < bapb.a(); i++) {
            baol b = bapb.g(i).b();
            if (b != null) {
                int a = b.a(6);
                String c = a != 0 ? b.c(a + b.a) : null;
                if (c != null) {
                    return svj.a(context, c);
                }
            }
        }
        return 0;
    }

    protected static int a(Context context, String str) {
        int identifier;
        synchronized (a) {
            Integer num = (Integer) a.get(str);
            if (num == null) {
                identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
                a.put(str, Integer.valueOf(identifier));
            } else {
                identifier = num.intValue();
            }
        }
        return identifier;
    }
}
