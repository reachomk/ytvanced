package defpackage;

import android.content.ContentResolver;

/* renamed from: xti */
public final class xti {
    public final ContentResolver a;
    private final String b;
    private volatile boolean c;

    xti(ContentResolver contentResolver, String str) {
        this.a = (ContentResolver) amqw.a((Object) contentResolver);
        String a = xvd.a(str);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 9);
        stringBuilder.append("youtube:");
        stringBuilder.append(a);
        stringBuilder.append(":");
        this.b = stringBuilder.toString();
    }

    public final String a(String str) {
        String valueOf = String.valueOf(this.b);
        str = String.valueOf(str);
        return str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
    }

    public final void a() {
        rzt.b(this.a, this.b);
        rzt.a(this.a, "android_id", 0);
        rzt.a(this.a, "http_stats", false);
        this.c = true;
    }

    public final boolean a(String str, boolean z) {
        b(str);
        return rzt.a(this.a, a(str), z);
    }

    public final String a(String str, String str2) {
        b(str);
        return rzt.a(this.a, a(str), str2);
    }

    public final int a(String str, int i) {
        b(str);
        ContentResolver contentResolver = this.a;
        str = a(str);
        Object a = rzt.a(contentResolver);
        Object obj = (Integer) rzt.a(rzt.e, str, Integer.valueOf(i));
        if (obj != null) {
            return obj.intValue();
        }
        String a2 = rzt.a(contentResolver, str);
        if (a2 != null) {
            try {
                int parseInt = Integer.parseInt(a2);
                i = Integer.valueOf(parseInt);
                obj = i;
                i = parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        rzt.a(a, rzt.e, str, obj);
        return i;
    }

    public final void b(String str) {
        if (!this.c) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
            stringBuilder.append("Fetching the Gservices key '");
            stringBuilder.append(str);
            stringBuilder.append("' before the end of the bulk initialization");
            xtl.d(stringBuilder.toString());
        }
    }
}
