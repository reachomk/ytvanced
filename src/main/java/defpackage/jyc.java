package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jyc */
final class jyc implements OnClickListener {
    private final /* synthetic */ jya a;

    jyc(jya jya) {
        this.a = jya;
    }

    public final void onClick(View view) {
        int integer = this.a.c.getInteger(R.integer.channel_header_description_collapsed_lines);
        jya jya = this.a;
        TextView textView = jya.e;
        if (!jya.n) {
            integer = Integer.MAX_VALUE;
        }
        textView.setMaxLines(integer);
        jya jya2 = this.a;
        jya2.n ^= 1;
    }
}
