package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: uus */
final class uus extends ClickableSpan {
    private final /* synthetic */ int a;
    private final /* synthetic */ uuo b;

    uus(uuo uuo, int i) {
        this.b = uuo;
        this.a = i;
    }

    public final void onClick(View view) {
        int i = this.a;
        if (i == R.string.other_methods_suffix) {
            this.b.a.a(4);
        } else if (i == R.string.use_password_suffix) {
            this.b.a.a(7);
        }
    }
}
