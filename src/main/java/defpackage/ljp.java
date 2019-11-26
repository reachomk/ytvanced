package defpackage;

import android.widget.TextView;

/* renamed from: ljp */
final class ljp {
    public final TextView a;
    public final Runnable b;
    public boolean c = false;
    public CharSequence d;

    ljp(TextView textView) {
        this.a = textView;
        textView.addOnAttachStateChangeListener(new ljr(this));
        this.b = new ljs(this, textView);
    }

    public final void a(CharSequence charSequence) {
        this.d = charSequence;
        if (!this.c) {
            this.a.setText(charSequence);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.a.removeCallbacks(this.b);
        this.a.setText(this.d);
        this.c = false;
    }
}
