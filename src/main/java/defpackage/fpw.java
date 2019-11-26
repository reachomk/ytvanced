package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: fpw */
final class fpw extends fai {
    public final xwz a;
    private final Context b;
    private final CharSequence c;

    fpw(Context context, CharSequence charSequence, xwz xwz) {
        this.b = (Context) amqw.a((Object) context);
        this.c = (CharSequence) amqw.a((Object) charSequence);
        this.a = (xwz) amqw.a((Object) xwz);
    }

    public final int a() {
        return R.id.create_group;
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
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) LayoutInflater.from(this.b).inflate(R.layout.abc_action_menu_item_layout, null);
        actionMenuItemView.a((aja) menuItem);
        actionMenuItemView.setOnClickListener(new fpz(this));
        actionMenuItemView.setTextColor(ra.c(this.b, R.color.quantum_googblue));
        menuItem.setActionView(actionMenuItemView);
        menuItem.setShowAsAction(2);
    }

    public final boolean b(MenuItem menuItem) {
        this.a.b();
        return true;
    }

    public final CharSequence e() {
        return this.c;
    }
}
