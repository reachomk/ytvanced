package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: dvh */
public class dvh extends PreferenceActivity {
    private ael a;

    public void onCreate(Bundle bundle) {
        fmu.a(this);
        a().p();
        a().b();
        super.onCreate(bundle);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a().c();
    }

    public final MenuInflater getMenuInflater() {
        return a().f();
    }

    public final void setContentView(int i) {
        a().b(i);
    }

    public final void setContentView(View view) {
        a().a(view);
    }

    public final void setContentView(View view, LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    public final void addContentView(View view, LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPostResume() {
        super.onPostResume();
        a().j();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        a().a(charSequence);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a().g();
    }

    public void onStop() {
        super.onStop();
        a().i();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDestroy() {
        super.onDestroy();
        a().l();
    }

    public final void invalidateOptionsMenu() {
        a().m();
    }

    public final ael a() {
        if (this.a == null) {
            this.a = ael.a((Activity) this, null);
        }
        return this.a;
    }
}
