package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kmi */
final class kmi implements akot {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.title));
    private final TextView c = ((TextView) this.a.findViewById(R.id.subtitle));

    public kmi(ViewGroup viewGroup) {
        this.a = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.topic_picker_header, viewGroup, false);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        kmj kmj = (kmj) obj;
        xpr.a(this.b, kmj.a);
        xpr.a(this.c, kmj.b);
    }
}
