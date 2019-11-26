package defpackage;

import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: vyy */
public final class vyy {
    public boolean a;
    private final TextView b;

    public vyy(TextView textView) {
        this.b = textView;
        a();
    }

    public final void a() {
        a(false, true);
        this.b.setText("");
    }

    public final void a(boolean z, boolean z2) {
        if (z2 || this.a != z) {
            this.a = z;
            this.b.setClickable(z);
            this.b.setEnabled(z);
            TextView textView = this.b;
            textView.setCompoundDrawablePadding(z ? (int) (textView.getResources().getDisplayMetrics().density * 6.0f) : 0);
            this.b.setCompoundDrawablesWithIntrinsicBounds(0, 0, !z ? 0 : R.drawable.ad_choices_instream_icon, 0);
        }
    }
}
