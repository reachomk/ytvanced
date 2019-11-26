package defpackage;

import com.google.protos.youtube.api.innertube.ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand;
import java.util.Map;

/* renamed from: glp */
public final class glp implements aaap {
    public final emd a;
    public final goq b;
    private final wda c;

    public glp(wda wda, emd emd, goq goq) {
        this.c = wda;
        this.a = emd;
        this.b = goq;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.showCommentSimpleboxCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.showCommentSimpleboxCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            anxp anxp = ((ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand) b).b;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(aqcc.a);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ajsr ajsr = (ajsr) ajzv.a((anze) b, ajsr.class);
            this.c.f = new gls(this);
            this.c.a(ajsr, null);
        }
    }
}
