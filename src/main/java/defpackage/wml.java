package defpackage;

import android.content.Intent;
import com.google.protos.youtube.api.innertube.UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint;
import java.util.Map;

/* renamed from: wml */
public abstract class wml implements aaap {
    private final wmh a;

    public wml(wmh wmh) {
        this.a = wmh;
    }

    public abstract String b(apxu apxu, Map map);

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.unlimitedManageFamilyEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint = (UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint) obj;
        anvu anvu = null;
        if (!(unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint == null || (unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.a & 4) == 0)) {
            anvu = unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.c;
        }
        wmh wmh = this.a;
        String b2 = b(apxu, map);
        wmh.h = anvu;
        the the = wmh.e;
        String b3 = ((ust) wmh.b.c()).b();
        if (b2 == null) {
            b2 = "ytr";
        }
        thf a = the.a(b3, b2);
        a.a("youtube");
        Intent a2 = wmh.c.a(a);
        if (wmh.h != null) {
            acum acum = wmh.f;
            wmn wmn = new wmn();
            wmn.a = wmh.h;
            asmz asmz = (asmz) asmw.f.createBuilder();
            azlw a3 = wmn.a();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (a3 != null) {
                asmw.c = a3;
                asmw.b = 262;
                acum.a((asmw) ((anxl) asmz.build()));
            } else {
                throw new NullPointerException();
            }
        }
        wmh.a.a(a2, 2001, wmh);
    }
}
