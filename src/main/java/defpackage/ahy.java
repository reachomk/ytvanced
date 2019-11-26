package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: ahy */
public final class ahy extends ActionMode {
    public final ahv a;
    private final Context b;

    public ahy(Context context, ahv ahv) {
        this.b = context;
        this.a = ahv;
    }

    public final Object getTag() {
        return this.a.c;
    }

    public final void setTag(Object obj) {
        this.a.c = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void invalidate() {
        this.a.d();
    }

    public final void finish() {
        this.a.c();
    }

    public final Menu getMenu() {
        return new ajn(this.b, (tc) this.a.b());
    }

    public final CharSequence getTitle() {
        return this.a.e();
    }

    public final void setTitle(int i) {
        this.a.a(i);
    }

    public final CharSequence getSubtitle() {
        return this.a.f();
    }

    public final void setSubtitle(int i) {
        this.a.b(i);
    }

    public final View getCustomView() {
        return this.a.h();
    }

    public final void setCustomView(View view) {
        this.a.a(view);
    }

    public final MenuInflater getMenuInflater() {
        return this.a.a();
    }

    public final boolean getTitleOptionalHint() {
        return this.a.d;
    }

    public final void setTitleOptionalHint(boolean z) {
        this.a.a(z);
    }

    public final boolean isTitleOptional() {
        return this.a.g();
    }
}
