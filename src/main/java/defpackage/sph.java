package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.List;

/* renamed from: sph */
public final class sph extends cma {
    @cue(a = 13)
    public YogaAlign a;
    @cue(a = 6)
    public List b;
    @cue(a = 13)
    public swf c;
    @cue(a = 13)
    public swk d;
    @cue(a = 13)
    public YogaFlexDirection e;
    @cue(a = 13)
    public YogaJustify f;
    @cue(a = 13)
    public sxd g;
    @cue(a = 13)
    public bdhr u;
    @cue(a = 13)
    public YogaWrap v;

    public sph() {
        super("ScrollableContainerComponent");
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        int i;
        bdhr bdhr = this.u;
        swf swf = this.c;
        swk swk = this.d;
        YogaFlexDirection yogaFlexDirection = this.e;
        YogaAlign yogaAlign = this.a;
        YogaWrap yogaWrap = this.v;
        YogaJustify yogaJustify = this.f;
        List list = this.b;
        clz a = sne.a(cmg);
        a.a(yogaAlign);
        a.a(yogaWrap);
        a.a(yogaJustify);
        a.a(yogaFlexDirection);
        a.a(list);
        azvr azvr = bdhr.c;
        if (azvr != null) {
            i = azvr.a;
            if (!((i & 1) == 0 || (i & 2) == 0)) {
                a.f(azvr.b);
                a.l(bdhr.c.c);
            }
        }
        cqw cqw = new cqw(cmg);
        i = bdhr.g;
        int i2 = i - 1;
        if (i != 0) {
            clz a2;
            azvf azvf;
            if (i2 != 2) {
                a2 = cze.a(cmg);
                a2.b(bdhr.d);
                a2.a();
                azvf = bdhr.b;
                if (azvf != null) {
                    a2.a(Integer.valueOf(cqw.a(azvf.b)));
                }
                if (bdhr.f != null) {
                    a2.a(new sps(swf, bdhr));
                }
                a2.a(a);
            } else {
                a2 = dcv.a(cmg);
                a2.c(bdhr.e);
                a2.g();
                a2.b(swk.f());
                a2.b();
                a2.a();
                azvf = bdhr.b;
                if (azvf != null) {
                    a2.a(Integer.valueOf(cqw.a(azvf.c)));
                }
                if (bdhr.f != null) {
                    a2.a(new spp(swf, bdhr));
                }
                a2.a(a);
            }
            return a2.c();
        }
        throw null;
    }
}
