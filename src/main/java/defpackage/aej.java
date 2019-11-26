package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import java.util.ArrayList;

/* renamed from: aej */
public class aej extends nn implements aei, qz {
    private ael g;
    private Resources h;

    public final void b_() {
    }

    public final void c_() {
    }

    public final ahv d_() {
        return null;
    }

    public final void onContentChanged() {
    }

    public aej(int i) {
        super(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        h().a();
    }

    public void onCreate(Bundle bundle) {
        ael h = h();
        h.p();
        h.b();
        super.onCreate(bundle);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        h().c(i);
    }

    /* Access modifiers changed, original: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        h().c();
    }

    public final ads g() {
        return h().d();
    }

    public final void a(Toolbar toolbar) {
        h().a(toolbar);
    }

    public final MenuInflater getMenuInflater() {
        return h().f();
    }

    public final void setContentView(int i) {
        h().b(i);
    }

    public final void setContentView(View view) {
        h().a(view);
    }

    public final void setContentView(View view, LayoutParams layoutParams) {
        h().a(view, layoutParams);
    }

    public final void addContentView(View view, LayoutParams layoutParams) {
        h().b(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.h != null) {
            this.h.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        h().g();
    }

    /* Access modifiers changed, original: protected */
    public void onPostResume() {
        super.onPostResume();
        h().j();
    }

    public void onStart() {
        super.onStart();
        h().h();
    }

    public void onStop() {
        super.onStop();
        h().i();
    }

    public final View findViewById(int i) {
        return h().a(i);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        boolean z = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ads g = g();
        if (menuItem.getItemId() != 16908332 || g == null || (g.d() & 4) == 0) {
            return false;
        }
        Intent a = qa.a(this);
        if (a == null) {
            z = false;
        } else if (shouldUpRecreateTask(a)) {
            qw a2 = qw.a((Context) this);
            Intent e_ = e_();
            if (e_ == null) {
                e_ = qa.a(this);
            }
            if (e_ != null) {
                ComponentName component = e_.getComponent();
                if (component == null) {
                    component = e_.resolveActivity(a2.b.getPackageManager());
                }
                a2.a(component);
                a2.a(e_);
            }
            if (a2.a.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            ArrayList arrayList = a2.a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            ra.a(a2.b, intentArr);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            navigateUpTo(a);
        }
        return z;
    }

    public void onDestroy() {
        super.onDestroy();
        h().l();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        h().a(charSequence);
    }

    public final void w_() {
        h().m();
    }

    public final void invalidateOptionsMenu() {
        h().m();
    }

    public final Intent e_() {
        return qa.a(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        h().k();
    }

    public final ael h() {
        if (this.g == null) {
            this.g = ael.a((Activity) this, (aei) this);
        }
        return this.g;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ads g = g();
        if (keyCode == 82 && g != null && g.a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final Resources getResources() {
        if (this.h == null && asr.a()) {
            this.h = new asr(this, super.getResources());
        }
        Resources resources = this.h;
        return resources == null ? super.getResources() : resources;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!(VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()))) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void openOptionsMenu() {
        ads g = g();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (g == null || !g.k()) {
            super.openOptionsMenu();
        }
    }

    public final void closeOptionsMenu() {
        ads g = g();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (g == null || !g.l()) {
            super.closeOptionsMenu();
        }
    }
}
