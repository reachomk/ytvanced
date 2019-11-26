package defpackage;

import android.content.Context;
import android.provider.Settings.Secure;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: tum */
final class tum {
    public final sdp a;
    private final int b;
    private final double c;
    private final String d;
    private final String e;

    tum(sdp sdp, double d, int i, String str, Context context) {
        this.a = sdp;
        this.c = d;
        this.b = i;
        this.d = str;
        this.e = Secure.getString(context.getContentResolver(), "android_id");
    }

    /* Access modifiers changed, original: final */
    public final Long a(long j) {
        r0 = new Object[3];
        int i = 0;
        r0[0] = Long.valueOf(j);
        r0[1] = this.e;
        r0[2] = this.d;
        Random random = new Random((long) Objects.hash(r0));
        double nextDouble = random.nextDouble();
        double d = this.c;
        if (d >= 1.0d) {
            i = (int) Math.min(Math.round((d + d) * nextDouble), 2147483646);
        } else if (nextDouble < d) {
            i = 1;
        }
        long j2 = 31557600000L + j;
        int i2 = this.b;
        long j3 = (j2 - j) - ((long) (i2 + i2));
        TreeSet treeSet = new TreeSet();
        while (treeSet.size() < i) {
            long abs = (Math.abs(Math.max(random.nextLong(), -9223372036854775807L)) % j3) + j;
            long j4 = (long) this.b;
            j4 += j4;
            if (treeSet.subSet(Long.valueOf(abs - j4), Long.valueOf(j4 + abs)).isEmpty()) {
                treeSet.add(Long.valueOf(abs));
            }
        }
        Long l = (Long) treeSet.ceiling(Long.valueOf(this.a.a() + 100));
        if (l == null) {
            return j < this.a.a() ? a(j2) : null;
        } else {
            return l;
        }
    }
}
