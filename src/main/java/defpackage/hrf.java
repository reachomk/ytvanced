package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import java.util.HashMap;

/* renamed from: hrf */
public final class hrf implements xcp {
    public hlp A;
    private final Context B;
    private final bcaa C;
    private final hmj D;
    private final zyw E;
    private final hln F;
    private final acwa G;
    private final ImageView H;
    private final OfflineArrowView I;
    private final View J;
    private final View K;
    public final eki a;
    public final xci b;
    public final akop c;
    public final hqp d;
    public final akoj e;
    public final bcaa f;
    public final hng g;
    public final ejv h;
    public final hrm i = new hrm(this);
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final ViewGroup n;
    public final OfflineArrowView o;
    public final View p;
    public final OnGlobalLayoutListener q;
    public final hnj r;
    public final eka s;
    public final int t;
    public final int u;
    public akor v;
    public akou w;
    public aqgs x;
    public String y;
    public akoj z;

    public hrf(Context context, eki eki, bcaa bcaa, hmj hmj, xci xci, akop akop, hqp hqp, zyw zyw, hln hln, bcaa bcaa2, acwa acwa, hng hng, ejv ejv, View view, akoj akoj) {
        this.B = context;
        this.a = eki;
        this.C = bcaa;
        this.D = hmj;
        this.b = xci;
        this.c = akop;
        this.d = hqp;
        this.E = zyw;
        this.e = akoj;
        this.F = hln;
        this.f = bcaa2;
        this.G = acwa;
        this.g = hng;
        this.h = ejv;
        this.j = (TextView) view.findViewById(R.id.title);
        this.k = (TextView) view.findViewById(R.id.author);
        this.l = (TextView) view.findViewById(R.id.overflow_video_size_bytes);
        this.m = (TextView) view.findViewById(R.id.details);
        this.H = (ImageView) view.findViewById(R.id.thumbnail);
        this.I = (OfflineArrowView) view.findViewById(R.id.offline_arrow);
        this.p = view.findViewById(R.id.contextual_menu_anchor);
        this.n = (ViewGroup) view.findViewById(R.id.offline_candidate_layout);
        this.o = (OfflineArrowView) view.findViewById(R.id.offline_candidate_arrow);
        this.J = view.findViewById(R.id.duration);
        this.K = view.findViewById(R.id.resume_playback_inflated_overlay);
        this.q = hsu.a(this.k, this.l);
        this.r = new hri(this);
        this.s = new hrh(this);
        this.t = a(R.attr.ytTextPrimary);
        this.u = a(R.attr.ytTextSecondary);
    }

    public final boolean a() {
        akor akor = this.v;
        if (akor != null) {
            if (TextUtils.equals("downloads_page_recommendations_item_section_identifier", akor.b("downloads_page_section_key"))) {
                return true;
            }
        }
        return false;
    }

    private final int a(int i) {
        TypedValue typedValue = new TypedValue();
        return this.B.getTheme().resolveAttribute(i, typedValue, true) ? this.B.getResources().getColor(typedValue.resourceId) : -1;
    }

