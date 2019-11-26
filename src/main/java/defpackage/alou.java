package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: alou */
public final class alou implements akot {
    private final aloy a;
    private final View b;
    private final aloz c;
    private final TextView d = ((TextView) this.b.findViewById(R.id.user_public_name));

    public alou(Context context, akkq akkq, aloy aloy) {
        this.a = (aloy) amqw.a((Object) aloy);
        this.b = View.inflate(context, R.layout.connection, null);
        this.c = new aloz(akkq, (ImageView) this.b.findViewById(R.id.connection_thumbnail));
        this.b.setOnClickListener(new alox(aloy));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aqtk aqtk;
        aqkg aqkg = (aqkg) obj;
        this.b.setTag(aqkg);
        this.b.setSelected(this.a.b(aqkg));
        arml arml = null;
        if ((aqkg.a & 4) != 0) {
            aqtk = aqkg.d;
            if (aqtk == null) {
                aqtk = aqtk.c;
            }
        } else {
            aqtk = null;
        }
        aloq.a(aqtk, this.c);
        TextView textView = this.d;
        if ((aqkg.a & 1) != 0) {
            arml = aqkg.b;
            if (arml == null) {
                arml = arml.f;
            }
        }
        textView.setText(ajqy.a(arml));
    }
}
