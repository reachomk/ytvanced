package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.youtube.R;

/* renamed from: ein */
public final class ein extends eiq {
    public eir a;
    public final /* synthetic */ SpecificNetworkErrorViewLoadingFrameLayout b;
    private ImageView c;
    private View d;
    private View e;
    private boolean f;
    private int g;
    private boolean h;

    /* Access modifiers changed, original: protected|final */
    public final View a() {
        View a = super.a();
        this.c = (ImageView) a.findViewById(R.id.error_icon);
        this.d = a.findViewById(R.id.error_retry_button);
        this.e = a.findViewById(R.id.account_instructions_button);
        View view = this.d;
        if (view != null) {
            view.setOnClickListener(new eim(this));
        }
        view = this.e;
        if (view != null) {
            view.setOnClickListener(new eip(this));
        }
        a(this.f);
        b(this.h);
        a(this.g);
        return a;
    }

    public final void a(boolean z) {
        View view = this.d;
        if (view != null) {
            view.setVisibility(!z ? 8 : 0);
        } else {
            this.f = z;
        }
    }

    public final void b(boolean z) {
        View view = this.e;
        if (view != null) {
            view.setVisibility(!z ? 8 : 0);
        } else {
            this.h = z;
        }
    }

    public final void a(int i) {
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setImageResource(i);
        } else {
            this.g = i;
        }
    }

    public /* synthetic */ ein(SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout, int i) {
        this.b = specificNetworkErrorViewLoadingFrameLayout;
        super(specificNetworkErrorViewLoadingFrameLayout, 3, i, R.id.error_message_text);
    }
}
