package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kgt */
public final class kgt implements akot {
    public awjb a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.title));

    public kgt(Context context, aaas aaas) {
        this.b = LayoutInflater.from(context).inflate(R.layout.playlist_panel_link_layout, null);
        this.b.setOnClickListener(new kgs(this, aaas));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        awjb awjb = (awjb) obj;
        this.a = awjb;
        akor.a.a(awjb.d.d(), null);
        xpr.a(this.c, awjb.b);
    }
}
