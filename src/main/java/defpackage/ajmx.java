package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: ajmx */
public class ajmx {
    public final ajna l;
    public final ajna m;
    public final String n;
    public final int o;

    public ajmx(long j, long j2, int i, String str) {
        amqw.a(j <= j2);
        this.l = new ajna(this, 1, j);
        this.m = new ajna(this, 2, j2);
        this.o = i;
        if (TextUtils.isEmpty(str)) {
            str = UUID.randomUUID().toString();
        }
        this.n = str;
    }

    public final long h() {
        return this.l.a;
    }

    public final long i() {
        return this.m.a;
    }

    public final boolean a(long j) {
        boolean z = false;
        if (j >= h()) {
            if (j < i()) {
                z = true;
            } else if (j == i() && h() == i()) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    public static ajna b(long j) {
        return new ajmx(j, j, aocf.UNSET_ENUM_VALUE, "\u0000").l;
    }

    public final String toString() {
        String l = Long.toString(h());
        String l2 = Long.toString(i());
        String str = h() != i() ? ")" : "]";
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(l).length() + 11) + String.valueOf(l2).length()) + str.length());
        stringBuilder.append("Interval[");
        stringBuilder.append(l);
        stringBuilder.append(", ");
        stringBuilder.append(l2);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
