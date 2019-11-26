package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ilv */
public final class ilv implements akot {
    private final Context a;
    private final ViewGroup b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.feed_source));
    private final TextView d = ((TextView) this.b.findViewById(R.id.video_count));
    private final aadw e;
    private bbnc f;

    public ilv(Context context, aadw aadw) {
        this.a = context;
        this.b = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.suggested_playlist_videos_selection_metadata, null);
        this.e = aadw;
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        bbnc bbnc = this.f;
        if (bbnc != null) {
            bbnc.bK_();
        }
    }

    public final void a(aveh aveh) {
        CharSequence quantityString = this.a.getResources().getQuantityString(R.plurals.selected_video_count, aveh != null ? aveh.getSelectedVideoIds().size() : 0, new Object[]{Integer.valueOf(aveh != null ? aveh.getSelectedVideoIds().size() : 0)});
        xpr.a(this.d, quantityString);
        this.d.setContentDescription(quantityString);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arrk arrk = (arrk) obj;
        TextView textView = this.c;
        arml arml = arrk.b;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        a((aveh) this.e.a(arrk.c));
        this.f = this.e.a(arrk.c, true).a(bbmt.a()).c(new ily(this));
    }
}
