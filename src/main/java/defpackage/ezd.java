package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/* renamed from: ezd */
public final class ezd implements OnClickListener {
    public final ObjectAnimator a;
    public final TextView b;
    public final int c;
    public boolean d = false;
    public int e;
    private final int f;

    public ezd(TextView textView, int i, int i2) {
        this.b = textView;
        this.c = i;
        this.f = i2;
        this.e = textView.getLineCount();
        this.a = ObjectAnimator.ofInt(textView, "maxLines", new int[]{i, d()});
        this.a.setDuration(150);
        this.a.addListener(new eze(this));
        textView.addOnLayoutChangeListener(new ezf(this));
        c();
    }

    public final void a() {
        this.d = false;
        this.b.setMaxLines(this.c);
    }

    public final void onClick(View view) {
        this.d ^= 1;
        if (!b()) {
            c();
        } else if (this.a.isRunning() || !this.d) {
            this.a.reverse();
        } else {
            this.a.start();
        }
    }

    public final boolean b() {
        int min = Math.min(this.b.getLineCount(), this.c) - 1;
        boolean z = false;
        if (this.b.getVisibility() == 0) {
            if (this.b.getLineCount() > this.c) {
                z = true;
            } else if (this.b.getLayout() == null || this.b.getLayout().getEllipsisCount(min) == 0) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    public final void c() {
        int i;
        if (this.d) {
            i = this.f;
        } else {
            i = this.c;
        }
        if (this.b.getMaxLines() != i) {
            this.b.setMaxLines(i);
        }
    }

    public final int d() {
        int i = this.e;
        if (i <= this.c) {
            return this.f;
        }
        return Math.min(i, this.f);
    }
}
