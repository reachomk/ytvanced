package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: ghd */
public final class ghd implements OnTouchListener, gjs {
    public static final babe l = babe.COMMENT_NORMAL;
    private static final amur s = amur.a(babe.COMMENT_NORMAL, Integer.valueOf(R.style.NormalDynamicSticker), babe.COMMENT_LIGHT, Integer.valueOf(R.style.LightDynamicSticker));
    public final akkq a;
    public final zkw b;
    public final gkt c;
    public final akko d = akko.h().a(this.m).a((int) R.drawable.product_logo_avatar_anonymous_color_24).a();
    public final Activity e;
    public ViewGroup f;
    public ghi g;
    public bacz h;
    public View i;
    public View j;
    public View k;
    private final akks m = new ghe(this);
    private final gfz n = new ghh(this);
    private final gfz o = new ghg(this);
    private final List p = Arrays.asList(new gfz[]{this.n, this.o});
    private boolean q;
    private AnimatorSet r;

    public ghd(Activity activity, akkq akkq, zkw zkw, gkt gkt, ghi ghi) {
        this.e = activity;
        this.a = akkq;
        this.b = zkw;
        this.c = gkt;
        this.g = ghi;
    }

    public final void a(bacz bacz) {
        this.h = bacz;
        bacx bacx = this.h.d;
        if (bacx == null) {
            bacx = bacx.e;
        }
        babb babb = bacx.b == 4 ? (babb) bacx.c : babb.g;
        babd babd = babb.f;
        if (babd == null) {
            babd = babd.e;
        }
        anyc anyc = new anyc(babd.c, babd.d);
        babd = babb.f;
        if (babd == null) {
            babd = babd.e;
        }
        Object a = babe.a(babd.b);
        if (a == null) {
            a = babe.COMMENT_STYLE_UNSPECIFIED;
        }
        a((babe) gih.a(anyc, a));
        View view = this.i;
        bacz bacz2 = this.h;
        view.setLayoutParams(new LayoutParams(bacz2.b, bacz2.c));
        ghc ghc = new ghc(this);
        Uri d = xvt.d(babb.e);
        ImageView imageView = (ImageView) this.i.findViewById(R.id.author_avatar);
        imageView.setImageDrawable(this.e.getResources().getDrawable(R.drawable.product_logo_avatar_anonymous_color_24));
        this.a.b(d, new ghj(this, imageView, ghc));
    }

    public final void a(babe babe) {
        bacx bacx = this.h.d;
        if (bacx == null) {
            bacx = bacx.e;
        }
        anxl anxl = bacx.b == 4 ? (babb) bacx.c : babb.g;
        bacy bacy = (bacy) ((anxo) this.h.toBuilder());
        anxl anxl2 = this.h.d;
        if (anxl2 == null) {
            anxl2 = bacx.e;
        }
        bacw bacw = (bacw) ((anxo) anxl2.toBuilder());
        baba baba = (baba) ((anxo) anxl.toBuilder());
        anxl anxl3 = anxl.f;
        if (anxl3 == null) {
            anxl3 = babd.e;
        }
        babf babf = (babf) ((anxo) anxl3.toBuilder());
        babf.a(babe);
        baba.a(babf);
        bacw.a(baba);
        bacy.a(bacw);
        this.h = (bacz) ((anxl) bacy.build());
        this.i = LayoutInflater.from(new ContextThemeWrapper(this.e, ((Integer) s.get(babe)).intValue())).inflate(R.layout.comment_sticker, null, false);
        TextView textView = (TextView) this.i.findViewById(R.id.author);
        TextView textView2 = (TextView) this.i.findViewById(R.id.comment);
        textView2.setText(anxl.c);
        textView.setText(anxl.d);
        textView.setAccessibilityTraversalAfter(R.id.reel_camera_close);
        textView2.setAccessibilityTraversalAfter(R.id.author);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view != this.i) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (this.q) {
                    a(false);
                    this.q = false;
                    this.i.performClick();
                }
                return true;
            } else if (action != 2) {
                return false;
            }
        }
        if (!this.q) {
            a(true);
            this.q = true;
        }
        return true;
    }

    private final void a(boolean z) {
        this.r = gfu.a(this.p, z, this.r, !z ? 70 : 150);
    }

    public final void a() {
        int i = 0;
        this.f.setVisibility(0);
        Rect a = ghd.a(this.f);
        Rect a2 = ghd.a(this.i);
        float height = ((float) a2.height()) / ((float) Math.min(a.width(), a.height()));
        float exactCenterY = a2.exactCenterY();
        float exactCenterY2 = a.exactCenterY();
        int height2 = a.height();
        Matrix matrix = new Matrix();
        matrix.setTranslate(0.0f, (exactCenterY - exactCenterY2) / ((float) height2));
        matrix.preScale(height, height, 0.5f, 0.5f);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        aodc aodc = (aodc) aocz.f.createBuilder();
        aodc.a();
        aodc.b();
        aodc.a(2);
        while (i < 9) {
            aodc.a(fArr[i]);
            i++;
        }
        aocz aocz = (aocz) ((anxl) aodc.build());
        ViewGroup viewGroup = (ViewGroup) this.i.getParent();
        LayoutParams layoutParams = this.i.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.i.getWidth(), this.i.getHeight());
        viewGroup.removeView(this.i);
        this.i.setLayoutParams(layoutParams2);
        Bitmap a3 = zmb.a(this.e, this.i);
        zkw.a(this.e, a3, new ghf(this, a3, layoutParams, viewGroup, aocz));
    }

    public final bacy a(zme zme) {
        bacx bacx = this.h.d;
        if (bacx == null) {
            bacx = bacx.e;
        }
        anxl anxl = (bacx.b == 4 ? (babb) bacx.c : babb.g).b;
        if (anxl == null) {
            anxl = baao.c;
        }
        baat baat = (baat) ((anxo) anxl.toBuilder());
        baat.a(zme.b);
        bacx bacx2 = this.h.d;
        if (bacx2 == null) {
            bacx2 = bacx.e;
        }
        baba baba = (baba) ((anxo) (bacx2.b == 4 ? (babb) bacx2.c : babb.g).toBuilder());
        baba.copyOnWrite();
        babb babb = (babb) baba.instance;
        babb.b = (baao) ((anxl) baat.build());
        babb.a |= 1;
        anxl = this.h.d;
        if (anxl == null) {
            anxl = bacx.e;
        }
        bacw bacw = (bacw) ((anxo) anxl.toBuilder());
        bacw.a(baba);
        bacy bacy = (bacy) ((anxo) this.h.toBuilder());
        bacy.a(bacw);
        return bacy;
    }

    private static Rect a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
