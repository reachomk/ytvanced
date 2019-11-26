package defpackage;

import android.net.Uri;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aell */
public abstract class aell {
    private static final Character[] a = new Character[]{Character.valueOf('0'), Character.valueOf('1'), Character.valueOf('2'), Character.valueOf('3'), Character.valueOf('4'), Character.valueOf('5'), Character.valueOf('6'), Character.valueOf('7'), Character.valueOf('8'), Character.valueOf('9'), Character.valueOf('a'), Character.valueOf('b'), Character.valueOf('c'), Character.valueOf('d'), Character.valueOf('e'), Character.valueOf('f')};

    public abstract aepg a();

    public abstract void a(long j);

    public abstract void a(String str);

    public abstract long b();

    public abstract aepg b(String str);

    public abstract String c();

    public static aell a(amro amro, String str, long j, xsc xsc, ScheduledExecutorService scheduledExecutorService, avtc avtc, aajk aajk, xhv xhv, aelx aelx) {
        avtc avtc2 = avtc;
        return new aeln(amro, str, j, (long) avtc2.o, avtc2.t, xsc, scheduledExecutorService, xhv, aelx, avtc2.p, avtc2.q, avtc2.r, aajk);
    }

    static Uri a(Uri uri) {
        xvo a = xvo.a(uri);
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            Character[] chArr = a;
            stringBuilder.append(chArr[random.nextInt(chArr.length)].charValue());
        }
        a.a("id", stringBuilder.toString());
        return a.a();
    }
}
