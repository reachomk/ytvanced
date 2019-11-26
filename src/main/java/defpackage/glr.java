package defpackage;

import com.google.protos.youtube.api.innertube.ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand;
import java.util.Map;

/* renamed from: glr */
public final class glr implements aaap {
    private final glv a;

    public glr(glv glv) {
        this.a = glv;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.showReelsCommentsOverlayCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            anze anze;
            access$000 = anxl.checkIsLite(ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.showReelsCommentsOverlayCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            if ((((ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand) obj).a & 1) != 0) {
                access$000 = anxl.checkIsLite(ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.showReelsCommentsOverlayCommand);
                apxu.a(access$000);
                Object b2 = apxu.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                anxp anxp = ((ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand) b2).b;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(axeq.a);
                anxp.a(access$000);
                b2 = anxp.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                anze = (axez) b2;
            } else {
                anze = null;
            }
            glv glv = this.a;
            akab akab = (akab) ajzv.a(anze, akab.class);
            glv.f.a(glv.e.t());
            glv.g.f();
            glv.d.a();
            glv.g.b(new aafn(akab));
            glu glu = glv.h;
            nt f = glv.a.f();
            Object obj2 = glv.b;
            amqw.a(obj2);
            glu.Z = obj2;
            glu.a(f, "REEL_COMMENT_VIEW_TAG");
            glv.c.b();
            glv.g.e();
        }
    }
}
