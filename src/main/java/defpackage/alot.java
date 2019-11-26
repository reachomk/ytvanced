package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: alot */
public final class alot implements akot, OnClickListener {
    private final alov a;
    private final View b;
    private final aloz c;
    private final TextView d = ((TextView) this.b.findViewById(R.id.user_public_name));

    public alot(Context context, akkq akkq, alov alov) {
        this.a = (alov) amqw.a((Object) alov);
        this.b = View.inflate(context, R.layout.connection, null);
        this.c = new aloz(akkq, (ImageView) this.b.findViewById(R.id.connection_thumbnail));
        this.b.setOnClickListener(this);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final void onClick(View view) {
        aqke aqke = (aqke) view.getTag();
        if (this.a.a(aqke)) {
            view.setSelected(this.a.b(aqke));
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aqke aqke = (aqke) obj;
        this.b.setTag(aqke);
        this.b.setSelected(this.a.b(aqke));
        aqtk aqtk = aqke.d;
        if (aqtk == null) {
            aqtk = aqtk.c;
        }
        aloq.a(aqtk, this.c);
        TextView textView = this.d;
        arml arml = aqke.b;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
    }
}
