package defpackage;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* renamed from: ewz */
public final class ewz extends aiua {
    public YouTubeTextView a;

    public ewz(Context context) {
        super(context);
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void c() {
        YouTubeTextView youTubeTextView = this.a;
        if (youTubeTextView != null) {
            youTubeTextView.setText(null);
            setVisibility(8);
        }
    }
}
