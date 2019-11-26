package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.common.ui.TouchImageView;

/* renamed from: ibn */
public final /* synthetic */ class ibn implements OnClickListener {
    private final ibo a;
    private final TouchImageView b;

    public ibn(ibo ibo, TouchImageView touchImageView) {
        this.a = ibo;
        this.b = touchImageView;
    }

    public final void onClick(View view) {
        ibo ibo = this.a;
        TouchImageView touchImageView = this.b;
        if (ibo.e != null) {
            if (!ibo.a) {
                ibo.b.a(3, new acvs(acwc.FULLSCREEN_OPEN_WITH_BUTTON), null);
            }
            ibo.e.b(touchImageView.isSelected() ^ 1);
        }
    }
}
