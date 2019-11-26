package defpackage;

import android.content.SharedPreferences;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: zyu */
public final class zyu implements UncaughtExceptionHandler {
    public UncaughtExceptionHandler a;
    public volatile boolean b;
    private final SharedPreferences c;

    public zyu(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (!this.b) {
            a(a() + 1);
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        return this.c.getInt("com.google.android.libraries.youtube.innertube.pref.startup_uncaught_exception_count", 0);
    }

    private final void a(int i) {
        this.c.edit().putInt("com.google.android.libraries.youtube.innertube.pref.startup_uncaught_exception_count", i).commit();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        a(0);
    }
}
