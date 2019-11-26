package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.CircularClipTapBloomView;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.TapBloomView;
import com.google.android.youtube.R;

/* renamed from: aild */
public final class aild {
    private static final bcpu j = bcpu.a(200);
    private static final bcpu k = bcpu.a(200);
    private static final bcpu l = bcpu.a(200);
    public final xnz a;
    public final xqc b;
    public final ailk c = new ailk((TapBloomView) this.d.d());
    public final xqc d;
    public final ailp e;
    public final LinearLayout f;
    public final View g;
    public final ailf h;
    public AnimatorListenerAdapter i;
    private final xqc m;
    private final aile n;

    public aild(View view, ailf ailf, aile aile) {
        int integer = view.getResources().getInteger(R.integer.fade_duration_fast);
        this.g = view;
        this.h = ailf;
        this.n = aile;
        this.d = new xnz((CircularClipTapBloomView) view.findViewById(R.id.tap_bloom_view), (byte) 0);
        long j = (long) integer;
        this.m = new xnz((TextView) view.findViewById(R.id.user_education_text_view), j, 8);
        this.b = new xnz((TextView) view.findViewById(R.id.fast_forward_rewind_hint_text), j, 8);
        this.e = ailp.f().a(j).b(amul.a(ailo.a(0.0f, 1.0f, l), ailo.a(1.0f, 1.0f, k), ailo.a(1.0f, 0.0f, l))).a(amul.a(view.findViewById(R.id.swipe_triangle_left), view.findViewById(R.id.swipe_triangle_mid), view.findViewById(R.id.swipe_triangle_right))).a();
        this.a = new xnz((ImageView) view.findViewById(R.id.dark_background), (byte) 0);
        xnz xnz = this.a;
        xnz.c = 300;
        xnz.b = 200;
        this.f = (LinearLayout) view.findViewById(R.id.fast_forward_rewind_triangles);
    }

    public final void a(boolean z) {
        if (z) {
            TextView textView = (TextView) this.m.d();
            aile aile = this.n;
            int a = aile.a(aile.a());
            textView.setText(aile.a.getQuantityString(R.plurals.user_education_quick_seek, a, new Object[]{Integer.valueOf(a)}));
            this.m.a(true);
            return;
        }
        this.m.b(true);
    }
}
