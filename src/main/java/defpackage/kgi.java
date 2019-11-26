package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.youtube.R;

/* renamed from: kgi */
public final class kgi implements akot {
    public final aaas a;
    public hal b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.title));
    private final TextView e = ((TextView) this.c.findViewById(R.id.author));
    private final TextView f = ((TextView) this.c.findViewById(R.id.video_count));
    private final PlaylistThumbnailView g = ((PlaylistThumbnailView) this.c.findViewById(R.id.playlist_thumbnail));
    private final View h = this.c.findViewById(R.id.contextual_menu_anchor);
    private final View i = this.c.findViewById(R.id.feed_entry);
    private final ImageView j = ((ImageView) this.c.findViewById(R.id.channel_avatar));
    private final TextView k = ((TextView) this.c.findViewById(R.id.feed_text));
    private final akkq l;
    private final akvo m;
    private final akoj n;

    public kgi(Context context, akkq akkq, aaas aaas, akvo akvo) {
        this.l = (akkq) amqw.a((Object) akkq);
        this.m = (akvo) amqw.a((Object) akvo);
        this.a = (aaas) amqw.a((Object) aaas);
        this.c = View.inflate(context, R.layout.playlist_feed_entry, null);
        this.n = new akoj(aaas, this.c);
        this.i.setOnClickListener(new kgl(this));
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.n.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        awkv awkv;
        obj = (hal) obj;
        akoj akoj = this.n;
        acvx acvx = akor.a;
        hak a = obj.a();
        auvn auvn = null;
        if (a.b == null) {
            apxu apxu;
            awjp awjp = a.a;
            if ((awjp.a & 32) != 0) {
                apxu = awjp.i;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = null;
            }
            a.b = apxu;
        }
        akoj.a(acvx, a.b, akor.b());
        akor.a.a(obj.a().a.q.d(), null);
        aabd.a(this.a, obj.a.g, obj);
        this.b = obj;
        this.l.a(this.j, obj.a.a);
        TextView textView = this.k;
        if (textView != null) {
            textView.setText(ajqy.a(obj.a.c));
        }
        hak a2 = obj.a();
        TextView textView2 = this.d;
        arml arml = a2.a.c;
        if (arml == null) {
            arml = arml.f;
        }
        textView2.setText(ajqy.a(arml));
        textView2 = this.e;
        awjp awjp2 = a2.a;
        if ((awjp2.a & 128) != 0) {
            arml = awjp2.k;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView2.setText(ajqy.a(arml));
        textView2 = this.f;
        arml = a2.a.h;
        if (arml == null) {
            arml = arml.f;
        }
        textView2.setText(ajqy.a(arml));
        this.g.b.setText(String.valueOf(a2.a.g));
        awjp awjp3 = a2.a;
        if ((awjp3.a & 4) != 0) {
            awkv = awjp3.d;
            if (awkv == null) {
                awkv = awkv.d;
            }
        } else {
            awkv = null;
        }
        ImageView imageView;
        akkq akkq;
        aygk aygk;
        if (awkv == null) {
            aygk aygk2;
            this.g.b(false);
            akkq akkq2 = this.l;
            imageView = this.g.a;
            if (a2.a.e.size() <= 0) {
                aygk2 = null;
            } else {
                aygk2 = (aygk) a2.a.e.get(0);
            }
            akkq2.a(imageView, aygk2);
        } else if ((awkv.a & 2) == 0) {
            this.g.b(false);
            akkq = this.l;
            imageView = this.g.a;
            if ((awkv.a & 1) != 0) {
                awkx awkx = awkv.b;
                if (awkx == null) {
                    awkx = awkx.c;
                }
                aygk = awkx.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
            } else {
                aygk = null;
            }
            akkq.a(imageView, aygk);
        } else {
            this.g.b(true);
            akkq = this.l;
            imageView = this.g.a;
            awkt awkt = awkv.c;
            if (awkt == null) {
                awkt = awkt.c;
            }
            aygk = awkt.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
        }
        this.h.setVisibility(0);
        akvo akvo = this.m;
        View view = this.h;
        if (obj.a() != null) {
            hak a3 = obj.a();
            auvr auvr = a3.a.o;
            if (auvr == null) {
                auvr = auvr.c;
            }
            if ((1 & auvr.a) != 0) {
                auvr auvr2 = a3.a.o;
                if (auvr2 == null) {
                    auvr2 = auvr.c;
                }
                auvn = auvr2.b;
                if (auvn == null) {
                    auvn = auvn.l;
                }
            }
        }
        akvo.a(view, auvn, obj, akor.a);
    }
}
