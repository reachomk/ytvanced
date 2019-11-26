package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;

/* renamed from: alkh */
final class alkh extends ans {
    private final /* synthetic */ alkc a;

    alkh(alkc alkc, Context context) {
        this.a = alkc;
    }

    public final boolean l() {
        AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = this.a.ac;
        if (anchorableTopPeekingScrollView.n || anchorableTopPeekingScrollView.getScrollY() == anchorableTopPeekingScrollView.k) {
            return true;
        }
        return false;
    }
}
