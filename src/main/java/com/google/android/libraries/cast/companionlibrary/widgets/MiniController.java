package com.google.android.libraries.cast.companionlibrary.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.youtube.R;
import defpackage.pjy;
import defpackage.sac;
import defpackage.sap;
import defpackage.sbt;
import defpackage.sbv;
import defpackage.sdc;
import defpackage.sdf;
import defpackage.sdg;
import defpackage.sdh;
import defpackage.sdi;
import defpackage.sdj;
import defpackage.sdk;
import defpackage.sdl;
import defpackage.sdm;
import defpackage.sdn;
import defpackage.sdo;
import defpackage.sdq;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class MiniController extends RelativeLayout implements sdg {
    public ImageView a;
    public sdq b;
    public sdc c;
    public ProgressBar d;
    public ImageView e;
    public sdc f;
    public View g;
    public pjy h;
    private boolean i;
    private sap j;
    private Handler k;
    private TextView l;
    private TextView m;
    private ImageView n;
    private ProgressBar o;
    private Uri p;
    private Drawable q;
    private Drawable r;
    private int s = 1;
    private Drawable t;
    private TextView u;
    private View v;
    private View w;
    private View x;
    private Uri y;

    public MiniController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.mini_controller, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, sac.a);
        this.i = obtainStyledAttributes.getBoolean(sac.b, false);
        obtainStyledAttributes.recycle();
        this.q = getResources().getDrawable(R.drawable.ic_mini_controller_pause);
        this.r = getResources().getDrawable(R.drawable.ic_mini_controller_play);
        this.t = getResources().getDrawable(R.drawable.ic_mini_controller_stop);
        this.k = new Handler();
        this.j = sap.o();
        a();
        this.n.setOnClickListener(new sdk(this));
        this.g.setOnClickListener(new sdj(this));
        this.w.setOnClickListener(new sdm(this));
        this.x.setOnClickListener(new sdl(this));
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            this.d.setProgress(0);
        }
    }

    public final void a(sdq sdq) {
        if (sdq != null) {
            this.b = sdq;
        }
    }

    public final void a(int i) {
        this.s = i;
    }

    public final void b(int i, int i2) {
        if (this.s != 2 && this.d != null) {
            this.k.post(new sdi(this, i2, i));
        }
    }

    public final void a(boolean z) {
        this.v.setVisibility(!z ? 8 : 0);
        int i = z ^ 1;
        ProgressBar progressBar = this.d;
        if (progressBar != null) {
            int i2 = 4;
            if (!(i == 0 || this.s == 2)) {
                i2 = 0;
            }
            progressBar.setVisibility(i2);
        }
    }

    public final void a(pjy pjy) {
        this.h = pjy;
        if (pjy == null) {
            c("");
            b(null);
            return;
        }
        MediaInfo mediaInfo = pjy.a;
        if (mediaInfo != null) {
            c(mediaInfo.d.a("com.google.android.gms.cast.metadata.TITLE"));
            b(sdh.a(mediaInfo, 0));
        }
    }

    public MiniController(Context context) {
        super(context);
        a();
    }

    public final void a(Uri uri) {
        Uri uri2 = this.p;
        if (uri2 == null || !uri2.equals(uri)) {
            this.p = uri;
            sdc sdc = this.c;
            if (sdc != null) {
                sdc.cancel(true);
            }
            this.c = new sdo(this);
            this.c.a(uri);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i) {
            boolean add;
            sdq sdq = this.j;
            synchronized (sdq.B) {
                add = sdq.B.add(this);
            }
            if (add) {
                a(sdq);
                try {
                    if (sdq.h()) {
                        sdq.m();
                        if (sdq.u() || sdq.t()) {
                            sdq.a((sdg) this);
                            setVisibility(0);
                        }
                    }
                } catch (sbt | sbv e) {
                    sdf.a(sap.r, "Failed to get the status of media playback on receiver", e);
                }
                String.valueOf(this).length();
            } else {
                String.valueOf(this).length();
            }
            ScheduledFuture scheduledFuture = sdq.L;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                sdq.J();
                sdq.L = sdq.K.scheduleAtFixedRate(sdq.M, 100, sap.t, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sdc sdc = this.c;
        if (sdc != null) {
            sdc.cancel(true);
            this.c = null;
        }
        if (this.i) {
            sap sap = this.j;
            a(null);
            synchronized (sap.B) {
                sap.B.remove(this);
                if (sap.B.isEmpty()) {
                    sap.J();
                }
            }
        }
    }

    public final void a(String str) {
        this.l.setText(str);
    }

    public final void b(String str) {
        this.m.setText(str);
    }

    public final void a(int i, int i2) {
        if (i == 1) {
            i = this.s;
            if (i == 1) {
                this.n.setVisibility(4);
                b(false);
            } else if (i == 2) {
                if (i2 == 2) {
                    this.n.setVisibility(0);
                    this.n.setImageDrawable(this.r);
                    b(false);
                    return;
                }
                this.n.setVisibility(4);
                b(false);
            }
        } else if (i == 2) {
            Drawable drawable;
            this.n.setVisibility(0);
            ImageView imageView = this.n;
            i2 = this.s;
            if (i2 == 1) {
                drawable = this.q;
            } else if (i2 != 2) {
                drawable = this.q;
            } else {
                drawable = this.t;
            }
            imageView.setImageDrawable(drawable);
            b(false);
        } else if (i == 3) {
            this.n.setVisibility(0);
            this.n.setImageDrawable(this.r);
            b(false);
        } else if (i != 4) {
            this.n.setVisibility(4);
            b(false);
        } else {
            this.n.setVisibility(4);
            b(true);
        }
    }

    private final void a() {
        this.a = (ImageView) findViewById(R.id.icon_view);
        this.l = (TextView) findViewById(R.id.title_view);
        this.m = (TextView) findViewById(R.id.subtitle_view);
        this.n = (ImageView) findViewById(R.id.play_pause);
        this.o = (ProgressBar) findViewById(R.id.loading_view);
        this.g = findViewById(R.id.container_current);
        this.d = (ProgressBar) findViewById(R.id.progressBar);
        this.e = (ImageView) findViewById(R.id.icon_view_upcoming);
        this.u = (TextView) findViewById(R.id.title_view_upcoming);
        this.v = findViewById(R.id.container_upcoming);
        this.w = findViewById(R.id.play_upcoming);
        this.x = findViewById(R.id.stop_upcoming);
    }

    public final void b(boolean z) {
        this.o.setVisibility(!z ? 8 : 0);
    }

    private final void b(Uri uri) {
        Uri uri2 = this.y;
        if (uri2 == null || !uri2.equals(uri)) {
            this.y = uri;
            sdc sdc = this.f;
            if (sdc != null) {
                sdc.cancel(true);
            }
            this.f = new sdn(this);
            this.f.a(uri);
        }
    }

    private final void c(String str) {
        this.u.setText(str);
    }
}
