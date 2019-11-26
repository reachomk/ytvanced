package defpackage;

import java.util.regex.Pattern;

/* renamed from: rzy */
public final class rzy implements rzx {
    private final /* synthetic */ Pattern a;

    public rzy(Pattern pattern) {
        this.a = pattern;
    }

    public final boolean a(String str) {
        return this.a.matcher(str).find();
    }
}
