package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: kal */
public final class kal implements akot {
    public final View a;
    public apxu b;
    private final kap c;
    private final kap d;

    public kal(Context context, akkl akkl, aaas aaas, est est, aklf aklf, akvo akvo, ViewGroup viewGroup) {
        amqw.a((Object) context);
        amqw.a((Object) akvo);
        amqw.a((Object) aklf);
        amqw.a((Object) est);
        amqw.a((Object) akkl);
        amqw.a((Object) aaas);
        this.a = LayoutInflater.from(context).inflate(R.layout.compact_channel_recommendation_card, viewGroup, false);
        this.c = new kap(context, akkl, est, aklf, akvo, this.a, R.id.centered_card_view_stub);
        this.d = new kap(context, akkl, est, aklf, akvo, this.a, R.id.left_align_card_view_stub);
        this.a.setOnClickListener(new kak(this, aaas));
        this.a.setTag(R.id.offset_adjuster_tag, new kan(this));
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.c.b();
        this.d.b();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ajsy ajsy = (ajsy) obj;
        this.b = ajsy.f;
        aqds aqds = ajsy.g;
        if (!(aqds == null || (aqds.a & 1) == 0)) {
            int a = aqdu.a(aqds.b);
            if (a != 0 && a == 4) {
                this.d.a(ajsy, akor);
                this.c.a();
                return;
            }
        }
        this.c.a(ajsy, akor);
        this.d.a();
    }
}
