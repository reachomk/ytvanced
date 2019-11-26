package defpackage;

import java.io.PrintStream;

/* renamed from: bdeh */
public final class bdeh {
    public static volatile bcvq a = new bden();
    public static volatile bcvq b = new bdem();
    public static volatile bcvt c = new bdeq();
    public static volatile bcvq d = new bdet();
    public static volatile bcvq e = new bdex();
    private static volatile bcvk f = new bdeg();
    private static volatile bcvq g = new bdep();
    private static volatile bcvt h = new bdeo();
    private static volatile bcvt i = new bdes();
    private static volatile bcvq j = new bdev();
    private static volatile bcvq k = new bder();
    private static volatile bcvq l = new bdeu();
    private static volatile bcvq m = new bdej();
    private static volatile bcvq n = new bdel();
    private static volatile bcvq o = new bdei();
    private static volatile bcvq p = new bdek();

    public static void a(Throwable th) {
        bcvk bcvk = f;
        if (bcvk != null) {
            try {
                bcvk.a(th);
                return;
            } catch (Throwable th2) {
                PrintStream printStream = System.err;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The onError handler threw an Exception. It shouldn't. => ");
                stringBuilder.append(th2.getMessage());
                printStream.println(stringBuilder.toString());
                ankx.a(th2);
                bdeh.d(th2);
            }
        }
        bdeh.d(th);
    }

    private static void d(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static bcvl a(bcvl bcvl) {
        bcvq bcvq = j;
        return bcvq != null ? (bcvl) bcvq.a(bcvl) : bcvl;
    }

    public static bcty a(bctz bctz, bcty bcty) {
        bcvt bcvt = h;
        return bcvt != null ? (bcty) bcvt.a(bctz, bcty) : bcty;
    }

    public static bcuo a(bcuo bcuo) {
        bcvq bcvq = k;
        return bcvq != null ? (bcuo) bcvq.a(bcuo) : bcuo;
    }

    public static Throwable b(Throwable th) {
        bcvq bcvq = l;
        return bcvq != null ? (Throwable) bcvq.a(th) : th;
    }

    public static Throwable c(Throwable th) {
        bcvq bcvq = m;
        return bcvq != null ? (Throwable) bcvq.a(th) : th;
    }
}
