package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;

/* renamed from: aktr */
public final class aktr implements akto {
    public View a = null;

    public aktr(View view) {
        this.a = view;
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
        View view = this.a;
        if (view != null) {
            View findViewById = view.findViewById(i);
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setText(spannableStringBuilder);
            }
        }
    }
}
