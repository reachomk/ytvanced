package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yzk */
public final class yzk implements zai {
    private final TextView a;

    public yzk(View view) {
        this.a = (TextView) view.findViewById(R.id.text);
    }

    public final void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
