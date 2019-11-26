package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.emoji.widget.EmojiTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: ghk */
public final class ghk extends gif implements OnClickListener {
    private final FrameLayout p;
    private final ImageView q;
    private final gib r;
    private axui t;
    private Bitmap u;
    private EmojiTextView v;

    public ghk(View view, gib gib) {
        super(view);
        this.p = (FrameLayout) view.findViewById(R.id.dynamic_sticker_container);
        this.q = (ImageView) view.findViewById(R.id.sticker);
        this.r = gib;
    }

    /* Access modifiers changed, original: final */
    public final void u() {
        axak axak = this.s;
        anxr access$000 = anxl.checkIsLite(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
        axak.a(access$000);
        if (axak.h.a(access$000.d)) {
            axak = this.s;
            access$000 = anxl.checkIsLite(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
            axak.a(access$000);
            Object b = axak.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            this.t = (axui) b;
            Context context = this.q.getContext();
            int a = aqzp.a(this.t.b);
            if (a == 0) {
                a = 1;
            }
            a--;
            View a2;
            if (a == 1) {
                this.u = zmb.a(context, a(context, R.layout.location_sticker, ((Integer) ghm.n.get(ghm.o)).intValue()));
                this.q.setImageBitmap(this.u);
            } else if (a == 2) {
                a2 = a(context, R.layout.user_mention_sticker, ((Integer) giv.m.get(giv.n)).intValue());
                this.r.g().a((ImageView) a2.findViewById(R.id.icon));
                this.u = zmb.a(context, a2);
                this.q.setImageBitmap(this.u);
            } else if (a == 3) {
                if (this.v == null) {
                    this.v = (EmojiTextView) ((ViewStub) this.p.findViewById(R.id.unicode_emoji_sticker_stub)).inflate();
                }
                EmojiTextView emojiTextView = this.v;
                int i = this.p.getLayoutParams().height;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.unicode_emoji_sticker_padding);
                emojiTextView.setTextSize(1, (float) ((int) (Math.min((float) (i - (dimensionPixelSize + dimensionPixelSize)), (float) context.getResources().getDimensionPixelSize(R.dimen.dynamic_sticker_max_height)) / context.getResources().getDisplayMetrics().scaledDensity)));
                EmojiTextView emojiTextView2 = this.v;
                arml arml = this.t.c;
                if (arml == null) {
                    arml = arml.f;
                }
                emojiTextView2.setText(ajqy.a(arml));
            } else if (a == 4) {
                a2 = LayoutInflater.from(context).inflate(R.layout.date_sticker, new FrameLayout(context));
                ((TextView) a2.findViewById(R.id.date)).setText(new SimpleDateFormat("d", Locale.getDefault()).format(new Date()));
                this.u = zmb.a(context, a2);
                this.q.setImageBitmap(this.u);
                b(this.t);
            } else if (a != 5) {
                a = aqzp.a(this.t.b);
                if (a == 0) {
                    a = 1;
                }
                String valueOf = String.valueOf(aqzp.b(a));
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 17);
                stringBuilder.append("unexpected type: ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                a2 = LayoutInflater.from(context).inflate(R.layout.time_sticker, new FrameLayout(context));
                ((TextView) a2.findViewById(R.id.time)).setText(new SimpleDateFormat("h:mm", Locale.getDefault()).format(new Date()));
                ((TextView) a2.findViewById(R.id.am_pm_indicator)).setText(Calendar.getInstance().getDisplayName(9, 1, Locale.getDefault()));
                this.u = zmb.a(context, a2);
                this.q.setImageBitmap(this.u);
                b(this.t);
            }
            this.p.setOnClickListener(this);
            axui axui = this.t;
            if (this.r.b() != null) {
                this.r.b().a(gji.a(axui), null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("renderer missing");
    }

    private final View a(Context context, int i, int i2) {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(context, i2)).inflate(i, new FrameLayout(context));
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        arml arml = this.t.c;
        if (arml == null) {
            arml = arml.f;
        }
        Spanned a = ajqy.a(arml);
        textView.setText(a);
        textView.setAllCaps(true);
        this.q.setContentDescription(a == null ? "" : a.toString());
        return inflate;
    }

    /* Access modifiers changed, original: final */
    public final void v() {
        this.q.setImageDrawable(null);
        Bitmap bitmap = this.u;
        if (bitmap != null) {
            bitmap.recycle();
            this.u = null;
        }
        EmojiTextView emojiTextView = this.v;
        if (emojiTextView != null) {
            emojiTextView.setText(null);
        }
        this.t = null;
    }

    public final void onClick(View view) {
        int a = aqzp.a(this.t.b);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        a--;
        axaj axaj;
        axak axak;
        boolean m;
        bacy bacy;
        Bitmap bitmap;
        bacw bacw;
        bacx bacx;
        bacx bacx2;
        Activity activity;
        zkw zkw;
        gjv gjv;
        if (a == 1) {
            a(this.t);
            ghm f = this.r.f();
            axaj = (axaj) axak.a.createBuilder();
            axaj.a(StickerCatalogRendererOuterClass.dynamicStickerRenderer, this.t);
            axak = (axak) ((anxl) axaj.build());
            boolean m2 = this.r.m();
            f.l = axak;
            f.m = m2;
            if (!f.d || alai.a(f.b, 3)) {
                f.b();
                return;
            }
            f.f = f.c();
            f.f.a();
        } else if (a == 2) {
            a(this.t);
            giv g = this.r.g();
            axaj = (axaj) axak.a.createBuilder();
            axaj.a(StickerCatalogRendererOuterClass.dynamicStickerRenderer, this.t);
            axak = (axak) ((anxl) axaj.build());
            m = this.r.m();
            g.i = axak;
            g.j = m;
            g.l.b();
            g.g.setVisibility(0);
            gqy gqy = g.h;
            if (!TextUtils.isEmpty(gqy.d.getText())) {
                gqy.d.setText("");
            }
            gqy.d.requestFocus();
            xpr.b(gqy.d);
            gqy.a(gqy.a.getString(R.string.user_mention_search_view_results_box_hint));
            gqy.c.a();
        } else if (a == 3) {
            this.r.l().a(this.s);
            this.p.removeView(this.v);
            a(this.t);
            this.r.e().a();
            ggm h = this.r.h();
            View view2 = this.v;
            m = this.r.m();
            bacy = (bacy) bacz.g.createBuilder();
            String charSequence = view2.getText().toString();
            if (h.d.a() && !h.c.a(charSequence).isEmpty()) {
                h.e.t().b(new acvs(acwc.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON));
            }
            bado bado = (bado) badp.e.createBuilder();
            bado.a(charSequence);
            if (h.d.a()) {
                amul a2 = h.c.a(charSequence);
                if (!a2.isEmpty()) {
                    badq badq = (badq) badr.d.createBuilder();
                    badq.a(charSequence);
                    badq.copyOnWrite();
                    badr badr = (badr) badq.instance;
                    if (!badr.c.a()) {
                        badr.c = anxl.mutableCopy(badr.c);
                    }
                    anvf.addAll(a2, badr.c);
                    bado.a((badr) ((anxl) badq.build()));
                }
            }
            bacw bacw2 = (bacw) bacx.e.createBuilder();
            bacw2.a(bado);
            bacw2.a(m);
            bacy.a(bacw2);
            gjl.a(h.a, h.f, view2, bacy, new ggo(h));
        } else if (a == 4) {
            a(this.t);
            this.r.l().a(this.s);
            this.r.e().a();
            gjg k = this.r.k();
            bitmap = this.u;
            bacw = (bacw) bacx.e.createBuilder();
            bacw.a(this.r.m());
            babg babg = babg.c;
            bacw.copyOnWrite();
            bacx = (bacx) bacw.instance;
            if (babg != null) {
                bacx.c = babg;
                bacx.b = 9;
                bacx2 = (bacx) ((anxl) bacw.build());
                bacy = (bacy) bacz.g.createBuilder();
                bacy.a(bacx2);
                activity = k.a;
                zkw = k.b;
                gjv = k.c;
                gjv.getClass();
                gjl.a(activity, zkw, bitmap, bacy, new gjj(gjv));
                return;
            }
            throw new NullPointerException();
        } else if (a != 5) {
            int a3 = aqzp.a(this.t.b);
            if (a3 != 0) {
                i = a3;
            }
            String valueOf = String.valueOf(aqzp.b(i));
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 17);
            stringBuilder.append("unexpected type: ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            a(this.t);
            this.r.l().a(this.s);
            this.r.e().a();
            gjq j = this.r.j();
            bitmap = this.u;
            bacw = (bacw) bacx.e.createBuilder();
            bacw.a(this.r.m());
            badi badi = badi.c;
            bacw.copyOnWrite();
            bacx = (bacx) bacw.instance;
            if (badi != null) {
                bacx.c = badi;
                bacx.b = 8;
                bacx2 = (bacx) ((anxl) bacw.build());
                bacy = (bacy) bacz.g.createBuilder();
                bacy.a(bacx2);
                activity = j.a;
                zkw = j.b;
                gjv = j.c;
                gjv.getClass();
                gjl.a(activity, zkw, bitmap, bacy, new gjt(gjv));
                return;
            }
            throw new NullPointerException();
        }
    }

    private final void a(axui axui) {
        if (this.r.b() != null) {
            this.r.b().a(3, gji.a(axui), null);
        }
    }

    private final void b(axui axui) {
        arml arml = axui.c;
        if (arml == null) {
            arml = arml.f;
        }
        Spanned a = ajqy.a(arml);
        this.q.setContentDescription(a == null ? "" : a.toString());
    }
}
