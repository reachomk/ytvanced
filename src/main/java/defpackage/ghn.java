package defpackage;

import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import com.google.android.libraries.youtube.edit.geo.LocationSearchView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import com.google.protos.youtube.api.innertube.UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ghn */
public final class ghn extends ggx {
    private ViewGroup aA;
    private boolean aB;
    private boolean aC = true;
    public abjy ag;
    public ghm ah;
    public giv ai;
    public Executor aj;
    public ghz ak;
    public giq al;
    public SharedPreferences am;
    public RtlAwareViewPager an;
    public DefaultTabsBar ao;
    public ghw ap;
    public ImageButton[] aq;
    public int ar;
    public boolean as;
    private FrameLayout at;
    private axuh au;
    private View av;
    private axuo aw;
    private LinearLayout ax;
    private View ay;
    private LocationSearchView az;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((ghy) xtx.a(ghy.class, this.y, p())).m().a(this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        this.ab.t().a(acwl.ax, null, null);
        this.at = (FrameLayout) layoutInflater.inflate(R.layout.multi_page_sticker_catalog_fragment, viewGroup, false);
        this.av = this.at.findViewById(R.id.sticker_catalog_container);
        this.an = (RtlAwareViewPager) this.at.findViewById(R.id.sticker_catalog_page);
        RtlAwareViewPager rtlAwareViewPager = this.an;
        if (rtlAwareViewPager.d != 2) {
            rtlAwareViewPager.d = 2;
            rtlAwareViewPager.c();
        }
        this.ap = new ghw(this, s());
        this.an.l = new ghx(this);
        this.ao = (DefaultTabsBar) this.at.findViewById(R.id.sticker_page_tab_bar);
        this.ax = (LinearLayout) this.at.findViewById(R.id.sticker_page_bottom_toolbar);
        if (this.ac.b()) {
            this.as = true;
            this.an.b(this.ao);
            this.ao.setVisibility(0);
            this.ax.setVisibility(8);
        } else {
            this.as = false;
            this.ao.setVisibility(8);
            this.ax.setVisibility(0);
        }
        this.ay = this.at.findViewById(R.id.spinner);
        if (bundle2 != null) {
            this.ap.a(bundle2.getParcelable("pages"), getClass().getClassLoader());
            this.ar = bundle2.getInt("position");
        }
        this.an.a(this.ap);
        g(true);
        String str = "window";
        if (this.as) {
            AnimatorListener ght = new ght(this);
            this.af = true;
            this.c.setOnKeyListener(this);
            Display defaultDisplay = ((WindowManager) M_().getSystemService(str)).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i = point.y;
            this.ae = i;
            this.av.setTranslationY((float) i);
            this.an.setTranslationY((float) this.ae);
            this.an.setTranslationY((float) this.ae);
            a(true, ght);
        } else {
            d(this.ar);
            this.ax.setAlpha(0.0f);
            this.c.setOnKeyListener(this);
            this.av.setAlpha(0.0f);
            this.an.setAlpha(0.0f);
            Display defaultDisplay2 = ((WindowManager) M_().getSystemService(str)).getDefaultDisplay();
            Point point2 = new Point();
            defaultDisplay2.getSize(point2);
            int i2 = point2.y;
            this.ae = i2;
            this.an.setTranslationY((float) i2);
            f(true);
        }
        a((int) R.layout.location_search_view_layout, (int) R.style.f313ReelTheme.NoActionBar.FullScreen.Light, (int) R.style.f312ReelTheme.NoActionBar.FullScreen.Dark);
        this.az = (LocationSearchView) this.at.findViewById(R.id.location_search_view);
        zqo zqo = this.ah;
        zqq zqq = this.az;
        gha gha = this.ad;
        acvx t = this.ab.t();
        zqo.h = zqq;
        zqo.g = gha;
        zqo.j = this;
        zqo.k = t;
        zqo.i = zqo.a.a(zqq, zqo);
        zqo.f = zqo.c();
        a((int) R.layout.user_mention_search_view, (int) R.style.f600UserMentionSearchView.Light, (int) R.style.f599UserMentionSearchView.Dark);
        this.aA = (ViewGroup) this.at.findViewById(R.id.user_mention_search_view);
        giv giv = this.ai;
        ViewGroup viewGroup2 = this.aA;
        gha = this.ad;
        t = this.ab.t();
        giv.g = viewGroup2;
        giv.f = gha;
        FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.results_view);
        giv.l = new gaz();
        giv.l.a(frameLayout);
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.userMentionSuggestionsEndpoint, UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.a);
        giv.k = (apxu) ((anxl) apxx.build());
        grc grc = giv.a;
        ayvv ayvv = ayvv.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_MENTION_STICKER;
        Context context = (Context) grc.a((Context) grc.a.get(), 1);
        grq grq = (grq) grc.a((grq) grc.b.get(), 2);
        ViewGroup viewGroup3 = (ViewGroup) grc.a(viewGroup2, 3);
        grd grd = (grd) grc.a(giv, 4);
        acvx acvx = (acvx) grc.a(t, 5);
        gqy gqy = r9;
        ayvv ayvv2 = (ayvv) grc.a(ayvv, 6);
        gqy gqy2 = new gqy(context, grq, viewGroup3, grd, acvx, ayvv2, (apxu) grc.a(giv.k, 7));
        giv.h = gqy;
        return this.at;
    }

    public final void e(Bundle bundle) {
        bundle.putParcelable("pages", this.ap.b());
        bundle.putInt("position", this.an.a());
        super.e(bundle);
    }

    /* Access modifiers changed, original: protected|final */
    public final List a(float f, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.av, View.ALPHA, new float[]{f}).setDuration(300));
        arrayList.add(ObjectAnimator.ofFloat(this.an, View.TRANSLATION_Y, new float[]{(float) i}).setDuration(300));
        arrayList.add(ObjectAnimator.ofFloat(this.an, View.ALPHA, new float[]{f}).setDuration(300));
        if (!this.as) {
            arrayList.add(ObjectAnimator.ofFloat(this.ax, View.ALPHA, new float[]{f}).setDuration(300));
        }
        return arrayList;
    }

    public final void a(int i, String[] strArr, int[] iArr) {
        this.ah.f.a(i, strArr, iArr);
    }

    /* Access modifiers changed, original: final */
    public final void d(int i) {
        abjy abjy = this.ag;
        abjz abjz = new abjz(abjy.c, abjy.d.c());
        abjz.h = abjy.b.p();
        abjz.a = i;
        abjz.b = this.aC;
        abjz.g();
        xan.a(this.ag.a.a(abjz), this.aj, new ghq(this), new ghp(this), ankh.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final View W() {
        return this.an;
    }

    /* Access modifiers changed, original: protected|final */
    public final View X() {
        return this.av;
    }

    /* JADX WARNING: Missing block: B:12:0x002a, code skipped:
            if (r4 == 4) goto L_0x002c;
     */
    public final boolean onKey(android.content.DialogInterface r3, int r4, android.view.KeyEvent r5) {
        /*
        r2 = this;
        r3 = 0;
        r0 = 4;
        r1 = 1;
        if (r4 != r0) goto L_0x002a;
    L_0x0005:
        r4 = r5.getAction();
        if (r4 != r1) goto L_0x002c;
    L_0x000b:
        r4 = r2.az;
        r4 = r4.getVisibility();
        if (r4 == 0) goto L_0x0022;
    L_0x0013:
        r4 = r2.aA;
        r4 = r4.getVisibility();
        if (r4 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x002c;
    L_0x001c:
        r3 = r2.ai;
        r3.b();
        return r1;
    L_0x0022:
        r3 = r2.az;
        r4 = 8;
        r3.setVisibility(r4);
        return r1;
    L_0x002a:
        if (r4 != r0) goto L_0x0036;
    L_0x002c:
        r4 = r5.getAction();
        if (r4 != r1) goto L_0x0036;
    L_0x0032:
        r2.f(r3);
        return r1;
    L_0x0036:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghn.onKey(android.content.DialogInterface, int, android.view.KeyEvent):boolean");
    }

    public final void a(ajvj ajvj) {
        if (gge.a(this) && ajvj != null) {
            boolean z = this.aC;
            this.ar = !z ? this.ar : ajvj.e;
            int i = 0;
            if (z) {
                this.aC = false;
            }
            ghw ghw = this.ap;
            int i2 = ghw.b;
            int i3 = ajvj.d;
            if (i2 != i3) {
                ghw.b = i3;
                ghw.d();
                this.an.b(this.ar);
            }
            gil gil = (gil) this.ap.c(this.an.a());
            if (gil != null && gge.a(gil)) {
                ajzw ajzw;
                axak axak;
                aphg aphg;
                aodv aodv;
                Object b;
                gid gid = gil.a;
                gid.i = this;
                gid.h = this.ad;
                if (!this.aB) {
                    ajzw = ajvj.a;
                    if (ajzw != null) {
                        this.au = (axuh) ajzv.a(ajzw, axuh.class);
                        axuh axuh = this.au;
                        arml arml = null;
                        if ((axuh.a & 2) != 0) {
                            axak = axuh.c;
                            if (axak == null) {
                                axak = axak.a;
                            }
                        } else {
                            axak = null;
                        }
                        ajzw = ajzv.a(axak);
                        axuh axuh2 = this.au;
                        if ((axuh2.a & 1) != 0) {
                            arml = axuh2.b;
                            if (arml == null) {
                                arml = arml.f;
                            }
                        }
                        FrameLayout frameLayout = this.at;
                        if (ajzw != null) {
                            aphg = (aphg) ajzv.a(ajzw, aphg.class);
                            ImageView imageView = (ImageView) frameLayout.findViewById(R.id.sticker_catalog_close);
                            ImageView imageView2 = (ImageView) frameLayout.findViewById(R.id.sticker_catalog_back);
                            if (this.ac.b()) {
                                imageView.setOnClickListener(new ggz(this));
                                imageView2.setVisibility(8);
                                imageView.setVisibility(0);
                            } else if (aphg != null) {
                                akvp akvp = this.Z;
                                arwf arwf = aphg.e;
                                if (arwf == null) {
                                    arwf = arwf.c;
                                }
                                arwh a = arwh.a(arwf.b);
                                if (a == null) {
                                    a = arwh.UNKNOWN;
                                }
                                imageView2.setImageResource(akvp.a(a));
                                imageView2.setOnClickListener(new ggy(this));
                                if ((aphg.a & 16384) != 0) {
                                    aodv = aphg.p;
                                    if (aodv == null) {
                                        aodv = aodv.c;
                                    }
                                    imageView2.setContentDescription(aodv.b);
                                }
                                imageView2.setVisibility(0);
                                imageView.setVisibility(8);
                            }
                        }
                        if (arml != null) {
                            ((TextView) frameLayout.findViewById(R.id.sticker_catalog_title)).setText(ajqy.a(arml));
                        }
                        this.aB = true;
                    }
                }
                ajzw = ajvj.b;
                if (ajzw != null) {
                    b = ajzv.b(ajzw);
                    if (b instanceof axun) {
                        axun axun = (axun) b;
                        i2 = axun.c;
                        if (i2 > 0) {
                            gil.d(i2);
                        }
                        if (axun.b.size() > 0) {
                            gil.a(axun.b);
                        }
                        ghn.a(this.ab, axun.b);
                    } else if (b instanceof awvc) {
                        ghz ghz = this.ak;
                        awvc awvc = (awvc) b;
                        gil.d(awvc.b);
                        List a2 = ghz.a.a();
                        ghn.a(ghz.b, a2);
                        gil.a.k = true;
                        gil.a(a2);
                        TextView textView = (TextView) gil.K.findViewById(R.id.sticker_page_text);
                        if (!ghz.c.b()) {
                            arml arml2 = awvc.c;
                            if (arml2 == null) {
                                arml2 = arml.f;
                            }
                            textView.setText(ajqy.a(arml2));
                            textView.setVisibility(0);
                        }
                    } else if (b instanceof ayki) {
                        giq giq = this.al;
                        ayki ayki = (ayki) b;
                        amul amul = giq.a.c;
                        if (amul.isEmpty()) {
                            giq.b.post(new git(this));
                        } else {
                            ArrayList arrayList = new ArrayList(amul.size());
                            int i4 = 0;
                            while (i4 < amul.size()) {
                                String str = (String) amul.get(i4);
                                axuk axuk = (axuk) axui.d.createBuilder();
                                arml a3 = ajqy.a(str);
                                axuk.copyOnWrite();
                                axui axui = (axui) axuk.instance;
                                if (a3 != null) {
                                    axui.c = a3;
                                    axui.a |= 2;
                                    axuk.copyOnWrite();
                                    axui axui2 = (axui) axuk.instance;
                                    axui2.a |= 1;
                                    axui2.b = 3;
                                    axui2 = (axui) ((anxl) axuk.build());
                                    axaj axaj = (axaj) axak.a.createBuilder();
                                    axaj.a(StickerCatalogRendererOuterClass.dynamicStickerRenderer, axui2);
                                    arrayList.add((axak) ((anxl) axaj.build()));
                                    i4++;
                                } else {
                                    throw new NullPointerException();
                                }
                            }
                            giq.b.post(new gis(giq, arrayList, gil, ayki, this));
                        }
                    }
                }
                ajzw ajzw2 = ajvj.c;
                if (ajzw2 != null) {
                    this.aw = (axuo) ajzv.a(ajzw2, axuo.class);
                    if (this.as) {
                        if (this.ao.b() == 0 && !this.aw.a.isEmpty()) {
                            for (axak axak2 : this.aw.a) {
                                anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                                axak2.a(access$000);
                                if (axak2.h.a(access$000.d)) {
                                    access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                                    axak2.a(access$000);
                                    b = axak2.h.b(access$000.d);
                                    if (b == null) {
                                        b = access$000.b;
                                    } else {
                                        b = access$000.a(b);
                                    }
                                    aphg = (aphg) b;
                                    if ((aphg.a & 16384) != 0) {
                                        DefaultTabsBar defaultTabsBar = this.ao;
                                        aodv = aphg.p;
                                        if (aodv == null) {
                                            aodv = aodv.c;
                                        }
                                        CharSequence charSequence = aodv.b;
                                        defaultTabsBar.a(charSequence, charSequence);
                                    }
                                    this.ao.c(i).setOnClickListener(new ghs(this, i));
                                }
                                i++;
                            }
                        }
                    } else if (this.aq == null && !this.aw.a.isEmpty()) {
                        anyd<axak> anyd = this.aw.a;
                        this.aq = new ImageButton[anyd.size()];
                        int i5 = 0;
                        for (axak axak3 : anyd) {
                            anxr access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                            axak3.a(access$0002);
                            if (axak3.h.a(access$0002.d)) {
                                access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                                axak3.a(access$0002);
                                Object b2 = axak3.h.b(access$0002.d);
                                if (b2 == null) {
                                    b2 = access$0002.b;
                                } else {
                                    b2 = access$0002.a(b2);
                                }
                                aphg aphg2 = (aphg) b2;
                                ImageButton imageButton = (ImageButton) LayoutInflater.from(M_()).inflate(R.layout.sticker_page_selector_button, this.ax, false);
                                akvp akvp2 = this.Z;
                                arwf arwf2 = aphg2.e;
                                if (arwf2 == null) {
                                    arwf2 = arwf.c;
                                }
                                arwh a4 = arwh.a(arwf2.b);
                                if (a4 == null) {
                                    a4 = arwh.UNKNOWN;
                                }
                                imageButton.setImageResource(akvp2.a(a4));
                                if ((aphg2.a & 16384) != 0) {
                                    aodv aodv2 = aphg2.p;
                                    if (aodv2 == null) {
                                        aodv2 = aodv.c;
                                    }
                                    imageButton.setContentDescription(aodv2.b);
                                }
                                if (i5 == this.ar) {
                                    imageButton.setAlpha(1.0f);
                                }
                                this.aq[i5] = imageButton;
                                imageButton.setOnClickListener(new ghr(this, i5));
                                this.ax.addView(imageButton);
                            }
                            i5++;
                        }
                    }
                }
            }
        }
    }

    private static void a(acwa acwa, List list) {
        for (axak b : list) {
            anze b2 = ajzv.b(b);
            if (b2 instanceof axuj) {
                acwa.t().a(gie.a((axuj) b2).d());
            } else if (b2 instanceof axui) {
                acwa.t().a(gji.a((axui) b2));
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Throwable th) {
        xtl.a("Failed to get multi page sticker", th);
        Toast.makeText(p(), R.string.reel_generic_error_message, 1).show();
    }

    public final void g(boolean z) {
        this.ay.setVisibility(!z ? 8 : 0);
    }

    private final void a(int i, int i2, int i3) {
        Context contextThemeWrapper;
        if (fmv.a(this.am) == 2) {
            contextThemeWrapper = new ContextThemeWrapper(M_(), i3);
        } else {
            contextThemeWrapper = new ContextThemeWrapper(M_(), i2);
        }
        LayoutInflater.from(contextThemeWrapper).inflate(i, this.at, true);
    }
}
