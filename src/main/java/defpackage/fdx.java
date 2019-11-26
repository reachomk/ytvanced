package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* renamed from: fdx */
final /* synthetic */ class fdx implements OnFocusChangeListener {
    private final YouTubeTextView a;

    fdx(YouTubeTextView youTubeTextView) {
        this.a = youTubeTextView;
    }

    public final void onFocusChange(View view, boolean z) {
        xpr.a(this.a, false);
    }
}
