package defpackage;

import android.view.View.OnClickListener;
import android.widget.TextView;

/* renamed from: aitp */
public final class aitp {
    private final TextView a;

    public aitp(TextView textView) {
        this.a = (TextView) amqw.a((Object) textView);
    }

    public final void a(int i) {
        this.a.setVisibility(i);
    }

    public final void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void a(OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("[");
        stringBuilder.append(this.a.getId());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
