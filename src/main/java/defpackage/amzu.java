package defpackage;

import java.util.Calendar;
import java.util.Date;

/* renamed from: amzu */
public final class amzu extends amzt {
    private final amzr c;

    public amzu(amyo amyo, int i, amzr amzr) {
        super(amyo, i);
        this.c = amzr;
        StringBuilder a = amyo.a(new StringBuilder("%"));
        a.append(!amyo.b() ? 't' : 'T');
        a.append(amzr.b);
        a.toString();
    }

    public final void a(amzw amzw, Object obj) {
        amzr amzr = this.c;
        amyo amyo = this.b;
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder a = amyo.a(new StringBuilder("%"));
            a.append(!amyo.b() ? 't' : 'T');
            a.append(amzr.b);
            ((amyz) amzw).c.append(String.format(amyz.a, a.toString(), new Object[]{obj}));
            return;
        }
        StringBuilder stringBuilder = ((amyz) amzw).c;
        char c = amzr.b;
        StringBuilder stringBuilder2 = new StringBuilder(3);
        stringBuilder2.append("%t");
        stringBuilder2.append(c);
        amyz.a(stringBuilder, obj, stringBuilder2.toString());
    }
}
