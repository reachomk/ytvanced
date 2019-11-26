package defpackage;

import android.widget.ImageView;
import com.google.android.libraries.youtube.share.ui.ConversationIconView;

/* renamed from: alpb */
public final class alpb extends xnd {
    private final int a;
    private final /* synthetic */ ConversationIconView b;

    public alpb(ConversationIconView conversationIconView, int i) {
        this.b = conversationIconView;
        this.a = i;
    }

    public final void a(ImageView imageView) {
        if (this.b.a(this.a)) {
            this.b.invalidate();
        }
    }
}
