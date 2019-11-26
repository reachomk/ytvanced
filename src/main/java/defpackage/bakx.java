package defpackage;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* renamed from: bakx */
public final class bakx {
    public final banj a = banj.h;
    public Date b = new Date();
    public Date c = new Date();
    public final List d = new LinkedList();

    public final void a(baky baky) {
        long j = baky.k().i;
        for (baky baky2 : this.d) {
            if (baky2.k().i == j) {
                break;
            }
        }
        baky baky22 = null;
        if (baky22 != null) {
            balb k = baky.k();
            long j2 = 0;
            for (baky baky3 : this.d) {
                if (j2 < baky3.k().i) {
                    j2 = baky3.k().i;
                }
            }
            k.i = j2 + 1;
        }
        this.d.add(baky);
    }

    public final String toString() {
        Object obj = "Movie{ ";
        for (baky baky : this.d) {
            String valueOf = String.valueOf(obj);
            long j = baky.k().i;
            String l = baky.l();
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 30) + String.valueOf(l).length());
            stringBuilder.append(valueOf);
            stringBuilder.append("track_");
            stringBuilder.append(j);
            stringBuilder.append(" (");
            stringBuilder.append(l);
            stringBuilder.append(") ");
            obj = stringBuilder.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder stringBuilder2 = new StringBuilder(valueOf2.length() + 1);
        stringBuilder2.append(valueOf2);
        stringBuilder2.append("}");
        return stringBuilder2.toString();
    }

    public static long a(long j, long j2) {
        return j2 != 0 ? bakx.a(j2, j % j2) : j;
    }
}
