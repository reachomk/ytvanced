package defpackage;

import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: acuf */
public final class acuf implements acum {
    public final afoi a;
    public final acul b;
    private final afpu c;
    private final xsc d;
    private final xpt e;
    private final Executor f;

    public acuf(acul acul, afoi afoi, afpu afpu, xsc xsc, xpt xpt, Executor executor) {
        this.a = (afoi) amqw.a((Object) afoi);
        this.b = (acul) amqw.a((Object) acul);
        this.c = (afpu) amqw.a((Object) afpu);
        this.d = (xsc) amqw.a((Object) xsc);
        this.e = (xpt) amqw.a((Object) xpt);
        this.f = (Executor) amqw.a((Object) executor);
    }

    public final boolean a(asmw asmw) {
        return a(asmw, false, -1, null, null);
    }

    public final boolean a(asmw asmw, long j) {
        return a(asmw, false, j, null, null);
    }

    public final boolean a(asmw asmw, afpt afpt) {
        return a(asmw, false, -1, afpt, null);
    }

    public final boolean a(asmw asmw, afpt afpt, long j, afot afot) {
        return a(asmw, false, j, afpt, afot);
    }

    private final boolean a(asmw asmw, boolean z, long j, afpt afpt, afot afot) {
        asmw asmw2 = asmw;
        afot afot2 = afot;
        if (this.b.a.b) {
            if (asmw2 != null) {
                asmy a = asmy.a(asmw2.b);
                if (a == asmy.PAYLOAD_NOT_SET) {
                    a("ClientEvent does not have one and only one payload set.");
                    return false;
                }
                long a2 = this.d.a();
                acul acul = this.b;
                if (acul.c.contains(a) || (acul.g.containsKey(a) && a2 < ((Long) acul.g.get(a)).longValue())) {
                    return false;
                }
                String h;
                boolean g;
                asmz asmz = (asmz) ((anxo) asmw.toBuilder());
                if (j >= 0) {
                    a2 = j;
                }
                asmz.copyOnWrite();
                asmw asmw3 = (asmw) asmz.instance;
                asmw3.a |= 1;
                asmw3.d = a2;
                asna asna = (asna) asnb.c.createBuilder();
                a2 = this.e.b();
                asna.copyOnWrite();
                asnb asnb = (asnb) asna.instance;
                asnb.a |= 1;
                asnb.b = a2;
                asmz.copyOnWrite();
                asmw asmw4 = (asmw) asmz.instance;
                asmw4.e = (asnb) ((anxl) asna.build());
                asmw4.a |= 2;
                asmw3 = (asmw) ((anxl) asmz.build());
                String a3 = afpt == null ? this.c.c().a() : afpt.a();
                if (afot2 == null) {
                    h = this.c.h();
                } else {
                    h = afot2.a;
                }
                String str = h;
                if (afot2 == null) {
                    g = this.c.g();
                } else {
                    g = afot2.b;
                }
                boolean z2 = g;
                String.valueOf(a).length();
                if (z) {
                    this.a.b((njz) ((anxo) acuf.a(asmw3, a3, str, z2).toBuilder()));
                } else {
                    this.f.execute(new acui(this, a, asmw3, a3, str, z2));
                }
                return true;
            }
            a("Unspecified ClientEvent");
        }
        return false;
    }

    public final boolean b(asmw asmw) {
        return a(asmw, true, -1, null, null);
    }

    public final boolean b(asmw asmw, afpt afpt, long j, afot afot) {
        return a(asmw, true, j, afpt, afot);
    }

    private final void a(String str) {
        String canonicalName = getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(canonicalName).length() + 33) + String.valueOf(str).length());
        stringBuilder.append(canonicalName);
        stringBuilder.append(" could not generate ClientEvent: ");
        stringBuilder.append(str);
        xtl.a("GEL_DELAYED_EVENT_DEBUG", stringBuilder.toString());
    }

    public static nka a(asmw asmw, String str, String str2, boolean z) {
        njz njz = (njz) nka.l.createBuilder();
        njz.a(asmw.toByteString());
        njz.a("event_logging");
        njz.b(str);
        if (!TextUtils.isEmpty(str2)) {
            njz.c(str2);
        }
        njz.a(z);
        return (nka) ((anxl) njz.build());
    }
}
