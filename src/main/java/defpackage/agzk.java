package defpackage;

import android.os.Process;
import java.io.IOException;

/* renamed from: agzk */
public abstract class agzk implements agya {
    public final agxz a;
    public final agqz b;
    public final String c;
    public final String d;
    public final ahad e;
    public final agvz f;
    public final xsc g;
    private final String h;
    private final byte[] i;
    private final agwa j;
    private final boolean k;
    private final agzo l;
    private aivp m;
    private final agzy n;
    private final ahac o;
    private final int p;
    private volatile boolean q;
    private boolean r = false;
    private String s = "";
    private final int t;

    public agzk(agxz agxz, xsc xsc, xua xua, agqz agqz, agzo agzo, ahad ahad, agvz agvz, agwa agwa, boolean z) {
        this.a = agxz;
        this.g = xsc;
        this.b = agqz;
        this.l = agzo;
        this.e = ahad;
        this.f = agvz;
        this.j = agwa;
        this.k = z;
        this.p = agxj.e(agqz.f);
        this.t = agxj.F(agqz.f);
        this.c = agqz.a;
        this.h = xua.a();
        this.d = agxj.b(agqz.f);
        this.i = agxj.f(agqz.f);
        this.n = new agzy(xsc, agvz.p(), new agzn(this));
        this.o = new ahac();
    }

    public abstract void a(long j, double d, boolean z);

    public abstract void a(aakj aakj, int i);

    public abstract void a(aakj aakj, agpw agpw);

    public abstract void a(agyc agyc, agpw agpw);

    public abstract boolean a();

    public final void run() {
        String str;
        StringBuilder stringBuilder;
        String str2 = "pudl task[";
        Process.setThreadPriority(10);
        String str3;
        String str4;
        try {
            String.valueOf(this.c).length();
            try {
                String str5;
                String str6;
                long t;
                aghl p;
                ahad ahad = this.e;
                String str7 = this.d;
                byte[] bArr = this.i;
                agqz agqz = this.b;
                aakj a = ahad.a(str7, bArr, agqz, null, !agxj.i(agqz.f) ? 2 : 3, 1);
                this.s = a.e.b("spacecast_appliance_id");
                if (!a()) {
                    a(a, this.p);
                }
                ahad.a(this.c, a);
                aajs a2 = this.e.a(this.c, this.h, a);
                agqn a3 = this.e.a(this.p, this.t, this.d, a2, a.n(), this.f.p(), agxj.o(this.b.f));
                long j = a3.c;
                long j2 = a3.d;
                this.r = agxj.a(a2.l, a3);
                boolean z = j2 > j;
                this.n.c = j2;
                this.a.a(this.c, j2);
                a(j, 0.0d, z);
                agzy agzy = this.n;
                agzy.a = this.d;
                agzy.b = 0;
                afzi j3 = this.f.j();
                str3 = null;
                if (j3 != null) {
                    agpv b = j3.b();
                    if (b != null) {
                        str3 = b.a;
                    }
                }
                if (this.m == null) {
                    this.m = this.l.a();
                    this.m.b = this.n;
                }
                agql agql = a3.b;
                boolean a4 = agzk.a(agql, z);
                if (agql != null) {
                    str5 = this.d;
                    str6 = this.c;
                    String str8 = this.h;
                    aivp aivp = this.m;
                    t = agql.t();
                    p = this.f.p();
                    ahac ahac = this.o;
                    ahad.a(str5, str6, str8, aivp, agql, 0, t, p, str3, ahac.d, ahac.b, this.j);
                    if (this.k) {
                        this.e.a(this.b, agql, this.f.p());
                    }
                    this.n.b = agql.t();
                }
                if (!this.q) {
                    agql = a3.a;
                    boolean a5 = agzk.a(agql, a4);
                    if (agql != null) {
                        str5 = this.d;
                        str4 = this.c;
                        str6 = this.h;
                        aivp aivp2 = this.m;
                        t = agql.t();
                        p = this.f.p();
                        ahac ahac2 = this.o;
                        ahad.a(str5, str4, str6, aivp2, agql, 0, t, p, str3, ahac2.c, ahac2.a, this.j);
                        if (this.k) {
                            this.e.a(this.b, agql, this.f.p());
                        }
                    }
                    if (!this.q) {
                        a(j2, 0.0d, a5);
                        a(a, b());
                    }
                }
            } catch (agyc e) {
                a(e, b());
            } catch (IOException e2) {
                a(this.e.a(e2), b());
            } catch (InterruptedException e3) {
                str = this.c;
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 41);
                stringBuilder.append(str2);
                stringBuilder.append(str);
                stringBuilder.append("] error while downloading video");
                xtl.a(stringBuilder.toString(), e3);
                str4 = "Error encountered while downloading the video";
                if (this.e.a()) {
                    a(agyc.b(str4, e3, agqf.FAILED_UNKNOWN, 23), b());
                } else {
                    a(agyc.a(str4, e3, agqf.FAILED_UNKNOWN, 23), b());
                }
            }
        } catch (Exception e32) {
            str = this.c;
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 37);
            stringBuilder.append(str2);
            stringBuilder.append(str);
            stringBuilder.append("] error while pinning video");
            xtl.a(stringBuilder.toString(), e32);
            afpf afpf = afpf.offline;
            str3 = String.valueOf(e32.getMessage());
            str4 = "Abstract pin exception: ";
            afpc.a(2, afpf, str3.length() == 0 ? new String(str4) : str4.concat(str3), e32);
            str3 = "Error encountered while pinning the video";
            if (this.e.a()) {
                a(agyc.b(str3, e32, agqf.FAILED_UNKNOWN, 1), b());
            } else {
                a(agyc.a(str3, e32, agqf.FAILED_UNKNOWN, 1), b());
            }
        }
    }

    public final void a(int i) {
        String.valueOf(this.c).length();
        boolean z = true;
        this.q = true;
        if ((i & 128) != 0) {
            z = false;
        }
        aivp aivp = this.m;
        if (aivp != null) {
            aivp.a(z);
        }
    }

    private static boolean a(agql agql, boolean z) {
        boolean z2 = true;
        if (!z) {
            if (agql != null) {
                return !agql.u() ? z2 : false;
            } else {
                z2 = false;
            }
        }
    }

    private final agpw b() {
        agpw agpw = this.b.g;
        agxj.d(agpw, this.o.b());
        agxj.e(agpw, this.o.a());
        if (!amqu.a(this.s)) {
            agxj.f(agpw, this.s);
            if (this.r) {
                agxj.B(agpw);
            } else {
                agxj.C(agpw);
            }
        }
        return agpw;
    }
}
