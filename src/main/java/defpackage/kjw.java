package defpackage;

import android.view.View;

/* renamed from: kjw */
final class kjw {
    private final View a;
    private final CharSequence b;
    private final CharSequence c;

    kjw(View view, CharSequence charSequence, CharSequence charSequence2) {
        this.a = view;
        this.b = charSequence;
        this.c = charSequence2;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.a.setContentDescription(!z ? this.b : this.c);
    }
}
