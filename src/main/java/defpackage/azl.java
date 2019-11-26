package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: azl */
public class azl extends aeh {
    public static final int b = ((int) TimeUnit.SECONDS.toMillis(30));
    public wd A;
    public azy B;
    public xs C;
    public ve D;
    public azz E;
    public Bitmap F;
    public Uri G;
    public boolean H;
    public Bitmap I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public Interpolator S;
    public final AccessibilityManager T;
    public Runnable U;
    private final bab V;
    private boolean W;
    private boolean X;
    private int Y;
    private Button Z;
    private Button aa;
    private ImageButton ab;
    private ImageButton ac;
    private MediaRouteExpandCollapseButton ad;
    private TextView ae;
    private TextView af;
    private TextView ag;
    private boolean ah;
    private LinearLayout ai;
    private View aj;
    private Interpolator ak;
    private Interpolator al;
    private Interpolator am;
    public final bbb c;
    public final bbs d;
    public Context e;
    public View f;
    public FrameLayout g;
    public LinearLayout h;
    public FrameLayout i;
    public ImageView j;
    public LinearLayout k;
    public RelativeLayout l;
    public OverlayListView m;
    public bac n;
    public List o;
    public Set p;
    public Set q;
    public Set r;
    public SeekBar s;
    public baa t;
    public bbs u;
    public int v;
    public int w;
    public int x;
    public final int y;
    public Map z;

    public azl(Context context) {
        this(context, 0);
    }

    public azl(Context context, int i) {
        context = bai.a(context, i, true);
        super(context, bai.a(context));
        this.ah = true;
        this.U = new azk(this);
        this.e = getContext();
        this.B = new azy(this);
        this.c = bbb.a(this.e);
        this.V = new bab(this);
        this.d = bbb.c();
        a(bbb.d());
        this.y = this.e.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.T = (AccessibilityManager) this.e.getSystemService("accessibility");
        if (VERSION.SDK_INT >= 21) {
            this.ak = AnimationUtils.loadInterpolator(context, R.interpolator.mr_linear_out_slow_in);
            this.al = AnimationUtils.loadInterpolator(context, R.interpolator.mr_fast_out_slow_in);
        }
        this.am = new AccelerateDecelerateInterpolator();
    }

