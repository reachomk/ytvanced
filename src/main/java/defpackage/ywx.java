package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.conversation.ui.FacePileView;
import com.google.android.youtube.R;

/* renamed from: ywx */
public final class ywx {
    public final View a;
    public final FacePileView b = ((FacePileView) amqw.a((FacePileView) this.a.findViewById(R.id.empty_face_pile)));
    public final TextView c;
    public final int d;

    public ywx(View view, xnk xnk) {
        this.a = (View) amqw.a(view.findViewById(R.id.empty));
        xpr.a(this.a, false);
        this.b.a = xnk;
        this.c = (TextView) amqw.a((TextView) this.a.findViewById(R.id.empty_text));
        this.d = xwe.a(view.getContext(), R.attr.ytGeneralBackgroundA, 0);
    }
}
