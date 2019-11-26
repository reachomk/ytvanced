package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand;
import java.util.Map;

/* renamed from: wqx */
public final class wqx implements aaap {
    public final xoi a;
    public final wqq b;
    public final wox c = new wox();
    public final wqz d;
    public final acum e;
    public final aaas f;
    private final Activity g;
    private final ablb h;

    public wqx(Activity activity, ablb ablb, xoi xoi, wqz wqz, wqq wqq, acum acum, aaas aaas) {
        this.g = activity;
        this.h = ablb;
        this.a = xoi;
        this.b = wqq;
        this.d = wqz;
        this.e = acum;
        this.f = aaas;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        asmw asmw;
        anxr access$000 = anxl.checkIsLite(YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.ypcPauseSubscriptionCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand = (YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand) obj;
        byte[] d = ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.c.d();
        if (bchf.a(d)) {
            wqu wqu = new wqu();
            wqu.a(d);
            asmz asmz = (asmz) asmw.f.createBuilder();
            azly a = wqu.a();
            asmz.copyOnWrite();
            asmw asmw2 = (asmw) asmz.instance;
            if (a != null) {
                asmw2.c = a;
                asmw2.b = 190;
                asmw = (asmw) ((anxl) asmz.build());
            } else {
                throw new NullPointerException();
            }
        }
        asmw = null;
        ablb ablb = this.h;
        aaml ablc = new ablc(ablb.c, ablb.d.c());
        ablc.a = ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.b;
        ablc.b = ((Long) map.get("pause_subscription_resume_time_ms_key")).longValue();
        ablc.a(apxu.b);
        this.c.show(this.g.getFragmentManager(), wox.a);
        ablb ablb2 = this.h;
        ablb2.a.a(ablc, new wqw(this, d, asmw));
    }
}
