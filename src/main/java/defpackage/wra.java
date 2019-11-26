package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand;
import java.util.Map;

/* renamed from: wra */
public final class wra implements aaap {
    public final xoi a;
    public final wqq b;
    public final wox c = new wox();
    public final wrc d;
    public final acum e;
    public final aaas f;
    private final Activity g;
    private final ablf h;

    public wra(Activity activity, ablf ablf, xoi xoi, wrc wrc, wqq wqq, acum acum, aaas aaas) {
        this.g = activity;
        this.h = ablf;
        this.a = xoi;
        this.b = wqq;
        this.d = wrc;
        this.e = acum;
        this.f = aaas;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        asmw asmw;
        anxr access$000 = anxl.checkIsLite(YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.ypcResumeSubscriptionCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand = (YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand) obj;
        byte[] d = ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.c.d();
        if (bchf.a(d)) {
            wrb wrb = new wrb();
            wrb.a(d);
            asmz asmz = (asmz) asmw.f.createBuilder();
            azmc a = wrb.a();
            asmz.copyOnWrite();
            asmw asmw2 = (asmw) asmz.instance;
            if (a != null) {
                asmw2.c = a;
                asmw2.b = 195;
                asmw = (asmw) ((anxl) asmz.build());
            } else {
                throw new NullPointerException();
            }
        }
        asmw = null;
        ablf ablf = this.h;
        aaml ablg = new ablg(ablf.c, ablf.d.c());
        ablg.a = ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.b;
        ablg.a(apxu.b);
        this.c.show(this.g.getFragmentManager(), wox.a);
        ablf ablf2 = this.h;
        ablf2.a.a(ablg, new wrd(this, d, asmw));
    }
}
