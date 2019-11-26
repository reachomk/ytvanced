package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.List;

/* renamed from: spj */
public final class spj extends cma {
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
    public bapj u;
    @cue(a = 13)
    public YogaWrap v;

    public spj() {
        super("ScrollableContainerComponentFlat");
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        clz a;
        bapj bapj = this.u;
        swf swf = this.c;
        swk swk = this.d;
        YogaFlexDirection yogaFlexDirection = this.e;
        YogaAlign yogaAlign = this.a;
        YogaWrap yogaWrap = this.v;
        YogaJustify yogaJustify = this.f;
        List list = this.b;
        clz a2 = sne.a(cmg);
        a2.a(yogaAlign);
        a2.a(yogaWrap);
        a2.a(yogaJustify);
        a2.a(yogaFlexDirection);
        a2.a(list);
        if (bapj.b() != null && ((double) bapj.b().a()) > 0.5d && ((double) bapj.b().b()) > 0.5d) {
            a2.f(bapj.b().a());
            a2.l(bapj.b().b());
        }
        cqw cqw = new cqw(cmg);
        int a3 = bapj.a(4);
        boolean z = false;
        baph a4;
        if ((a3 != 0 ? bapj.b.getInt(a3 + bapj.a) : 0) != 2) {
            a = cze.a(cmg);
            int a5 = bapj.a(10);
            if (!(a5 == 0 || bapj.b.get(a5 + bapj.a) == (byte) 0)) {
                z = true;
            }
            a.b(z);
            a.a();
            if (bapj.a() != null) {
                a4 = bapj.a();
                a.a(Integer.valueOf(cqw.a(a4.b.getFloat(a4.a))));
            }
            if (bapj.c() != null) {
                a.a(new spn(swf, bapj));
            }
            a.a(a2);
        } else {
            a = dcv.a(cmg);
            a3 = bapj.a(12);
            if (!(a3 == 0 || bapj.b.get(a3 + bapj.a) == (byte) 0)) {
                z = true;
            }
            a.c(z);
            a.g();
            a.b(swk.f());
            a.b();
            a.a();
            if (bapj.a() != null) {
                a4 = bapj.a();
                a.a(Integer.valueOf(cqw.a(a4.b.getFloat(a4.a + 4))));
            }
            if (bapj.c() != null) {
                a.a(new spo(swf, bapj));
            }
            a.a(a2);
        }
        return a.c();
    }
}