    private final void a(xo xoVar) {
        wd wdVar = this.A;
        xs xsVar = null;
        if (wdVar != null) {
            wdVar.b(this.B);
            this.A = null;
        }
        if (xoVar != null && this.X) {
            try {
                this.A = new wd(this.e, xoVar);
            } catch (RemoteException e) {
                Log.e("MediaRouteCtrlDialog", "Error creating media controller in setMediaSession.", e);
            }
            wd wdVar2 = this.A;
            if (wdVar2 != null) {
                wdVar2.a(this.B);
            }
            wdVar2 = this.A;
            vj b = wdVar2 != null ? wdVar2.b() : null;
            this.D = b != null ? b.a() : null;
            wdVar2 = this.A;
            if (wdVar2 != null) {
                xsVar = wdVar2.a.b();
            }
            this.C = xsVar;
            k();
            a(false);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView((int) R.layout.mr_controller_material_dialog_b);
        findViewById(16908315).setVisibility(8);
        azw azw = new azw(this);
        this.g = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.g.setOnClickListener(new azo(this));
        this.h = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.h.setOnClickListener(new azr());
        Context context = this.e;
        int a = bai.a(context, 0, (int) R.attr.colorPrimary);
        if (sc.b(a, bai.a(context, 0, 16842801)) < 3.0d) {
            a = bai.a(context, 0, (int) R.attr.colorAccent);
        }
        this.Z = (Button) findViewById(16908314);
        this.Z.setText(R.string.mr_controller_disconnect);
        this.Z.setTextColor(a);
        this.Z.setOnClickListener(azw);
        this.aa = (Button) findViewById(16908313);
        this.aa.setText(R.string.mr_controller_stop_casting);
        this.aa.setTextColor(a);
        this.aa.setOnClickListener(azw);
        this.ag = (TextView) findViewById(R.id.mr_name);
        this.ac = (ImageButton) findViewById(R.id.mr_close);
        this.ac.setOnClickListener(azw);
        findViewById(R.id.mr_custom_control);
        this.i = (FrameLayout) findViewById(R.id.mr_default_control);
        azq azq = new azq(this);
        this.j = (ImageView) findViewById(R.id.mr_art);
        this.j.setOnClickListener(azq);
        findViewById(R.id.mr_control_title_container).setOnClickListener(azq);
        this.k = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.aj = findViewById(R.id.mr_control_divider);
        this.l = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.ae = (TextView) findViewById(R.id.mr_control_title);
        this.af = (TextView) findViewById(R.id.mr_control_subtitle);
        this.ab = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.ab.setOnClickListener(azw);
        this.ai = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.ai.setVisibility(8);
        this.s = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.s.setTag(this.d);
        this.t = new baa(this);
        this.s.setOnSeekBarChangeListener(this.t);
        this.m = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.o = new ArrayList();
        this.n = new bac(this, this.m.getContext(), this.o);
        this.m.setAdapter(this.n);
        this.r = new HashSet();
        Context context2 = this.e;
        LinearLayout linearLayout = this.k;
        OverlayListView overlayListView = this.m;
        boolean f = this.d.f();
        int a2 = bai.a(context2, 0, (int) R.attr.colorPrimary);
        int a3 = bai.a(context2, 0, (int) R.attr.colorPrimaryDark);
        if (f && bai.b(context2, 0) == -570425344) {
            i = -1;
        } else {
            i = a2;
            a2 = a3;
        }
        linearLayout.setBackgroundColor(i);
        overlayListView.setBackgroundColor(a2);
        linearLayout.setTag(Integer.valueOf(i));
        overlayListView.setTag(Integer.valueOf(a2));
        bai.a(this.e, (MediaRouteVolumeSlider) this.s, this.k);
        this.z = new HashMap();
        this.z.put(this.d, this.s);
        this.ad = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.ad.f = new azt(this);
        g();
        this.P = this.e.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.Q = this.e.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.R = this.e.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.f = null;
        this.W = true;
        b();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        int a = bag.a(this.e);
        getWindow().setLayout(a, -2);
        View decorView = getWindow().getDecorView();
        this.Y = (a - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.e.getResources();
        this.v = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.w = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.x = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.F = null;
        this.G = null;
        k();
        a(false);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X = true;
        this.c.a(baz.c, this.V, 2);
        a(bbb.d());
    }

    public final void onDetachedFromWindow() {
        this.c.a(this.V);
        a(null);
        this.X = false;
        super.onDetachedFromWindow();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        this.d.b(i == 25 ? -1 : 1);
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return (i == 25 || i == 24) ? true : super.onKeyUp(i, keyEvent);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0132  */
    public final void a(boolean r10) {
        /*
        r9 = this;
        r0 = r9.u;
        r1 = 1;
        if (r0 == 0) goto L_0x000d;
    L_0x0005:
        r9.K = r1;
        r0 = r9.L;
        r10 = r10 | r0;
        r9.L = r10;
        return;
    L_0x000d:
        r0 = 0;
        r9.K = r0;
        r9.L = r0;
        r2 = r9.d;
        r2 = r2.a();
        if (r2 == 0) goto L_0x019a;
    L_0x001a:
        r2 = r9.d;
        r2 = r2.c();
        if (r2 == 0) goto L_0x0024;
    L_0x0022:
        goto L_0x019a;
    L_0x0024:
        r2 = r9.W;
        if (r2 == 0) goto L_0x0199;
    L_0x0028:
        r2 = r9.ag;
        r3 = r9.d;
        r3 = r3.d;
        r2.setText(r3);
        r2 = r9.Z;
        r3 = r9.d;
        r3 = r3.i;
        r4 = 8;
        if (r3 != 0) goto L_0x003e;
    L_0x003b:
        r3 = 8;
        goto L_0x003f;
    L_0x003e:
        r3 = 0;
    L_0x003f:
        r2.setVisibility(r3);
        r2 = r9.H;
        if (r2 == 0) goto L_0x0078;
    L_0x0046:
        r2 = r9.I;
        r2 = defpackage.azl.a(r2);
        if (r2 == 0) goto L_0x0067;
    L_0x004e:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Can't set artwork image with recycled bitmap: ";
        r2.append(r3);
        r3 = r9.I;
        r2.append(r3);
        r2 = r2.toString();
        r3 = "MediaRouteCtrlDialog";
        android.util.Log.w(r3, r2);
        goto L_0x0075;
    L_0x0067:
        r2 = r9.j;
        r3 = r9.I;
        r2.setImageBitmap(r3);
        r2 = r9.j;
        r3 = r9.J;
        r2.setBackgroundColor(r3);
    L_0x0075:
        r9.l();
    L_0x0078:
        r2 = r9.d;
        r2 = r9.a(r2);
        if (r2 == 0) goto L_0x00b1;
    L_0x0080:
        r2 = r9.ai;
        r2 = r2.getVisibility();
        if (r2 != r4) goto L_0x00b6;
    L_0x0088:
        r2 = r9.ai;
        r2.setVisibility(r0);
        r2 = r9.s;
        r3 = r9.d;
        r3 = r3.p;
        r2.setMax(r3);
        r2 = r9.s;
        r3 = r9.d;
        r3 = r3.o;
        r2.setProgress(r3);
        r2 = r9.ad;
        r3 = r9.d;
        r3 = r3.f();
        if (r3 != 0) goto L_0x00ac;
    L_0x00a9:
        r3 = 8;
        goto L_0x00ad;
    L_0x00ac:
        r3 = 0;
    L_0x00ad:
        r2.setVisibility(r3);
        goto L_0x00b6;
    L_0x00b1:
        r2 = r9.ai;
        r2.setVisibility(r4);
    L_0x00b6:
        r2 = r9.c();
        if (r2 == 0) goto L_0x0196;
    L_0x00bc:
        r2 = r9.D;
        r3 = 0;
        if (r2 == 0) goto L_0x00c4;
    L_0x00c1:
        r2 = r2.a;
        goto L_0x00c5;
    L_0x00c4:
        r2 = r3;
    L_0x00c5:
        r5 = android.text.TextUtils.isEmpty(r2);
        r5 = r5 ^ r1;
        r6 = r9.D;
        if (r6 == 0) goto L_0x00d0;
    L_0x00ce:
        r3 = r6.b;
    L_0x00d0:
        r6 = android.text.TextUtils.isEmpty(r3);
        r6 = r6 ^ r1;
        r7 = r9.d;
        r7 = r7.q;
        r8 = -1;
        if (r7 != r8) goto L_0x010e;
    L_0x00dc:
        r7 = r9.C;
        if (r7 != 0) goto L_0x00e1;
    L_0x00e0:
        goto L_0x0105;
    L_0x00e1:
        r7 = r7.a;
        if (r7 == 0) goto L_0x0105;
    L_0x00e5:
        if (r5 != 0) goto L_0x00f2;
    L_0x00e7:
        if (r6 != 0) goto L_0x00f2;
    L_0x00e9:
        r2 = r9.ae;
        r3 = 2131952893; // 0x7f1304fd float:1.9542242E38 double:1.053324683E-314;
        r2.setText(r3);
        goto L_0x0116;
    L_0x00f2:
        if (r5 == 0) goto L_0x00fb;
    L_0x00f4:
        r5 = r9.ae;
        r5.setText(r2);
        r2 = 1;
        goto L_0x00fc;
    L_0x00fb:
        r2 = 0;
    L_0x00fc:
        if (r6 == 0) goto L_0x0117;
    L_0x00fe:
        r5 = r9.af;
        r5.setText(r3);
        r3 = 1;
        goto L_0x0118;
    L_0x0105:
        r2 = r9.ae;
        r3 = 2131952894; // 0x7f1304fe float:1.9542244E38 double:1.0533246835E-314;
        r2.setText(r3);
        goto L_0x0116;
    L_0x010e:
        r2 = r9.ae;
        r3 = 2131952888; // 0x7f1304f8 float:1.9542231E38 double:1.0533246805E-314;
        r2.setText(r3);
    L_0x0116:
        r2 = 1;
    L_0x0117:
        r3 = 0;
    L_0x0118:
        r5 = r9.ae;
        if (r2 != 0) goto L_0x011f;
    L_0x011c:
        r2 = 8;
        goto L_0x0120;
    L_0x011f:
        r2 = 0;
    L_0x0120:
        r5.setVisibility(r2);
        r2 = r9.af;
        if (r3 != 0) goto L_0x012a;
    L_0x0127:
        r3 = 8;
        goto L_0x012b;
    L_0x012a:
        r3 = 0;
    L_0x012b:
        r2.setVisibility(r3);
        r2 = r9.C;
        if (r2 == 0) goto L_0x0196;
    L_0x0132:
        r2 = r2.a;
        r3 = 6;
        if (r2 == r3) goto L_0x013d;
    L_0x0137:
        r3 = 3;
        if (r2 != r3) goto L_0x013b;
    L_0x013a:
        goto L_0x013d;
    L_0x013b:
        r2 = 0;
        goto L_0x013e;
    L_0x013d:
        r2 = 1;
    L_0x013e:
        r3 = r9.ab;
        r3 = r3.getContext();
        if (r2 == 0) goto L_0x0153;
    L_0x0146:
        r5 = r9.i();
        if (r5 == 0) goto L_0x0153;
    L_0x014c:
        r2 = 2130772161; // 0x7f0100c1 float:1.7147433E38 double:1.052741324E-314;
        r5 = 2131952895; // 0x7f1304ff float:1.9542246E38 double:1.053324684E-314;
        goto L_0x0175;
    L_0x0153:
        if (r2 == 0) goto L_0x0163;
    L_0x0155:
        r5 = r9.j();
        if (r5 != 0) goto L_0x015c;
    L_0x015b:
        goto L_0x0163;
    L_0x015c:
        r2 = 2130772165; // 0x7f0100c5 float:1.714744E38 double:1.052741326E-314;
        r5 = 2131952897; // 0x7f130501 float:1.954225E38 double:1.053324685E-314;
        goto L_0x0175;
    L_0x0163:
        if (r2 != 0) goto L_0x0172;
    L_0x0165:
        r2 = r9.h();
        if (r2 == 0) goto L_0x0172;
    L_0x016b:
        r2 = 2130772162; // 0x7f0100c2 float:1.7147435E38 double:1.0527413244E-314;
        r5 = 2131952896; // 0x7f130500 float:1.9542248E38 double:1.0533246845E-314;
        goto L_0x0175;
    L_0x0172:
        r1 = 0;
        r2 = 0;
        r5 = 0;
    L_0x0175:
        r6 = r9.ab;
        if (r1 != 0) goto L_0x017b;
    L_0x0179:
        r0 = 8;
    L_0x017b:
        r6.setVisibility(r0);
        if (r1 == 0) goto L_0x0196;
    L_0x0180:
        r0 = r9.ab;
        r1 = defpackage.bai.a(r3, r2);
        r0.setImageResource(r1);
        r0 = r9.ab;
        r1 = r3.getResources();
        r1 = r1.getText(r5);
        r0.setContentDescription(r1);
    L_0x0196:
        r9.d(r10);
    L_0x0199:
        return;
    L_0x019a:
        r9.dismiss();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azl.a(boolean):void");
    }

    static boolean a(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    public final boolean c() {
        return (this.D == null && this.C == null) ? false : true;
    }

    public final int b(boolean z) {
        int i;
        if (z || this.ai.getVisibility() == 0) {
            int paddingTop = this.k.getPaddingTop() + this.k.getPaddingBottom();
            if (z) {
                paddingTop += this.l.getMeasuredHeight();
            }
            if (this.ai.getVisibility() == 0) {
                paddingTop += this.ai.getMeasuredHeight();
            }
            if (z && this.ai.getVisibility() == 0) {
                return paddingTop + this.aj.getMeasuredHeight();
            }
            i = paddingTop;
        } else {
            i = 0;
        }
        return i;
    }

    public final void c(boolean z) {
        View view = this.aj;
        int i = 0;
        int i2 = (this.ai.getVisibility() == 0 && z) ? 0 : 8;
        view.setVisibility(i2);
        LinearLayout linearLayout = this.k;
        if (this.ai.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* Access modifiers changed, original: final */
    public final void d(boolean z) {
        this.i.requestLayout();
        this.i.getViewTreeObserver().addOnGlobalLayoutListener(new azs(this, z));
    }

    public final void a(View view, int i) {
        azv azv = new azv(azl.a(view), i, view);
        azv.setDuration((long) this.P);
        if (VERSION.SDK_INT >= 21) {
            azv.setInterpolator(this.S);
        }
        view.startAnimation(azv);
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        if (VERSION.SDK_INT >= 21) {
            this.S = !this.M ? this.al : this.ak;
        } else {
            this.S = this.am;
        }
    }

    /* Access modifiers changed, original: final */
    public final void e(boolean z) {
        this.p = null;
        this.q = null;
        this.N = false;
        if (this.O) {
            this.O = false;
            d(z);
        }
        this.m.setEnabled(true);
    }

    /* Access modifiers changed, original: final */
    public final void f(boolean z) {
        int firstVisiblePosition = this.m.getFirstVisiblePosition();
        for (int i = 0; i < this.m.getChildCount(); i++) {
            View childAt = this.m.getChildAt(i);
            bbs bbs = (bbs) this.n.getItem(firstVisiblePosition + i);
            if (z) {
                Set set = this.p;
                if (set != null && set.contains(bbs)) {
                }
            }
            ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
            alphaAnimation.setDuration(0);
            animationSet.addAnimation(alphaAnimation);
            new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
        }
        for (bak bak : this.m.a) {
            bak.k = true;
            bak.l = true;
            baj baj = bak.m;
            if (baj != null) {
                baj.a();
            }
        }
        if (!z) {
            e(false);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean h() {
        return (this.C.e & 516) != 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean i() {
        return (this.C.e & 514) != 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean j() {
        return (this.C.e & 1) != 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(bbs bbs) {
        return this.ah && bbs.n == 1;
    }

    public static int a(View view) {
        return view.getLayoutParams().height;
    }

    static void b(View view, int i) {
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: final */
    public final int a(int i, int i2) {
        if (i < i2) {
            return (int) (((((float) this.Y) * 9.0f) / 16.0f) + 0.5f);
        }
        return (int) (((((float) this.Y) * ((float) i2)) / ((float) i)) + 0.5f);
    }

    /* Access modifiers changed, original: final */
    public final void k() {
        Bitmap bitmap;
        ve veVar = this.D;
        Object obj = null;
        Bitmap bitmap2 = veVar != null ? veVar.c : null;
        if (veVar != null) {
            obj = veVar.d;
        }
        azz azz = this.E;
        if (azz == null) {
            bitmap = this.F;
        } else {
            bitmap = azz.a;
        }
        Uri uri;
        if (azz == null) {
            uri = this.G;
        } else {
            uri = azz.b;
        }
        if (bitmap != bitmap2 || (bitmap == null && ((uri == null || !uri.equals(obj)) && !(uri == null && obj == null)))) {
            azz = this.E;
            if (azz != null) {
                azz.cancel(true);
            }
            this.E = new azz(this);
            this.E.execute(new Void[0]);
        }
    }

    /* Access modifiers changed, original: final */
    public final void l() {
        this.H = false;
        this.I = null;
        this.J = 0;
    }
}
