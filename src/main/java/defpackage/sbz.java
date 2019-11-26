package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.libraries.cast.companionlibrary.widgets.MiniController;
import com.google.android.youtube.R;

/* renamed from: sbz */
public final class sbz extends aej implements sbw {
    public static final String g = sdf.a(sbz.class);
    private View A;
    private Toolbar B;
    private int C = 2;
    private boolean D;
    public sap h;
    public TextView i;
    public sbx j;
    private View k;
    private ImageButton l;
    private TextView m;
    private TextView n;
    private SeekBar o;
    private TextView p;
    private ProgressBar q;
    private double r;
    private View s;
    private Drawable t;
    private Drawable u;
    private Drawable v;
    private int w;
    private ImageButton x;
    private ImageButton y;
    private ImageButton z;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.cast_activity);
        this.t = getResources().getDrawable(R.drawable.ic_pause_circle_white_80dp);
        this.u = getResources().getDrawable(R.drawable.ic_play_circle_white_80dp);
        this.v = getResources().getDrawable(R.drawable.ic_stop_circle_white_80dp);
        this.k = findViewById(R.id.pageview);
        this.l = (ImageButton) findViewById(R.id.play_pause_toggle);
        this.m = (TextView) findViewById(R.id.live_text);
        this.i = (TextView) findViewById(R.id.start_text);
        this.n = (TextView) findViewById(R.id.end_text);
        this.o = (SeekBar) findViewById(R.id.seekbar);
        this.p = (TextView) findViewById(R.id.textview2);
        this.q = (ProgressBar) findViewById(R.id.progressbar1);
        this.s = findViewById(R.id.controllers);
        this.x = (ImageButton) findViewById(R.id.cc);
        this.y = (ImageButton) findViewById(R.id.next);
        this.z = (ImageButton) findViewById(R.id.previous);
        this.A = findViewById(R.id.playback_controls);
        ((MiniController) findViewById(R.id.miniController1)).g.setVisibility(8);
        c(2);
        this.l.setOnClickListener(new sby(this));
        this.o.setOnSeekBarChangeListener(new scb(this));
        this.x.setOnClickListener(new sca(this));
        this.y.setOnClickListener(new scd(this));
        this.z.setOnClickListener(new scc(this));
        this.h = sap.o();
        sap sap = this.h;
        this.D = sap.a.j;
        this.r = sap.v;
        bundle = getIntent().getExtras();
        if (bundle == null) {
            finish();
            return;
        }
        this.B = (Toolbar) findViewById(R.id.toolbar);
        a(this.B);
        if (g() != null) {
            g().b(true);
        }
        nt f = f();
        String str = "task";
        scf scf = (scf) f.a(str);
        if (scf != null) {
            this.j = scf;
            this.j.f();
            return;
        }
        nf scf2 = new scf();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extras", bundle);
        scf2.f(bundle2);
        f.a().a(scf2, str).a();
        this.j = scf2;
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        aal a;
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.cast_player_menu, menu);
        sap sap = this.h;
        MenuItem findItem = menu.findItem(R.id.media_route_menu_item);
        bbe bbe = null;
        if (findItem instanceof tf) {
            a = ((tf) findItem).a();
        } else {
            Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
            a = bbe;
        }
        ayz ayz = (ayz) a;
        baz baz = sap.e;
        if (baz != null) {
            if (!ayz.b.equals(baz)) {
                if (!ayz.b.c()) {
                    bbe.a(bbe);
                }
                if (!baz.c()) {
                    bbe.a(baz, bbe);
                }
                ayz.b = baz;
                if (ayz.a != null && ayz.b()) {
                    aak aak = ayz.a;
                    ayz.c();
                    aak.a();
                }
            }
            if (sap.d() != null) {
                bae d = sap.d();
                if (d == null) {
                    throw new IllegalArgumentException("factory must not be null");
                } else if (ayz.c != d) {
                    ayz.c = d;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return true;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        sap sap = this.h;
        double d = this.r;
        if (sap.h()) {
            boolean z = keyEvent.getAction() == 0;
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 24) {
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void b(boolean z) {
        this.q.setVisibility(!z ? 4 : 0);
    }

    public final void c(boolean z) {
        int i = 0;
        int i2 = !z ? 0 : 4;
        TextView textView = this.m;
        if (!z) {
            i = 4;
        }
        textView.setVisibility(i);
        this.i.setVisibility(i2);
        this.n.setVisibility(i2);
        this.o.setVisibility(i2);
    }

    public final void c(int i) {
        if (i == 1) {
            this.x.setVisibility(0);
            this.x.setEnabled(true);
        } else if (i != 2) {
            this.x.setVisibility(8);
        } else {
            this.x.setVisibility(0);
            this.x.setEnabled(false);
        }
    }

    public final void b(int i, int i2) {
        i--;
        int i3 = this.C;
        if (i3 == 1) {
            if (i2 >= i) {
                this.y.setVisibility(4);
            } else {
                this.y.setVisibility(0);
                this.y.setEnabled(true);
            }
            if (i2 > 0) {
                this.z.setVisibility(0);
                this.z.setEnabled(true);
                return;
            }
            this.z.setVisibility(4);
        } else if (i3 == 2) {
            if (i2 < i) {
                this.y.setVisibility(0);
                this.y.setEnabled(true);
            } else {
                this.y.setVisibility(0);
                this.y.setEnabled(false);
            }
            if (i2 > 0) {
                this.z.setVisibility(0);
                this.z.setEnabled(true);
                return;
            }
            this.z.setVisibility(0);
            this.z.setEnabled(false);
        } else if (i3 != 3) {
            sdf.a(g, "onQueueItemsUpdated(): Invalid NextPreviousPolicy has been set");
        } else {
            this.y.setVisibility(0);
            this.y.setEnabled(true);
            this.z.setVisibility(0);
            this.z.setEnabled(true);
        }
    }

    /* JADX WARNING: Missing block: B:6:0x000e, code skipped:
            if (r6 != 4) goto L_0x006c;
     */
    public final void a(int r6) {
        /*
        r5 = this;
        r0 = 1;
        r1 = 4;
        r2 = 0;
        if (r6 == r0) goto L_0x006d;
    L_0x0005:
        r3 = 2131952001; // 0x7f130181 float:1.9540432E38 double:1.0533242423E-314;
        r4 = 2;
        if (r6 == r4) goto L_0x0039;
    L_0x000b:
        r4 = 3;
        if (r6 == r4) goto L_0x0011;
    L_0x000e:
        if (r6 == r1) goto L_0x006d;
    L_0x0010:
        goto L_0x006c;
    L_0x0011:
        r6 = r5.s;
        r6.setVisibility(r2);
        r6 = r5.q;
        r6.setVisibility(r1);
        r6 = r5.A;
        r6.setVisibility(r2);
        r6 = r5.l;
        r1 = r5.u;
        r6.setImageDrawable(r1);
        r6 = r5.p;
        r0 = new java.lang.Object[r0];
        r1 = r5.h;
        r1 = r1.h;
        r0[r2] = r1;
        r0 = r5.getString(r3, r0);
        r6.setText(r0);
        return;
    L_0x0039:
        r6 = r5.q;
        r6.setVisibility(r1);
        r6 = r5.A;
        r6.setVisibility(r2);
        r6 = r5.w;
        if (r6 != r4) goto L_0x004f;
    L_0x0047:
        r6 = r5.l;
        r1 = r5.v;
        r6.setImageDrawable(r1);
        goto L_0x0056;
    L_0x004f:
        r6 = r5.l;
        r1 = r5.t;
        r6.setImageDrawable(r1);
    L_0x0056:
        r6 = r5.p;
        r0 = new java.lang.Object[r0];
        r1 = r5.h;
        r1 = r1.h;
        r0[r2] = r1;
        r0 = r5.getString(r3, r0);
        r6.setText(r0);
        r6 = r5.s;
        r6.setVisibility(r2);
    L_0x006c:
        return;
    L_0x006d:
        r6 = r5.A;
        r6.setVisibility(r1);
        r6 = r5.q;
        r6.setVisibility(r2);
        r6 = r5.p;
        r0 = 2131952030; // 0x7f13019e float:1.9540491E38 double:1.0533242566E-314;
        r0 = r5.getString(r0);
        r6.setText(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbz.a(int):void");
    }

    public final void a(int i, int i2) {
        this.o.setProgress(i);
        this.o.setMax(i2);
        this.i.setText(sdh.a(i));
        this.n.setText(sdh.a(i2));
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            View view = this.k;
            if (view instanceof ImageView) {
                ((ImageView) view).setImageBitmap(bitmap);
            } else {
                view.setBackgroundDrawable(new BitmapDrawable(getResources(), bitmap));
            }
        }
    }

    public final void a(String str) {
        this.B.a((CharSequence) str);
    }

    public final void b(String str) {
        this.p.setText(str);
    }

    public final void e_(int i) {
        this.w = i;
    }

    public final void a(boolean z) {
        boolean z2 = false;
        this.s.setVisibility(!z ? 4 : 0);
        if (z) {
            if (this.w == 2) {
                z2 = true;
            }
            c(z2);
        }
    }

    public final void a() {
        finish();
    }

    public final void d(int i) {
        this.C = i;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.D) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() ^ 4102);
            setImmersive(true);
        }
    }
}
