package defpackage;

import java.util.regex.Matcher;

/* renamed from: xvq */
public final class xvq {
    private final xvs a;

    public xvq(xvs xvs) {
        this.a = (xvs) amqw.a((Object) xvs);
    }

    public final nlg a(String str) {
        nld a = this.a.a();
        Matcher matcher = a.c.matcher(str);
        if (matcher.lookingAt()) {
            int i = 0;
            while (i < a.b.length) {
                int i2 = i + 1;
                if (matcher.group(i2) != null) {
                    return a.b[i];
                }
                i = i2;
            }
        }
        return nlg.c;
    }
}
