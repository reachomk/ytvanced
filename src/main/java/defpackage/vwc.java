package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownTextView;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownView;
import com.google.android.libraries.youtube.ads.player.ui.SkipAdButton;
import com.google.android.youtube.R;

/* renamed from: vwc */
public final class vwc implements vzk {
    private final vuz a;
    private final SkipAdButton b;
    private final int c;

    public vwc(vuz vuz, SkipAdButton skipAdButton, int i) {
        this.a = (vuz) amqw.a((Object) vuz);
        this.b = (SkipAdButton) amqw.a((Object) skipAdButton);
        this.c = i;
        a(3, false);
    }

    public final void a() {
    }

    public final void a(vrd vrd) {
        CharSequence charSequence;
        boolean z = false;
        if (vrd.b() > 1 && vrd.a() < vrd.b()) {
            z = true;
        }
        SkipAdButton skipAdButton = this.b;
        TextView textView = skipAdButton.f;
        if (z) {
            charSequence = skipAdButton.d;
        } else {
            charSequence = skipAdButton.c;
        }
        textView.setText(charSequence);
        AdCountdownView adCountdownView = this.a.a;
        adCountdownView.g = z;
        adCountdownView.a(adCountdownView.e);
    }

    public final void a(int i, boolean z) {
        SkipAdButton skipAdButton;
        if (z) {
            this.b.setVisibility(8);
            this.a.a(8);
        } else if (i == 0) {
            if (this.b.a()) {
                this.b.setVisibility(0);
                skipAdButton = this.b;
                if (skipAdButton.a()) {
                    ayiv ayiv = skipAdButton.m;
                    AlphaAnimation alphaAnimation = new AlphaAnimation(ayiv.f, ayiv.g);
                    alphaAnimation.setStartOffset((long) skipAdButton.m.c);
                    alphaAnimation.setFillAfter(skipAdButton.m.h);
                    alphaAnimation.setDuration((long) skipAdButton.m.b);
                    skipAdButton.startAnimation(alphaAnimation);
                }
            } else {
                this.b.setVisibility(this.c);
            }
            this.a.a(0);
            this.a.a(true);
        } else if (i == 1) {
            this.b.setVisibility(0);
            this.a.a(8);
        } else if (i != 2) {
            if (i == 3) {
                this.b.setVisibility(8);
                skipAdButton = this.b;
                ValueAnimator valueAnimator = skipAdButton.p;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    skipAdButton.p = null;
                    skipAdButton.r = false;
                    skipAdButton.f.setVisibility(0);
                    skipAdButton.g.getLayoutParams().width = -2;
                }
                this.a.a(8);
                this.a.a();
            }
        } else {
            this.b.setVisibility(8);
            this.a.a(false);
            this.a.a(0);
        }
    }

    public final void a(int i) {
        AdCountdownView adCountdownView = this.a.a;
        if (adCountdownView.e) {
            adCountdownView.c.a(R.string.skip_ad_in_multiline, i);
        }
    }

    public final void b(int i) {
        AdCountdownView adCountdownView = this.a.a;
        if (!adCountdownView.e && adCountdownView.h == vsm.POST_ROLL) {
            adCountdownView.c.a(R.string.ad_will_end_in_multiline, i);
        }
    }

    public final void a(float f, int i) {
        AdCountdownView adCountdownView = this.a.a;
        Resources resources = adCountdownView.getResources();
        int i2 = adCountdownView.l;
        int i3 = adCountdownView.k;
        float f2 = ((float) i) * resources.getDisplayMetrics().density;
        adCountdownView.d.getLayoutParams().width = (int) (((float) i2) * f);
        int i4 = (int) (f * ((float) i3));
        adCountdownView.d.getLayoutParams().height = i4;
        aokl aokl = (aokl) aokm.f.createBuilder();
        aokl.a("{TIME_REMAINING}");
        aokl.a();
        aokm aokm = (aokm) ((anxl) aokl.build());
        vyz vyz = adCountdownView.c;
        ajrc a = ajrc.a(vyz.o);
        if (a != null) {
            vyz.c.setTypeface(a.a(vyz.a, 0), 0);
        }
        vyz.d.a(aokm);
        vyz.d.b();
        vyz vyz2 = adCountdownView.c;
        i = (int) f2;
        vyz2.b.getLayoutParams().width = 0;
        vyz2.c.getLayoutParams().height = i4;
        vyz2.b.getLayoutParams().height = i4;
        AdCountdownTextView adCountdownTextView = vyz2.c;
        adCountdownTextView.setPadding(i, adCountdownTextView.getPaddingTop(), i, vyz2.c.getPaddingBottom());
    }

    public final void a(axoq axoq) {
        aokm aokm;
        SkipAdButton skipAdButton = this.b;
        vzo vzo = skipAdButton.b;
        aohb aohb = null;
        if (axoq == null) {
            aokm = null;
        } else {
            aokm = axoq.c;
            if (aokm == null) {
                aokm = aokm.f;
            }
        }
        vzo.a(aokm);
        vzq vzq = skipAdButton.a;
        if (!(axoq == null || (axoq.a & 1) == 0)) {
            axos axos = axoq.b;
            if (axos == null) {
                axos = axos.c;
            }
            aohb = axos.b;
            if (aohb == null) {
                aohb = aohb.e;
            }
        }
        vzq.e = aohb;
        skipAdButton.b.b();
        skipAdButton.a.b();
        if (axoq != null && (axoq.a & 32) != 0) {
            ayiv ayiv = axoq.f;
            if (ayiv == null) {
                ayiv = ayiv.i;
            }
            skipAdButton.m = ayiv;
        }
    }

    public final void a(aoiy aoiy) {
        aokm aokm;
        aohw aohw;
        AdCountdownView adCountdownView = this.a.a;
        aohb aohb = null;
        if (aoiy == null) {
            aokm = null;
        } else if ((aoiy.a & 4) != 0) {
            aoix aoix = aoiy.c;
            if (aoix == null) {
                aoix = aoix.c;
            }
            aokm = aoix.b;
            if (aokm == null) {
                aokm = aokm.f;
            }
        } else {
            aokm = aoiy.e;
            if (aokm == null) {
                aokm = aokm.f;
            }
        }
        vzn vzn = adCountdownView.b;
        if (aoiy != null) {
            aohw = aoiy.d;
            if (aohw == null) {
                aohw = aohw.d;
            }
        } else {
            aohw = null;
        }
        vzn.a(aohw);
        vzq vzq = adCountdownView.a;
        if (!(aoiy == null || (aoiy.a & 1) == 0)) {
            aoja aoja = aoiy.b;
            if (aoja == null) {
                aoja = aoja.c;
            }
            aohb = aoja.b;
            if (aohb == null) {
                aohb = aohb.e;
            }
        }
        vzq.e = aohb;
        adCountdownView.c.a(aokm);
        adCountdownView.a.b();
        adCountdownView.b.b();
    }

    public final void a(float f) {
        vyz vyz = this.a.a.c;
        vyz.d.a(vzl.a(f, vyz.h, vyz.i));
        vyz.e.setColor(vzl.a(f, vyz.f, vyz.g));
        vyz.d.b();
        SkipAdButton skipAdButton = this.b;
        skipAdButton.l.setColor(vzl.a(f, skipAdButton.j, skipAdButton.k));
        skipAdButton.b.a(vzl.a(f, skipAdButton.h, skipAdButton.i));
        skipAdButton.a.b();
        skipAdButton.b.b();
        SkipAdButton.a(skipAdButton.e.getDrawable(), f);
    }

    public final void a(vsm vsm) {
        AdCountdownView adCountdownView = this.a.a;
        vsm vsm2 = vsm.POST_ROLL;
        boolean z = false;
        boolean z2 = vsm != vsm2;
        if (vsm == vsm2) {
            z = true;
        }
        vzn vzn = adCountdownView.b;
        vzn.f = z;
        vzn.b();
        adCountdownView.f = z2;
        if (!adCountdownView.e && vsm == vsm.POST_ROLL) {
            vyz vyz = adCountdownView.c;
            AdCountdownTextView adCountdownTextView = vyz.c;
            adCountdownTextView.setPadding(16, adCountdownTextView.getPaddingTop(), 16, vyz.c.getPaddingBottom());
        }
        adCountdownView.h = vsm;
    }

    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
        SkipAdButton skipAdButton = this.b;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) skipAdButton.getLayoutParams();
        if (z4 && z3 && z2 && z) {
            marginLayoutParams.bottomMargin = skipAdButton.o;
        } else {
            marginLayoutParams.bottomMargin = skipAdButton.n;
        }
        skipAdButton.setLayoutParams(marginLayoutParams);
        AdCountdownView adCountdownView = this.a.a;
        marginLayoutParams = (MarginLayoutParams) adCountdownView.getLayoutParams();
        if (z4 && z3 && z2 && z) {
            marginLayoutParams.bottomMargin = adCountdownView.j;
        } else {
            marginLayoutParams.bottomMargin = adCountdownView.i;
        }
        adCountdownView.setLayoutParams(marginLayoutParams);
    }

    public final void a(boolean z, int i) {
        SkipAdButton skipAdButton = this.b;
        skipAdButton.q = z;
        skipAdButton.s = i;
    }

    public final void a(vzc vzc, boolean z, int i) {
        AdCountdownView adCountdownView;
        if (z) {
            vuz vuz = this.a;
            aaft b = vzc.b();
            adCountdownView = vuz.a;
            aokl aokl = (aokl) aokm.f.createBuilder();
            aokl.a("{TIME_REMAINING}");
            aokr aokr = (aokr) aokq.d.createBuilder();
            aokn aokn = (aokn) aoko.d.createBuilder();
            if (i == 0) {
                i = 6;
            }
            aokn.copyOnWrite();
            aoko aoko = (aoko) aokn.instance;
            aoko.a |= 1;
            aoko.b = i - 1;
            aoko aoko2 = (aoko) ((anxl) aokn.build());
            aokr.copyOnWrite();
            aokq aokq = (aokq) aokr.instance;
            if (aoko2 != null) {
                aohw aohw;
                aokq.b = aoko2;
                aokq.a |= 1;
                aokl.copyOnWrite();
                aokm aokm = (aokm) aokl.instance;
                aokm.c = (aokq) ((anxl) aokr.build());
                aokm.a |= 2;
                aokl.a();
                aohz aohz = (aohz) aohw.d.createBuilder();
                if (b.d() != null) {
                    aygk d = b.d();
                    aohz.copyOnWrite();
                    aohw = (aohw) aohz.instance;
                    if (d != null) {
                        aohw.b = d;
                        aohw.a |= 1;
                    } else {
                        throw new NullPointerException();
                    }
                }
                aokl.copyOnWrite();
                aokm aokm2 = (aokm) aokl.instance;
                aokm2.e = (aohw) ((anxl) aohz.build());
                aokm2.a |= 32;
                aohz aohz2 = (aohz) aohw.d.createBuilder();
                aoib aoib = (aoib) aohy.c.createBuilder();
                aoha aoha = (aoha) aohb.e.createBuilder();
                aoha.copyOnWrite();
                aohb aohb = (aohb) aoha.instance;
                aohb.a |= 4;
                aohb.d = true;
                aohb aohb2 = (aohb) ((anxl) aoha.build());
                aoib.copyOnWrite();
                aohy aohy = (aohy) aoib.instance;
                if (aohb2 != null) {
                    aohy.b = aohb2;
                    aohy.a |= 1;
                    aohz2.copyOnWrite();
                    aohw = (aohw) aohz2.instance;
                    aohw.c = (aohy) ((anxl) aoib.build());
                    aohw.a |= 2;
                    adCountdownView.c.a((aokm) ((anxl) aokl.build()));
                    adCountdownView.b.a((aohw) ((anxl) aohz2.build()));
                    adCountdownView.b.b();
                } else {
                    throw new NullPointerException();
                }
            }
            throw new NullPointerException();
        }
        adCountdownView = this.a.a;
        if (vzc.b() != null) {
            vzn vzn = adCountdownView.b;
            vzn.a = vzc.b();
            vzn.b();
        }
    }
}
