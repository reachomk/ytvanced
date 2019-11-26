package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.libraries.youtube.conversation.ui.StickyPlayerContainer;

/* renamed from: fqq */
final /* synthetic */ class fqq implements xpx {
    private final fqo a;
    private final StickyPlayerContainer b;

    fqq(fqo fqo, StickyPlayerContainer stickyPlayerContainer) {
        this.a = fqo;
        this.b = stickyPlayerContainer;
    }

    public final Object get() {
        fqo fqo = this.a;
        StickyPlayerContainer stickyPlayerContainer = this.b;
        if (fqo.b == null) {
            fqo.b = new Rect();
        }
        if (fqo.c == null) {
            fqo.c = new int[2];
        }
        View view = fqo.a;
        Rect rect = fqo.b;
        int[] iArr = fqo.c;
        stickyPlayerContainer.getLocationOnScreen(iArr);
        int i = iArr[1];
        view.getLocationOnScreen(iArr);
        rect.set(0, 0, stickyPlayerContainer.getWidth(), Math.min(stickyPlayerContainer.getHeight(), iArr[1] - i));
        return fqo.b;
    }
}
