package defpackage;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yzp */
public final class yzp extends yzq implements zap {
    private final TextView a;

    public yzp(View view) {
        super(view, 0);
        this.a = (TextView) view.findViewById(R.id.text);
        this.a.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void a(zas zas) {
        this.a.setTransformationMethod(new yzr(zas));
    }
}
