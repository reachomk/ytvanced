package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.DurationBadgeView;
import com.google.android.youtube.R;

/* renamed from: ipg */
public final class ipg implements akot {
    public final acvx a;
    public apxu b;
    public awvz c;
    private final View d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final DurationBadgeView h;
    private final View i;
    private final ipk j;
    private final fnk k;
    private final akvo l;
    private final Resources m;
    private final akkq n;

    public ipg(Context context, akkq akkq, aaas aaas, akvo akvo, acwa acwa, zyw zyw, ViewGroup viewGroup) {
        if (!wvl.a(zyw)) {
            context = xuv.a(context, null, R.style.f516Theme.YouTube.Dark);
        }
        this.n = akkq;
        this.l = akvo;
        this.a = acwa.t();
        this.m = context.getResources();
        this.d = LayoutInflater.from(context).inflate(R.layout.red_carpet_video_view, viewGroup, false);
        View findViewById = this.d.findViewById(R.id.thumbnail_container);
        this.d.setOnClickListener(new ipj(this, aaas));
        this.e = (ImageView) findViewById.findViewById(R.id.video_image);
        this.f = (TextView) this.d.findViewById(R.id.video_title);
        this.g = (TextView) this.d.findViewById(R.id.video_subtitle);
        this.h = (DurationBadgeView) findViewById.findViewById(R.id.video_duration);
        View findViewById2 = findViewById.findViewById(R.id.red_badge_overlay);
        ViewStub viewStub = (ViewStub) findViewById.findViewById(R.id.resume_playback_overlay);
        this.i = this.d.findViewById(R.id.contextual_menu_anchor);
        this.j = ipn.a(findViewById2);
        this.k = new fnk(viewStub);
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        LayoutParams layoutParams = this.d.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.m.getDimensionPixelSize(R.dimen.red_carpet_video_thumbnail_width);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        auvn auvn;
        awvz awvz = (awvz) obj;
        this.c = awvz;
        arml arml2 = null;
        this.a.a(awvz.g.d(), null);
        apxu apxu = awvz.e;
        if (apxu == null) {
            apxu = apxu.d;
        }
        this.b = apxu;
        akkq akkq = this.n;
        ImageView imageView = this.e;
        aygk aygk = awvz.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        ImageView imageView2 = this.e;
        aygk aygk2 = awvz.b;
        if (aygk2 == null) {
            aygk2 = aygk.f;
        }
        imageView2.setContentDescription(ezh.a(aygk2));
        for (awvv awvv : awvz.f) {
            int i = awvv.a;
            if (i == 121720768) {
                ayfy ayfy = (ayfy) awvv.b;
                arml arml3 = ayfy.b;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
                CharSequence a = ajqy.a(arml3);
                if ((ayfy.a & 1) != 0) {
                    arml = ayfy.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                CharSequence b = ajqy.b(arml);
                xpr.a(this.h, a);
                if (!(this.h == null || TextUtils.isEmpty(a))) {
                    this.h.setContentDescription(b);
                    this.h.b();
                }
            } else if (i == 110282477) {
                ayfq ayfq = (ayfq) awvv.b;
                if (ayfq.b != 0) {
                    this.k.a(ayfq);
                } else {
                    fnk fnk = this.k;
                    fnk.a();
                    fnk.a.setVisibility(0);
                    fnk.b.setVisibility(0);
                    fnk.b.setProgress(0);
                }
            } else if (i == 104364901) {
                this.j.a((apeb) awvv.b);
            }
        }
        akvo akvo = this.l;
        View view = this.d;
        View view2 = this.i;
        auvr auvr = awvz.i;
        if (auvr == null) {
            auvr = auvr.c;
        }
        if ((auvr.a & 1) == 0) {
            auvn = null;
        } else {
            auvr = awvz.i;
            if (auvr == null) {
                auvr = auvr.c;
            }
            auvn auvn2 = auvr.b;
            if (auvn2 == null) {
                auvn2 = auvn.l;
            }
            auvn = auvn2;
        }
        akvo.a(view, view2, auvn, awvz, this.a);
        TextView textView = this.f;
        if ((awvz.a & 2) != 0) {
            arml = awvz.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.g;
        if ((awvz.a & 4) != 0) {
            arml2 = awvz.d;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml2));
    }
}
