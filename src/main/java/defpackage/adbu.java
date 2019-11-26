package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

/* renamed from: adbu */
public abstract class adbu extends aej {
    private boolean g = true;
    private int h;
    private Bundle i;

    public void a(int i, Activity activity) {
    }

    public abstract boolean a(int i, nf nfVar);

    public abstract nf c(int i);

    public abstract boolean d(int i);

    public abstract int l();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.h = bundle.getInt("currentIndex");
            this.i = bundle.getBundle("currentData");
        } else {
            this.h = l();
            this.i = null;
        }
        m();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.h = intent.getIntExtra("com.google.android.libraries.youtube.mdx.common.newIndex", -1);
        this.i = (Bundle) intent.getParcelableExtra("com.google.android.libraries.youtube.mdx.common.data");
        m();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("currentIndex", this.h);
        bundle.putBundle("currentData", this.i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        super.onStop();
        this.g = false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        super.onStart();
        this.g = true;
        m();
    }

    private final void m() {
        if (this.g) {
            nt f = f();
            if (!a(this.h, f.a(16908290))) {
                nf c = c(this.h);
                Bundle bundle = c.j;
                if (bundle == null) {
                    c.f(this.i);
                } else {
                    Bundle bundle2 = this.i;
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    c.f(bundle);
                }
                f.a().b(16908290, c).a();
                a(this.h, (Activity) this);
            }
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onBackPressed() {
        if (!d(this.h)) {
            super.onBackPressed();
        }
    }
}
