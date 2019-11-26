package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;

/* renamed from: ljv */
final class ljv {
    public final ImageView a;
    public final ProgressBar b;
    public final lka c;
    public Drawable d;
    public Drawable e;
    private Drawable f;
    private Drawable g;
    private Drawable h;

    ljv(ImageView imageView, ProgressBar progressBar, lka lka) {
        this.a = imageView;
        this.b = progressBar;
        this.c = lka;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        boolean z = true;
        this.a.setEnabled(true);
        this.a.setOnClickListener(new ljx(this));
        this.b.setVisibility(8);
        if (i == 1) {
            if (this.h == null) {
                this.h = ra.a(this.a.getContext(), (int) R.drawable.quantum_ic_pause_grey600_24);
            }
            a(this.h, (int) R.string.accessibility_pause);
        } else if (i == 2) {
            if (this.f == null) {
                this.f = ra.a(this.a.getContext(), (int) R.drawable.quantum_ic_play_arrow_grey600_24);
            }
            a(this.f, (int) R.string.accessibility_play);
        } else if (i == 3) {
            if (this.g == null) {
                this.g = ra.a(this.a.getContext(), (int) R.drawable.quantum_ic_replay_grey600_24);
            }
            a(this.g, (int) R.string.accessibility_replay);
        } else if (i == 4) {
            z = false;
        }
        xpr.a(this.a, z);
    }

    public final void a(Drawable drawable, int i) {
        this.a.setImageDrawable(drawable);
        ImageView imageView = this.a;
        imageView.setContentDescription(imageView.getContext().getText(i));
    }

    public final void a(int i, int i2) {
        this.b.setMax(i);
        this.b.setProgress(i2);
    }
}
