package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.security.Key;
import java.util.Arrays;
import java.util.List;

/* renamed from: agwo */
public final class agwo {
    private final agwc a;
    private final Key b;
    private boolean c;
    private ahdp d;

    public agwo(agwc agwc, Key key) {
        this.a = agwc;
        this.b = key;
        agwj agwj = new agwj();
    }

    public final synchronized agwn a(agql agql) {
        agvt agvt;
        int i;
        Throwable e;
        long j;
        StringBuilder stringBuilder;
        agql agql2;
        synchronized (this) {
            agwq agwq = new agwq();
            agwq.a = agql;
            agwq.c = 3;
            agwq.b = 0;
            agvz b = this.a.b();
            agvt q = b.q();
            int a = q.a(agql.q(), agql.r());
            agwn a2;
            if (a == -1) {
                a2 = agwq.a();
                return a2;
            }
            this.c = false;
            agqd a3 = q.a(agql.q(), agql.r(), a, 0);
            if (a3 != null) {
                byte[] f = a3.f();
                if (f != null && f.length == 10) {
                    this.c = true;
                }
            }
            this.d = new ahdp(this.c);
            int pow = ((int) Math.pow(2.0d, (double) a)) << 12;
            double t = (double) agql.t();
            double d = (double) pow;
            Double.isNaN(t);
            Double.isNaN(d);
            int ceil = (int) Math.ceil(t / d);
            oww oww = null;
            if (b.j() != null) {
                for (oww oww2 : (List) b.j().get()) {
                    if (oww2.c().contains(agql.w())) {
                        oww = oww2;
                        break;
                    }
                }
            }
            if (oww != null) {
                agwq.b = pow;
                byte[] bArr = new byte[pow];
                int i2 = 0;
                while (i2 < ceil) {
                    int i3;
                    agqd a4 = q.a(agql.q(), agql.r(), a, i2);
                    if (a4 == null || a4.f() == null) {
                        agvt = q;
                        i = a;
                        i3 = pow;
                        agwq.a((long) (i2 * i3));
                    } else {
                        long j2 = (long) (i2 * pow);
                        agvt = q;
                        int min = (int) Math.min((long) pow, agql.t() - j2);
                        Key key = this.b;
                        oxc oxc = r12;
                        long j3 = j2;
                        oxc oxc2 = new oxc(oww, null, new ovw(), null, 4, null);
                        oxy oxy = new oxy(key.getEncoded(), oxc);
                        String w = agql.w();
                        i = a;
                        i3 = pow;
                        try {
                            oxy.a(new ovm(Uri.EMPTY, j3, (long) min, w));
                            try {
                                oxy.a(bArr, 0, min);
                                this.d.a();
                                ahdr a5 = ahdp.a(this.c);
                                double d2 = (double) min;
                                Double.isNaN(d2);
                                a = (int) Math.ceil(d2 / 4096.0d);
                                for (pow = 0; pow < a; pow++) {
                                    int i4 = pow << 12;
                                    int min2 = Math.min(4096, min - i4);
                                    a5.a();
                                    a5.a(bArr, i4, min2);
                                    this.d.a(a5.c());
                                }
                                if (!Arrays.equals(this.d.b(), a4.f())) {
                                    agwq.a(j3);
                                }
                            } catch (IOException e2) {
                                e = e2;
                                j = j3;
                                stringBuilder = new StringBuilder(String.valueOf(w).length() + 36);
                                stringBuilder.append("Couldn't read from data source for ");
                                stringBuilder.append(w);
                                stringBuilder.append("\n");
                                xtl.a(stringBuilder.toString(), e);
                                agwq.a(j);
                                i2++;
                                agql2 = agql;
                                q = agvt;
                                a = i;
                                pow = i3;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            j = j3;
                            stringBuilder = new StringBuilder(String.valueOf(w).length() + 36);
                            stringBuilder.append("Couldn't read from data source for ");
                            stringBuilder.append(w);
                            stringBuilder.append("\n");
                            xtl.a(stringBuilder.toString(), e);
                            agwq.a(j);
                            i2++;
                            agql2 = agql;
                            q = agvt;
                            a = i;
                            pow = i3;
                        }
                    }
                    i2++;
                    agql2 = agql;
                    q = agvt;
                    a = i;
                    pow = i3;
                }
                a2 = agwq.a();
                return a2;
            }
            a2 = agwq.a();
            return a2;
        }
    }
}
