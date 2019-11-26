package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: klu */
public final class klu implements akot {
    public final aaas a;
    private final View b;
    private final YouTubeTextView c = ((YouTubeTextView) this.b.findViewById(R.id.title_view));
    private final YouTubeTextView d = ((YouTubeTextView) this.b.findViewById(R.id.subtitle_view));
    private final YouTubeTextView e = ((YouTubeTextView) this.b.findViewById(R.id.subtitle_view2));
    private final YouTubeTextView f = ((YouTubeTextView) this.b.findViewById(R.id.link_view));
    private final YouTubeTextView g = ((YouTubeTextView) this.b.findViewById(R.id.calendar_month));
    private final YouTubeTextView h = ((YouTubeTextView) this.b.findViewById(R.id.calendar_day));

    public klu(Context context, aaas aaas) {
        this.b = LayoutInflater.from(context).inflate(R.layout.ticket_event, null, false);
        this.a = aaas;
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aygq aygq = (aygq) obj;
        xpr.a(this.c, aygq.b);
        xpr.a(this.d, aygq.d);
        xpr.a(this.e, aygq.e);
        this.b.setContentDescription(aygq.c);
        this.g.setText(aygq.i);
        this.h.setText(aygq.j);
        xpr.a(this.f, aygq.k);
        if ((aygq.a & 256) == 0) {
            this.b.setClickable(false);
        } else {
            this.b.setOnClickListener(new klx(this, aygq));
            this.b.setClickable(true);
        }
        akor.a.a(aygq.l.d(), null);
    }
}
