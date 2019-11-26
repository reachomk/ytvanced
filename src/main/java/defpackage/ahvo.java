package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.common.ui.TouchImageView;

/* renamed from: ahvo */
public final class ahvo implements ahvm, OnClickListener {
    private ahvp a;
    private final TouchImageView b;

    public ahvo(TouchImageView touchImageView) {
        this.b = touchImageView;
        touchImageView.setOnClickListener(this);
    }

    public final void a(boolean z) {
        xpr.a(this.b, z);
    }

    public final void a(ahvp ahvp) {
        this.a = ahvp;
    }

    public final void onClick(View view) {
        ahvp ahvp = this.a;
        if (ahvp != null) {
            ahvp.a();
        }
    }
}