    public final void b() {
        if (!amqu.a(this.y)) {
            agqs u;
            agqy a = ((agwc) this.C.get()).b().k().a(this.y);
            this.i.a = a;
            if (a != null && (a.u() == agqs.PLAYABLE || a.u() == agqs.CANDIDATE)) {
                this.j.setTextColor(xwe.a(this.B, R.attr.ytTextPrimary, 0));
                xpr.a(this.m, false);
            } else {
                if (a()) {
                    this.j.setTextColor(xwe.a(this.B, R.attr.ytTextPrimary, 0));
                } else {
                    this.j.setTextColor(xwe.a(this.B, R.attr.ytTextDisabled, 0));
                }
                hkt a2 = this.D.a(1, a);
                StringBuilder stringBuilder = new StringBuilder();
                int i = 0;
                while (true) {
                    String[] strArr = a2.b;
                    if (i >= strArr.length) {
                        break;
                    }
                    stringBuilder.append(strArr[i]);
                    if (i < a2.b.length - 1) {
                        stringBuilder.append(10);
                    }
                    i++;
                }
                xpr.a(this.m, stringBuilder.toString());
                this.m.setMaxLines(a2.b.length);
                this.m.setTextColor(xwe.a(this.B, a2.a, 0));
                TextView textView = this.m;
                textView.setTypeface(textView.getTypeface(), 0);
            }
            arml arml = null;
            TextView textView2;
            if (a != null && foh.u(this.E) && a.n()) {
                textView2 = this.k;
                Context context = this.B;
                aqgs aqgs = this.x;
                if ((aqgs.a & 16) != 0) {
                    arml = aqgs.g;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                textView2.setText(hsu.a(context, ajqy.a(arml), a.h()));
                this.k.getViewTreeObserver().addOnGlobalLayoutListener(this.q);
            } else {
                textView2 = this.k;
                aqgs aqgs2 = this.x;
                if ((aqgs2.a & 16) != 0) {
                    arml = aqgs2.g;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                textView2.setText(ajqy.a(arml));
                xpr.a(this.l, false);
            }
            if (a != null) {
                u = a.u();
            } else {
                u = agqs.DELETED;
            }
            View view;
            if (u == agqs.PLAYABLE || a()) {
                c();
            } else if (u.y || u == agqs.TRANSFER_PENDING_USER_APPROVAL) {
                Object obj = (a == null || a.w()) ? 1 : null;
                this.H.setAlpha(0.2f);
                xpr.a(this.I, true);
                xpr.a(this.J, false);
                view = this.K;
                if (view != null) {
                    xpr.a(view, false);
                }
                this.I.e();
                if (u == agqs.DELETED) {
                    this.I.a(R.drawable.ic_offline_refresh);
                } else if (u == agqs.TRANSFER_PENDING_USER_APPROVAL) {
                    this.I.b(R.drawable.ic_offline_sync_playlist);
                } else if (obj != null) {
                    this.I.a(R.drawable.ic_offline_refresh);
                } else {
                    this.I.a(R.drawable.ic_offline_error);
                }
            } else {
                int q = a.q();
                this.H.setAlpha(0.2f);
                xpr.a(this.I, true);
                xpr.a(this.J, false);
                view = this.K;
                if (view != null) {
                    xpr.a(view, false);
                }
                this.I.c(q);
                int ordinal = u.ordinal();
                if (ordinal == 3) {
                    this.I.a();
                } else if (ordinal == 4 || ordinal == 6 || ordinal == 9) {
                    this.I.c();
                } else if (ordinal != 11) {
                    this.I.b();
                } else {
                    this.I.a(R.drawable.ic_offline_paused);
                    this.I.e();
                }
            }
            if (a == null || !a()) {
                xpr.a(this.p, true);
                xpr.a(this.o, false);
            } else {
                xpr.a(this.p, false);
                xpr.a(this.n, true);
                if (this.A == null) {
                    hln hln = this.F;
                    String a3 = a.a();
                    OfflineArrowView offlineArrowView = this.o;
                    eki eki = (eki) hln.a((eki) hln.a.get(), 1);
                    bcaa bcaa = hln.b;
                    hln.a((hlr) hln.c.get(), 3);
                    this.A = new hlk(eki, bcaa, 0, a3, (OfflineArrowView) hln.a(offlineArrowView, 6), null);
                }
                hlp hlp = this.A;
                a.a();
                hlp.a(hks.a(a));
                u = a.u();
                int ordinal2 = u.ordinal();
                if (ordinal2 == 2) {
                    a(a, 2);
                } else if (ordinal2 == 3) {
                    a(a, 4);
                } else if (ordinal2 == 11) {
                    a(a, 6);
                } else if (u.y && a.w()) {
                    a(a, 5);
                }
                this.n.setOnClickListener(new hrk(this));
            }
        }
    }

    public final void c() {
        this.H.setAlpha(1.0f);
        boolean z = false;
        xpr.a(this.I, false);
        xpr.a(this.J, true);
        if (this.K != null) {
            ayfq a = ipo.a(this.x.B);
            View view = this.K;
            if (a != null && a.b > 0) {
                z = true;
            }
            xpr.a(view, z);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{xgg.class, agkv.class, aglm.class};
        } else if (i == 0) {
            b();
        } else if (i == 1) {
            b();
        } else if (i == 2) {
            aglm aglm = (aglm) obj;
            String str = this.y;
            if (str != null && str.equals(aglm.a.a())) {
                b();
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }

    private final void a(agqy agqy, int i) {
        CharSequence string;
        avrh avrh = (avrh) OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.f.createBuilder();
        avrh.a(agqy.a());
        avrh.a(i);
        if (i == 2) {
            avsj A = agqy.A();
            if (A != null) {
                avsl avsl = (avsl) ((anxo) A.toBuilder());
                avsl.copyOnWrite();
                avsj avsj = (avsj) avsl.instance;
                avsj.a &= -65;
                avsj.g = avsj.h.g;
                axaj axaj = (axaj) axak.a.createBuilder();
                axaj.a(OfflineabilityRendererOuterClass.offlineabilityRenderer, (avsj) ((anxl) avsl.build()));
                avrh.copyOnWrite();
                OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) avrh.instance;
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint.e = (axak) ((anxl) axaj.build());
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint.a |= 16;
            }
        }
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) ((anxl) avrh.build()));
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.G.t());
        this.o.setOnClickListener(new hrj(this, apxx, hashMap));
        i--;
        if (i == 1) {
            string = this.B.getString(R.string.accessibility_offline_button_save);
        } else if (i == 3) {
            string = this.B.getString(R.string.accessibility_offline_button_pause);
        } else if (i == 4) {
            string = this.B.getString(R.string.accessibility_offline_button_retry);
        } else if (i != 5) {
            string = null;
        } else {
            string = this.B.getString(R.string.accessibility_offline_button_resume);
        }
        this.o.setContentDescription(string);
    }
}
