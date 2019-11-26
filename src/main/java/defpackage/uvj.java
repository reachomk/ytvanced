package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: uvj */
final class uvj extends ClickableSpan {
    private final /* synthetic */ int a;
    private final /* synthetic */ uvg b;

    uvj(uvg uvg, int i) {
        this.b = uvg;
        this.a = i;
    }

    public final void onClick(View view) {
        int i = this.a;
        if (i == R.string.other_methods_suffix) {
            this.b.c.a(4);
        } else if (i == R.string.use_fingerprint_suffix) {
            this.b.c.a(6);
        }
    }
}
