package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: amyv */
public abstract class amyv {
    public static String a = "amzm";
    public static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    public static String c = "com.google.common.flogger.backend.system.DefaultPlatform";
    public static final String[] d = new String[]{a, b, c};

    public abstract amyr b(String str);

    public abstract amyx b();

    /* Access modifiers changed, original: protected */
    public boolean b(String str, Level level, boolean z) {
        return false;
    }

    public abstract String h();

    public static amyx a() {
        return amyy.a.b();
    }

    public static amyr a(String str) {
        return amyy.a.b(str);
    }

    public static boolean a(String str, Level level, boolean z) {
        return amyy.a.b(str, level, z);
    }

    public static amzb c() {
        return amyy.a.d();
    }

    /* Access modifiers changed, original: protected */
    public amzb d() {
        return amzb.a;
    }

    public static long e() {
        return amyy.a.f();
    }

    /* Access modifiers changed, original: protected */
    public long f() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public static String g() {
        return amyy.a.h();
    }
}
