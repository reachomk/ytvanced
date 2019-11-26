package defpackage;

import java.util.regex.Matcher;

/* renamed from: amqi */
final class amqi extends ampy {
    private final Matcher a;

    amqi(Matcher matcher) {
        this.a = (Matcher) amqw.a((Object) matcher);
    }

    public final boolean a() {
        return this.a.matches();
    }

    public final boolean a(int i) {
        return this.a.find(i);
    }

    public final int b() {
        return this.a.end();
    }

    public final int c() {
        return this.a.start();
    }
}
