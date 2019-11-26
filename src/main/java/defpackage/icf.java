package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: icf */
final class icf extends icl {
    public final TextView a;
    public final ick b;
    public int c = 0;
    public boolean d = false;

    public icf(Context context, icm icm, aigy aigy, ProgressBar progressBar, TextView textView, TextView textView2, View view) {
        super(icm, textView2, view, new ico(progressBar));
        this.a = textView;
        this.b = new ick(aigy, new icj(new xnz(this.a, 0, 8)));
        Resources resources = context.getResources();
        tst tst = new tst(resources.getDimensionPixelSize(R.dimen.inline_muted_buffering_progress_thickness), resources.getDimensionPixelSize(R.dimen.buffering_progress_inset), new int[]{resources.getColor(R.color.buffering_progress_color)});
        tst.setAlpha(resources.getInteger(R.integer.buffering_progress_transparency));
        progressBar.setIndeterminateDrawable(tst);
    }

    public final void a() {
        ick ick = this.b;
        aihq aihq = ick.c;
        aihq.k = aihq.i;
        ick.a.a(aihq);
    }

    public final void a(ice ice) {
        this.e.setText(ice.e());
        this.c = ice.a();
        this.f = ice.b();
        f();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        int i = this.c;
        aich aich = this.f;
        aicj aicj = aich.a;
        aicj aicj2 = aicj.PLAYING;
        if (i == 3 && aicj == aicj2 && !aich.b) {
            c();
            this.d = true;
        } else if (this.c == 0 || (i == 3 && aicj != aicj2 && this.d)) {
            super.d();
            this.b.b(false);
        } else {
            e();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        super.c();
        this.b.b(false);
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        super.d();
        this.b.c(false);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        super.e();
        this.b.b(false);
    }
}
