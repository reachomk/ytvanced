package defpackage;

import android.graphics.drawable.Drawable;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.List;

/* renamed from: sne */
public final class sne extends cma {
    @cue(a = 13)
    public YogaAlign a;
    @cue(a = 6)
    public List b;
    @cue(a = 13)
    public Drawable c;
    @cue(a = 13)
    public YogaFlexDirection d;
    @cue(a = 13)
    public Integer e;
    @cue(a = 13)
    public YogaJustify f;
    @cue(a = 13)
    public Integer g;
    @cue(a = 0)
    public float u;
    @cue(a = 13)
    public YogaWrap v;

    private sne() {
        super("Container");
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        cmc a;
        YogaFlexDirection yogaFlexDirection = this.d;
        List<cma> list = this.b;
        Drawable drawable = this.c;
        Integer num = this.g;
        Integer num2 = this.e;
        YogaAlign yogaAlign = this.a;
        YogaWrap yogaWrap = this.v;
        YogaJustify yogaJustify = this.f;
        int ordinal = yogaFlexDirection.ordinal();
        if (ordinal == 1) {
            a = cls.a(cmg);
            a.a();
        } else if (ordinal == 2) {
            a = cqz.a(cmg);
        } else if (ordinal != 3) {
            a = cls.a(cmg);
        } else {
            a = cqz.a(cmg);
            a.a();
        }
        for (cma g : list) {
            a.b(g.g());
        }
        if (yogaAlign != null) {
            a.a(yogaAlign);
        }
        if (yogaWrap != null) {
            a.a(yogaWrap);
        }
        if (yogaJustify != null) {
            a.a(yogaJustify);
        }
        if (drawable != null) {
            a.a(drawable);
        } else if (!(num == null && num2 == null)) {
            Drawable stg = new stg();
            int i = 0;
            stg.a = num2 != null ? num2.intValue() : 0;
            if (num != null) {
                i = num.intValue();
            }
            stg.b = i;
            a.a(stg);
        }
        return a.c();
    }

    public final Object a(coj coj, Object obj) {
        int i = coj.b;
        if (i == -1351902487 || i != -1048037474) {
            return null;
        }
        cmm.a((cmg) coj.c[0], (coi) obj);
        return null;
    }

    public static snd a(cmg cmg) {
        snd snd = new snd();
        snd.a(snd, cmg, new sne());
        return snd;
    }
}
