package defpackage;

import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: lka */
public final class lka {
    public final ljv a;
    public final lkc b;
    public final Set c;
    public int d;
    public boolean e;
    public int f = 2;
    public final vzk g = new ljz(this);
    private boolean h;
    private int i = 1;

    lka(ImageView imageView, ProgressBar progressBar, lkc lkc) {
        this.a = new ljv(imageView, progressBar, this);
        this.b = lkc;
        this.c = new HashSet();
        a();
    }

    public final void a(int i) {
        this.i = i;
        a();
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (this.e) {
            this.a.a(this.i);
        } else if (this.h) {
            ljv ljv = this.a;
            ljv.a.setOnClickListener(new ljy(ljv));
            ljv.a.setEnabled(true);
            ljv.b.setVisibility(0);
            ProgressBar progressBar = ljv.b;
            if (ljv.e == null) {
                ljv.e = ra.a(ljv.a.getContext(), (int) R.drawable.floatybar_progress_circle_autonav);
            }
            progressBar.setProgressDrawable(ljv.e);
            if (ljv.d == null) {
                ljv.d = ra.a(ljv.a.getContext(), (int) R.drawable.floatybar_progress_selector);
            }
            ljv.a(ljv.d, (int) R.string.autonav_a11y);
        } else {
            this.a.a(this.i);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkx ahkx) {
        this.c.add((ahkx) amqw.a((Object) ahkx));
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.h = z;
        a();
    }
}
