package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.conversation.ui.FacePileView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: yxg */
public final class yxg {
    public yxi a;
    private final View b;
    private final FacePileView c = ((FacePileView) this.b.findViewById(R.id.face_pile));
    private final TextView d = ((TextView) this.b.findViewById(R.id.hearters_overflow));

    public yxg(View view, akkq akkq) {
        this.b = view.findViewById(R.id.heart_face_pile_and_overflow);
        this.c.a = akkq;
        this.b.setOnClickListener(new yxj(this));
    }

    public final void a(List list, int i) {
        if (list == null || list.isEmpty()) {
            xpr.a(this.b, false);
            return;
        }
        this.c.a(list, i);
        xpr.a(this.b, true);
    }

    public final void a(int i) {
        CharSequence quantityString;
        if (i > 0) {
            quantityString = this.b.getResources().getQuantityString(R.plurals.overflow_hearters, i, new Object[]{Integer.valueOf(i)});
        } else {
            quantityString = null;
        }
        xpr.a(this.d, quantityString);
    }
}
