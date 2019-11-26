package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: ilg */
public abstract class ilg implements akot {
    private static final arwh h = arwh.UNKNOWN;
    public final Context a;
    public final hmc b;
    public final View c;
    public final TextView d;
    public final PlaylistThumbnailView e;
    public final ViewStub f;
    public hlv g;
    private final akkq i;
    private final akvo j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final View n;
    private final akvp o;

    public ilg(Context context, akkq akkq, akvo akvo, int i, akvp akvp) {
        this(context, akkq, akvo, i, akvp, null, null);
    }

    public ilg(Context context, akkq akkq, akvo akvo, akvp akvp, hmc hmc) {
        this(context, akkq, akvo, R.layout.compact_playlist_item, akvp, null, hmc);
    }

    public ilg(Context context, akkq akkq, akvo akvo, akvp akvp, ViewGroup viewGroup) {
        this(context, akkq, akvo, R.layout.playlist_card_item, akvp, viewGroup, null);
    }

    private ilg(Context context, akkq akkq, akvo akvo, int i, akvp akvp, ViewGroup viewGroup, hmc hmc) {
        this.a = (Context) amqw.a((Object) context);
        this.i = (akkq) amqw.a((Object) akkq);
        this.j = (akvo) amqw.a((Object) akvo);
        this.o = akvp;
        this.b = hmc;
        this.c = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.d = (TextView) this.c.findViewById(R.id.title);
        this.k = (TextView) this.c.findViewById(R.id.owner);
        this.l = (TextView) this.c.findViewById(R.id.video_count);
        this.m = (TextView) this.c.findViewById(R.id.bottom_panel_overlay_text);
        this.e = (PlaylistThumbnailView) this.c.findViewById(R.id.playlist_thumbnail);
        this.n = this.c.findViewById(R.id.contextual_menu_anchor);
        this.f = (ViewStub) this.c.findViewById(R.id.offline_badge);
    }

    public static boolean a(List list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final void a(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void b(CharSequence charSequence) {
        xpr.a(this.k, charSequence);
    }

    public final void c(CharSequence charSequence) {
        this.l.setText(charSequence);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        TextView textView = this.e.b;
        xpr.a(textView, charSequence);
        textView.setContentDescription(charSequence2);
    }

    public final void a(awkv awkv, aygk aygk) {
        akkq akkq;
        ImageView imageView;
        aygk aygk2;
        if (awkv == null) {
            this.e.b(false);
            this.i.a(this.e.a, aygk);
        } else if ((awkv.a & 2) != 0) {
            this.e.b(true);
            akkq = this.i;
            imageView = this.e.a;
            awkt awkt = awkv.c;
            if (awkt == null) {
                awkt = awkt.c;
            }
            aygk2 = awkt.b;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
            akkq.a(imageView, aygk2);
        } else {
            this.e.b(false);
            akkq = this.i;
            imageView = this.e.a;
            if ((1 & awkv.a) != 0) {
                awkx awkx = awkv.b;
                if (awkx == null) {
                    awkx = awkx.c;
                }
                aygk2 = awkx.b;
                if (aygk2 == null) {
                    aygk2 = aygk.f;
                }
            } else {
                aygk2 = null;
            }
            akkq.a(imageView, aygk2);
        }
    }

    public final void a(aygk aygk) {
        this.e.b(aklb.b(aygk));
        this.i.a(this.e.a, aygk);
    }

    public final void b(List list) {
        for (ayfu ayfu : list) {
            int i = ayfu.a;
            if ((i & 128) != 0) {
                arwh a;
                ayfs ayfs = ayfu.i;
                if (ayfs == null) {
                    ayfs = ayfs.d;
                }
                TextView textView = this.e.b;
                arml arml = ayfs.b;
                if (arml == null) {
                    arml = arml.f;
                }
                CharSequence a2 = ajqy.a(arml);
                xpr.a(textView, a2);
                textView.setContentDescription(this.a.getResources().getQuantityString(R.plurals.video_count, (ayfs.a & 1) != 0 ? xvd.a(a2.toString(), 0) : 0, new Object[]{Integer.valueOf((ayfs.a & 1) != 0 ? xvd.a(a2.toString(), 0) : 0)}));
                if ((ayfs.a & 2) != 0) {
                    arwf arwf = ayfs.c;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    a = arwh.a(arwf.b);
                    if (a == null) {
                        a = arwh.UNKNOWN;
                    }
                } else {
                    a = h;
                }
                this.e.a(this.o.a(a));
                this.e.a(true);
                TextView textView2 = this.m;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else if ((i & 2) != 0) {
                ayfe ayfe = ayfu.c;
                if (ayfe == null) {
                    ayfe = ayfe.c;
                }
                this.e.a(false);
                arml arml2 = ayfe.b;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                Spanned a3 = ajqy.a(arml2);
                if (!(this.m == null || TextUtils.isEmpty(a3))) {
                    this.m.setVisibility(0);
                    this.m.setText(a3);
                    this.m.setContentDescription(a3);
                }
            }
        }
    }

    public final void a(View view, auvr auvr, Object obj, acvx acvx) {
        auvn auvn;
        akvo akvo = this.j;
        View view2 = this.n;
        if (auvr == null || (auvr.a & 1) == 0) {
            auvn = null;
        } else {
            auvn auvn2 = auvr.b;
            if (auvn2 == null) {
                auvn2 = auvn.l;
            }
            auvn = auvn2;
        }
        akvo.a(view, view2, auvn, obj, acvx);
    }

    public void a(akpb akpb) {
        hlv hlv = this.g;
        if (hlv != null) {
            hlv.a();
        }
    }
}
