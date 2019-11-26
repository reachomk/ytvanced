package defpackage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: inb */
public final class inb extends apa {
    public static final int[] c = new int[]{aocf.UNSET_ENUM_VALUE};
    public List d;
    public aygk e;
    public apgw f;
    private final Activity g;
    private final akkq h;
    private final apr i;
    private final apr j;
    private final ColorDrawable k = new ColorDrawable();
    private inf l;
    private final int m;

    public inb(Activity activity, akkq akkq, apr apr, apr apr2, int i) {
        this.g = activity;
        this.h = akkq;
        this.i = apr;
        this.j = apr2;
        this.m = i;
    }

    public final int a(int i) {
        int i2 = 0;
        if (i != 0 || this.f != apgw.BUNDLE_ITEM_STYLE_ONE_AND_TWO_AVATAR) {
            if (i == a() - 1 && e()) {
                i2 = 1;
            }
            return i2;
        } else if (f()) {
            return 2;
        } else {
            return 0;
        }
    }

    public final int a() {
        return !e() ? 3 : 4;
    }

    public final boolean e() {
        apgw apgw = this.f;
        return apgw == null || apgw == apgw.BUNDLE_ITEM_STYLE_UNSPECIFIED || this.f == apgw.BUNDLE_ITEM_STYLE_TWO_BY_TWO || !f();
    }

    private static ing a(int i, ViewGroup viewGroup, apr apr) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        frameLayout.setLayoutParams(apr);
        return new ing(frameLayout, xop.a(frameLayout.findViewById(R.id.scrim)));
    }

    public final boolean f(int i) {
        return i == 0 && !e();
    }

    private final boolean f() {
        aygk aygk = this.e;
        return aygk != null && aygk.b.size() > 0;
    }
}
