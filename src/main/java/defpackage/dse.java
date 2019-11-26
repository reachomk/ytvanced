package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.youtube.R;

/* renamed from: dse */
public abstract class dse extends dsq {
    public dux a;
    public xtw b;
    public Handler c;
    public boolean d;
    public dsf e;
    public eda f;
    public dsy g;

    public int a() {
        return 0;
    }

    public boolean a(boolean z) {
        return true;
    }

    public abstract Class d();

    public int e() {
        return 536870912;
    }

    public boolean f() {
        return false;
    }

    public int g() {
        return 5;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        fmu.a(this);
        super.onCreate(bundle);
        this.g.a(getWindow());
        wzd pk = ((dsg) amnn.a(getApplication(), dsg.class)).pk();
        pk.a();
        this.e.a(g());
        if (this.b.a(this.d)) {
            Intent a = this.a.a(c(), f());
            if (a != null) {
                a(true);
                a(a);
            } else if (!a(false)) {
                overridePendingTransition(17432576, 17432577);
                finish();
            } else if (a() == 0) {
                a(c());
            } else {
                this.c.postDelayed(new dsh(this), (long) a());
            }
        } else {
            xpr.a((Context) this, (int) R.string.error_permission_check_failed, 1);
            finish();
        }
        pk.a();
    }

    public final void a(Intent intent) {
        startActivity(intent);
        overridePendingTransition(17432576, 17432577);
        finish();
    }

    public Intent c() {
        Intent intent = new Intent(getIntent());
        intent.setComponent(new ComponentName(this, d()));
        intent.putExtra("alias", getClass().getName());
        intent.setFlags(e());
        return intent;
    }
}
