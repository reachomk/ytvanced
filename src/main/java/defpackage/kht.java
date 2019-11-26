package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.youtube.R;

/* renamed from: kht */
final class kht extends ilg {
    private final akoj h;
    private final int i;
    private final PlaylistThumbnailView j = ((PlaylistThumbnailView) this.c.findViewById(R.id.playlist_thumbnail_start));
    private final PlaylistThumbnailView k = ((PlaylistThumbnailView) this.c.findViewById(R.id.playlist_thumbnail_top_end));
    private final PlaylistThumbnailView l = ((PlaylistThumbnailView) this.c.findViewById(R.id.playlist_thumbnail));
    private final /* synthetic */ khq m;

    public kht(khq khq, Context context, akkq akkq, int i, flu flu, aaas aaas, akvo akvo, akvp akvp) {
        this.m = khq;
        super(context, akkq, akvo, i, akvp);
        this.h = new akoj(aaas, (akou) flu);
        this.i = i;
    }

    public final View K_() {
        return this.c;
    }

    /* renamed from: a */
    public final void a_(akor akor, awug awug) {
        apxu apxu;
        akoj akoj = this.h;
        acvx acvx = akor.a;
        arml arml = null;
        if ((awug.a & 16) != 0) {
            apxu = awug.g;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        arml arml2 = awug.b;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        a(ajqy.a(arml2));
        arml2 = awug.h;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        b(ajqy.a(arml2));
        aygk aygk;
        if (this.i == R.layout.full_bleed_playlist_item_three_up) {
            this.j.c(4);
            this.k.c(4);
            this.l.c(4);
            this.j.a(false);
            this.k.a(false);
            this.l.a(true);
            anyd anyd = awug.d;
            aygk aygk2 = (aygk) anyd.get(0);
            aygk aygk3 = (aygk) anyd.get(1);
            aygk = (aygk) anyd.get(2);
            this.j.b(aklb.b(aygk2));
            this.m.a.a(this.j.a, aygk2);
            this.k.b(aklb.b(aygk3));
            this.m.a.a(this.k.a, aygk3);
            this.l.b(aklb.b(aygk));
            this.m.a.a(this.l.a, aygk);
        } else if ((awug.a & 4) != 0) {
            PlaylistThumbnailView playlistThumbnailView = this.e;
            int a = awue.a(awug.l);
            if (a == 0) {
                a = 1;
            }
            playlistThumbnailView.c(a);
            aygk = awug.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            a(aygk);
        }
        if (awug.e.size() > 0) {
            b(awug.e);
            return;
        }
        if ((awug.a & 256) != 0) {
            arml2 = awug.k;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        CharSequence a2 = ajqy.a(arml2);
        if ((awug.a & 256) != 0) {
            arml = awug.k;
            if (arml == null) {
                arml = arml.f;
            }
        }
        a(a2, ajqy.a(arml));
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.h.a();
    }
}
