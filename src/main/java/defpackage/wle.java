package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: wle */
public final class wle extends akne {
    public wle(Context context, akpb akpb) {
        super(context, akpb);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -2));
        return frameLayout;
    }
}
