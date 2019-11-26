package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.conversation.ui.FacePileView;
import com.google.android.youtube.R;

/* renamed from: yeu */
public final class yeu implements akot {
    private final View a;
    private final FacePileView b = ((FacePileView) this.a.findViewById(R.id.facepile));
    private final TextView c;
    private final aaas d;

    public yeu(Context context, akkq akkq, aaas aaas) {
        this.d = (aaas) amqw.a((Object) aaas);
        this.a = View.inflate(context, R.layout.conversation_metadata_item, null);
        this.b.a = akkq;
        this.c = (TextView) this.a.findViewById(R.id.metadata_detail_text);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aqnt aqnt = (aqnt) obj;
        Context context = this.a.getContext();
        if (aqnt.f.size() <= 0) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.b.a(aqnt.f, xwe.a(context, R.attr.ytGeneralBackgroundA, 0));
        }
        TextView textView = this.c;
        if ((aqnt.a & 8) != 0) {
            arml = aqnt.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(aabb.a(arml, this.d, false));
        this.c.setMovementMethod(LinkMovementMethod.getInstance());
        this.c.setHighlightColor(0);
    }
}
