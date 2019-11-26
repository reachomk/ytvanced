package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint;
import java.util.List;
import java.util.Map;

/* renamed from: wpv */
public final class wpv implements aaap {
    public final Activity a;
    public final akvp b;
    public final acvx c;
    public final xoi d;
    public final aaas e;
    public final wqq f;
    public final wox g = new wox();
    public final wqp h;
    public final acum i;
    private final ablj j;

    public wpv(Activity activity, ablj ablj, akvp akvp, acvx acvx, xoi xoi, aaas aaas, wqp wqp, wqq wqq, acum acum) {
        this.a = activity;
        this.j = ablj;
        this.b = akvp;
        this.c = acvx;
        this.d = xoi;
        this.e = aaas;
        this.f = wqq;
        this.h = wqp;
        this.i = acum;
    }

    public final void a(apxu apxu, Map map) {
        asmw asmw;
        asmw asmw2;
        asmw asmw3;
        List list;
        ablj ablj = this.j;
        aaml abmb = new abmb(ablj.c, ablj.d.c());
        abmb.a(apxu.b);
        anxr access$000 = anxl.checkIsLite(YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.ypcCancelRecurrenceEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        b = (YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint) b;
        anvu anvu = b.c;
        if (anvu.c()) {
            asmw = null;
        } else {
            wqm wqm = new wqm();
            wqm.a = anvu;
            asmz asmz = (asmz) asmw.f.createBuilder();
            azls a = wqm.a();
            asmz.copyOnWrite();
            asmw2 = (asmw) asmz.instance;
            if (a != null) {
                asmw2.c = a;
                asmw2.b = 200;
                asmw = (asmw) ((anxl) asmz.build());
            } else {
                throw new NullPointerException();
            }
        }
        if (anvu.c()) {
            asmw3 = null;
        } else {
            wqm wqm2 = new wqm();
            wqm2.a = anvu;
            wqm2.b = 4;
            asmz asmz2 = (asmz) asmw.f.createBuilder();
            azls a2 = wqm2.a();
            asmz2.copyOnWrite();
            asmw2 = (asmw) asmz2.instance;
            if (a2 != null) {
                asmw2.c = a2;
                asmw2.b = 201;
                asmw3 = (asmw) ((anxl) asmz2.build());
            } else {
                throw new NullPointerException();
            }
        }
        amqw.a(b);
        abmb.a = aali.b(b.b);
        try {
            list = (List) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", List.class);
        } catch (ClassCastException unused) {
            list = null;
        }
        if (!(list == null || list.isEmpty())) {
            abmb.b = list;
        }
        this.g.show(this.a.getFragmentManager(), wox.a);
        ablj ablj2 = this.j;
        ablj2.j.a(abmb, new wpu(this, asmw, asmw3));
    }
}
