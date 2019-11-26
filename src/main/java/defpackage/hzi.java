package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: hzi */
public final class hzi extends aito implements aiaa {
    private final int a;
    private boolean b;
    private ImageView c;
    private boolean d;
    private Bitmap e;
    private int f;
    private int g;

    public hzi(Context context) {
        super(context);
        this.a = context.getResources().getInteger(R.integer.fade_duration_fast);
    }

    public final void a(ahzz ahzz) {
    }

    public final void a(Bitmap bitmap) {
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
    }

    public final void a(boolean z) {
    }

    public final void a(boolean z, boolean z2) {
    }

    public final void b(boolean z) {
    }

    public final void b(boolean z, boolean z2) {
    }

    /* Access modifiers changed, original: protected|final */
    public final aitx b(Context context) {
        aitx b = super.b(context);
        int i = this.a;
        b.b = i;
        b.a = i;
        return b;
    }

    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.youtube_invideo_programming_overlay, null);
        this.c = (ImageView) inflate.findViewById(R.id.branding_watermark);
        return inflate;
    }

    public final void a(Context context, View view) {
        if (c(1)) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float applyDimension = TypedValue.applyDimension(1, (float) this.f, displayMetrics);
            float applyDimension2 = TypedValue.applyDimension(1, (float) this.g, displayMetrics);
            this.c.getLayoutParams().width = (int) applyDimension;
            this.c.getLayoutParams().height = (int) applyDimension2;
            this.c.setImageBitmap(this.e);
        }
        if (c(2)) {
            xpr.a(this.c, this.d);
        }
        this.e = null;
    }

    public final void e() {
        l();
        this.d = false;
        this.e = null;
        b(3);
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void a(Bitmap bitmap, int i, int i2) {
        this.e = bitmap;
        this.f = i;
        this.g = i2;
        b(1);
    }

    public final void f() {
        this.d = true;
        if (c()) {
            k();
        } else {
            l();
        }
        b(2);
    }

    public final void g() {
        this.d = false;
        b(2);
    }

    public final boolean c() {
        return this.d && !this.b;
    }

    public final void c(boolean z) {
        if (z == this.b) {
            int i = z ^ 1;
            this.b = i;
            if (i != 0) {
                ag_();
                return;
            }
            af_();
        }
    }
}
