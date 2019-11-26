package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: yvg */
public final class yvg {
    public final aadw a;
    public final afxb b;
    public final aaas c;
    public final xsc d;
    public final Map e = new HashMap();
    public final yvh f;
    public final amro g;

    public yvg(yji yji, aadw aadw, afxb afxb, aaas aaas, xsc xsc, yvh yvh) {
        this.a = aadw;
        this.b = afxb;
        this.c = aaas;
        this.d = xsc;
        this.f = yvh;
        yji.getClass();
        this.g = new yvf(yji);
    }

    public final ykt a(String str) {
        return (ykt) this.a.a(yvg.b(str));
    }

    public static String b(String str) {
        return yic.a("ChatTypingStatus", str);
    }

    public final void c(String str) {
        zz zzVar = (zz) this.e.remove(str);
        if (zzVar != null) {
            this.b.b((atun) zzVar.a, (afxc) zzVar.b);
        }
    }
}
