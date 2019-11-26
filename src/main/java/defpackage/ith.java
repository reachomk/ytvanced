package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ith */
final class ith extends ita {
    private final TextView f = ((TextView) this.b.findViewById(R.id.header));

    public ith(Context context, akkq akkq, aaas aaas, akvo akvo, Handler handler, akvp akvp, int i, ViewGroup viewGroup) {
        super(context, akkq, aaas, akvo, handler, akvp, i, viewGroup);
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
    }
}
