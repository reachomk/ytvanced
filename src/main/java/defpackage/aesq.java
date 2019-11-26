package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: aesq */
final class aesq implements afmq {
    private static final int a = ((int) TimeUnit.DAYS.toSeconds(1));

    aesq() {
    }

    public final boolean d() {
        return true;
    }

    public final int a() {
        return (int) TimeUnit.DAYS.toHours(30);
    }

    public final List b() {
        return amul.a(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(8), Integer.valueOf(16), Integer.valueOf(32), Integer.valueOf(64), Integer.valueOf(128), Integer.valueOf(256), Integer.valueOf(512), Integer.valueOf(1024), Integer.valueOf(2048), Integer.valueOf(4096), Integer.valueOf(8192), Integer.valueOf(16384), Integer.valueOf(32768), Integer.valueOf(65536), Integer.valueOf(a), Integer.valueOf(a), Integer.valueOf(a), Integer.valueOf(a), Integer.valueOf(a), Integer.valueOf(a), Integer.valueOf(a), Integer.valueOf(a), Integer.valueOf(a), Integer.valueOf(a));
    }

    public final int c() {
        return (int) TimeUnit.DAYS.toMinutes(30);
    }
}
