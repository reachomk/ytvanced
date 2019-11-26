package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kff */
public final class kff extends akpl {
    private final Context a;
    private final aaas b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.title));
    private final TextView e = ((TextView) this.c.findViewById(R.id.content));

    public kff(Context context, aaas aaas) {
        this.a = context;
        this.b = aaas;
        this.c = LayoutInflater.from(context).inflate(R.layout.watch_metadata_row, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        auxp auxp = (auxp) obj;
        arml arml = auxp.b;
        if (arml == null) {
            arml = arml.f;
        }
        this.d.setText(ajqy.a(arml));
        this.e.setText(ajqy.a((CharSequence) "  ", aabb.a((arml[]) auxp.c.toArray(new arml[0]), this.b, false)));
        this.c.setContentDescription(this.a.getString(R.string.accessibility_watch_metadata_row, new Object[]{r5, r6}));
    }
}
