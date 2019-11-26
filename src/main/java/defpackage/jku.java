package defpackage;

import android.text.TextUtils;

/* renamed from: jku */
final /* synthetic */ class jku implements Runnable {
    private final jkp a;
    private final String b;
    private final String c;

    jku(jkp jkp, String str, String str2) {
        this.a = jkp;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        jkp jkp = this.a;
        String str = this.b;
        String str2 = this.c;
        fnp a = jkp.a.a(str, null);
        if (a != null) {
            xvd.a(str2);
            if (TextUtils.isEmpty(a.h)) {
                a.h = str2;
            } else if (!str2.equals(a.h)) {
                str = a.h;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 43) + str2.length());
                stringBuilder.append("Video id is not allowed to change from ");
                stringBuilder.append(str);
                stringBuilder.append(" to ");
                stringBuilder.append(str2);
                throw new AssertionError(stringBuilder.toString());
            }
            jkp.a.a(a);
        }
    }
}
