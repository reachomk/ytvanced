package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kbg */
public final class kbg extends akpl {
    public final aaas a;
    public appk b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.privacy_text));
    private final ImageView e = ((ImageView) this.c.findViewById(R.id.privacy_link_button));

    public kbg(Context context, aaas aaas) {
        this.a = (aaas) amqw.a((Object) aaas);
        this.c = View.inflate(context, R.layout.content_view_privacy_link, null);
        this.e.setOnClickListener(new kbj(this));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        CharSequence a;
        appk appk = (appk) obj;
        this.b = appk;
        if ((appk.a & 1) != 0) {
            arml arml = appk.b;
            if (arml == null) {
                arml = arml.f;
            }
            a = ajqy.a(arml);
        } else {
            a = "";
        }
        this.d.setText(a);
        this.e.setContentDescription(a);
    }
}
