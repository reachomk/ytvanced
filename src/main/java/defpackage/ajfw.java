package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ajfw */
final class ajfw implements afmw {
    private final /* synthetic */ aqtz a;

    ajfw(aqtz aqtz) {
        this.a = aqtz;
    }

    public final int c() {
        return 0;
    }

    public final int a() {
        return ((aqtw) this.a.instance).b;
    }

    public final int b() {
        return ((aqtw) this.a.instance).c;
    }

    public final int d() {
        return (int) TimeUnit.DAYS.toMinutes(30);
    }
}
