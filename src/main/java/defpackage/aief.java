package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: aief */
public final class aief implements aiek {
    private View a = null;
    private final Context b;

    public aief(Context context) {
        this.b = (Context) amqw.a((Object) context);
    }

    public final void c() {
    }

    public final View a() {
        if (this.a == null) {
            this.a = LayoutInflater.from(this.b).inflate(R.layout.flag_overflow_button, null);
        }
        return this.a;
    }

    public final void b() {
        View view = this.a;
        if (view != null) {
            xpr.a(view, false);
        }
    }
}
