package defpackage;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;

/* renamed from: xox */
public class xox {
    private final int a;
    public View b;
    private final int c;
    private final int d;
    private TextView e;
    private CharSequence f;
    private final /* synthetic */ LoadingFrameLayout g;

    /* Access modifiers changed, original: protected */
    public View a() {
        View inflate = LayoutInflater.from(this.g.a).inflate(this.c, this.g, false);
        int i = this.d;
        if (i > 0) {
            this.e = (TextView) inflate.findViewById(i);
            this.e.setMovementMethod(LinkMovementMethod.getInstance());
            a(this.f);
        }
        return inflate;
    }

    public final void b(int i) {
        if (this.a == i) {
            if (this.b == null) {
                this.b = a();
                this.g.addView(this.b);
            }
            this.b.setVisibility(0);
            return;
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(8);
            this.b.clearFocus();
        }
    }

    public final void a(CharSequence charSequence) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(charSequence);
            this.f = null;
            return;
        }
        this.f = charSequence;
    }

    public /* synthetic */ xox(LoadingFrameLayout loadingFrameLayout, int i, int i2, int i3) {
        this.g = loadingFrameLayout;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }
}
