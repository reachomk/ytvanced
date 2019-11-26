package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;

/* renamed from: ioa */
final class ioa extends akne {
    public ioa(Context context, akpb akpb) {
        super(context, akpb);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(0, -2, 1.0f));
        return frameLayout;
    }
}
