package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: jpm */
public final class jpm extends fai implements OnClickListener, OnLongClickListener {
    public Bitmap a;
    private final nn b;
    private final LayoutInflater c;
    private final Resources d;
    private final akkq e;
    private final akbb f;
    private final egm g;
    private final afqe h;
    private final bcaa i;
    private final hdm j;
    private final aeag k;
    private final akvp l;
    private final acvx m;
    private final int n;
    private final wxc o = wxc.a(this.b, new jpo(this));
    private MenuItem p;
    private View q;
    private ImageView r;

    public jpm(nn nnVar, akkq akkq, egm egm, afqe afqe, bcaa bcaa, hdm hdm, aeag aeag, akvp akvp, LayoutInflater layoutInflater, Resources resources, acvx acvx, akbb akbb, int i) {
        this.b = nnVar;
        this.d = resources;
        this.c = layoutInflater;
        this.e = akkq;
        this.g = egm;
        this.h = afqe;
        this.i = bcaa;
        this.j = hdm;
        this.k = aeag;
        this.l = akvp;
        aeag.i = new jpl(egm, akbb);
        this.m = acvx;
        this.f = akbb;
        this.n = i;
        this.a = BitmapFactory.decodeResource(resources, R.drawable.quantum_ic_account_circle_grey600_24);
        h();
    }

    public final boolean b() {
        return false;
    }

    public final boolean b(MenuItem menuItem) {
        return false;
    }

    public final int c() {
        return 0;
    }

    public final ezx d() {
        return null;
    }

    public final int a() {
        return this.n;
    }

    public final int f() {
        return this.n + 1000;
    }

    public final CharSequence e() {
        return this.d.getString(R.string.account);
    }

    public final void a(MenuItem menuItem) {
        if (this.q == null) {
            this.q = this.c.inflate(R.layout.mobile_topbar_avatar_button, null, false);
        }
        this.r = (ImageView) this.q.findViewById(R.id.image);
        menuItem.setShowAsAction(2);
        this.r.setContentDescription(e());
        this.q.setOnClickListener(this);
        this.q.setOnLongClickListener(this);
        this.p = menuItem;
        g();
        jxb jxb = (jxb) this.i.get();
        if (jxb.c()) {
            jxb.a(this.r, this.f);
        }
        this.j.e = this.q;
        h();
    }

    public final void onClick(View view) {
        if (!this.k.b()) {
            this.g.a(this.f);
            byte[] bArr = this.f.d;
            if (bArr != null) {
                this.m.a(3, new acvs(bArr), null);
            }
        }
    }

    public final boolean onLongClick(View view) {
        this.h.a(this.b, this.f.d, null);
        return false;
    }

    private final void h() {
        akbb akbb = this.f;
        if (akbb != null) {
            aygk aygk = akbb.b;
            if (!(aygk == null || aygk.b.size() == 0)) {
                this.e.b(Uri.parse(((aygm) this.f.b.b.get(0)).b), this.o);
            }
        }
        arwf arwf = this.f.a;
        if (arwf != null) {
            akvp akvp = this.l;
            arwh a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            int a2 = akvp.a(a);
            if (a2 == 0) {
                a2 = 0;
            }
            if (this.p != null && this.q != null && a2 != 0) {
                this.r.setImageResource(a2);
                this.r.setColorFilter(xwe.a(this.b, R.attr.ytTextPrimary, 0));
                this.p.setActionView(this.q);
            }
        }
    }

    public final void g() {
        if (this.p != null && this.q != null) {
            this.r.setImageDrawable(new BitmapDrawable(this.d, this.a));
            this.r.clearColorFilter();
            this.p.setActionView(this.q);
        }
    }
}
