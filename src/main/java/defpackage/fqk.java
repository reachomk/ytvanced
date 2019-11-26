package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ActionMenuItemView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: fqk */
final class fqk extends fai {
    public final fqm a;
    public CharSequence b;
    private final Context c;

    fqk(Context context, fqm fqm) {
        this.c = (Context) amqw.a((Object) context);
        this.a = (fqm) amqw.a((Object) fqm);
    }

    public final int a() {
        return R.id.menu_done;
    }

    public final boolean b() {
        return true;
    }

    public final int c() {
        return 0;
    }

    public final ezx d() {
        return null;
    }

    public final int f() {
        return 2000;
    }

    public final void a(MenuItem menuItem) {
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) LayoutInflater.from(this.c).inflate(R.layout.abc_action_menu_item_layout, null);
        actionMenuItemView.a((aja) menuItem);
        actionMenuItemView.setOnClickListener(new fqn(this));
        actionMenuItemView.setTextColor(ra.c(this.c, R.color.quantum_googblue));
        menuItem.setActionView(actionMenuItemView);
        menuItem.setShowAsAction(2);
    }

    public final boolean b(MenuItem menuItem) {
        this.a.a();
        return true;
    }

    public final CharSequence e() {
        if (TextUtils.isEmpty(this.b)) {
            return this.c.getString(R.string.done);
        }
        return this.b;
    }
}
