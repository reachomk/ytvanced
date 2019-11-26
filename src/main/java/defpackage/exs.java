package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: exs */
public final class exs extends aiua {
    public final TextView a;
    private boolean b = false;
    private final View c;

    public exs(Context context) {
        super(context);
        this.c = LayoutInflater.from(context).inflate(R.layout.trailer_overlay, this);
        this.a = (TextView) this.c.findViewById(R.id.message);
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void c() {
        this.a.setText("");
        d();
    }

    public final void a(boolean z) {
        this.b = z;
        d();
    }

    public final void d() {
        if (!this.b || this.a.getText().length() <= 0) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
        }
    }
}
