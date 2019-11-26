package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: grt */
public final class grt implements akot {
    public grv a;
    private final akkq b;
    private final View c;
    private final ImageView d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;

    public grt(Context context, akkq akkq) {
        amqw.a(akkq != null);
        this.b = akkq;
        this.c = View.inflate(context, R.layout.user_mention_suggestion, null);
        this.d = (ImageView) this.c.findViewById(R.id.channel_thumbnail);
        this.e = (YouTubeTextView) this.c.findViewById(R.id.channel_display_name);
        this.f = (YouTubeTextView) this.c.findViewById(R.id.channel_details);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aywd aywd = (aywd) obj;
        akkq akkq = this.b;
        ImageView imageView = this.d;
        aygk aygk = aywd.d;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        this.e.setText(aywd.c);
        YouTubeTextView youTubeTextView = this.f;
        arml arml = aywd.e;
        if (arml == null) {
            arml = arml.f;
        }
        youTubeTextView.setText(ajqy.a(arml));
        acvx acvx = akor.a;
        acvx.a(aywd.f.d(), null);
        this.a = (grv) akor.a("listener");
        if (this.a != null) {
            this.c.setOnClickListener(new grs(this, acvx, aywd, akor.a("position", -1)));
            return;
        }
        this.c.setOnClickListener(null);
    }
}
