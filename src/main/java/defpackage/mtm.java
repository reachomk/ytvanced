package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.PrimitiveAdOverlay;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;

/* renamed from: mtm */
public final class mtm extends aiua implements PrimitiveAdOverlay {
    private static final String b = yx.a().a(" · ");
    public wae a;
    private final TextView c;
    private final FrameLayout d;
    private final View e;
    private final TextView f;
    private final ImageView g;
    private final TextView h;
    private aitp i;
    private CharSequence j;
    private final ImageView k;
    private final DisplayMetrics l = getResources().getDisplayMetrics();
    private final ViewGroup m;
    private boolean n;
    private boolean o;

    public mtm(Context context, int i) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.embedded_ad_overlay, this);
        this.c = (TextView) findViewById(R.id.ad_text);
        this.d = (FrameLayout) findViewById(R.id.ad_text_and_ad_choices_button);
        this.m = (LinearLayout) findViewById(R.id.ad_title_layout);
        this.e = findViewById(R.id.skip_ad_button);
        this.f = (TextView) this.e.findViewById(R.id.skip_ad_text);
        this.k = (ImageView) this.e.findViewById(R.id.skip_ad_icon);
        this.h = (TextView) this.m.findViewById(R.id.title);
        ViewGroup viewGroup = this.m;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.thumbnail);
        LayoutParams layoutParams = imageView.getLayoutParams();
        CircularImageView circularImageView = new CircularImageView(context, null);
        circularImageView.setId(imageView.getId());
        circularImageView.setLayoutParams(layoutParams);
        circularImageView.setAdjustViewBounds(true);
        int indexOfChild = viewGroup.indexOfChild(imageView);
        viewGroup.removeView(imageView);
        viewGroup.addView(circularImageView, indexOfChild);
        this.g = circularImageView;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams2.bottomMargin += i;
        this.d.setOnClickListener(new mtp(this));
        this.e.setOnClickListener(new mto(this));
        this.e.setOnTouchListener(new mtr(this));
        mtq mtq = new mtq(this);
        this.h.setOnClickListener(mtq);
        this.g.setOnClickListener(mtq);
        a(null);
        a(null);
        e(false);
        a(false);
        c(false);
        d(false);
    }

    public final void a(wae wae) {
        this.a = wae;
    }

    public final void a(aitp aitp) {
        amqw.a((Object) aitp);
        amqw.b(this.i == null);
        this.i = aitp;
        this.i.a(new mtt(this));
        this.i.a(8);
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    private final void c() {
        this.m.setVisibility(0);
        TextView textView = this.h;
        int i = 8;
        if (!TextUtils.isEmpty(null) && getWidth() >= ((int) TypedValue.applyDimension(1, 500.0f, this.l))) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public final void a(boolean z) {
        this.n = z;
        d();
    }

    public final void b(boolean z) {
        this.o = z;
        d();
    }

    public final void c(boolean z) {
        this.e.setEnabled(z);
        if (z) {
            this.f.setText(getResources().getString(R.string.skip_ad));
        }
        this.k.setVisibility(!z ? 8 : 0);
    }

    private final void d() {
        if (this.o || !this.n) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
        }
    }

    public final void d(boolean z) {
        setVisibility(!z ? 8 : 0);
        if (!z) {
            aitp aitp = this.i;
            if (aitp != null) {
                aitp.a(8);
            }
        }
    }

    public final void e(boolean z) {
        this.d.setEnabled(z);
        adl.a(this.c, 0, !z ? 0 : R.drawable.ad_choices_instream_icon);
        if (z) {
            this.c.setCompoundDrawablePadding(10);
        }
    }

    public final void a(int i) {
        if (i != -1) {
            String b = xvd.b((long) (i / 1000));
            this.c.setText(getResources().getString(R.string.ad_normal, new Object[]{b, b}));
            return;
        }
        TextView textView = this.c;
        Resources resources = getResources();
        r3 = new Object[2];
        String str = "";
        r3[0] = str;
        r3[1] = str;
        textView.setText(resources.getString(R.string.ad_normal, r3));
    }

    public final void a(CharSequence charSequence) {
        this.j = charSequence;
        this.h.setText(charSequence);
        if (charSequence == null) {
            this.h.setVisibility(8);
        } else {
            c();
        }
    }

    public final void b(int i) {
        i = (i + 999) / 1000;
        TextView textView = this.f;
        Resources resources = getResources();
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(i);
        textView.setText(resources.getString(R.string.skip_ad_in, objArr));
        this.f.setContentDescription(getResources().getQuantityString(R.plurals.accessibility_skip_ad_in, i, new Object[]{r4}));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        c();
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            this.g.setImageBitmap(bitmap);
            this.g.setVisibility(0);
            if (!TextUtils.isEmpty(this.j)) {
                this.g.setContentDescription(this.j);
            }
            return;
        }
        this.g.setImageDrawable(null);
        this.g.setVisibility(4);
    }

    public final void b(CharSequence charSequence) {
        if (this.i != null) {
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = getResources().getString(R.string.ad_learn_more);
            }
            this.i.a(charSequence);
            this.i.a(0);
        }
    }
}
