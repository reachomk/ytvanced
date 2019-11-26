package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ite */
final class ite extends ita {
    private final TextView f = ((TextView) this.b.findViewById(R.id.header));
    private final TextView g = ((TextView) this.b.findViewById(R.id.section_title));

    public ite(Context context, akkq akkq, aaas aaas, akvo akvo, Handler handler, akvp akvp, ViewGroup viewGroup) {
        super(context, akkq, aaas, akvo, handler, akvp, R.layout.clarification_item_large, viewGroup);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, boolean z) {
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aptw aptw) {
        super.a(aptw);
        TextView textView = this.f;
        arml arml = aptw.j;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.g;
        arml = aptw.k;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.c;
        arml arml2 = aptw.d;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
    }
}
