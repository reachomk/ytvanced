package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.database.DataSetObservable;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: zos */
public final class zos extends DataSetObservable {
    private String A;
    private ValueAnimator B;
    private ValueAnimator C;
    public final Context a;
    public final float b;
    public final Map c;
    public final Map d;
    public final Map e;
    public String f;
    public zon g;
    public uit h;
    public final List i = new ArrayList();
    public final List j = new ArrayList();
    public HorizontalScrollView k;
    public zjp l;
    public zng m;
    public int n;
    public final int o;
    private final float p;
    private final float q;
    private final int r;
    private final int s;
    private final int t;
    private final float u;
    private final int v;
    private final int w;
    private String x;
    private View y;
    private boolean z;

    public zos(Context context, int i) {
        this.a = (Context) amqw.a((Object) context);
        this.o = i;
        this.c = new TreeMap();
        this.d = new TreeMap();
        this.e = new TreeMap();
        this.f = "NORMAL";
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.w = displayMetrics.widthPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.edit_filter_text_selected_alpha_value, typedValue, true);
        this.p = typedValue.getFloat();
        typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.edit_filter_text_unselected_alpha_value, typedValue, true);
        this.q = typedValue.getFloat();
        if (i == R.layout.choose_filter_list_item_camera || i == R.layout.choose_filter_list_item_camera_preset) {
            i = context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_selected_thumbnail_size);
            this.r = i;
            this.s = i;
            this.b = ((float) context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_unselected_thumbnail_size)) / ((float) this.r);
            this.t = context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_first_last_item_margin);
            this.u = (float) context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_item_outline_width);
            this.v = xwe.a(context, R.attr.ytOverlayTextPrimary, 0);
            return;
        }
        i = context.getResources().getDimensionPixelSize(R.dimen.edit_filter_preview_selected_thumbnail_size);
        this.r = i;
        this.s = i;
        this.b = ((float) context.getResources().getDimensionPixelSize(R.dimen.edit_filter_preview_unselected_thumbnail_size)) / ((float) this.r);
        this.t = context.getResources().getDimensionPixelSize(R.dimen.edit_filter_preview_first_last_item_margin);
        this.u = 0.0f;
        this.v = 0;
    }

    public final boolean a() {
        return this.i.isEmpty() ^ 1;
    }

    public final void b() {
        for (zjt zjt : this.i) {
            String str = zjt.a;
            TextureView a = a(str);
            View b = b(str);
            View findViewById = b.findViewById(R.id.filter_thumbnail_background);
            View findViewById2 = b.findViewById(R.id.filter_thumbnail_border);
            if (zjt.b) {
                findViewById.setVisibility(0);
                a.setVisibility(4);
            } else {
                findViewById.setVisibility(8);
                a.setVisibility(0);
            }
            View findViewById3 = b.findViewById(R.id.filter_text);
            if (str.equals("NORMAL")) {
                a(b, a, findViewById2, str, false);
                a(findViewById3, h(str));
            } else if (h(str)) {
                a(b, str);
                a(findViewById3, true);
                if (!amqq.a(this.A, str)) {
                    ValueAnimator valueAnimator = this.B;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    this.B = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    this.B.setDuration(225);
                    this.B.addUpdateListener(a(a, findViewById2, false));
                    this.B.start();
                }
            } else {
                a(findViewById3, false);
                a(b, a, findViewById2, str, true);
            }
        }
        this.A = i() ? this.f : null;
        String str2 = this.x;
        if (str2 != null) {
            f(str2);
        }
        h();
        g();
    }

    private final void a(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setAlpha(this.p);
        } else {
            view.setAlpha(this.q);
        }
    }

    private final void a(View view, TextureView textureView, View view2, String str, boolean z) {
        a(view, str);
        if (amqq.a(str, this.A) && z) {
            ValueAnimator valueAnimator = this.C;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.C = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.C.setDuration(225);
            this.C.addUpdateListener(a(textureView, view2, true));
            this.C.start();
            return;
        }
        a(textureView, view2, this.b, 0.0f);
    }

    public final void a(TextureView textureView, View view, float f, float f2) {
        int round = Math.round(((float) this.s) * f);
        int round2 = Math.round(((float) this.r) * f);
        FrameLayout frameLayout = (FrameLayout) textureView.getParent();
        LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = round;
            layoutParams.height = round2;
            frameLayout.setLayoutParams(layoutParams);
        }
        if (view != null) {
            int round3 = Math.round(this.u * f2);
            if (round3 > 0) {
                view.setVisibility(0);
                ((GradientDrawable) view.getBackground()).setStroke(round3, this.v);
            } else {
                view.setVisibility(8);
            }
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.s, (float) this.r);
        f = (1.0f - f) / 2.0f;
        float f3 = (float) this.s;
        float f4 = (float) this.r;
        f2 = 1.0f - f;
        RectF rectF2 = new RectF(f3 * f, f * f4, f3 * f2, f4 * f2);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
        textureView.setTransform(matrix);
        textureView.invalidate();
    }

    private final void a(View view, String str) {
        int i = 0;
        if (!str.equals(((zjt) this.i.get(0)).a)) {
            List list = this.i;
            if (!str.equals(((zjt) list.get(list.size() - 1)).a)) {
                return;
            }
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        int i2 = str.equals(((zjt) this.i.get(0)).a) ? this.t : 0;
        int i3 = layoutParams.topMargin;
        List list2 = this.i;
        if (str.equals(((zjt) list2.get(list2.size() - 1)).a)) {
            i = this.t;
        }
        layoutParams.setMargins(i2, i3, i, layoutParams.bottomMargin);
        view.setLayoutParams(layoutParams);
    }

    private final AnimatorUpdateListener a(TextureView textureView, View view, boolean z) {
        return new zoy(this, z, textureView, view);
    }

    public final TextureView a(String str) {
        return (TextureView) this.c.get(str);
    }

    public final View b(String str) {
        return (View) this.e.get(str);
    }

    public final boolean c() {
        if (!this.z) {
            for (zjt zjt : this.i) {
                if (zjt.b) {
                    zjt a = zjt.a(this.i, this.f);
                    if (a != null) {
                        return a.b;
                    }
                    amqw.b(false);
                    return false;
                }
            }
            this.z = true;
        }
        return false;
    }

    public final void c(String str) {
        if (g(str)) {
            notifyChanged();
        } else {
            d(str);
        }
    }

    public final void d(String str) {
        this.f = h(str) ? "NORMAL" : str;
        f(str);
        zng zng = this.m;
        if (zng != null) {
            zng.a(this.f);
        }
        e(str);
    }

    public final boolean d() {
        return this.a.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final void e(String str) {
        View b = b(str);
        if (b != null) {
            int left = b.getLeft();
            int i = this.w;
            int width = b.getWidth();
            ObjectAnimator duration = ObjectAnimator.ofInt(this.k, "scrollX", new int[]{(left - (i / 2)) + (width / 2)}).setDuration(225);
            duration.setInterpolator(new ayr());
            duration.start();
        }
    }

    private final void f(String str) {
        if (a()) {
            String str2 = null;
            this.x = null;
            amqw.a((Object) str);
            View b = b(str);
            if (b != null && xrn.c(b.getContext())) {
                zjt a = zjt.a(this.i, str);
                if (a != null) {
                    str2 = a.a(b.getContext());
                }
                if (str2 == null) {
                    str2 = "";
                }
                xrn.a(b.getContext(), b, b.getContext().getString(!str.equals(this.f) ? R.string.accessibility_filter_view_unselected : R.string.accessibility_filter_view_selected, new Object[]{str2}));
            }
            g();
            notifyChanged();
            return;
        }
        this.x = str;
    }

    private final void h() {
        if (a()) {
            View view = this.y;
            if (view != null) {
                view.setVisibility(!c() ? 8 : 0);
            }
        }
    }

    private final boolean g(String str) {
        return this.f.equals(str);
    }

    private final boolean h(String str) {
        return i() && g(str);
    }

    private final boolean i() {
        zng zng = this.m;
        if (zng == null) {
            return true;
        }
        return zng.a();
    }

    public final String a(int i) {
        return ((zjt) this.i.get(i)).a;
    }

    public final int e() {
        for (int i = 0; i < this.i.size(); i++) {
            if (((zjt) this.i.get(i)).a.equals(this.f)) {
                return i;
            }
        }
        return -1;
    }

    public final void a(View view) {
        this.y = view;
        h();
    }

    public final boolean f() {
        for (zjt a : this.i) {
            if (!a.a()) {
                return true;
            }
        }
        return false;
    }

    public final void g() {
        zjt a = zjt.a(this.i, this.f);
        String valueOf;
        String str;
        if (a == null) {
            valueOf = String.valueOf(this.f);
            str = "setSelectedEffectPreviewed Filter not found: ";
            xtl.a("FilterList", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            return;
        }
        if (!(a.b || a.b())) {
            zjp zjp = this.l;
            if (zjp != null) {
                zjp.b(this.f);
            } else {
                zng zng = this.m;
                if (zng != null) {
                    zng.b(this.f);
                } else {
                    valueOf = String.valueOf(this.f);
                    str = "FilterList.setSelectedEffectPreviewed failed to set effect previewed: ";
                    xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                }
            }
            ((ImageView) this.d.get(this.f)).setVisibility(8);
            View b = b(this.f);
            Context context = b.getContext();
            if (xrn.c(context)) {
                xrn.a(context, b, context.getString(R.string.a11y_new_effect_indicator));
            }
        }
    }
}
