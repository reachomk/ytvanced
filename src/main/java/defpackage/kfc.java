package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kfc */
public final class kfc extends akpl {
    private final aaas a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.content));

    public kfc(Context context, aaas aaas) {
        this.a = aaas;
        this.b = LayoutInflater.from(context).inflate(R.layout.watch_metadata_row_header, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        auxn auxn = (auxn) obj;
        if ((auxn.a & 1) != 0) {
            arml = auxn.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = aabb.a(arml, this.a, false);
        this.c.setText(a);
        this.b.setContentDescription(a);
    }
}
