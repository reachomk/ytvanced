package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.support.design.textfield.TextInputLayout;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf.PrefixedEditText;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: leb */
public final class leb extends ldg implements ezk {
    public final Activity b;
    public final lff c;
    public final afpu d;
    public final afqe e;
    public ajuo f;
    public aqxj g;
    public eqz h;
    public ViewGroup i;
    public Button j;
    public long k;
    private final Context l;
    private final akkq m;
    private final aaas n;
    private final acvx o;
    private final ezg p;
    private erf q;
    private erg r;
    private erj s;
    private eri t;
    private akyu u;
    private ViewGroup v;
    private YouTubeTextView w;

    public leb(Context context, bcaa bcaa, Activity activity, akkq akkq, aaas aaas, acvx acvx, afpu afpu, afqe afqe, ezg ezg) {
        super(acvx);
        this.l = context;
        this.c = (lff) bcaa.get();
        this.b = activity;
        this.m = akkq;
        this.n = aaas;
        this.o = acvx;
        this.d = afpu;
        this.e = afqe;
        this.p = ezg;
    }

    public final void a(akoq akoq) {
    }

    public final void a(lel lel) {
    }

    public final void g() {
    }

    public final void h() {
    }

    public final void i() {
    }

    public final void j() {
    }

    public final void a(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        b = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) b;
        amqw.a(b);
        if (this.f != null) {
            String str = "donation_shelf";
            arml arml;
            if (b.b.equals(str)) {
                int i;
                aqxj aqxj = this.g;
                LayoutInflater from = LayoutInflater.from(this.l);
                this.v = (ViewGroup) from.inflate(R.layout.donation_engagement_panel, null, false);
                a(this.v, str);
                this.t = new eri(this.l, (ViewGroup) this.v.findViewById(R.id.progress_group));
                this.t.a(aqxj);
                this.r = new erg((ViewGroup) this.v.findViewById(R.id.creator_messages_container), from, this.m);
                erg erg = this.r;
                for (i = 0; i < aqxj.r.size(); i++) {
                    arml arml2;
                    ViewGroup viewGroup = (ViewGroup) erg.a.getChildAt(i);
                    if (viewGroup == null) {
                        viewGroup = (ViewGroup) erg.b.inflate(R.layout.donation_creator_message, erg.a, false);
                        erg.a.addView(viewGroup);
                    }
                    erh erh = (erh) erg.a.getTag();
                    if (erh == null) {
                        erh = new erh(erg.c, viewGroup);
                        viewGroup.setTag(erh);
                    }
                    aqxg aqxg = (aqxg) aqxj.r.get(i);
                    if ((aqxg.a & 1) == 0) {
                        erh.b.setVisibility(8);
                    } else {
                        erh.b.setVisibility(0);
                        akkq akkq = erh.a;
                        ImageView imageView = erh.b;
                        aygk aygk = aqxg.b;
                        if (aygk == null) {
                            aygk = aygk.f;
                        }
                        akkq.a(imageView, aygk);
                    }
                    TextView textView = erh.c;
                    if ((aqxg.a & 2) != 0) {
                        arml2 = aqxg.c;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    } else {
                        arml2 = null;
                    }
                    xpr.a(textView, ajqy.a(arml2));
                    textView = erh.d;
                    if ((aqxg.a & 4) != 0) {
                        arml = aqxg.d;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    xpr.a(textView, ajqy.a(arml));
                }
                i = erg.a.getChildCount() - aqxj.r.size();
                if (i > 0) {
                    erg.a.removeViews(aqxj.r.size(), i);
                }
                if (aqxj.r.size() <= 0) {
                    erg.a.setVisibility(8);
                } else {
                    erg.a.setVisibility(0);
                }
                this.w = (YouTubeTextView) this.v.findViewById(R.id.nonprofit_description_view);
                TextView textView2 = this.w;
                arml arml3 = aqxj.p;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
                xpr.a(textView2, ajqy.a(arml3));
                this.p.a(aqxj.B, (ezk) this);
            } else if (b.b.equals("donation_amount_picker")) {
                aqxj aqxj2 = this.g;
                this.v = (ViewGroup) LayoutInflater.from(this.l).inflate(R.layout.donation_amount_picker, null, false);
                a(this.v, null);
                if ((aqxj2.a & 256) != 0) {
                    this.j.setOnClickListener(new lea(this));
                }
                this.h = new eqz((YouTubeTextView) this.v.findViewById(R.id.custom_amount_label), (TextInputLayout) this.v.findViewById(R.id.custom_amount_group));
                this.h.e = new led(this);
                eqz eqz = this.h;
                eqz.f = aqxj2;
                YouTubeTextView youTubeTextView = eqz.a;
                arml = aqxj2.v;
                if (arml == null) {
                    arml = arml.f;
                }
                youTubeTextView.setText(ajqy.a(arml));
                PrefixedEditText prefixedEditText = eqz.c;
                arml = aqxj2.w;
                if (arml == null) {
                    arml = arml.f;
                }
                String obj = ajqy.a(arml).toString();
                prefixedEditText.a = obj;
                prefixedEditText.c = 20;
                prefixedEditText.b = new float[obj.length()];
                prefixedEditText.invalidate();
                eqz.c.addTextChangedListener(eqz.d);
                era era = new era(this.l, (RadioGroup) this.v.findViewById(R.id.predefined_amounts_group));
                era.c = new lec(this);
                if (aqxj2.u.size() != 0) {
                    era.b.setOnCheckedChangeListener(new erd(era));
                    int min = Math.min(aqxj2.u.size() - 1, 1);
                    for (int i2 = 0; i2 < aqxj2.u.size(); i2++) {
                        arml arml4;
                        aqxl aqxl = (aqxl) aqxj2.u.get(i2);
                        View view = (RadioButton) LayoutInflater.from(era.a).inflate(R.layout.donation_predefined_amount_button, era.b, false);
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
                        era.b.addView(view);
                        if ((aqxl.a & 2) != 0) {
                            arml4 = aqxl.c;
                            if (arml4 == null) {
                                arml4 = arml.f;
                            }
                        } else {
                            arml4 = null;
                        }
                        xpr.a((TextView) view, ajqy.a(arml4));
                        xpr.a(view, view.getBackground());
                        if (i2 == 0) {
                            marginLayoutParams.setMarginStart(0);
                        } else if (i2 == aqxj2.u.size() - 1) {
                            marginLayoutParams.setMarginStart(0);
                        }
                        view.setTag((aqxl) aqxj2.u.get(i2));
                        if (i2 == min) {
                            view.setChecked(true);
                        }
                    }
                } else {
                    erc erc = era.c;
                    if (erc != null) {
                        erc.a(0);
                    }
                }
                b();
            }
        }
    }

