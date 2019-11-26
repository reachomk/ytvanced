package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ijh */
public final class ijh extends aito implements aicu, aidj, OnClickListener {
    private View a;
    private TextView b;
    private TextView c;
    private TextView d;
    private View e;
    private ImageView f;
    private ImageView g;
    private aict h;
    private aidm i;
    private int j;
    private int k;
    private CharSequence l;
    private CharSequence m;
    private boolean n;
    private View o;
    private TextView p;
    private boolean q;
    private CharSequence r;
    private CharSequence s;
    private CharSequence t;
    private Bitmap u;

    public ijh(Context context) {
        super(context);
    }

    public final boolean c() {
        return true;
    }

    public final View a(Context context) {
        this.a = LayoutInflater.from(context).inflate(R.layout.livestream_offline_slate, new FrameLayout(context), true);
        this.b = (TextView) this.a.findViewById(R.id.livestream_line1);
        this.c = (TextView) this.a.findViewById(R.id.livestream_line2);
        this.g = (ImageView) this.a.findViewById(R.id.livestream_channel_image);
        this.e = this.a.findViewById(R.id.livestream_notification_button);
        this.f = (ImageView) this.a.findViewById(R.id.livestream_notification_icon);
        this.d = (TextView) this.a.findViewById(R.id.livestream_notification_text);
        this.e.setOnClickListener(this);
        this.o = this.a.findViewById(R.id.livestream_replay_button);
        this.p = (TextView) this.a.findViewById(R.id.livestream_replay_text);
        this.o.setOnClickListener(this);
        this.a.setClickable(false);
        this.a.setBackgroundColor(0);
        this.f.setImageAlpha(128);
        return this.a;
    }

    public final void a(Context context, View view) {
        boolean z = true;
        if (c(1)) {
            int i = 8;
            if (this.q) {
                this.b.setText(this.r);
                this.c.setText(this.s);
                this.p.setText(this.t);
                this.e.setVisibility(8);
                this.o.setVisibility(0);
            } else {
                this.b.setText(this.r);
                this.c.setText(this.s);
                LayoutParams layoutParams = (LayoutParams) this.b.getLayoutParams();
                if (!TextUtils.isEmpty(this.s) || TextUtils.isEmpty(this.r)) {
                    layoutParams.addRule(2, R.id.livestream_text_anchor);
                    layoutParams.removeRule(15);
                } else {
                    layoutParams.removeRule(2);
                    layoutParams.addRule(15);
                }
                this.b.setLayoutParams(layoutParams);
                this.o.setVisibility(8);
                view = this.e;
                if (this.k > 0) {
                    i = 0;
                }
                view.setVisibility(i);
            }
        }
        if (c(2)) {
            this.e.setSelected(this.n);
            int i2 = this.j;
            if (i2 != 0) {
                int i3 = this.k;
                if (i3 != 0) {
                    ImageView imageView = this.f;
                    if (!this.n) {
                        i2 = i3;
                    }
                    imageView.setImageResource(i2);
                }
            }
            this.d.setText(!this.n ? this.m : this.l);
        }
        if (c(4)) {
            ImageView imageView2 = this.g;
            if (imageView2 != null) {
                imageView2.setImageBitmap(this.u);
                view = this.a;
                if (this.u == null) {
                    z = false;
                }
                view.setClickable(z);
            }
            this.u = null;
        }
    }

    public final void a(Bitmap bitmap) {
        this.u = bitmap;
        b(4);
    }

    public final ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void a(aict aict) {
        this.h = (aict) amqw.a((Object) aict, (Object) "listener cannot be null");
    }

    public final void a(aidm aidm) {
        this.i = aidm;
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.r = charSequence;
        this.s = charSequence2;
        this.t = charSequence3;
        this.q = true;
        k();
        b(1);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, CharSequence charSequence4, int i2) {
        this.r = charSequence;
        this.s = charSequence2;
        this.n = z;
        this.j = i2;
        this.k = i;
        this.l = charSequence4;
        this.m = charSequence3;
        this.q = false;
        k();
        b(3);
    }

    public final void ag_() {
        l();
    }

    public final void onClick(View view) {
        if (view == this.e) {
            this.n ^= 1;
            b(2);
            this.h.b();
        }
        if (view == this.o) {
            this.h.a();
        }
    }

    public final int getWidth() {
        View view = this.a;
        return view != null ? view.getWidth() : 0;
    }

    public final int getHeight() {
        View view = this.a;
        return view != null ? view.getHeight() : 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        if (i != 3) {
            boolean z = true;
            if (i != 1) {
                aidm aidm = this.i;
                if (aidm != null) {
                    if (i != 2) {
                        z = false;
                    }
                    aidm.f(z);
                }
            }
        }
    }
}
