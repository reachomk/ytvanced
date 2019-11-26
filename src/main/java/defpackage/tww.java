package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: tww */
final class tww extends ttj implements ttx, tzh {
    public static final long d = TimeUnit.HOURS.toMillis(12);
    public final SharedPreferences e;
    public final boolean f;
    public final int g;
    public final Pattern[] h;
    private final tty i;

    static tww a(udc udc, Application application, tzu tzu, tzu tzu2, SharedPreferences sharedPreferences, amqp amqp) {
        if (!amqp.a()) {
            return new tww(udc, application, tzu, tzu2, sharedPreferences);
        }
        amqp.b();
        amqp.b();
        amqp.b();
        throw new NoSuchMethodError();
    }

    public final void f() {
    }

    private tww(udc udc, Application application, tzu tzu, tzu tzu2, SharedPreferences sharedPreferences) {
        this(udc, application, tzu, tzu2, sharedPreferences, false, -1, new Pattern[0]);
    }

    private tww(udc udc, Application application, tzu tzu, tzu tzu2, SharedPreferences sharedPreferences, boolean z, int i, Pattern... patternArr) {
        super(udc, application, tzu, tzu2, 1);
        this.e = sharedPreferences;
        this.f = false;
        this.g = -1;
        this.h = patternArr;
        this.i = tty.a(application);
    }

    public final void e() {
        this.i.a((ttp) this);
    }

    public final void b(Activity activity) {
        this.i.b(this);
        c().submit(new twv(this));
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        this.i.b(this);
    }
}
