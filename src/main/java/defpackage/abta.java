package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import com.google.protos.youtube.api.innertube.YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abta */
public abstract class abta implements abun, abxx, akot, OnClickListener, OnFocusChangeListener, OnSeekBarChangeListener {
    private final TextView A;
    private final LinearLayout B;
    private final TextView C;
    private final ImageView D;
    private final TextView E;
    private final TextView F;
    private final View G;
    private final View H;
    private final View I;
    private final ViewGroup J;
    private final ImageView K;
    private final View L;
    private final View M;
    private final TextView N;
    private final TextView O;
    private final TextView P;
    private final SeekBar Q;
    private final ProgressBar R;
    private final View S;
    private final abrq T;
    private final abqz U;
    private final wqg V;
    private final Map W;
    private final StringBuilder X = new StringBuilder();
    private final int Y;
    private akor Z = new akor();
    public final ImageView a;
    private int aa;
    private long ab;
    private String ac;
    private NumberFormat ad;
    private apxu ae;
    private final abxo af;
    private arec ag;
    private boolean ah;
    private boolean ai;
    private final acvx aj;
    public final EditText b;
    public final Context c;
    public final Button d;
    public boolean e;
    public boolean f;
    public final aaas g;
    public final EditText h;
    public final abrf i;
    public long j;
    public int k;
    public ajwy l;
    private final View m;
    private final TextView n;
    private final TextView o;
    private final abru p;
    private final akvp q;
    private final TextWatcher r = new abte(this);
    private final TextWatcher s = new abth(this);
    private final Runnable t = new abtg(this);
    private final ImageView u;
    private final ImageView v;
    private final TextView w;
    private final View x;
    private final View y;
    private final TextView z;

