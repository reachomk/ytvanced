package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: dvg */
public abstract class dvg extends aej implements acwa, wxd {
    public ewi b_;
    public tem g;
    public xpt h;
    public suq j;
    public xfi k;
    private wxb l;
    private ezv m;
    private xoe n;

    public void b_(int i) {
    }

    /* Access modifiers changed, original: protected */
    public Dialog d(int i) {
        return null;
    }

    public Dialog e(int i) {
        return null;
    }

    public abstract void l();

    /* Access modifiers changed, original: protected */
    public void m() {
    }

    public boolean onSearchRequested() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        int a = fmv.a(((wwz) getApplication()).i().ox());
        if (a != 2) {
            fmu.a(this);
        } else {
            fmu.a(true, this);
        }
        b_(a);
        l();
        n();
        super.onCreate(bundle);
        this.k.a();
    }

    /* Access modifiers changed, original: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        xvj.a();
        w_();
    }

    public void onStart() {
        this.j.a(getResources().getConfiguration());
        super.onStart();
        xvj.a();
    }

    public void onResume() {
        super.onResume();
        r();
        xpt xpt = this.h;
        if (xpt != null) {
            xpt.a();
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        p().a(menu, super.getMenuInflater(), s());
        this.b_.b();
        m();
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            return o();
        }
        return p().a(menuItem);
    }

    public boolean o() {
        String stringExtra = getIntent().getStringExtra("ancestor_classname");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                Intent intent = new Intent(this, Class.forName(stringExtra));
                intent.setFlags(603979776);
                finish();
                startActivity(intent);
                return true;
            } catch (ClassNotFoundException e) {
                xtl.b("Target Activity class for Up event not found", e);
            }
        }
        startActivity(ebl.a((Context) this));
        return true;
    }

    public final ezv p() {
        if (this.m == null) {
            this.m = new ezv(this, this);
        }
        return this.m;
    }

    /* Access modifiers changed, original: protected|final */
    @Deprecated
    public final Dialog onCreateDialog(int i) {
        return onCreateDialog(i, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final Dialog onCreateDialog(int i, Bundle bundle) {
        if (isFinishing()) {
            return null;
        }
        return bundle == null ? e(i) : d(i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        wxb wxb = this.l;
        if (wxb != null) {
            SparseArray sparseArray = wxb.a;
            if (!(sparseArray == null || sparseArray.get(i) == null)) {
                ((wxe) wxb.a.get(i)).a(i, i2, intent);
                SparseArray sparseArray2 = wxb.a;
                if (sparseArray2 != null) {
                    sparseArray2.remove(i);
                }
                return;
            }
        }
        if (i != 17) {
            if ((i == 900 || i == 901) && i2 == -1) {
                Intent a = amjn.a(this, intent);
                if (a != null) {
                    startActivityForResult(a, 902);
                    return;
                }
            }
            super.onActivityResult(i, i2, intent);
            return;
        }
        n();
    }

    public final void a(Intent intent, int i, wxe wxe) {
        a(intent, i, null, wxe);
    }

    public final void a(Intent intent, int i, Bundle bundle, wxe wxe) {
        if (this.l == null) {
            this.l = new wxb();
        }
        if (!this.l.a(i)) {
            wxb wxb = this.l;
            if (wxb.a == null) {
                wxb.a = new SparseArray();
            }
            wxb.a.put(i, wxe);
            startActivityForResult(intent, i, bundle);
        }
    }

    public final void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        try {
            super.startActivityForResult(intent, i, bundle);
        } catch (Exception e) {
            xpr.a((Context) this, (int) R.string.error_processing_link, 0);
            afpc.a(2, afpf.crash, "Failed to resolve intent", e);
        }
    }

    public final void startActivity(Intent intent) {
        try {
            super.startActivity(intent);
        } catch (Exception e) {
            xpr.a((Context) this, (int) R.string.error_processing_link, 0);
            afpc.a(2, afpf.crash, "Failed to resolve intent", e);
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        try {
            super.startActivity(intent, bundle);
        } catch (Exception e) {
            xpr.a((Context) this, (int) R.string.error_processing_link, 0);
            afpc.a(2, afpf.crash, "Failed to resolve intent", e);
        }
    }

    public final boolean q() {
        wxb wxb = this.l;
        if (wxb == null || !wxb.a(906)) {
            return false;
        }
        finishActivity(906);
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.j.a(configuration);
        super.onConfigurationChanged(configuration);
        xpt xpt = this.h;
        if (xpt != null) {
            xpt.a();
        }
        r();
        this.b_.b();
    }

    public final void onUserInteraction() {
        xpt xpt = this.h;
        if (xpt != null) {
            xpt.a();
        }
        super.onUserInteraction();
    }

    /* Access modifiers changed, original: protected */
    public void r() {
        ads g = g();
        if (g != null) {
            g.g();
            g.b(true);
        }
    }

    private final void n() {
        int a = this.g.a(this);
        if (a == 0) {
            return;
        }
        Dialog a2;
        if (a == 1 || a == 2 || a == 3) {
            a2 = this.g.a(a, this, new dvj(this));
            a2.setCanceledOnTouchOutside(false);
            a2.show();
            return;
        }
        a2 = this.g.a(a, this, new dvi(this));
        a2.setCanceledOnTouchOutside(false);
        a2.setOnDismissListener(new dvl(this));
        a2.show();
    }

    public final xoe s() {
        if (this.n == null) {
            Object g = g();
            amqw.a(g);
            this.n = new xoe(g.h());
        }
        return this.n;
    }

    public acvx t() {
        return acvx.g;
    }
}
