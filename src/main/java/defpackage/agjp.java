package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: agjp */
public final class agjp implements akot {
    private final Context a;
    private final ViewGroup b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.video_title));
    private final ListView d = ((ListView) this.b.findViewById(R.id.ad_list));
    private final TextView e = ((TextView) this.b.findViewById(R.id.empty_ad));
    private final akpk f;

    public agjp(Context context, akoe akoe) {
        this.a = context;
        this.b = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.debug_offline_ad_video_entry, null);
        aknw aknw = new aknw();
        aknw.a(agjl.class, new agjn(context));
        akoc a = akoe.a(aknw);
        this.f = new akpk();
        a.a(this.f);
        this.d.setAdapter(a);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        agjq agjq = (agjq) obj;
        this.c.setText(agjq.a.a(this.a));
        List list = agjq.b;
        if (list != null && !list.isEmpty()) {
            this.e.setVisibility(8);
            this.f.clear();
            this.f.addAll(agjq.b);
        }
    }
}
