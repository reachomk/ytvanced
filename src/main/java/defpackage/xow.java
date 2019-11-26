package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;

/* renamed from: xow */
public final class xow extends xox {
    public xoy a;
    private ImageView c;
    private View d;
    private boolean e;
    private int f;

    /* Access modifiers changed, original: protected|final */
    public final View a() {
        View a = super.a();
        this.c = (ImageView) a.findViewById(R.id.error_icon);
        this.d = a.findViewById(R.id.error_retry_button);
        View view = this.d;
        if (view != null) {
            view.setOnClickListener(new xov(this));
        }
        a(this.e);
        a(this.f);
        return a;
    }

    public final void a(boolean z) {
        View view = this.d;
        if (view != null) {
            view.setVisibility(!z ? 8 : 0);
        } else {
            this.e = z;
        }
    }

    public final void a(int i) {
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setImageResource(i);
        } else {
            this.f = i;
        }
    }

    public /* synthetic */ xow(LoadingFrameLayout loadingFrameLayout, int i) {
        super(loadingFrameLayout, 3, i, R.id.error_message_text);
    }
}
