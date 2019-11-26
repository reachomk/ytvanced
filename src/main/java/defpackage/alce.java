package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: alce */
final class alce implements OnClickListener {
    private final /* synthetic */ OnClickListener a;
    private final /* synthetic */ albo b;

    alce(OnClickListener onClickListener, albo albo) {
        this.a = onClickListener;
        this.b = albo;
    }

    public final void onClick(View view) {
        OnClickListener onClickListener = this.a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this.b.e();
    }
}
