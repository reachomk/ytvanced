package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.google.android.libraries.youtube.conversation.ui.LongClickLinearLayout;

/* renamed from: zbz */
public final class zbz implements OnLongClickListener {
    private final /* synthetic */ LongClickLinearLayout a;

    public zbz(LongClickLinearLayout longClickLinearLayout) {
        this.a = longClickLinearLayout;
    }

    public final boolean onLongClick(View view) {
        LongClickLinearLayout longClickLinearLayout = this.a;
        OnLongClickListener onLongClickListener = longClickLinearLayout.a;
        if (onLongClickListener == null || longClickLinearLayout.c) {
            return true;
        }
        longClickLinearLayout.b = true;
        return onLongClickListener.onLongClick(longClickLinearLayout);
    }
}
