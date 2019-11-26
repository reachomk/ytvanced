package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import com.google.android.youtube.R;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gnu */
public final class gnu {
    public final aaas a;
    public final goq b;
    private final akoe c;

    public gnu(aaas aaas, goq goq, akoe akoe) {
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = goq;
        this.c = akoe;
    }

    public final void a(Context context, View view, got got, auvn auvn, Map map) {
        Context contextThemeWrapper = new ContextThemeWrapper(context, R.style.f313ReelTheme.NoActionBar.FullScreen.Light);
        AtomicReference atomicReference = new AtomicReference();
        gnx gnx = new gnx(new aknw(), new gny(this, contextThemeWrapper, new gnw(map), new gnv(atomicReference)));
        gnx.a(auvj.class);
        ListAdapter a = this.c.a(gnx.a);
        aknh akpk = new akpk();
        a.a(akpk);
        akpk.addAll(auvn.b);
        int a2 = xpr.a(contextThemeWrapper, a, new FrameLayout(contextThemeWrapper));
        float dimension = contextThemeWrapper.getResources().getDimension(R.dimen.innertube_menu_width_increment_dp);
        aoa aoa = new aoa(contextThemeWrapper);
        atomicReference.set(aoa);
        aoa.l = 0;
        aoa.j = 8388661;
        Resources resources = contextThemeWrapper.getResources();
        aoa.d((int) xpr.a(contextThemeWrapper, (float) a2, dimension));
        aoa.g = -resources.getDimensionPixelOffset(R.dimen.reel_popup_menu_horizontal_offset);
        aoa.a(-resources.getDimensionPixelOffset(R.dimen.reel_popup_menu_vertical_offset));
        aoa.h();
        aoa.i();
        aoa.a(a);
        if (view != null) {
            aoa.m = view;
        }
        this.b.a();
        got.a(false);
        aoa.a(new gnt(this, got));
        aoa.f_();
    }
}
