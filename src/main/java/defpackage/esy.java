package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: esy */
public final class esy implements akot {
    public final aaas a;
    private final View b;
    private final View c = this.b.findViewById(R.id.info_layout);
    private final YouTubeTextView d = ((YouTubeTextView) this.b.findViewById(R.id.title_view));
    private final YouTubeTextView e = ((YouTubeTextView) this.b.findViewById(R.id.subtitle_view));
    private final YouTubeTextView f = ((YouTubeTextView) this.b.findViewById(R.id.subtitle_view2));
    private final Button g = ((Button) this.b.findViewById(R.id.ticket_button));
    private final YouTubeTextView h = ((YouTubeTextView) this.b.findViewById(R.id.more_tickets_text));
    private final ImageView i = ((ImageView) this.b.findViewById(R.id.sponsored_icon));
    private final View j = this.b.findViewById(R.id.calendar_view);
    private final YouTubeTextView k = ((YouTubeTextView) this.b.findViewById(R.id.calendar_month));
    private final YouTubeTextView l = ((YouTubeTextView) this.b.findViewById(R.id.calendar_day));
    private final View m = this.b.findViewById(R.id.divider);

    public esy(Context context, aaas aaas) {
        this.b = LayoutInflater.from(context).inflate(R.layout.ticket_companion, null, false);
        this.a = aaas;
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        etc etc = (etc) obj;
        acvx acvx = akor.a;
        aygs aygs = (aygs) etc.a.b.get(0);
        aygq aygq = aygs.a == 136346452 ? (aygq) aygs.b : aygq.m;
        xpr.a(this.d, aygq.b);
        xpr.a(this.e, aygq.d);
        this.c.setContentDescription(aygq.c);
        if (akor.a("always_display_as_grid", false)) {
            this.j.setVisibility(8);
            this.f.setVisibility(0);
            this.f.setText(aygq.e);
        } else {
            this.j.setVisibility(0);
            this.f.setVisibility(8);
        }
        this.k.setText(aygq.i);
        this.l.setText(aygq.j);
        if (aygq.f.isEmpty()) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
            this.g.setText(aygq.f);
            this.g.setContentDescription(aygq.g);
            this.g.setOnClickListener(new esx(this, aygq));
        }
        if ((etc.a.a & 1024) == 0) {
            this.h.setClickable(false);
        } else {
            this.h.setOnClickListener(new eta(this, etc, akor));
            this.h.setClickable(true);
        }
        aygu aygu = etc.a;
        CharSequence charSequence = (aygu.a & 4) != 0 ? aygu.c : null;
        this.h.setText(charSequence);
        if (charSequence == null || charSequence.length() <= 0) {
            this.h.setVisibility(8);
            this.m.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.m.setVisibility(0);
        }
        if ((etc.a.a & 512) == 0) {
            xpr.a(this.i, false);
        } else {
            xpr.a(this.i, true);
            this.i.setContentDescription(etc.a.d);
            this.i.setOnClickListener(new esz(this, etc));
        }
        acvx.a(aygq.l.d(), null);
        acvx.a(etc.a.g.d(), null);
    }
}
