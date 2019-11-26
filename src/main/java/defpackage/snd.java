package defpackage;

import android.graphics.drawable.Drawable;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.BitSet;
import java.util.List;

/* renamed from: snd */
public final class snd extends clz {
    private sne a;
    private final String[] d = new String[]{"children", "flexDirection"};
    private final BitSet e = new BitSet(2);

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final snd a(YogaAlign yogaAlign) {
        this.a.a = yogaAlign;
        return this;
    }

    public final snd a(List list) {
        this.a.b = list;
        this.e.set(0);
        return this;
    }

    public final snd b(Drawable drawable) {
        this.a.c = drawable;
        return this;
    }

    public final snd a(YogaFlexDirection yogaFlexDirection) {
        this.a.d = yogaFlexDirection;
        this.e.set(1);
        return this;
    }

    public final snd a(Integer num) {
        this.a.e = num;
        return this;
    }

    public final snd a(YogaJustify yogaJustify) {
        this.a.f = yogaJustify;
        return this;
    }

    public final snd b(Integer num) {
        this.a.g = num;
        return this;
    }

    public final snd u(float f) {
        this.a.u = f;
        return this;
    }

    public final snd a(YogaWrap yogaWrap) {
        this.a.v = yogaWrap;
        return this;
    }

    public final /* synthetic */ cma c() {
        clz.a(2, this.e, this.d);
        sne sne = this.a;
        super.e();
        this.a = null;
        return sne;
    }

    static /* synthetic */ void a(snd snd, cmg cmg, sne sne) {
        super.a(cmg, (cma) sne);
        snd.a = sne;
        snd.e.clear();
    }
}
