package defpackage;

import android.content.Context;

/* renamed from: svk */
public final class svk extends svj {
    public static int a(Context context, bdhi bdhi) {
        for (bdhk c : bdhi.a) {
            bdhj c2 = c.c();
            if (c2 != null) {
                String str = c2.a;
                if (str != null) {
                    return svj.a(context, str);
                }
            }
        }
        return 0;
    }
}
