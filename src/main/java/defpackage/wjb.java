package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;

/* renamed from: wjb */
final class wjb extends akne {
    public wjb(Context context, akpb akpb) {
        super(context, akpb);
    }

    public final View a(akor akor, ajsn ajsn, int i) {
        akor = a(akor);
        akor.a("replyIndex", Integer.valueOf(i));
        akor.a("indentedComment", Boolean.valueOf(true));
        return a(akor, ajsn);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -2));
        return frameLayout;
    }
}
