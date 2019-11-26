package defpackage;

import android.app.Activity;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.apps.youtube.app.common.tutorial.ClingTutorialView;
import com.google.android.apps.youtube.app.common.tutorial.ClingView;
import com.google.android.youtube.R;

/* renamed from: kyu */
public final class kyu implements ewm, xcp {
    public final ewi a;
    private final Activity b;
    private final hdk c;
    private ViewGroup d;
    private ClingTutorialView e;
    private final bcaa f;

    public kyu(Activity activity, ewi ewi, hdk hdk, bbb bbb, bcaa bcaa) {
        this.b = (Activity) amqw.a((Object) activity);
        this.a = (ewi) amqw.a((Object) ewi);
        this.c = (hdk) amqw.a((Object) hdk);
        amqw.a((Object) bbb);
        this.f = (bcaa) amqw.a((Object) bcaa);
    }

    public final int a() {
        return 5500;
    }

    public final boolean b() {
        MediaRouteButton f = this.c.f();
        boolean z = false;
        if (f != null && f.isShown() && bbb.a() != null) {
            for (bbs d : bbb.a()) {
                if (((adgw) this.f.get()).d(d)) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            Activity activity = this.b;
            if (activity instanceof dvd) {
                return ((dvd) activity).b();
            }
        }
        return z;
    }

    public final void c() {
        ClingTutorialView clingTutorialView;
        if (this.d == null) {
            ViewGroup viewGroup = (ViewGroup) this.b.getWindow().findViewById(R.id.accessibility_layer_container);
            if (viewGroup == null) {
                viewGroup = (ViewGroup) this.b.getWindow().getDecorView();
            }
            this.d = viewGroup;
        }
        View view = this.e;
        if (view == null) {
            this.e = (ClingTutorialView) this.b.getLayoutInflater().inflate(R.layout.tutorial_view, this.d).findViewById(R.id.tutorial_view);
            this.e.c = new kyt(this);
            clingTutorialView = this.e;
            clingTutorialView.b.setText(Html.fromHtml(this.b.getString(R.string.dial_screen_tutorial)));
            view = this.e;
            view.d = 1000;
        }
        if (this.d.indexOfChild(view) < 0) {
            this.d.addView(this.e);
        }
        MediaRouteButton f = this.c.f();
        ClingTutorialView clingTutorialView2 = this.e;
        Object obj = this.d;
        ClingView clingView = clingTutorialView2.a;
        View view2 = clingView.b;
        if (view2 != null) {
            view2.getViewTreeObserver().removeOnGlobalLayoutListener(clingView.d);
        }
        clingView.b = f;
        clingView.a = (View) amqw.a(obj);
        view = clingView.b;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(clingView.d);
        }
        clingView.postInvalidate();
        clingTutorialView2.postInvalidate();
        clingTutorialView = this.e;
        if (clingTutorialView.getVisibility() == 0) {
            clingTutorialView.setAnimation(null);
            return;
        }
        clingTutorialView.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) clingTutorialView.d);
        clingTutorialView.startAnimation(alphaAnimation);
    }

    public final void d() {
        ClingTutorialView clingTutorialView = this.e;
        if (clingTutorialView != null) {
            clingTutorialView.a();
            this.d.removeView(this.e);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adpz.class};
        } else if (i == 0) {
            this.a.b();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