    private final void a(ViewGroup viewGroup, String str) {
        CharSequence charSequence;
        this.i = (ViewGroup) viewGroup.findViewById(R.id.scroll_view);
        this.q = new erf((ViewGroup) this.i.findViewById(R.id.campaign_group), false, this.m);
        this.q.a(this.g);
        this.s = new erj(this.l, this.n, (ViewGroup) this.i.findViewById(R.id.nonprofit_group));
        erj erj = this.s;
        aqxj aqxj = this.g;
        TextView textView = erj.c;
        arml arml = aqxj.n;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        erj.d.d();
        arml arml2 = aqxj.o;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        int size = arml2.b.size();
        TextView textView2 = erj.d;
        arml arml3 = aqxj.o;
        if (arml3 == null) {
            arml3 = arml.f;
        }
        if (arml3 == null) {
            charSequence = null;
        } else {
            charSequence = new SpannableStringBuilder(aabb.a(arml3, erj.b, false));
            if (charSequence.length() != 0 && size > 1) {
                int length = charSequence.length();
                size = charSequence.length();
                String valueOf = String.valueOf(charSequence.subSequence(charSequence.length() - 1, charSequence.length()));
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 2);
                stringBuilder.append(valueOf);
                stringBuilder.append("  ");
                charSequence.replace(length - 1, size, stringBuilder.toString());
                Context context = erj.a;
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.quantum_ic_open_in_new_black_12);
                Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), Math.max(erj.d.getLineHeight(), decodeResource.getHeight()), Config.ARGB_8888);
                Paint paint = new Paint();
                paint.setColorFilter(new PorterDuffColorFilter(xwe.a(erj.a, R.attr.ytCallToAction, 0), Mode.SRC_IN));
                new Canvas(createBitmap).drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                charSequence.setSpan(new ImageSpan(context, createBitmap), charSequence.length() - 1, charSequence.length(), 0);
            }
        }
        xpr.a(textView2, charSequence);
        this.j = (Button) viewGroup.findViewById(R.id.donation_button);
        View view = this.j;
        xpr.a(view, view.getBackground());
        this.u = new akyu(this.n, new akpi(), this.j);
        aphj aphj = this.g.g;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) != 0) {
            Map map;
            aphj = this.g.g;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if (str == null) {
                map = null;
            } else {
                map = new HashMap();
                map.put("engagement_panel_id_key", str);
            }
            TextView textView3 = this.j;
            if ((aphg.a & 128) != 0) {
                arml3 = aphg.g;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
            } else {
                arml3 = null;
            }
            xpr.a(textView3, ajqy.a(arml3));
            this.u.a(aphg, this.a, map);
        }
        this.o.a(this.g.C.d(), null);
    }

    public final View f() {
        return this.v;
    }

    public final leg n() {
        return this.c;
    }

    public final void a() {
        aphj aphj = this.g.g;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) != 0) {
            aphj = this.g.g;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            anxp anxp = aphg.n;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$000 = anxl.checkIsLite(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
                anxp.a(access$000);
                Object b = anxp.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                azmp azmp = (azmp) ((anxo) ((YpcGetCartEndpoint$YPCGetCartEndpoint) obj).toBuilder());
                long j = this.k;
                azmp.copyOnWrite();
                YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) azmp.instance;
                ypcGetCartEndpoint$YPCGetCartEndpoint.a |= 1024;
                ypcGetCartEndpoint$YPCGetCartEndpoint.j = j;
                YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint2 = (YpcGetCartEndpoint$YPCGetCartEndpoint) ((anxl) azmp.build());
                aaas aaas = this.n;
                apxx apxx = (apxx) ((anxo) anxp.toBuilder());
                apxx.a(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint, ypcGetCartEndpoint$YPCGetCartEndpoint2);
                apxu apxu = (apxu) ((anxl) apxx.build());
                aphj aphj2 = this.g.g;
                if (aphj2 == null) {
                    aphj2 = aphj.d;
                }
                obj = aphj2.b;
                if (obj == null) {
                    obj = aphg.s;
                }
                aaas.a(apxu, acwi.a(obj, true));
            }
        }
    }

    public final void b() {
        this.i.post(new lef(this));
    }

    public final void a(String str, aqxj aqxj) {
        aqxj aqxj2 = this.g;
        if (aqxj2 != null && aqxj2.B.equals(str)) {
            this.t.a(aqxj);
        }
    }

    public final /* bridge */ /* synthetic */ Object e() {
        return this.f;
    }
}
