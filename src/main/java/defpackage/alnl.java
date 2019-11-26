package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: alnl */
public final class alnl implements akot {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.title));
    private final View c = this.a.findViewById(R.id.divider);

    public alnl(Context context) {
        this.a = LayoutInflater.from(context).inflate(R.layout.phonebook_section_title, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        avzc avzc = (avzc) obj;
        TextView textView = this.b;
        if ((avzc.a & 1) != 0) {
            arml = avzc.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        this.c.setVisibility(akor.a("position", -1) != 0 ? 0 : 8);
    }
}
