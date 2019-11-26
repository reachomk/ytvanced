package defpackage;

import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import java.util.List;

/* renamed from: xpl */
public final class xpl implements biw {
    private final /* synthetic */ RtlAwareViewPager a;

    public xpl(RtlAwareViewPager rtlAwareViewPager) {
        this.a = rtlAwareViewPager;
    }

    public final void a(int i, float f, int i2) {
        RtlAwareViewPager rtlAwareViewPager = this.a;
        biw biw = rtlAwareViewPager.l;
        if (biw != null) {
            biw.a(rtlAwareViewPager.c(i), f, i2);
        }
        List<biw> list = this.a.k;
        if (list != null) {
            for (biw biw2 : list) {
                biw2.a(this.a.c(i), f, i2);
            }
        }
    }

    public final void b(int i) {
        RtlAwareViewPager rtlAwareViewPager = this.a;
        biw biw = rtlAwareViewPager.l;
        if (biw != null) {
            biw.b(rtlAwareViewPager.c(i));
        }
        List<biw> list = this.a.k;
        if (list != null) {
            for (biw biw2 : list) {
                biw2.b(this.a.c(i));
            }
        }
    }

    public final void a(int i) {
        biw biw = this.a.l;
        if (biw != null) {
            biw.a(i);
        }
        List<biw> list = this.a.k;
        if (list != null) {
            for (biw a : list) {
                a.a(i);
            }
        }
    }
}