    public abta(Context context, abru abru, aaas aaas, akvp akvp, abrf abrf, abrq abrq, abqz abqz, acwa acwa) {
        this.c = context;
        this.p = abru;
        this.g = aaas;
        this.q = akvp;
        this.i = abrf;
        this.T = abrq;
        this.U = abqz;
        this.m = LayoutInflater.from(context).inflate(b(), null);
        this.n = (TextView) this.m.findViewById(R.id.title);
        this.u = (ImageView) this.m.findViewById(R.id.back_button);
        this.v = (ImageView) this.m.findViewById(R.id.help_button);
        this.d = (Button) this.m.findViewById(R.id.buy_button);
        this.w = (TextView) this.m.findViewById(R.id.message_ticker_duration);
        this.N = (TextView) this.m.findViewById(R.id.character_count);
        this.M = this.m.findViewById(R.id.purchase_flow_input_panel_container);
        this.y = this.m.findViewById(R.id.heading);
        this.z = (TextView) this.m.findViewById(R.id.heading_title);
        this.A = (TextView) this.m.findViewById(R.id.heading_description);
        this.x = this.m.findViewById(R.id.message_header);
        this.G = this.m.findViewById(R.id.purchase_flow_message_settings_container);
        this.H = this.m.findViewById(R.id.purchase_flow_currency_and_price_container);
        this.I = this.m.findViewById(R.id.message_body);
        this.E = (TextView) this.m.findViewById(R.id.author_name);
        this.F = (TextView) this.m.findViewById(R.id.purchase_amount);
        this.b = (EditText) this.m.findViewById(R.id.edit_message);
        this.B = (LinearLayout) this.m.findViewById(R.id.footer_body);
        this.C = (TextView) this.m.findViewById(R.id.footer_text);
        this.D = (ImageView) this.m.findViewById(R.id.footer_icon);
        this.a = (ImageView) this.m.findViewById(R.id.author_image);
        this.Q = (SeekBar) this.m.findViewById(R.id.tier_seek_bar);
        this.O = (TextView) this.m.findViewById(R.id.currency_symbol);
        this.h = (EditText) this.m.findViewById(R.id.buy_price);
        this.P = (TextView) this.m.findViewById(R.id.currency_code);
        this.o = (TextView) this.m.findViewById(R.id.error_message);
        this.R = (ProgressBar) this.m.findViewById(R.id.progress_bar);
        this.S = this.m.findViewById(R.id.buy_frame);
        this.L = this.m.findViewById(R.id.underline);
        this.K = (ImageView) this.m.findViewById(R.id.emoji_picker_icon);
        this.J = (ViewGroup) this.m.findViewById(R.id.emoji_button_container);
        this.aj = acwa.t();
        this.Y = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_overlay_action_panel_container_margin_bottom);
        this.af = new abxo();
        this.b.setFilters(new InputFilter[]{new abry()});
        akoz.a(this.m, (akot) this);
        this.W = new HashMap();
        this.W.put("YpcTransactionListener", new abtj(this));
        this.V = new abti(this);
    }

    public void a(akpb akpb) {
        throw null;
    }

    public abstract void a(aygk aygk);

    public abstract int b();

    public abstract void c();

    public final View K_() {
        return this.m;
    }

    private final void b(boolean z) {
        if (z) {
            this.K.setImageResource(!this.ah ? R.drawable.ic_emoji_dark_on : R.drawable.ic_emoji_light_on);
            this.K.setContentDescription(this.c.getResources().getString(R.string.close_emoji_picker_button_cd));
            return;
        }
        this.K.setImageResource(!this.ah ? R.drawable.ic_emoji_dark_off : R.drawable.ic_emoji_light_off);
        this.K.setContentDescription(this.c.getResources().getString(R.string.open_emoji_picker_button_cd));
    }

    public final void d() {
        a(false);
    }

    public final void onClick(View view) {
        Object a;
        if (view == this.u) {
            a = this.Z.a("listenerKey");
            if (a instanceof abyb) {
                ((abyb) a).Z();
            }
        } else if (view == this.d) {
            a(true);
            auev j = j();
            if (j != null) {
                long a2 = a(this.h.getText().toString());
                if (this.ae != null && a2 > 0) {
                    this.o.setVisibility(8);
                    String str = "PURCHASE_PRICE_MICROS";
                    String str2 = "HANDLE_TRANSACTION_CALLBACK";
                    apxu apxu;
                    anxr access$000;
                    Object b;
                    azmp azmp;
                    YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint;
                    apxx apxx;
                    Map hashMap;
                    if (!this.i.b.a() || j.d == 0) {
                        a = j.d != 0 ? this.b.getText() : "";
                        apxu = this.ae;
                        access$000 = anxl.checkIsLite(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
                        apxu.a(access$000);
                        if (apxu.h.a(access$000.d)) {
                            apxu = this.ae;
                            access$000 = anxl.checkIsLite(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
                            apxu.a(access$000);
                            b = apxu.h.b(access$000.d);
                            if (b == null) {
                                b = access$000.b;
                            } else {
                                b = access$000.a(b);
                            }
                            azmp = (azmp) ((anxo) ((YpcGetCartEndpoint$YPCGetCartEndpoint) b).toBuilder());
                            azmp.a(a2);
                            String charSequence = a.toString();
                            azmp.copyOnWrite();
                            ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) azmp.instance;
                            if (charSequence != null) {
                                ypcGetCartEndpoint$YPCGetCartEndpoint.a |= 16;
                                ypcGetCartEndpoint$YPCGetCartEndpoint.f = charSequence;
                                apxx = (apxx) ((anxo) this.ae.toBuilder());
                                apxx.a(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint, (YpcGetCartEndpoint$YPCGetCartEndpoint) ((anxl) azmp.build()));
                                this.ae = (apxu) ((anxl) apxx.build());
                                this.g.a(this.ae, this.W);
                                return;
                            }
                            throw new NullPointerException();
                        }
                        apxu = this.ae;
                        access$000 = anxl.checkIsLite(YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.ypcHandleTransactionEndpoint);
                        apxu.a(access$000);
                        if (apxu.h.a(access$000.d)) {
                            apxu = this.ae;
                            hashMap = new HashMap();
                            hashMap.put(str2, this.V);
                            hashMap.put(str, Long.valueOf(a2));
                            hashMap.put("CLIENT_CHAT_MESSAGE_TEXT", a);
                            this.g.a(apxu, hashMap);
                            return;
                        }
                    }
                    augl a3 = this.i.a(this.b.getText());
                    apxu = this.ae;
                    access$000 = anxl.checkIsLite(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
                    apxu.a(access$000);
                    if (apxu.h.a(access$000.d)) {
                        apxu = this.ae;
                        access$000 = anxl.checkIsLite(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
                        apxu.a(access$000);
                        b = apxu.h.b(access$000.d);
                        if (b == null) {
                            b = access$000.b;
                        } else {
                            b = access$000.a(b);
                        }
                        azmp = (azmp) ((anxo) ((YpcGetCartEndpoint$YPCGetCartEndpoint) b).toBuilder());
                        azmp.a(a2);
                        azmp.copyOnWrite();
                        ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) azmp.instance;
                        if (a3 != null) {
                            ypcGetCartEndpoint$YPCGetCartEndpoint.g = a3;
                            ypcGetCartEndpoint$YPCGetCartEndpoint.a |= 32;
                            apxx = (apxx) ((anxo) this.ae.toBuilder());
                            apxx.a(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint, (YpcGetCartEndpoint$YPCGetCartEndpoint) ((anxl) azmp.build()));
                            this.ae = (apxu) ((anxl) apxx.build());
                            this.g.a(this.ae, this.W);
                            return;
                        }
                        throw new NullPointerException();
                    }
                    apxu = this.ae;
                    access$000 = anxl.checkIsLite(YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.ypcHandleTransactionEndpoint);
                    apxu.a(access$000);
                    if (apxu.h.a(access$000.d)) {
                        apxu = this.ae;
                        hashMap = new HashMap();
                        hashMap.put(str2, this.V);
                        hashMap.put(str, Long.valueOf(a2));
                        hashMap.put("LIVE_CHAT_RICH_MESSAGE_INPUT", a3);
                        this.g.a(apxu, hashMap);
                    }
                }
            }
        } else if (view == this.F) {
            if (this.H.getVisibility() == 0 && this.h.getVisibility() == 0 && this.h.requestFocus()) {
                xpr.b(this.h);
            }
        } else if (view == this.J) {
            c(this.i.d ^ 1);
        }
    }

    public final void a(boolean z) {
        if (this.R != null) {
            int i = 0;
            this.d.setVisibility(!z ? 0 : 8);
            ProgressBar progressBar = this.R;
            if (!z) {
                i = 8;
            }
            progressBar.setVisibility(i);
            this.S.setBackground(z ? this.d.getBackground() : null);
            return;
        }
        this.d.setEnabled(z ^ 1);
    }

    private final void c(boolean z) {
        LayoutParams layoutParams = (LayoutParams) this.M.getLayoutParams();
        b(z);
        if (z) {
            if (this.ai) {
                this.G.setVisibility(8);
                layoutParams.bottomMargin = this.Y;
            }
            this.i.a((ViewGroup) this.m, this.ag, this.b, this);
        } else {
            this.i.a();
            if (this.ai) {
                this.G.setVisibility(0);
                layoutParams.bottomMargin = 0;
            }
        }
        this.M.setLayoutParams(layoutParams);
    }

    public final void onFocusChange(View view, boolean z) {
        View view2 = this.h;
        if (view == view2) {
            if (z) {
                Drawable background = view2.getBackground();
                Context context = this.c;
                background.setColorFilter(xwe.a(context, R.attr.ytCallToAction, ra.c(context, R.color.buy_price_focused)), Mode.SRC_ATOP);
                this.h.post(this.t);
                return;
            }
            view2.getBackground().setColorFilter(xwe.a(this.c, R.attr.ytTextPrimary, 0), Mode.SRC_ATOP);
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.aa = i;
        if (z) {
            h();
        }
        g();
        b(null);
        i();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.h.setFocusable(false);
        this.h.setFocusableInTouchMode(false);
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.h.setFocusable(true);
        this.h.setFocusableInTouchMode(true);
        auev j = j();
        if (j != null) {
            aued aued;
            auet auet = j.e;
            if (auet == null) {
                auet = auet.c;
            }
            if (auet.a == 132496275) {
                aued = (aued) auet.b;
            } else {
                aued = aued.t;
            }
            if (aued.b == 6 && ((Boolean) aued.c).booleanValue()) {
                xpr.a(this.b);
            }
        }
    }

    public final void e() {
        Object a = this.Z.a("listenerKey");
        abqz abqz = this.U;
        if (abqz != null) {
            abqz.a(!this.ai ? 2 : 3, 3);
        }
        if (a instanceof abyb) {
            ((abyb) a).W();
        }
    }

    public final void a(CharSequence charSequence) {
        a(false);
        xpr.a(this.o, charSequence);
    }

    public final long a(String str) {
        try {
            return new BigDecimal(this.ad.parse(str).doubleValue(), MathContext.DECIMAL64).setScale((int) (Math.log10(1000000.0d) - Math.log10((double) this.ab)), RoundingMode.HALF_EVEN).scaleByPowerOfTen(6).longValue();
        } catch (ParseException unused) {
            xtl.c("Failed to parse buyBucket purchase amount.");
            return 0;
        }
    }

    private final void g() {
        auev j = j();
        if (j != null) {
            if ((j.a & 64) == 0) {
                this.w.setText(null);
            } else {
                TextView textView = this.w;
                arml arml = j.f;
                if (arml == null) {
                    arml = arml.f;
                }
                textView.setText(ajqy.a(arml));
            }
            long j2 = j.d;
            this.j = j2;
            a(j2 != 0 ? this.i.a(this.b.getText(), this.k) : 0, this.j);
        }
    }

    private final void h() {
        auev j = j();
        if (j != null) {
            this.h.setText(b(j.b));
        }
    }

    public final void b(String str) {
        CharSequence str2;
        if (TextUtils.isEmpty(str2)) {
            auev j = j();
            if (j != null) {
                str2 = b(j.b);
            }
        }
        if (!TextUtils.isEmpty(str2) && this.ac != null) {
            this.F.setText(this.c.getResources().getString(R.string.live_chat_purchase_amount, new Object[]{this.ac, str2}));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01d7  */
    private final void i() {
        /*
        r12 = this;
        r0 = r12.j();
        if (r0 == 0) goto L_0x0295;
    L_0x0006:
        r1 = r0.e;
        if (r1 != 0) goto L_0x000c;
    L_0x000a:
        r1 = defpackage.auet.c;
    L_0x000c:
        r1 = r1.a;
        r2 = 132496275; // 0x7e5bb93 float:3.4566337E-34 double:6.54618577E-316;
        if (r1 != r2) goto L_0x0295;
    L_0x0013:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0019;
    L_0x0017:
        r0 = defpackage.auet.c;
    L_0x0019:
        r1 = r0.a;
        if (r1 != r2) goto L_0x0022;
    L_0x001d:
        r0 = r0.b;
        r0 = (defpackage.aued) r0;
        goto L_0x0024;
    L_0x0022:
        r0 = defpackage.aued.t;
    L_0x0024:
        r1 = r0.i;
        if (r1 != 0) goto L_0x002a;
    L_0x0028:
        r1 = defpackage.aygk.f;
    L_0x002a:
        r12.a(r1);
        r1 = r12.af;
        r2 = r12.E;
        r3 = r0.k;
        r1.a(r2, r3);
        r1 = r12.E;
        r2 = r0.a;
        r2 = r2 & 16;
        if (r2 == 0) goto L_0x0045;
    L_0x003e:
        r2 = r0.h;
        if (r2 != 0) goto L_0x0046;
    L_0x0042:
        r2 = defpackage.arml.f;
        goto L_0x0046;
    L_0x0045:
        r2 = 0;
    L_0x0046:
        r2 = defpackage.ajqy.a(r2);
        defpackage.xpr.a(r1, r2);
        r1 = r12.af;
        r2 = r12.F;
        r3 = r0.m;
        r1.a(r2, r3);
        r1 = r0.b;
        r2 = 6;
        r3 = 2130838738; // 0x7f0204d2 float:1.7282467E38 double:1.0527742173E-314;
        r4 = 0;
        r5 = 8;
        if (r1 != r2) goto L_0x011c;
    L_0x0061:
        r1 = r0.c;
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x011c;
    L_0x006b:
        r1 = r12.i;
        r1 = r1.d;
        if (r1 == 0) goto L_0x0074;
    L_0x0071:
        r12.c(r4);
    L_0x0074:
        r1 = r12.I;
        r1.setVisibility(r5);
        r1 = r0.s;
        if (r1 == 0) goto L_0x007e;
    L_0x007d:
        goto L_0x0080;
    L_0x007e:
        r1 = defpackage.axak.a;
    L_0x0080:
        r2 = com.google.protos.youtube.api.innertube.LiveChatItemRenderer.liveChatPaidMessageFooterRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r1.a(r2);
        r1 = r1.h;
        r2 = r2.d;
        r1 = r1.a(r2);
        if (r1 != 0) goto L_0x009c;
    L_0x0093:
        r1 = r12.x;
        r2 = 2130838737; // 0x7f0204d1 float:1.7282465E38 double:1.052774217E-314;
        r1.setBackgroundResource(r2);
        goto L_0x00f2;
    L_0x009c:
        r1 = r0.s;
        if (r1 == 0) goto L_0x00a1;
    L_0x00a0:
        goto L_0x00a3;
    L_0x00a1:
        r1 = defpackage.axak.a;
    L_0x00a3:
        r2 = com.google.protos.youtube.api.innertube.LiveChatItemRenderer.liveChatPaidMessageFooterRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r1.a(r2);
        r1 = r1.h;
        r4 = r2.d;
        r1 = r1.b(r4);
        if (r1 != 0) goto L_0x00b9;
    L_0x00b6:
        r1 = r2.b;
        goto L_0x00bd;
    L_0x00b9:
        r1 = r2.a(r1);
    L_0x00bd:
        r1 = (defpackage.audz) r1;
        r12.a(r1);
        r1 = r12.c;
        r1 = r1.getResources();
        r2 = 2131626192; // 0x7f0e08d0 float:1.8879613E38 double:1.053163271E-314;
        r1 = r1.getDimension(r2);
        r1 = (int) r1;
        r12.a(r1);
        r1 = r12.af;
        r2 = r12.C;
        r4 = r0.o;
        r1.a(r2, r4);
        r1 = r12.D;
        r1 = r1.getDrawable();
        r2 = r12.D;
        r2 = r2.getColorFilter();
        r4 = r0.o;
        defpackage.abxo.a(r1, r2, r4);
        r1 = r12.x;
        r1.setBackgroundResource(r3);
    L_0x00f2:
        r1 = r12.x;
        r1 = r1.getBackground();
        r3 = r1;
        r3 = (android.graphics.drawable.GradientDrawable) r3;
        r1 = r12.I;
        r1 = r1.getBackground();
        r4 = r1;
        r4 = (android.graphics.drawable.GradientDrawable) r4;
        r1 = r12.B;
        r1 = r1.getBackground();
        r5 = r1;
        r5 = (android.graphics.drawable.GradientDrawable) r5;
        if (r3 == 0) goto L_0x0295;
    L_0x010f:
        if (r4 == 0) goto L_0x0295;
    L_0x0111:
        r2 = r12.af;
        r6 = r0.l;
        r7 = r0.n;
        r2.a(r3, r4, r5, r6, r7);
        goto L_0x0295;
    L_0x011c:
        r1 = r12.x;
        r1.setBackgroundResource(r3);
        r1 = r0.a;
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r1 = r1 & r2;
        if (r1 == 0) goto L_0x017e;
    L_0x0128:
        r1 = r0.s;
        if (r1 == 0) goto L_0x012d;
    L_0x012c:
        goto L_0x012f;
    L_0x012d:
        r1 = defpackage.axak.a;
    L_0x012f:
        r2 = com.google.protos.youtube.api.innertube.LiveChatItemRenderer.liveChatPaidMessageFooterRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r1.a(r2);
        r1 = r1.h;
        r2 = r2.d;
        r1 = r1.a(r2);
        if (r1 != 0) goto L_0x0143;
    L_0x0142:
        goto L_0x017e;
    L_0x0143:
        r1 = r0.s;
        if (r1 == 0) goto L_0x0148;
    L_0x0147:
        goto L_0x014a;
    L_0x0148:
        r1 = defpackage.axak.a;
    L_0x014a:
        r2 = com.google.protos.youtube.api.innertube.LiveChatItemRenderer.liveChatPaidMessageFooterRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r1.a(r2);
        r1 = r1.h;
        r3 = r2.d;
        r1 = r1.b(r3);
        if (r1 != 0) goto L_0x0160;
    L_0x015d:
        r1 = r2.b;
        goto L_0x0164;
    L_0x0160:
        r1 = r2.a(r1);
    L_0x0164:
        r1 = (defpackage.audz) r1;
        r12.a(r1);
        r12.a(r4);
        r1 = r12.D;
        r1 = r1.getDrawable();
        r2 = r12.D;
        r2 = r2.getColorFilter();
        r3 = r0.o;
        defpackage.abxo.a(r1, r2, r3);
        goto L_0x018b;
    L_0x017e:
        r1 = r12.I;
        r2 = 2130838736; // 0x7f0204d0 float:1.7282463E38 double:1.0527742163E-314;
        r1.setBackgroundResource(r2);
        r1 = r12.B;
        r1.setVisibility(r5);
    L_0x018b:
        r1 = r12.x;
        r1 = r1.getBackground();
        r7 = r1;
        r7 = (android.graphics.drawable.GradientDrawable) r7;
        r1 = r12.I;
        r1 = r1.getBackground();
        r8 = r1;
        r8 = (android.graphics.drawable.GradientDrawable) r8;
        r1 = r12.B;
        r1 = r1.getBackground();
        r9 = r1;
        r9 = (android.graphics.drawable.GradientDrawable) r9;
        if (r7 != 0) goto L_0x01a9;
    L_0x01a8:
        goto L_0x01b4;
    L_0x01a9:
        if (r8 == 0) goto L_0x01b4;
    L_0x01ab:
        r6 = r12.af;
        r10 = r0.l;
        r11 = r0.n;
        r6.a(r7, r8, r9, r10, r11);
    L_0x01b4:
        r1 = r12.af;
        r2 = r12.b;
        r3 = r0.o;
        r1.a(r2, r3);
        r1 = r12.af;
        r2 = r12.C;
        r3 = r0.o;
        r1.a(r2, r3);
        r1 = r0.b;
        if (r1 != r5) goto L_0x01cf;
    L_0x01ca:
        r1 = r0.c;
        r1 = (defpackage.aueb) r1;
        goto L_0x01d1;
    L_0x01cf:
        r1 = defpackage.aueb.c;
    L_0x01d1:
        r1 = r1.a;
        r2 = 1;
        r1 = r1 & r2;
        if (r1 == 0) goto L_0x0290;
    L_0x01d7:
        r1 = r0.b;
        if (r1 != r5) goto L_0x01e0;
    L_0x01db:
        r0 = r0.c;
        r0 = (defpackage.aueb) r0;
        goto L_0x01e2;
    L_0x01e0:
        r0 = defpackage.aueb.c;
    L_0x01e2:
        r0 = r0.b;
        if (r0 != 0) goto L_0x01e8;
    L_0x01e6:
        r0 = defpackage.augt.h;
    L_0x01e8:
        r1 = r12.b;
        r3 = r0.b;
        if (r3 != 0) goto L_0x01f0;
    L_0x01ee:
        r3 = defpackage.arml.f;
    L_0x01f0:
        r3 = defpackage.ajqy.a(r3);
        r1.setHint(r3);
        r1 = r12.b;
        r3 = r0.d;
        r5 = r1.getCurrentHintTextColor();
        if (r3 == r5) goto L_0x022d;
    L_0x0201:
        r5 = new android.animation.ArgbEvaluator;
        r5.<init>();
        r6 = 2;
        r6 = new java.lang.Object[r6];
        r7 = r1.getCurrentHintTextColor();
        r7 = java.lang.Integer.valueOf(r7);
        r6[r4] = r7;
        r3 = java.lang.Integer.valueOf(r3);
        r6[r2] = r3;
        r3 = android.animation.ValueAnimator.ofObject(r5, r6);
        r5 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r3.setDuration(r5);
        r5 = new abxt;
        r5.<init>(r1);
        r3.addUpdateListener(r5);
        r3.start();
    L_0x022d:
        r1 = r12.b;
        r3 = r0.f;
        r5 = r0.e;
        r6 = new abtf;
        r6.<init>(r12, r3, r5);
        r1.setOnFocusChangeListener(r6);
        r1 = r12.b;
        r1 = r1.hasFocus();
        r12.a(r1, r3, r5);
        r1 = r0.g;
        r12.k = r1;
        r0 = r0.f;
        r1 = android.graphics.Color.red(r0);
        r5 = (double) r1;
        r7 = 4596827742536767164; // 0x3fcb367a0f9096bc float:1.4257557E-29 double:0.2126;
        java.lang.Double.isNaN(r5);
        r5 = r5 * r7;
        r1 = android.graphics.Color.green(r0);
        r7 = (double) r1;
        r9 = 4604617168452267173; // 0x3fe6e2eb1c432ca5 float:6.457779E-22 double:0.7152;
        java.lang.Double.isNaN(r7);
        r7 = r7 * r9;
        r5 = r5 + r7;
        r0 = android.graphics.Color.blue(r0);
        r0 = (double) r0;
        r7 = 4589866978952703325; // 0x3fb27bb2fec56d5d float:-1.3121288E38 double:0.0722;
        java.lang.Double.isNaN(r0);
        r0 = r0 * r7;
        r5 = r5 + r0;
        r0 = 4627730092099895296; // 0x4039000000000000 float:0.0 double:25.0;
        r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r3 <= 0) goto L_0x0280;
    L_0x027f:
        goto L_0x0281;
    L_0x0280:
        r2 = 0;
    L_0x0281:
        r12.ah = r2;
        r0 = r12.i;
        r0 = r0.d;
        r12.b(r0);
        r0 = r12.I;
        r0.setVisibility(r4);
        return;
    L_0x0290:
        r0 = r12.I;
        r0.setVisibility(r5);
    L_0x0295:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abta.i():void");
    }

    private final void a(audz audz) {
        if (audz != null) {
            arml arml;
            TextView textView = this.C;
            if ((audz.a & 2) != 0) {
                arml = audz.c;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            if ((audz.a & 1) != 0) {
                akvp akvp = this.q;
                arwf arwf = audz.b;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                arwh a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
                int a2 = akvp.a(a);
                if (a2 != 0) {
                    this.D.setImageResource(a2);
                }
            }
            this.B.setVisibility(0);
        }
    }

    private final void a(int i) {
        LayoutParams layoutParams = (LayoutParams) this.C.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, i, layoutParams.rightMargin, layoutParams.bottomMargin);
        this.C.setLayoutParams(layoutParams);
        layoutParams = (LayoutParams) this.D.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, i, layoutParams.rightMargin, layoutParams.bottomMargin);
        this.D.setLayoutParams(layoutParams);
    }

    public final void a(int i, long j) {
        String string = this.c.getResources().getString(R.string.character_count, new Object[]{Integer.valueOf(i), Long.valueOf(j)});
        int c = ra.c(this.c, this.p.a(2));
        int a = xwe.a(this.c, R.attr.ytTextSecondary, 0);
        this.N.setText(string);
        if (((long) i) > this.j) {
            this.N.setTextColor(c);
            this.e = true;
        } else if (this.e) {
            this.N.setTextColor(a);
            this.e = false;
        }
        c();
    }

    private final auev j() {
        ajwy ajwy = this.l;
        if (ajwy != null) {
            auev[] auevArr = ajwy.b;
            if (auevArr != null) {
                int length = auevArr.length;
                if (length != 0) {
                    int i = this.aa;
                    if (i <= length) {
                        return auevArr[i];
                    }
                }
            }
        }
        return null;
    }

    public final void a(boolean z, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.L.getLayoutParams();
        if (z) {
            layoutParams.height = this.L.getResources().getDimensionPixelOffset(R.dimen.live_chat_underline_height_focused);
            this.L.setBackgroundColor(i);
        } else {
            layoutParams.height = this.L.getResources().getDimensionPixelOffset(R.dimen.live_chat_underline_height_unfocused);
            this.L.setBackgroundColor(i2);
        }
        this.L.requestLayout();
    }

    public final void a(long j) {
        ajwy ajwy = this.l;
        if (ajwy != null) {
            auev[] auevArr = ajwy.b;
            if (auevArr != null) {
                int length = auevArr.length;
                int i = 0;
                while (i < length) {
                    auev auev = this.l.b[i];
                    if ((i == 0 && j < auev.b) || ((i == length - 1 && j > auev.c) || (j >= auev.b && j <= auev.c))) {
                        this.aa = i;
                        this.Q.setProgress(i);
                        return;
                    }
                    i++;
                }
            }
        }
    }

    public final String b(long j) {
        return this.ad.format(c(j));
    }

    private final double c(long j) {
        double d = (double) (j - (j % this.ab));
        Double.isNaN(d);
        return d / 1000000.0d;
    }

    public final void f() {
        c(false);
        if (this.b.getVisibility() == 0) {
            this.b.requestFocus();
            xpr.b(this.b);
        }
    }

    /* JADX WARNING: Missing block: B:62:0x0102, code skipped:
            if (r3 != 0) goto L_0x0106;
     */
    public final /* synthetic */ void a_(defpackage.akor r10, java.lang.Object r11) {
        /*
        r9 = this;
        r11 = (defpackage.ajwy) r11;
        if (r10 == 0) goto L_0x0006;
    L_0x0004:
        r9.Z = r10;
    L_0x0006:
        r10 = r9.T;
        if (r10 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x000f;
    L_0x000b:
        r10 = r10.c;
        r9.ai = r10;
    L_0x000f:
        r9.l = r11;
        r10 = r11.j;
        r0 = 0;
        r1 = 0;
        if (r10 == 0) goto L_0x0031;
    L_0x0017:
        r2 = r10.length;
        if (r2 > 0) goto L_0x001b;
    L_0x001a:
        goto L_0x0031;
    L_0x001b:
        r3 = 0;
    L_0x001c:
        if (r3 >= r2) goto L_0x0031;
    L_0x001e:
        r4 = r10[r3];
        r5 = r4.a;
        r6 = 126326492; // 0x78796dc float:2.040121E-34 double:6.241358E-316;
        if (r5 != r6) goto L_0x002e;
    L_0x0027:
        r10 = r4.b;
        r10 = (defpackage.arec) r10;
        r9.ag = r10;
        goto L_0x0033;
    L_0x002e:
        r3 = r3 + 1;
        goto L_0x001c;
    L_0x0031:
        r9.ag = r0;
    L_0x0033:
        r10 = r9.u;
        r10.setOnClickListener(r9);
        r10 = r9.d;
        r10.setOnClickListener(r9);
        r10 = r9.F;
        r10.setOnClickListener(r9);
        r10 = r9.b;
        r2 = r9.r;
        r10.addTextChangedListener(r2);
        r10 = r9.ag;
        r2 = 8;
        if (r10 != 0) goto L_0x005a;
    L_0x004f:
        r10 = r9.K;
        r10.setVisibility(r2);
        r10 = r9.J;
        r10.setOnClickListener(r0);
        goto L_0x0072;
    L_0x005a:
        r10 = r9.b;
        r3 = r9.i;
        r3 = r3.a(r10);
        r10.addTextChangedListener(r3);
        r10 = r9.K;
        r10.setVisibility(r1);
        r10 = r9.J;
        r10.setOnClickListener(r9);
        r9.b(r1);
    L_0x0072:
        r10 = r9.l;
        r3 = 65153809; // 0x3e22b11 float:1.3292974E-36 double:3.21902587E-316;
        if (r10 == 0) goto L_0x00df;
    L_0x0079:
        r4 = r10.g;
        if (r4 != 0) goto L_0x007e;
    L_0x007d:
        goto L_0x00df;
    L_0x007e:
        r4 = r4.a;
        r5 = 53345347; // 0x32dfc43 float:5.1129713E-37 double:2.63561033E-316;
        if (r4 != r5) goto L_0x00df;
    L_0x0085:
        r10 = r10.f;
        if (r10 == 0) goto L_0x00df;
    L_0x0089:
        r4 = r10.a;
        if (r4 != r3) goto L_0x0092;
    L_0x008d:
        r10 = r10.b;
        r10 = (defpackage.aphg) r10;
        goto L_0x0094;
    L_0x0092:
        r10 = defpackage.aphg.s;
    L_0x0094:
        r10 = r10.a;
        r10 = r10 & 16;
        if (r10 == 0) goto L_0x00df;
    L_0x009a:
        r10 = r9.q;
        r4 = r9.l;
        r4 = r4.f;
        r6 = r4.a;
        if (r6 != r3) goto L_0x00a9;
    L_0x00a4:
        r4 = r4.b;
        r4 = (defpackage.aphg) r4;
        goto L_0x00ab;
    L_0x00a9:
        r4 = defpackage.aphg.s;
    L_0x00ab:
        r4 = r4.e;
        if (r4 != 0) goto L_0x00b1;
    L_0x00af:
        r4 = defpackage.arwf.c;
    L_0x00b1:
        r4 = r4.b;
        r4 = defpackage.arwh.a(r4);
        if (r4 != 0) goto L_0x00bb;
    L_0x00b9:
        r4 = defpackage.arwh.UNKNOWN;
    L_0x00bb:
        r10 = r10.a(r4);
        if (r10 == 0) goto L_0x00c6;
    L_0x00c1:
        r4 = r9.v;
        r4.setImageResource(r10);
    L_0x00c6:
        r10 = r9.l;
        r10 = r10.g;
        r4 = r10.a;
        if (r4 != r5) goto L_0x00d3;
    L_0x00ce:
        r10 = r10.b;
        r10 = (defpackage.aqwx) r10;
        goto L_0x00d5;
    L_0x00d3:
        r10 = defpackage.aqwx.g;
    L_0x00d5:
        r4 = r9.v;
        r5 = new abtc;
        r5.<init>(r9, r10);
        r4.setOnClickListener(r5);
    L_0x00df:
        r10 = r9.l;
        r4 = 1;
        if (r10 == 0) goto L_0x0153;
    L_0x00e4:
        r10 = r10.e;
        if (r10 != 0) goto L_0x00ea;
    L_0x00e8:
        goto L_0x0153;
    L_0x00ea:
        r5 = r10.a;
        if (r5 != r3) goto L_0x0153;
    L_0x00ee:
        r10 = r10.b;
        r10 = (defpackage.aphg) r10;
        r3 = r10.b;
        if (r3 != r4) goto L_0x0105;
    L_0x00f6:
        r3 = r10.c;
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r3 = defpackage.aphh.a(r3);
        if (r3 == 0) goto L_0x0105;
    L_0x0104:
        goto L_0x0106;
    L_0x0105:
        r3 = 1;
    L_0x0106:
        r5 = r3 + -1;
        if (r3 == 0) goto L_0x0152;
    L_0x010a:
        r3 = 4;
        if (r5 == r3) goto L_0x0118;
    L_0x010d:
        r3 = 6;
        if (r5 == r3) goto L_0x0114;
    L_0x0110:
        r3 = 2130838709; // 0x7f0204b5 float:1.7282408E38 double:1.052774203E-314;
        goto L_0x011b;
    L_0x0114:
        r3 = 2130838708; // 0x7f0204b4 float:1.7282406E38 double:1.0527742025E-314;
        goto L_0x011b;
    L_0x0118:
        r3 = 2130838706; // 0x7f0204b2 float:1.7282402E38 double:1.0527742015E-314;
    L_0x011b:
        r5 = r9.d;
        r6 = r9.c;
        r3 = defpackage.ra.a(r6, r3);
        defpackage.xpr.a(r5, r3);
        r3 = r10.l;
        if (r3 != 0) goto L_0x012c;
    L_0x012a:
        r3 = defpackage.apxu.d;
    L_0x012c:
        r9.ae = r3;
        r3 = r9.d;
        r5 = r10.a;
        r5 = r5 & 128;
        if (r5 == 0) goto L_0x013d;
    L_0x0136:
        r5 = r10.g;
        if (r5 != 0) goto L_0x013e;
    L_0x013a:
        r5 = defpackage.arml.f;
        goto L_0x013e;
    L_0x013d:
        r5 = r0;
    L_0x013e:
        r5 = defpackage.ajqy.a(r5);
        r3.setText(r5);
        r3 = r9.aj;
        r5 = new acvs;
        r10 = r10.r;
        r5.<init>(r10);
        r3.b(r5);
        goto L_0x0153;
    L_0x0152:
        throw r0;
    L_0x0153:
        r5 = r11.d;
        r9.ab = r5;
        r10 = r9.P;
        r3 = r11.c;
        r10.setText(r3);
        r10 = r11.c;
        r10 = java.util.Currency.getInstance(r10);
        r3 = r10.getSymbol();
        r9.ac = r3;
        r3 = r9.O;
        r5 = r9.ac;
        r3.setText(r5);
        r3 = r11.i;
        r3 = android.text.TextUtils.isEmpty(r3);
        r5 = 2;
        if (r3 == 0) goto L_0x017f;
    L_0x017a:
        r3 = java.util.Locale.getDefault();
        goto L_0x0199;
    L_0x017f:
        r3 = r11.i;
        r6 = "_";
        r3 = r3.split(r6);
        r6 = r3.length;
        if (r6 != r5) goto L_0x0195;
    L_0x018a:
        r6 = new java.util.Locale;
        r7 = r3[r1];
        r3 = r3[r4];
        r6.<init>(r7, r3);
        r3 = r6;
        goto L_0x0199;
    L_0x0195:
        r3 = java.util.Locale.getDefault();
    L_0x0199:
        r6 = java.text.NumberFormat.getInstance(r3);
        r9.ad = r6;
        r6 = r9.ad;
        r6.setCurrency(r10);
        r6 = r9.ad;
        r7 = r10.getDefaultFractionDigits();
        r6.setMaximumFractionDigits(r7);
        r6 = r9.ad;
        r7 = r10.getDefaultFractionDigits();
        r6.setMinimumFractionDigits(r7);
        r6 = r9.n;
        r7 = r11.a;
        r7 = defpackage.ajqy.a(r7);
        defpackage.xpr.a(r6, r7);
        r6 = r11.b;
        if (r6 == 0) goto L_0x02d5;
    L_0x01c5:
        r6 = r6.length;
        r6 = r6 + -1;
        r6 = java.lang.Math.max(r1, r6);
        r7 = r9.Q;
        r7.setMax(r6);
        r7 = r9.j();
        if (r7 == 0) goto L_0x02d5;
    L_0x01d7:
        r9.h();
        r9.g();
        r9.b(r0);
        r7 = r9.l;
        r7 = r7.k;
        if (r7 == 0) goto L_0x023c;
    L_0x01e6:
        r8 = defpackage.auen.class;
        r7 = defpackage.ajzv.a(r7, r8);
        r7 = (defpackage.auen) r7;
        if (r7 == 0) goto L_0x0237;
    L_0x01f0:
        r2 = r9.z;
        r8 = r7.a;
        r8 = r8 & r4;
        if (r8 == 0) goto L_0x01fd;
    L_0x01f7:
        r0 = r7.b;
        if (r0 != 0) goto L_0x01fd;
    L_0x01fb:
        r0 = defpackage.arml.f;
    L_0x01fd:
        r0 = defpackage.ajqy.a(r0);
        r2.setText(r0);
        r0 = r7.a;
        r0 = r0 & r5;
        if (r0 == 0) goto L_0x0231;
    L_0x0209:
        r0 = r7.c;
        if (r0 != 0) goto L_0x020f;
    L_0x020d:
        r0 = defpackage.arml.f;
    L_0x020f:
        r2 = new abtd;
        r2.<init>(r9);
        r0 = defpackage.ajqy.a(r0, r2);
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x0231;
    L_0x021e:
        r2 = r9.A;
        r2.setText(r0);
        r0 = r9.A;
        r2 = android.text.method.LinkMovementMethod.getInstance();
        r0.setMovementMethod(r2);
        r0 = r9.A;
        r0.setVisibility(r1);
    L_0x0231:
        r0 = r9.y;
        r0.setVisibility(r1);
        goto L_0x023c;
    L_0x0237:
        r0 = r9.y;
        r0.setVisibility(r2);
    L_0x023c:
        r0 = r9.Q;
        r0.setOnSeekBarChangeListener(r9);
        r7 = r11.h;
        r9.a(r7);
        r9.i();
        r9.h();
        r0 = r9.h;
        r0.setOnFocusChangeListener(r9);
        r0 = r9.h;
        r2 = r9.s;
        r0.addTextChangedListener(r2);
        r0 = r11.b;
        r0 = r0[r6];
        r5 = r0.c;
        r0 = java.text.NumberFormat.getInstance(r3);
        r0.setCurrency(r10);
        r0.setMaximumFractionDigits(r1);
        r5 = r9.c(r5);
        r0 = r0.format(r5);
        r2 = java.text.DecimalFormatSymbols.getInstance(r3);
        r3 = r2.getDecimalSeparator();
        r3 = java.lang.String.valueOf(r3);
        r2 = r2.getGroupingSeparator();
        r5 = r9.X;
        r5.setLength(r1);
        r5 = r9.X;
        r6 = "0123456789";
        r5.append(r6);
        r5 = r9.ad;
        r5 = r5.getMinimumFractionDigits();
        if (r5 <= 0) goto L_0x0299;
    L_0x0294:
        r5 = r9.X;
        r5.append(r3);
    L_0x0299:
        r5 = r9.ad;
        r5 = r5.isGroupingUsed();
        if (r5 == 0) goto L_0x02ac;
    L_0x02a1:
        r5 = r0.indexOf(r2);
        if (r5 < 0) goto L_0x02ac;
    L_0x02a7:
        r5 = r9.X;
        r5.append(r2);
    L_0x02ac:
        r5 = r9.h;
        r6 = r9.X;
        r6 = r6.toString();
        r6 = android.text.method.DigitsKeyListener.getInstance(r6);
        r5.setKeyListener(r6);
        r0 = r0.length();
        r5 = r9.h;
        r6 = new android.text.InputFilter[r4];
        r7 = new abue;
        r0 = java.lang.Math.max(r1, r0);
        r10 = r10.getDefaultFractionDigits();
        r7.<init>(r3, r2, r0, r10);
        r6[r1] = r7;
        r5.setFilters(r6);
    L_0x02d5:
        r10 = r11.l;
        r10 = r10 ^ r4;
        r11 = r9.H;
        defpackage.xpr.a(r11, r10);
        r11 = r9.Q;
        defpackage.xpr.a(r11, r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abta.a_(akor, java.lang.Object):void");
    }
}
