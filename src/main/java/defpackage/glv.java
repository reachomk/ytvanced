package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;

/* renamed from: glv */
public final class glv implements akxw, urt {
    public final nn a;
    public final CoordinatorLayout b;
    public final LoadingFrameLayout c;
    public final fmf d;
    public final acwa e;
    public final lfx f;
    public final akwy g;
    public final glu h;

    public glv(Context context, nn nnVar, xci xci, acwa acwa, xoi xoi, aapn aapn, akvz akvz, weo weo, akpe akpe, SharedPreferences sharedPreferences) {
        int color;
        acwa acwa2 = acwa;
        this.e = acwa2;
        this.a = nnVar;
        gly gly = new gly(weo, aapn, acwa2);
        View inflate = LayoutInflater.from(context).inflate(R.layout.reel_comment_view, null);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        double d = (double) displayMetrics.heightPixels;
        Double.isNaN(d);
        int i = (int) (d * 0.75d);
        this.b = (CoordinatorLayout) inflate.findViewById(R.id.reel_comment_coordinator_layout);
        int a = fmv.a(sharedPreferences);
        CoordinatorLayout coordinatorLayout = this.b;
        if (a == 2) {
            color = nnVar.getResources().getColor(R.color.yt_black1);
        } else {
            color = nnVar.getResources().getColor(R.color.white);
        }
        coordinatorLayout.setBackgroundColor(color);
        this.c = (LoadingFrameLayout) inflate.findViewById(R.id.reel_comment_loading_preview);
        LayoutParams layoutParams = this.c.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            this.c.setLayoutParams(layoutParams);
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.reel_comments);
        apn eyt = new eyt(context);
        eyt.b(1);
        recyclerView.a(eyt);
        glu glu = new glu();
        Bundle bundle = new Bundle();
        bundle.putInt("COMMENT_HEIGHT_KEY", i);
        glu.f(bundle);
        this.f = new lfx();
        this.f.a(acwa.t());
        glu glu2 = glu;
        aktq aktq = r0;
        aktq akwy = new akwy(null, recyclerView, akpe, new akwn(), aapn, xci, gly, xoi, this.f, ((gky) akvz).a, this, akxj.d);
        this.d = new fmf((StickyHeaderContainer) inflate.findViewById(R.id.sticky_header_container), (apa) aktq.e, new glx(aktq.d));
        this.g = aktq;
        this.h = glu2;
    }

    public final boolean ap_() {
        return true;
    }

    public final void v_() {
    }

    public final void H_() {
        akwy akwy = this.g;
        if (akwy != null) {
            akwy.f();
            this.g.s();
        }
        fmf fmf = this.d;
        if (fmf != null) {
            fmf.a();
        }
    }

    public final void a(boolean z) {
        H_();
    }

    public final void c() {
        H_();
    }

    public final void u_() {
        H_();
    }
}
