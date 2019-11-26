package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: aso */
final class aso {
    public final Context a;
    public final View b;
    public final TextView c;
    public final LayoutParams d = new LayoutParams();
    public final Rect e = new Rect();
    public final int[] f = new int[2];
    public final int[] g = new int[2];

    aso(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(this.a).inflate(R.layout.abc_tooltip, null);
        this.c = (TextView) this.b.findViewById(R.id.message);
        this.d.setTitle(getClass().getSimpleName());
        this.d.packageName = this.a.getPackageName();
        LayoutParams layoutParams = this.d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.f13Animation.AppCompat.Tooltip;
        layoutParams.flags = 24;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (b()) {
            ((WindowManager) this.a.getSystemService("window")).removeView(this.b);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return this.b.getParent() != null;
    }
}
