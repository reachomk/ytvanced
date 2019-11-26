package defpackage;

import android.support.design.appbar.AppBarLayout;
import android.view.View;
import java.util.Objects;

/* renamed from: dy */
public final class dy implements aba {
    private final /* synthetic */ AppBarLayout a;

    public dy(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    public final abx a(View view, abx abx) {
        AppBarLayout appBarLayout = this.a;
        Object obj = !abe.v(appBarLayout) ? null : abx;
        if (!Objects.equals(appBarLayout.c, obj)) {
            appBarLayout.c = obj;
            appBarLayout.requestLayout();
        }
        return abx;
    }
}
