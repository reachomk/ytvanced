package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import java.util.Set;

/* renamed from: hmk */
public final class hmk implements akot, OnClickListener, xcp {
    private final OnGlobalLayoutListener A;
    private final hnj B;
    private agqp C;
    private int D;
    private final eqf E;
    private hlv F;
    private fnk G;
    private View H;
    private final TextView a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final View e;
    private final View f;
    private final View g;
    private final View h;
    private final ImageView i;
    private final OfflineArrowView j;
    private final Context k;
    private final Resources l;
    private final agwh m;
    private final agvx n;
    private final agwf o;
    private final akkq p;
    private final akou q;
    private final String r;
    private final String s;
    private final hsy t;
    private final hmc u;
    private final hmj v;
    private final aaas w;
    private final zyw x;
    private final hqp y;
    private final hng z;

    public hmk(Context context, akou akou, agvz agvz, akkq akkq, String str, String str2, eqf eqf, hsy hsy, hmc hmc, hmj hmj, aaas aaas, zyw zyw, hqp hqp, hng hng) {
        akou akou2 = akou;
        String str3 = str;
        String str4 = str2;
        this.k = (Context) amqw.a((Object) context);
        this.q = (akou) amqw.a((Object) akou);
        this.l = context.getResources();
        amqw.a((Object) agvz);
        this.m = (agwh) amqw.a(agvz.k());
        this.n = (agvx) amqw.a(agvz.n());
        this.o = (agwf) amqw.a(agvz.o());
        this.p = (akkq) amqw.a((Object) akkq);
        boolean z = str3 == null || str4 == null;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(str2).length());
        stringBuilder.append("Both playlistId (");
        stringBuilder.append(str);
        stringBuilder.append(") and videoListId (");
        stringBuilder.append(str2);
        stringBuilder.append(") are set.");
        amqw.a(z, stringBuilder.toString());
        this.r = str3;
        this.s = str4;
        this.E = (eqf) amqw.a((Object) eqf);
        this.t = (hsy) amqw.a((Object) hsy);
        this.u = hmc;
        this.v = (hmj) amqw.a((Object) hmj);
        this.w = (aaas) amqw.a((Object) aaas);
        this.x = (zyw) amqw.a((Object) zyw);
        this.y = (hqp) amqw.a((Object) hqp);
        this.z = (hng) amqw.a((Object) hng);
        hlv hlv = null;
        this.e = LayoutInflater.from(context).inflate(R.layout.offline_video_item, null);
        this.a = (TextView) this.e.findViewById(R.id.title);
        this.a.setMaxLines(2);
        this.b = (TextView) this.e.findViewById(R.id.duration);
        this.c = (TextView) this.e.findViewById(R.id.author);
        this.d = (TextView) this.e.findViewById(R.id.details);
        this.d.setMaxLines(1);
        this.A = hsu.a(this.c, this.d);
        this.B = new hmn(this);
        this.f = this.e.findViewById(R.id.thumbnail_layout);
        this.i = (ImageView) this.f.findViewById(R.id.thumbnail);
        this.j = (OfflineArrowView) this.e.findViewById(R.id.offline_arrow);
        this.h = this.f.findViewById(R.id.resume_playback_overlay);
        this.g = this.e.findViewById(R.id.contextual_menu_anchor);
        akou.a(this.e);
        akou.a((OnClickListener) this);
        if (this.u != null) {
            ViewStub viewStub = (ViewStub) this.e.findViewById(R.id.offline_badge);
            if (viewStub != null) {
                hlv = this.u.a(viewStub, null);
            }
            this.F = hlv;
        }
    }

    public final View K_() {
        return this.q.a();
    }

    public final void a(akpb akpb) {
        this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this.A);
        this.z.b(this.B);
    }

    public final void onClick(View view) {
        agqp agqp = this.C;
        if (agqp != null) {
            String a = agqp.a();
            agqy a2 = this.m.a(a);
            if (a2 == null || a2.u() != agqs.PLAYABLE) {
                this.y.a(a, a2, this.r);
            } else {
                String str = this.r;
                int i = -1;
                if (str == null && this.s == null) {
                    if (a2.e) {
                        str = "PPSV";
                    } else {
                        Set l = this.n.l(a);
                        if (l.isEmpty()) {
                            l = this.o.h(a);
                            str = !l.isEmpty() ? this.t.a((String) l.iterator().next()) : null;
                        } else {
                            str = (String) l.iterator().next();
                        }
                    }
                } else if (str != null) {
                    i = this.D;
                } else {
                    str = this.t.a(this.s);
                    i = this.D;
                }
                if (str != null) {
                    apxu a3;
                    if (foh.M(this.x)) {
                        a3 = aiqo.a(a, str, i, hsz.b(a2.b(), a2.h));
                    } else {
                        a3 = aiqo.a(a, str, i);
                    }
                    this.w.a(a3, null);
                    return;
                }
                a = String.valueOf(a);
                String str2 = "Trying to play video that is not single nor in a list: ";
                xtl.c(a.length() == 0 ? new String(str2) : str2.concat(a));
            }
        }
    }

    public final void b() {
        agqp agqp = this.C;
        if (agqp != null) {
            b(this.m.a(agqp.a()));
        }
    }

    private final void a(agqy agqy) {
        this.b.setText(agqy.c());
        agpy d = agqy.d();
        if (d == null) {
            xpr.a(this.c, null);
        } else if (this.r != null && agqy.n() && foh.u(this.x)) {
            xpr.a(this.c, hsu.a(this.k, d.b, agqy.h()));
            this.c.getViewTreeObserver().addOnGlobalLayoutListener(this.A);
        } else {
            xpr.a(this.c, d.b);
        }
        this.p.a(this.i, agqy.e());
    }

    private final void b(agqy agqy) {
        agqs u;
        hkt a = this.v.a(1, agqy);
        StringBuilder stringBuilder = new StringBuilder();
        boolean z = false;
        int i = 0;
        while (true) {
            String[] strArr = a.b;
            if (i >= strArr.length) {
                break;
            }
            stringBuilder.append(strArr[i]);
            if (i < a.b.length - 1) {
                stringBuilder.append(10);
            }
            i++;
        }
        this.d.setText(stringBuilder.toString());
        this.d.setMaxLines(a.b.length);
        this.d.setTextColor(xwe.a(this.k, a.a, 0));
        TextView textView = this.d;
        textView.setTypeface(textView.getTypeface(), 0);
        if (agqy != null) {
            u = agqy.u();
        } else {
            u = agqs.DELETED;
        }
        if (u == agqs.PLAYABLE) {
            this.i.setAlpha(1.0f);
            this.a.setTextColor(xwe.a(this.k, R.attr.ytTextPrimary, 0));
            this.b.setVisibility(0);
            this.j.setVisibility(8);
        } else if (u.y || u == agqs.TRANSFER_PENDING_USER_APPROVAL) {
            Object obj = (agqy == null || agqy.w()) ? 1 : null;
            if (u == agqs.DELETED) {
                this.i.setImageDrawable(null);
            } else {
                this.i.setAlpha(0.2f);
            }
            this.a.setTextColor(xwe.a(this.k, R.attr.ytTextSecondary, 0));
            this.b.setVisibility(8);
            this.j.setVisibility(0);
            this.j.e();
            if (u == agqs.DELETED) {
                this.j.a(R.drawable.ic_offline_refresh);
            } else if (u == agqs.TRANSFER_PENDING_USER_APPROVAL) {
                this.j.b(R.drawable.ic_offline_sync_playlist);
            } else if (obj != null) {
                this.j.a(R.drawable.ic_offline_refresh);
            } else {
                this.j.a(R.drawable.ic_offline_error);
            }
        } else {
            int q = agqy.q();
            this.i.setAlpha(0.2f);
            this.a.setTextColor(xwe.a(this.k, R.attr.ytTextSecondary, 0));
            this.b.setVisibility(8);
            this.j.setVisibility(0);
            this.j.c(q);
            q = u.ordinal();
            if (q == 3) {
                this.j.a();
            } else if (q == 4 || q == 9) {
                this.j.c();
            } else if (q != 11) {
                this.j.b();
            } else {
                this.j.a(R.drawable.ic_offline_paused);
                this.j.e();
            }
        }
        View view = this.H;
        if (view != null) {
            xpr.a(view, u == agqs.PLAYABLE);
        }
        view = this.c;
        if (a.b.length <= 1 && !amqu.a(view.getText().toString())) {
            z = true;
        }
        xpr.a(view, z);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        agqp agqp = (agqp) obj;
        ((LayoutParams) this.f.getLayoutParams()).width = this.l.getDimensionPixelSize(R.dimen.offline_video_item_thumbnail_width);
        this.C = agqp;
        agqy a = this.m.a(agqp.a());
        if (a != null) {
            this.a.setText(a.a(this.k));
            a(a);
        } else {
            this.a.setText(agqp.b());
        }
        eqf eqf = this.E;
        View view = this.e;
        View view2 = this.g;
        eqm.a(eqf, view2, agqp);
        if (view2.getTag(R.id.menu_anchor_touch_handler) == null) {
            view2.setTag(R.id.menu_anchor_touch_handler, new akvu(view, view2));
        }
        int i = 0;
        this.D = akor.a("position", 0);
        akor.a("VideoPresenterConstants.VIDEO_ID", agqp.a());
        hlv hlv = this.F;
        if (hlv != null) {
            hlv.a(akor);
        }
        if (foh.M(this.x) && this.h != null) {
            if (a != null) {
                i = hsz.a(a.b(), a.h);
            }
            ayfp ayfp = (ayfp) ayfq.c.createBuilder();
            ayfp.a(i);
            ayfq ayfq = (ayfq) ((anxl) ayfp.build());
            if (this.G == null) {
                this.G = new fnk((ViewStub) this.h);
            }
            this.G.a(ayfq);
            this.H = this.f.findViewById(R.id.resume_playback_inflated_overlay);
        }
        b(a);
        this.z.a(this.B);
        this.q.a(akor);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{xgg.class, agkv.class, aglm.class, agls.class};
        } else if (i == 0) {
            b();
        } else if (i == 1) {
            b();
        } else if (i == 2) {
            aglm aglm = (aglm) obj;
            if (this.C.a().equals(aglm.a.a())) {
                a(aglm.a);
                b(aglm.a);
                return null;
            }
        } else if (i == 3) {
            agls agls = (agls) obj;
            if (this.C.a().equals(agls.a.a())) {
                if (this.i.getDrawable() == null) {
                    this.p.a(this.i, agls.a.e());
                }
                b(agls.a);
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
