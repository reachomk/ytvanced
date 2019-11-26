package defpackage;

import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;

/* renamed from: alke */
final /* synthetic */ class alke implements apg {
    private final alkc a;

    alke(alkc alkc) {
        this.a = alkc;
    }

    public final void a() {
        int i;
        alkc alkc = this.a;
        int height = alkc.ae.getHeight();
        for (i = 0; i < alkc.af.getChildCount(); i++) {
            height += alkc.af.getChildAt(i).getHeight();
        }
        height += alkc.aj.a();
        AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = alkc.ac;
        if (anchorableTopPeekingScrollView.n) {
            anchorableTopPeekingScrollView.p = height;
            i = anchorableTopPeekingScrollView.k;
            height = Math.min((height + (i + i)) - anchorableTopPeekingScrollView.o, i);
            anchorableTopPeekingScrollView.a(height, height);
            anchorableTopPeekingScrollView.b(height);
        }
    }
}
