package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* renamed from: ueb */
final class ueb implements udw {
    private static ueb b;
    public final Context a;
    private final ContentObserver c;

    static ueb a(Context context) {
        ueb ueb;
        synchronized (ueb.class) {
            if (b == null) {
                if (rn.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") != 0) {
                    ueb = new ueb();
                } else {
                    ueb = new ueb(context);
                }
                b = ueb;
            }
            ueb = b;
        }
        return ueb;
    }

    private ueb(Context context) {
        this.a = context;
        this.c = new ued();
        context.getContentResolver().registerContentObserver(rzt.a, true, this.c);
    }

    private ueb() {
        this.a = null;
        this.c = null;
    }

    /* renamed from: b */
    public final String a(String str) {
        if (this.a != null) {
            try {
                return (String) udz.a(new uea(this, str));
            } catch (SecurityException e) {
                str = String.valueOf(str);
                String str2 = "Unable to read GServices for: ";
                Log.e("GservicesLoader", str.length() == 0 ? new String(str2) : str2.concat(str), e);
            }
        }
        return null;
    }

    static synchronized void a() {
        synchronized (ueb.class) {
            if (!(b == null || b.a == null || b.c == null)) {
                b.a.getContentResolver().unregisterContentObserver(b.c);
            }
            b = null;
        }
    }
}
