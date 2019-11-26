package defpackage;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;

/* renamed from: eiq */
public class eiq {
    private final int a;
    private final int b;
    private final int c;
    private View d;
    private TextView e;
    private CharSequence f;
    private final /* synthetic */ SpecificNetworkErrorViewLoadingFrameLayout g;

    /* Access modifiers changed, original: protected */
    public View a() {
        View inflate = LayoutInflater.from(this.g.a).inflate(this.b, this.g, false);
        int i = this.c;
        if (i > 0) {
            this.e = (TextView) inflate.findViewById(i);
            this.e.setMovementMethod(LinkMovementMethod.getInstance());
            a(this.f);
        }
        return inflate;
    }

    public final void b(int i) {
        if (this.a == i) {
            if (this.d == null) {
                this.d = a();
                this.g.addView(this.d);
            }
            this.d.setVisibility(0);
            return;
        }
        View view = this.d;
        if (view != null) {
            view.setVisibility(8);
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

    public /* synthetic */ eiq(SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout, int i, int i2, int i3) {
        this.g = specificNetworkErrorViewLoadingFrameLayout;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
