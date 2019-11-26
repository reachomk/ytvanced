package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: aelb */
public final class aelb {
    public final aeuy a;
    private final boolean b;
    private final boolean c;
    private final Handler d = new Handler(Looper.getMainLooper());

    aelb(aeuy aeuy, boolean z, boolean z2) {
        this.a = aeuy;
        this.b = z;
        this.c = z2;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(aelc aelc) {
        long j;
        int i;
        if (this.b) {
            aequ aequ = aelc.h;
            j = aequ.b;
            if (j > 0) {
                int i2 = aelc.a;
                i = aequ.c;
                StringBuilder stringBuilder = new StringBuilder(54);
                stringBuilder.append("rn.");
                stringBuilder.append(i2);
                stringBuilder.append(";bw.");
                stringBuilder.append(j);
                stringBuilder.append(";src.");
                stringBuilder.append(i);
                a("bwinfo", new aetw(stringBuilder.toString()));
            }
        }
        if (this.b) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("rn.");
            stringBuilder2.append(aelc.a);
            stringBuilder2.append(";rt.");
            stringBuilder2.append(aelc.i);
            j = aelc.h.b;
            if (j > 0) {
                long j2 = (aelc.d * 8000) / j;
                stringBuilder2.append(";pt.");
                stringBuilder2.append(j2);
            }
            if (aelc.j > 0) {
                stringBuilder2.append(";ct.");
                stringBuilder2.append(aelc.j);
            }
            if (aelc.k != null) {
                stringBuilder2.append(";ec.");
                stringBuilder2.append(aelc.k);
            }
            a("rqs", new aeld(stringBuilder2.toString(), aelc.b + aelc.i));
        }
        if (this.c) {
            i = 0;
            while (i < aelc.c.length()) {
                int i3 = aelc.a;
                StringBuilder stringBuilder3 = aelc.c;
                int i4 = i + 260;
                String substring = stringBuilder3.substring(i, Math.min(i4, stringBuilder3.length()));
                StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(substring).length() + 33);
                stringBuilder4.append("rn.");
                stringBuilder4.append(i3);
                stringBuilder4.append(";idx.");
                stringBuilder4.append(i / 260);
                stringBuilder4.append(";d.");
                stringBuilder4.append(substring);
                a("rqd", new aetw(stringBuilder4.toString()));
                i = i4;
            }
        }
    }

    private final void a(String str, aevf aevf) {
        this.d.post(new aele(this, str, aevf));
    }
}
