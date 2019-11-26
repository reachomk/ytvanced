package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: yzn */
public final class yzn implements zah {
    public OnClickListener a;
    private final View b;
    private final View c;

    public yzn(View view) {
        this.b = (View) amqw.a(view.findViewById(R.id.progress));
        this.c = (View) amqw.a(view.findViewById(R.id.error_retry));
        ((View) amqw.a(this.c.findViewById(R.id.retry))).setOnClickListener(new yzm(this));
    }

    public final void a(OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    public final void a(boolean z) {
        if (z) {
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(4);
        }
    }

    public final void b(boolean z) {
        if (z) {
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(4);
        }
    }
}
