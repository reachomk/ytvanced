package defpackage;

import java.util.Locale;

/* renamed from: adtj */
public final class adtj {
    public static final String a = xtl.b("MDX.EventLogger");
    public final acum b;

    public adtj(acum acum) {
        amqw.a((Object) acum);
        this.b = acum;
    }

    public static int a(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? 2 : 6 : 4 : 5 : 7 : 3;
    }

    public static int b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? 1 : 4 : 3 : 2;
    }

    public static void a(aupl aupl) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        int a = aurj.a(aupl.b);
        if (a == 0) {
            a = 1;
        }
        objArr[0] = Integer.valueOf(a - 1);
        objArr[1] = Boolean.valueOf(aupl.d);
        objArr[2] = Boolean.valueOf(aupl.c);
        String.format(locale, "dial info: appStatus=%d isSleeping=%b isWakeOnLan=%b", objArr);
    }
}
